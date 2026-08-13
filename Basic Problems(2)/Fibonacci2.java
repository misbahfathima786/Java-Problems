import java.util.Scanner;
class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int first = 0;
        int second = 1;
        int next = 0;
        if(n==0) {
            System.out.println("n must be greater than 0");
            return;
        }
        if(n==1) {
            System.out.println("Fibonacci term at position " + n + " is 0.");
            return;
        }
        if(n == 2) {
          System.out.println("Fibonacci term at position " + n + " is 1.");
          return;
        }
        for(int i=3;i<=n;i++) {
            next = first + second;
            //System.out.print(next +" ");
            first = second;
            second = next;
        }
        System.out.println("Fibonacci term at position " + n + " is " + next+".");
        sc.close();
    }
}