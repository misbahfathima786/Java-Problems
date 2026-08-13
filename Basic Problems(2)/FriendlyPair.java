import java.util.*;

public class FriendlyPair {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter 1st number : ");
      int a  = sc.nextInt();
      System.out.print("Enter 2nd number : ");
      int b  = sc.nextInt();
      int sum1 = 0;
      int sum2 = 0;
      for(int i=1; i<a; i++) {
          if(a%i == 0) {
            sum1 += i;
          }
      }
      for(int i=1; i<b; i++) {
          if(b%i == 0) {
            sum2 += i;
          }
      }
      if((sum1/a == 1) && (sum2/b == 1)) {
        System.out.println(a+" and "+b+" are a Friendly Pair.");
      } 
      else {
        System.out.println(a+" and "+b+" are not a Friendly Pair.");
      }
      sc.close();
    }
}