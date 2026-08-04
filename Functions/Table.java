import java.util.Scanner;
class Functions {
    public static void printTable(int n) {
        int product = 1; 
        for(int i=1;i<=10;i++) {
            product = n*i;
            System.out.println(n + "x" + i + "=" + product);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        printTable(n);
        sc.close();
    }
}