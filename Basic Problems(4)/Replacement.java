import java.util.*;

public class Replacement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer : ");
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println("n = " + n);
            System.out.println("Resultant number after replacing 0's with 1's = 1");
            return;
        }

        int num = n;
        StringBuilder result = new StringBuilder();

        while (num != 0) {
            int digit = num % 10;

            if (digit == 0) {
              digit = 1;
            }

            result.append(digit);
            num /= 10;
        }

        result.reverse();

        System.out.println("n = " + n);
        System.out.println("Resultant number after replacing 0's with 1's = " + result);
    }
}