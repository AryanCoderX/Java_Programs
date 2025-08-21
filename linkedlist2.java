import java.util.*;
public class linkedlist2 {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;

   public static boolean cycleCheck(){
        Node slow= head;
        Node fast= head;
        while (fast!=null && fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
                return true;
        }
        return false;
   }

   public static void removeCycle(){
        Node slow= head;
        Node fast= head;
        boolean check=false;
        while (fast!=null && fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                check=true;
                break;
            }
        }
        if(check){
            slow=head;
            
            //hmlog ko generally full cycle bnane nahi aaega pr this is how we do it 
           if (slow == fast) {   
                while (fast.next != slow) {
                    fast = fast.next;
                }
                fast.next = null;
                return;
            }
            
            Node prev= null;
            while (slow!=fast) {
                slow=slow.next;
                prev=fast;
                fast=fast.next;
            }
            prev.next=null;
        }
   }

   public static void print() {
        if (head == null) {
            System.out.println("LinkedList is empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        head= new Node(1);
        head.next= new Node(2);
        head.next.next= new Node(3);
        head.next.next.next= head;
        //1->2->3->1
        System.out.println(cycleCheck());
        removeCycle();

        LinkedList<Integer> ll = new LinkedList<>();
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);
        System.out.println(ll);
        
        
    }
}