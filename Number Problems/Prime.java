import java.util.Scanner;
class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        boolean isPrime = true;
        if(n<=1) {
            System.out.println("Not a prime number.");
            return;
        }
        for(int i=2;i * i <= n;i++) {
            if(n%i==0) {
                System.out.println("Not a Prime number.");
                isPrime=false;
                break;
            }
        }
        if(isPrime)
            System.out.println("Prime number.");
        
    }
}