import java.util.Scanner;
class Functions {
    public static int gcd(int a,int b) {
        int result;
        if(b==0) {
            return a;
        }
        else {
            return gcd(b,a%b);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two values : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = gcd(a,b);
        System.out.println("GCD("+a+", "+b +") = "+result);
        sc.close();
    }
}