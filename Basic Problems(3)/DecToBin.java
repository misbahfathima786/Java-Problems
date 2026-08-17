import java.util.Scanner;
class DecToBin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Decimal number : ");
        int n = sc.nextInt();
        int rem = 0;
        int num = n;
        int n1 = num;
        int res = 0;
        int place = 1;
        while(num != 0) {
          rem = num % 2;
          res += rem * place;
          place *= 10;
          num /= 2;
        }
        System.out.println("Binary number of "+n+" = "+res+".");
        sc.close();
    }
}