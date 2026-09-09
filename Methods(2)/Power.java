import java.util.Scanner;
class Functions {
    public static int power(int x,int n) {
        int result = 1;
        for(int i=1;i<=n;i++) {
            result = result*x;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base value : ");
        int x = sc.nextInt();
        System.out.print("Enter the exponent value : ");
        int n = sc.nextInt();
        int result = power(x,n);
        System.out.println("Result = "+result);
        sc.close();
    }
}