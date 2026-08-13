import java.util.Scanner;

class PerfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        boolean isPerfectSquare = false;

        for(int i = 1; i <= n; i++) {
            if(i * i == n) {
                isPerfectSquare = true;
                break;
            }
        }

        if(isPerfectSquare) {
            System.out.println(n + " is a Perfect Square.");
        }
        else {
            System.out.println(n + " is not a Perfect Square.");
        }

        sc.close();
    }
}