import java.util.Scanner;

class ExactDivisors {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the limit: ");
        int N = sc.nextInt();

        System.out.print("Enter the number of divisors: ");
        int X = sc.nextInt();

        int answer = 0;

        for (int n = 1; n <= N; n++) {

            int count = 0;

            for (int i = 1; i <= n; i++) {

                if (n % i == 0) {
                    count++;
                }
            }

            if (count == X) {
                answer++;
            }
        }

        System.out.println(
            "Number of integers having exactly " + X +
            " divisors = " + answer
        );
    }
}