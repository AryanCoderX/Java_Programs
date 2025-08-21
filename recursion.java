import java.util.*;

public class recursion {
    static void print(int i, int n) {
        System.out.print(i);
        if (i == n) {
            return;
        }
        System.out.print(" ");
        print(i + 1, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // print(1,10);
        // int ar[]={1,2,3,4,6,5};
        // System.out.println("Is the array arranged? "+check(0, ar));
        System.out.println("2^10= " + exPowOp(2, 10));

        sc.close();
    }

    static boolean check(int i, int ar[]) {
        if (i == ar.length - 1)
            return true;
        if (ar[i] < ar[i + 1]) {
            return check(i + 1, ar);
        } else
            return false;
    }

    static int exPow(int ex, int pow) {
        if (pow == 1)
            return ex;
        if (ex == 0)
            return 0;
        return ex * exPow(ex, pow - 1);
    }

    static int exPowOp(int x, int n) {
        if (n == 1)
            return x;
        if (x == 0)
            return 0;
        int halfPow = exPowOp(x, n / 2);
        if (n % 2 == 0)
            return halfPow * halfPow;
        else
            return x * halfPow * halfPow;
    }
}