import java.util.*;

public class Recursion {

    public static boolean prime(int n, int i) {

        if (n <= 1) {
            return false;
        }

        if (i * i > n) {
            return true;
        }

        if (n % i == 0) {
            return false;
        }

        return prime(n, i + 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number = ");
        int n = sc.nextInt();

        boolean result = prime(n, 2);

        if (result) {
            System.out.println("Given number is a prime number");
        } else {
            System.out.println("Given number is not a prime number");
        }

        sc.close();
    }
}