import java.util.Scanner;
class Functions {
    public static void evenOdd(int n) {
        if(n%2==0) {
            System.out.println("Even number.");
        }
        else {
            System.out.println("Odd number.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        evenOdd(n);
        sc.close();
    }
}