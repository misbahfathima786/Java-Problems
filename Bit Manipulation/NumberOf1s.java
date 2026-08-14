import java.util.Scanner;
class NumberOf1s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int count = 0;
        while (n != 0) {
            n = n & (n-1);
            count += 1;
        }
        System.out.println("Number of 1's in given number = "+count);
        sc.close();
    }
}