import java.util.Scanner;
class Prime1 {
    public static boolean isPrime(int n) {
        if(n<2) {
            return false;
        }
        for(int i=2; i<n; i++) {
            if(n%i==0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting number : ");
        int a = sc.nextInt();
        System.out.print("Enter ending number : ");
        int b = sc.nextInt();
        System.out.print("Prime numbers between the given range are : ");
        for(int i=a; i<=b; i++) {
            if(isPrime(i)) {
                System.out.print(i+" ");
            }
        }
        sc.close();
    }
}