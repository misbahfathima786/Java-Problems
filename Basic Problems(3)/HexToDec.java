import java.util.Scanner;
class HexToDec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Hexa Decimal number : ");
        String n = sc.next();
        int a = n.length();
        int count = 0;
        int res = 0;
        while(a != 0) { 
          int n2 = n.charAt(a-1);
          if(n2>='0' && n2<='9') {
            n2 = n2 - '0';
          }
          else if(n2>='A' && n2<='F'){
            n2 = (int) n2 - 'A' + 10;
          }
          int n1 = (int) Math.pow(16,count);
          res += n1 * n2;
          a--;
          count++;
        }
        System.out.println("Decimal number of "+n+" = "+res+".");
        sc.close();
    }
}