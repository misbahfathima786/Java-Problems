import java.util.Scanner;
class GreatestOf3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number : ");
        int b = sc.nextInt();
        System.out.print("Enter 3rd number : ");
        int c = sc.nextInt();
        if(a>=b && a>=c) {
            System.out.println("1st number is greater.");
        }
        else if(b>=a && b>=c) {
            System.out.println("2nd number is greater.");
        }
        else {
            System.out.println("3rd number is greater.");
        }
        sc.close();
    }
}