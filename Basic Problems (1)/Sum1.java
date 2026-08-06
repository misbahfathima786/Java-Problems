import java.util.Scanner;
class Sum1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        int n = sc.nextInt();
        System.out.print("Enter 2nd number : ");
        int m = sc.nextInt();
        int sum = 0;
        for(int i=n; i<=m; i++) {
            sum += i;
        }
        System.out.println("Sum of First N Natural Numbers = "+sum);
        sc.close();
    }
}