import java.util.*;

public class Armstrong {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a starting number : ");
      int lower = sc.nextInt();
      System.out.print("Enter an ending number : ");
      int higher = sc.nextInt();
      int rem;
      System.out.println("Armstrong numbers between "+ lower +" and " + higher + " are....");
      for(int i=lower;i<=higher;i++) {
        int result = 0;
        int num = i;
        int n = i;
        int count = 0;
        while(n != 0) {
          n /= 10;
          count++;
        }
        while(num != 0) {
          rem = num % 10;
          result += (int) Math.pow(rem , count);
          num /= 10;
        }
        if(result == i)
          System.out.println(i);
      }  
    }
}