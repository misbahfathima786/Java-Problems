import java.util.Scanner;
class DecToHex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Decimal number : ");
        int n = sc.nextInt();
        int rem = 0;
        int num = n;
        int n1 = num;
        String hex = "0123456789ABCDEF";
        String res = "";
        while(num != 0) {
          rem = num % 16;
          if(rem >=0 && rem <= 15) {
            res = hex.charAt(rem) + res;
          }
          num /= 16;
        }
        System.out.println("Hexa Decimal number of "+n+" = "+res+".");
        sc.close();
    }
}