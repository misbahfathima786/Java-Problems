import java.util.Scanner;
class Functions {
    public static void primeNumber(int n) {
        if(n<=1) {
            System.out.println("Not Prime number.");
            return;
        }
        boolean isPrime = true;
        for(int i=2;i*i<=n;i++) {
            if(n%i==0) {
                System.out.println("Not a Prime number.");
                isPrime = false;
                break;
            }
        }
        if(isPrime)
            System.out.println("Prime number.");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        primeNumber(n);
        sc.close();
    }
}