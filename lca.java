import java.util.*;

public class lca {
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
    public static Node leastCommonAncestor(Node root, int n1, int n2) {
        ArrayList<Node> p1 = new ArrayList<>();
        ArrayList<Node> p2 = new ArrayList<>();

        getPath(root,n1,p1);
        getPath(root,n2,p2);

        int i=0;
        for (; i < p1.size() && i< p2.size() ; i++) {
            if(p1.get(i)!=p2.get(i)){
                break;
            }
        }
        return p1.get(i-1);
    }

    public static boolean getPath(Node root,int n,ArrayList<Node> path) {
        if(root==null) return false;

        path.add(root);
        if(root.data==n) return true;

        boolean left=getPath(root.left, n, path);
        boolean right=getPath(root.right, n, path);

        if(left || right)
        return true;
        else{
            path.remove(path.size()-1);
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nodes = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        Node root = BinaryTree.buildTree(nodes);

        int n1 = 4, n2 = 5;
        Node lca = leastCommonAncestor(root, n1, n2);
        if (lca != null)
            System.out.println("LCA of " + n1 + " and " + n2 + " is: " + lca.data);
        
        sc.close();
    }
}