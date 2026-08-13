import java.util.*;

public class Deficient {
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
      if(sum < n) {
        System.out.println(n+" is Deficient number.");
      }
      else {
        System.out.println(n+" is not Deficient number.");
      }
      sc.close();
    }
}