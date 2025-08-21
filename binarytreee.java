import java.util.*;

public class binarytreee {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
   
    public class binarytree{
        static int idx=-1;
        public static Node nodeBuilder(int nodes[]) {
            idx++;
            if (idx>nodes.length-1 || nodes[idx]==-1) {
                return null;
            }
            else{
                Node newNode= new Node(nodes[idx]);
                newNode.left=nodeBuilder(nodes);
                newNode.right=nodeBuilder(nodes);
                return newNode;
            }
        }
    }

    public static void preOrder(Node root) {
        if (root==null) {
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
        
    }

    public static void inOrder(Node root) {
        if (root==null) {
            return;
        }
        preOrder(root.left);
        System.out.print(root.data+" ");
        preOrder(root.right);
        
    }

    public static void levelOrder(Node root) {
        if (root==null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            Node currNode = q.remove();
            if (currNode==null) {
                System.out.println();
                if (q.isEmpty()) {
                    return;
                } else {
                    q.add(null);
                }
            }
            else{
                System.out.print(currNode.data+" ");
                if(currNode.left!=null){
                    q.add(currNode.left);
                }
                if(currNode.right!=null){
                    q.add(currNode.right);
                }   
            }
            
        }
    }



    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        int lh= height(root.left);
        int rh= height(root.right);
        return (lh+rh+1);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        Node root= binarytree.nodeBuilder(nodes);
        // preOrder(root);
        // System.out.println();
        // inOrder(root);
        // System.out.println();
        levelOrder(root);
        System.out.println();

        
        sc.close();
    }
}