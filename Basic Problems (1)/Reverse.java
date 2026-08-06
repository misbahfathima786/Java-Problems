import java.util.Scanner;
class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int reverse = 0;
        int rem;
        while(n!=0) {
            rem = n % 10;
            reverse = reverse * 10 + rem;
            n /= 10;
        }
        System.out.println("Reverse of a given number = "+reverse);
        sc.close();
    }
}