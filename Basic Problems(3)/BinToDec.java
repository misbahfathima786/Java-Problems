import java.util.Scanner;
class BinToDec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number(0/1) : ");
        int n = sc.nextInt();
        int num = n;
        int pow = 0;
        int res = 0;
        while(num != 0) {
          int n1 = (int) Math.pow(2,pow);
          int bit = num % 10;
          num /= 10;
          pow++;
          res += bit * n1;
        }
        System.out.println("Decimal number of "+n+" = "+res);
        sc.close();
    }
}