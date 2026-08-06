import java.util.Scanner;
class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        boolean isPrime = true;
        if(n<=1) {
            System.out.println("Given number is not a prime numer.");
            return;
        }
        else {
            for(int i=2; i*i<=n; i++) {
                if(n%i==0) {
                    isPrime = false;
                }
            }
        }
        if(isPrime) {
            System.out.println("Given number is prime number.");
        }
        else {
            System.out.println("Given number is not a prime numer.");
        }
        sc.close();
    }
}