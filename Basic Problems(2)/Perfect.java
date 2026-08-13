import java.util.Scanner;
class Perfect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int result = 0;
        for(int i=1; i<n; i++) {
          if(n%i == 0) {
            result += i;
          }
        }
        System.out.println("Given number = "+n+".");
        System.out.println("Resultant number = "+result+".");
        if(n == result) {
          System.out.println("Given number == Resultant number. so...");
          System.out.println(n+" is a Perfect number.");
        }
        else {
          System.out.println("Given number != Resultant number. so...");
          System.out.println(n+" is not a Perfect number.");
        }
        sc.close();
    }
}