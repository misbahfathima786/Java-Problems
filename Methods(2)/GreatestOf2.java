import java.util.Scanner;
class Functions {
    public static int greatestOfTwoNumbers(int a,int b) {
        return a>b ? a : b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a and b : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int greatest = greatestOfTwoNumbers(a,b);
        System.out.println("Greatest of two numbers is : " +greatest);
        sc.close();
    }
}