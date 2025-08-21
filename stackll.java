import java.util.*;

public class stackll {
    
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    static class stack{
        static boolean isEmpty(){
            return (head==null)?true:false;
        }

        static void push(int data){
            Node newNode= new Node(data);
            if(isEmpty()){
                head=tail=newNode;
                size++;
                return;
            }
            newNode.next=head;
            head=newNode;
            size++;
        }

        static int pop(){
            Node temp =head;
            head=head.next;
            size--;
            return temp.data;
        }

        static int peek(){
            return head.data;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        sc.close();
    }
}