import java.util.Scanner;
class DigitsOfOccurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        System.out.print("Enter a number to find it's occurence in n : ");
        int x = sc.nextInt();
        int num = n;
        int count = 0;
        while(num != 0) {
          int rem = num % 10;
          if(rem == x) {
            count++;
          }
          num /= 10;
        }
        System.out.println(x+" has occured "+count+" times in "+n+".");
        sc.close();
    }
}