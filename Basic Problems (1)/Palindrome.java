import java.util.Scanner;
class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int reverse = 0;
        int rem;
        int num = n;
        System.out.println("Given number = "+num);
        while(num!=0) {
            rem = num % 10;
            reverse = reverse * 10 + rem;
            num /= 10;
        }
        System.out.println("Reverse of a given number = "+reverse);
        if(n==reverse) {
            System.out.println("Given number is a palindrome.");
        }
        else {
            System.out.println("Given number is not a palindrome.");
        }
        sc.close();
    }
}