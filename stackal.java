import java.util.*;

public class stackal{
    static class stack{
        static ArrayList<Integer> list = new ArrayList<>();

        
        
        public static boolean isEmpty(){
            return list.size()==0;
        }

        static void push(int data){
            list.add(data);
        }

        static int pop(){
            int top=list.get(list.size()-1);
            list.remove(list.get(list.size()-1));
            return top;
        }

        static int peek(){
            return (list.get(list.size()-1));
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        sc.close();
    }
}