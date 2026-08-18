import java.util.*;

public class Handshake {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("How many people are there in a room ? ");
      int n = sc.nextInt();
      int handshake = n*(n-1)/2;
      System.out.println("Total number of Handshakes = "+handshake);
    }
}