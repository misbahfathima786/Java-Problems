import java.util.Scanner;
class DecToOct {
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
          rem = num % 8;
          res += rem * place;
          place *= 10;
          num /= 8;
        }
        System.out.println("Octal number of "+n+" = "+res+".");
        sc.close();
    }
}