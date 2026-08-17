import java.util.Scanner;
class OctToBin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Octal number : ");
        int n = sc.nextInt();
        int num = n;
        int pow = 0;
        int dec = 0;
        while(num != 0) {
          int n1 = (int) Math.pow(8,pow);
          int digit = num % 10;
          num /= 10;
          pow++;
          dec += digit * n1;
        }
        int rem = 0;
        int n1 = dec;
        int bin = 0;
        int place = 1;
        while(n1 != 0) {
          rem = n1 % 2;
          bin += rem * place;
          place *= 10;
          n1 /= 2;
        }
        System.out.println("Decimal number of "+n+" = "+dec);
        System.out.println("Binary number of "+n+" = "+bin+".");
        sc.close();
    }
}