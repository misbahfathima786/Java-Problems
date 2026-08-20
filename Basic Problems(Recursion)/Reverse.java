import java.util.*;

public class Recursion {
    public static int reverse(int n,int count) {
      if(n<10) {
        return n;
      }
      int rem = n % 10;
      int rev = reverse(n/10 , count - 1);
      int res = (int)( rem * Math.pow(10,count) + rev);
      return res; 
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a number = ");
      int n = sc.nextInt();
      int num = n;
      int count = 0;
      while(num != 0) {
        num /= 10;
        count++;
      }
      int reverse = reverse(n,count-1);
      System.out.println("Reverse of a number = "+reverse);
      sc.close();
    }
}