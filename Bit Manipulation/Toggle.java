import java.util.Scanner;
class Toggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        System.out.print("Enter a position where you want to toggle a number : ");
        int pos = sc.nextInt();
        int bitMasking = 1<<pos;
        int toggledNumber = n ^ bitMasking;
        System.out.println(toggledNumber);
        sc.close();
    }
}