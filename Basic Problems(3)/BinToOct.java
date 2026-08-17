import java.util.Scanner;
class BinToOct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number(0/1) : ");
        int n = sc.nextInt();
        int num = n;
        int pow = 0;
        int res1 = 0;
        while(num != 0) {
          int n1 = (int) Math.pow(2,pow);
          int bit = num % 10;
          num /= 10;
          pow++;
          res1 += bit * n1;
        }
        System.out.println("Decimal number of "+n+" = "+res1);
        int dec = res1;
        int place = 1;
        int rem = 0;
        int res2 = 0;
        while(dec != 0) {
          rem = dec % 8;
          res2 += rem * place;
          place *= 10;
          dec /= 8;
        }
        System.out.println("Octal number of "+n+" = "+res2);
        System.out.println("Binary -> Decimal -> Octal.");
        sc.close();
    }
} 