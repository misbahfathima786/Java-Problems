import java.util.*;
public class Sum {
    public static boolean isPrime(int n) {
      if(n<=1) {
        return false;
      }
      boolean isprime = true;
      for(int i=2; i*i<=n; i++) {
        if(n%i==0) {
          isprime = false;
        }
      }
      return isprime;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int sum = 0;
        boolean found = false;
        for(int i=2;i<n;i++) {
          int other = n - i;
          if(isPrime(i) && isPrime(other)) {
            sum = i+other;
            System.out.println("Sum of two prime numbers "+"("+i+" , "+other+")"+" = "+sum+".");
            found = true;
            break;
          }
        }
        if(!(found)) {
          System.out.println(n+" cannot be expressed as the sum of two prime numbers.");
        }
    }
}





