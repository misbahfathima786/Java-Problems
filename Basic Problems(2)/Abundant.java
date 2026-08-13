import java.util.*;

public class Abundant {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a number : ");
      int n = sc.nextInt();
      int div ;
      int sum = 0;
      for(int i=1; i<n; i++) {
        if(n%i == 0) {
          sum += i;
        }
      }
      System.out.println(sum);
      if(sum > n) {
        System.out.println(n+" is Abundant number.");
      }
      else {
        System.out.println(n+" is not Abundant number.");
      }
      sc.close();
    }
}