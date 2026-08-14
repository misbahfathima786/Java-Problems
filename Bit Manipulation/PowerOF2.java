import java.util.Scanner;
class PowerOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check whether it is a power of 2 or not : ");
        int n = sc.nextInt();
        int newNumber = n - 1;
        if((newNumber & n ) == 0) 
            System.out.println("Given number is a power of 2.");
        else 
            System.out.println("Given number is not a power of 2.");
        sc.close();
    }
}