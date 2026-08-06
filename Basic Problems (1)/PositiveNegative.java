import java.util.Scanner;
class PositiveNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int result = 0;
        if(n==0) {
            System.out.println("Given number is zero.");
            return;
        }
        else {
            result = n>0 ? 1 :0;
        }
        if(result==1) {
            System.out.print("Given number is positive.");
        }
        else {
            System.out.print("Given number is negative.");
        }
        sc.close();
    }
}