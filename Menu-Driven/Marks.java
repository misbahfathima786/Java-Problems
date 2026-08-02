import java.util.Scanner;

class Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks;
        int choice;
        do {
            System.out.println("Enter a choice -> 1 for input , 0 to stop.");
            choice = sc.nextInt();
            if(choice==1) {
                System.out.println("Enter the marks.");
                marks = sc.nextInt();
                if(marks < 0 || marks > 100)
                    System.out.println("Invalid marks!");
                    
                else if(marks >= 90)
                    System.out.println("This is Good.");
                    
                else if(marks >= 60)
                    System.out.println("This is also Good.");
                    
                else
                    System.out.println("This is Good as well.");
            }
            
            else if(choice != 0)
                System.out.println("Invalid choice! Please enter 1 or 0.");
                
        }while(choice != 0);
        sc.close();
    }
}