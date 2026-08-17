import java.util.*;

public class Permutation {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the number of people : ");
      int n = sc.nextInt();
      System.out.print("Enter the number of available seats : ");
      int r = sc.nextInt();
      int result = 1;
      if(n>r) {
        for(int i=n; i>=r; i--) {
        result = result * i;
        }
        System.out.println(n+" people can occupy "+r+" seats in "+result+" different ways.");
      }
      else {
        System.out.println("n must be greater than r.");
      }
      sc.close();
    }
}








 		



