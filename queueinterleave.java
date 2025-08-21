import java.util.*;

public class queueinterleave {

    public static void interleave(Queue<Integer> q1) {
        Queue<Integer> q2 = new LinkedList<>();

        int size = q1.size();
        for (int i = 0; i < size / 2; i++) {
            q2.add(q1.remove());
        }

        while (!q2.isEmpty()) {
            q1.add(q2.remove());
            q1.add(q1.remove());
        }
    }

    public static void queuereversal(Queue<Integer> q) {
        Stack<Integer> s = new Stack<>();
        while (!q.isEmpty()) {
            s.push(q.remove());
        }
        while (!s.isEmpty()) {
            q.add(s.pop());
        }
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);

        // interleave(q);
        queuereversal(q);
        while (!q.isEmpty()) {
            System.out.print(q.remove() + " ");
        }
        sc.close();
    }
}