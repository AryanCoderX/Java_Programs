import java.util.*;

public class priorityqueue {

    static class Student implements Comparable<Student>{
        String name;
        int rank;

        Student(String name,int rank){
            this.name=name;
            this.rank=rank;
        }

        @Override
        public int compareTo(Student s2){
            return this.rank-s2.rank;
        }
    }

    public static void name() {
        PriorityQueue<Character>pq= new  PriorityQueue<>();
        String name="aryan";
        for (int i = 0; i < name.length(); i++) {
            pq.add(name.charAt(i));
        }

        while (!pq.isEmpty()) {
            System.out.print(pq.peek()+" ");
            pq.remove();
        }
    }
    public static void ranking() {
        PriorityQueue<Student>pq= new PriorityQueue<>(Comparator.reverseOrder());//to make it in ascending order
        pq.add(new Student("A",21 ));
        pq.add(new Student("B",16 ));
        pq.add(new Student("C",23 ));
        pq.add(new Student("D",12 ));

        while (!pq.isEmpty()) {
            System.out.println(pq.peek().name+"->"+pq.peek().rank);
            pq.remove();
        }
    }
    public static void main(String[] args) {
        // name();
        ranking();
    }
}