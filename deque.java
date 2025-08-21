import java.util.*;

public class deque {

    public static class Stack {
        static Deque<Integer> s = new LinkedList<>();

        public void push(int data) {
            s.addLast(data);
        }

        public int pop() {
            return s.removeLast();
        }

        public int peek() {
            return s.getLast();
        }

        public boolean isEmpty() {
            return s.isEmpty();
        }

    }

    public static class queue {
        static Deque<Integer> q = new LinkedList<>();

        public void add(int data) {
            q.addLast(data);
        }

        public int remove() {
            return q.removeFirst();
        }

        public int peek() {
            return q.getFirst();
        }

        public boolean isEmpty() {
            return q.isEmpty();
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Doing operations on stack
        System.out.println("STACK:");

        Stack s = new Stack();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println("Peek element is: " + s.peek());
        while (!s.isEmpty()) {
            System.out.print(s.pop() + " ");
        }

        System.out.println();

        // Doing operations on queue
        System.out.println("QUEUE:");
        queue q = new queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println("Peek element is: " + q.peek());
        while (!q.isEmpty()) {
            System.out.print(q.remove() + " ");
        }

        sc.close();
    }
}