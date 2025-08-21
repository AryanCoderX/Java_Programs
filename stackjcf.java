import java.util.*;

public class stackjcf {

    public static void pushAtBottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }

        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    public static String reverseString(String str) {
        Stack<Character> ch = new Stack<>();
        int index = 0;
        while (index < str.length()) {
            ch.push(str.charAt(index));
            index++;
        }

        StringBuilder sb = new StringBuilder();
        while (!ch.isEmpty()) {
            sb.append(ch.peek());
            ch.pop();
        }
        return sb.toString();
    }

    public static void reverseStack(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s, top);
    }

    public static void nextGreater(int ar[]) {
        Stack<Integer> s = new Stack<>();
        int[] nxtGreater = new int[ar.length];
        for (int i = ar.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && ar[i] >= s.peek()) {
                s.pop();

            }
            if (s.isEmpty())
                nxtGreater[i] = -1;
            else
                nxtGreater[i] = s.peek();

            s.push(ar[i]);
        }
        for (int i = 0; i < nxtGreater.length; i++) {
            System.out.println(nxtGreater[i]);
        }

    }

    
    public static Boolean validParenthesis(String str) {
        Stack<Character> ch = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char c=str.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                ch.push(c);
            } else {
                if (ch.isEmpty()) {
                    return false;
                }
                if((c==')'&&ch.peek()=='(')||(c=='}'&&ch.peek()=='{')||(c==']'&&ch.peek()=='{')){
                    ch.pop();
                }else 
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Stack<Integer> s = new Stack<>();
        // s.push(1);
        // s.push(2);
        // s.push(3);
        // // pushAtBottom(s,4);
        // System.out.println(s);

        // reverseStack(s);

        // System.out.println(s);

        // System.out.println(reverseString("Aryan"));

        // int ar[]={6,8,0,1,3};
        // nextGreater(ar);

        System.out.println(validParenthesis("}}}}"));

    }
}