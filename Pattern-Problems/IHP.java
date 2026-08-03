import java.util.Scanner;
class IHP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int n = sc.nextInt();
        int number=1;
        for(int i = n;i >= 1;i--) {
            for(int j = 1;j <= i; j++) {
                System.out.print(number+" ");
            }
            number++;
            System.out.println();
        }
        sc.close();
    }
}