import java.util.Scanner;
class Prime {
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
        System.out.println("Prime numbers between 1 and 100 are : ");
        for(int i=1; i<=100; i++) {
            if(isPrime(i)) {
                System.out.print(i+" ");
            }
        }
        sc.close();
    }
}