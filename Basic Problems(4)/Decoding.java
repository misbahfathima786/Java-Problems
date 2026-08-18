import java.util.*;

public class Decoding {
  public static int countWays(String str) {

    if (str.length() == 0) {
        return 1;
    }

    if (str.charAt(0) == '0') {
        return 0;
    }

    int ways = countWays(str.substring(1));

    if (str.length() >= 2) {

        int num = Integer.parseInt(str.substring(0, 2));

        if (num >= 10 && num <= 26) {
            ways += countWays(str.substring(2));
        }
    }

    return ways;
  }
  public static void main(String[] args) {
      
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a digit sequence: ");
    String str = sc.next();

    System.out.println("Number of possible decodings = " + countWays(str));
    sc.close();
  }
}