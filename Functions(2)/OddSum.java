import java.util.Scanner;
class Functions {
    public static int oddSum(int n) {
        int sum = 0;
        for(int i=1;i<=n;i++) {
            if(i%2 != 0) {
                sum += i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sum = oddSum(n);
        System.out.println("Sum of all the odd numbers from 1 to "+ n + " = "+sum);
        sc.close();
    }
}