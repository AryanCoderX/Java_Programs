import java.util.*;

public class shortestdistance {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public class BinaryTree{
        static int idx=-1;
        public static Node buildTree(int nodes[]) {
            idx++;
            if(nodes[idx]==-1)
            return null;
            else{
                Node newNode= new Node(nodes[idx]);
                newNode.left=buildTree(nodes);
                newNode.right=buildTree(nodes);
                return newNode;
            }
        }
    }
    public static int minDistance(Node root, int n1, int n2) {
        if (root==null) return -1;
        if (root.data==n1||root.data==n2) 
        return 1;
        
        int lf= minDistance(root.left, n1, n2);
        int rf= minDistance(root.right, n1, n2);

        if(lf==0&&rf==0)
        return lf+rf;
        else
        return lf+rf+1;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nodes = { 1, 2, 4, -1, -1, 5, -1, -1, 3,  6, -1, -1, 7, -1, -1 };
        int n1=4;
        int n2=6;
        Node root = BinaryTree.buildTree(nodes);
        System.out.println("Shortest Distance between the two nodes is :"+minDistance(root,n1,n2));
        
        sc.close();
    }
}