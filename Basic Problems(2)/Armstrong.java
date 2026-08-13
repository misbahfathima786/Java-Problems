import java.util.Scanner;
class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int number = n;
        int num = n;
        int count = 0;
        int rem = 0;
        int result = 0;
        while(num != 0) {
            num /= 10;
            count++;
        }
        while(n != 0) {
            rem = n % 10;
            result += (int) Math.pow(rem , count);
            n /= 10;
        }
        if(number == result) {
            System.out.println("Given number is Armstrong number.");
        }
        else{
            System.out.println("Given number is not an Armstrong number.");
        }
        sc.close();    
    }
}












