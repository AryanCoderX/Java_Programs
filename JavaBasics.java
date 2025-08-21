import java.util.*;

public class JavaBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("hello world");

        System.out.println("Enter value of a");
        int a =sc.nextInt();
        System.out.println("Enter value of b");
        int b =sc.nextInt();

        System.out.println("Sum= "+(a+b));
        sc.close();
    }
}