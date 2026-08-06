import java.util.Scanner;
class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int result = 0;
        result = n%2==0 ? 1 : 0;
        if(result==1) {
            System.out.print("Given number is Even.");
        }
        else {
            System.out.print("Given number is Odd.");
        }
        sc.close();
    }
}