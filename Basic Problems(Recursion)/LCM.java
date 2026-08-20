import java.util.*;

public class Recursion {
    public static int lcm(int a , int b,int current) {
      if(current%a==0 && current%b==0) {
        return current;
      }
      else {
        return lcm(a,b,current+1);
      }
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the value of a = ");
      int a = sc.nextInt();
      System.out.print("Enter the value of b = ");
      int b = sc.nextInt();
      int current = Math.max(a,b);
      int lcm = lcm(a,b,current);
      System.out.println("LCM("+a+","+b+") = "+lcm);
    }
}