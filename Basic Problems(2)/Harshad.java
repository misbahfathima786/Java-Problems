import java.util.*;

public class Harshad {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a number : ");
      int n = sc.nextInt();
      int num = n;
      int sum = 0;
      int rem ;
      while(num != 0) {
        rem = num % 10;
        sum += rem;
        num /= 10;
      }
      if(n%sum == 0) {
        System.out.println(n+" is Harshad number.");
      }
      else {
        System.out.println(n+" is not Harshad number.");
      }
      sc.close();
    }
}