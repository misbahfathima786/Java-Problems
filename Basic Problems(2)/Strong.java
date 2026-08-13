import java.util.Scanner;
class Strong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int num = n;
        int result = 0;
        while(num != 0) {
          int reminder = num%10;
          int number = 1;
          for(int i=1; i<=reminder; i++) {
            number *= i;
          }
          result += number;
          num /= 10;
        }
        System.out.println("Given number = "+n+".");
        System.out.println("Resultant number = "+result+".");
        if(n == result) {
          System.out.println("Given number == Resultant number. so...");
          System.out.println(n+" is a Strong number.");
        }
        else {
          System.out.println("Given number != Resultant number. so...");
          System.out.println(n+" is not a Strong number.");
        }
        sc.close();
    }
}