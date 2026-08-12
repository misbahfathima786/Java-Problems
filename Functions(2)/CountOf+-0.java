import java.util.Scanner;
class Functions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int positive = 0;
        int negative = 0;
        int zero = 0;
        int choice;
        do{
            System.out.print("Enter a number : ");
            int n = sc.nextInt();
            if(n>0) {
                positive+=1;
            }
            else if(n<0) {
                negative+=1;
            }
            else {
               zero+=1; 
            }
            System.out.println("Do you want to continue ? yes(1) / no(0).");
            choice = sc.nextInt();
        }while(choice!=0);
        System.out.println("Count of positive numbers = "+positive);
        System.out.println("Count of negative numbers = "+negative);
        System.out.println("Count of zero = "+zero);
        sc.close();
    }
}