import java.util.*;

public class Recursion {
    public static int length(String str , int index) {
      if(str.length() == index) {
        return 0;
      }
      else {
        return 1 + length(str , index+1);
      }
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a string : ");
      String str = sc .next();
      int length = length(str , 0);
      System.out.println("Length of a string = "+length);
      sc.close();
    }
}