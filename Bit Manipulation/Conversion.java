import java.util.*;

public class Conversion {
    public static void decimaltoBinary(int n) {
      int num = n;
      int bit ;
      String result = "";
      while(n != 0) {
        bit = n & 1;
        n = n>>1;
        result += bit;
      }
      String reversed = new StringBuilder(result).reverse().toString();
      System.out.println("Binary number of "+num+" = "+reversed);
    }
    public static void binarytoDecimal(int m) {
      int num = m;
      int pos = 0;
      int result = 0;
      while(m != 0) {
        int bit = m % 10;
        result = result | (bit<<pos);
        pos++;
        m /= 10;
      }
      System.out.println("Decimal number of "+num+" = "+result);
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a decimal number : ");
      int n = sc.nextInt();
      System.out.print("Enter a binary number : ");
      int m = sc.nextInt();
      decimaltoBinary(n);
      binarytoDecimal(m);
      sc.close();
    }
}