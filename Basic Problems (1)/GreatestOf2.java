import java.util.Scanner;
class GreatestOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        int n = sc.nextInt();
        System.out.print("Enter 2nd number : ");
        int m = sc.nextInt();
        if(n>=m) {
            System.out.println("1st number is greater.");
        }
        else {
            System.out.println("2nd number is greater.");
        }
        sc.close();
    }
}