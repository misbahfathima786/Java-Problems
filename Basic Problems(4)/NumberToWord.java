import java.util.Scanner;

class NumberToWord {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        String words[] = {
            "Zero", "One", "Two", "Three", "Four",
            "Five", "Six", "Seven", "Eight", "Nine"
        };

        int reverse = 0;

        while (n != 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n / 10;
        }

        while (reverse != 0) {
            int digit = reverse % 10;
            System.out.print(words[digit] + " ");
            reverse = reverse / 10;
        }
    }
}