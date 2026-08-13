import java.util.Scanner;
class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int fact = 1;
        if(n==0) {
          System.out.println("Factorial of "+n+" is 0.");
          return;
        }
        for(int i=1; i<=n; i++) {
          fact *= i;
        }
        System.out.println("Factorial of "+n+" is "+fact+".");
        sc.close();
    }
}