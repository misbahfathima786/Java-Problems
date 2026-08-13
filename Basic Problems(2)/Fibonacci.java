import java.util.Scanner;
class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int first = 0;
        int second = 1;
        int next = 0;
        if(n==0) {
            System.out.println("n must be greater than 0");
            return;
        }
        if(n==1) {
            System.out.println("Fibonacci sequence upto "+n+" is");
            System.out.print(0 +" ");
            return;
        }
        System.out.println("Fibonacci sequence upto "+n+" is");
        System.out.print(0 +" ");
        System.out.print(1 +" ");
        for(int i=2;i<n;i++) {
            next = first + second;
            System.out.print(next +" ");
            first = second;
            second = next;
        }
        sc.close();
    }
}