import java.util.*;

public class Recursion {
    public static long fact(long n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * fact(n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer : ");
        long n = sc.nextLong();
        if (n < 0) {
            System.out.println("N must be greater than or equal to 0!");
            sc.close();
            return;
        }
        long res = fact(n);
        while (res % 10 == 0) {
            res = res / 10;
        }
        long digit = res % 10;
        System.out.println("Last non-zero digit of " + n + "! = " + digit);
        sc.close();
    }
}