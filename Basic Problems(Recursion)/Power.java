import java.util.Scanner;

class Recursion {
    public static int power(int x, int n) {
      if(n==0) {
        return 1;
      }
      else if(n==1) {
        return x;
      }
      else {
        return ((x)*power(x,n-1));
      }
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the base value: ");
      int x = sc.nextInt();
      System.out.print("Enter the exponent value: ");
      int n = sc.nextInt();
      int result = power(x,n);
      System.out.println("Power of a number = "+result);
      sc.close();
    }
}