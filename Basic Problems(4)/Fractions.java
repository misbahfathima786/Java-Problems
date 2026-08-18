import java.util.*;

public class Fractions {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the value os 1st numerator : ");
      int a = sc.nextInt();
      System.out.print("Enter the value os 1st denominator : ");
      int b = sc.nextInt();
      System.out.print("Enter the value os 2nd numerator : ");
      int c = sc.nextInt();
      System.out.print("Enter the value os 2nd denominator : ");
      int d = sc.nextInt();
      float sum = (float) ((a*d)+(c*b))/(b*d);
      System.out.println("Addition of two frations = "+sum);
    }
}