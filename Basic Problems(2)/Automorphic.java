import java.util.*;

public class Automorphic {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a number : ");
      int n = sc.nextInt();
      int square = n*n;
      int num = n;
      int count = 0;
      while(num != 0) {
        num /= 10;
        count ++;
      }
      int digit = (int) Math.pow(10,count);
      System.out.println("Square of "+n+" = "+square);
      if(square%digit == n) {
        System.out.println("Last digit of a square of "+n+" is equal to "+n+".");
        System.out.println(n+" is an Automorphic number.");
      }
      else {
        System.out.println("Last digit of a square of "+n+" is not equal to "+n+".");
        System.out.println(n+" is not an Automorphic number.");
      }
      sc.close();
    }
}