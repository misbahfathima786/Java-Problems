import java.util.*;

public class Recursion {
    public static int hcf(int a , int b) {
      if(b==0) {
        return a;
      }
      else {
        return hcf(a,a%b);
      }
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the value of a = ");
      int a = sc.nextInt();
      System.out.print("Enter the value of b = ");
      int b = sc.nextInt();
      int hcf = hcf(a,b);
      System.out.println("HCF("+a+","+b+") = "+hcf);
    }
}