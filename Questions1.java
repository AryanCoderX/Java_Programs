import java.util.*;

public class Questions1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // System.out.println("Enter the value of first number");
        // int num1= sc.nextInt(0);
        
        // System.out.println("Enter the value of Second number");
        // int num2= sc.nextInt(0);
        
        // System.out.println("Enter the value of third number");
        // int num3= sc.nextInt(0);

        // System.out.println("Average of three numbers is: "+((num1+num2+num3)/3));
    
        
        int x = 2, y = 5;
        int exp1 = (x * y / x);
        int exp2 = (x * (y / x));
        System.out.print(exp1 + " , ");
        System.out.print(exp2);
        sc.close();

    }
}