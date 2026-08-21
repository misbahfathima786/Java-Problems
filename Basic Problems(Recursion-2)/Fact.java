import java.util.*;

public class Recursion {
    public static int fact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * fact(n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer : ");
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("N must be greater than or equal to 0!");
            sc.close();
            return;
        }
        int res = fact(n);
        System.out.println("Factorial of " + n + "! = " + res);
        sc.close();
    }
}