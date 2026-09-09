import java.util.Scanner;
class Functions {
    public static void adult(int age) {
        if(age>18) {
            System.out.println("Yes this person is an adult , so he / she is eligible for vote!.");
        }
        else {
            System.out.println("No this person is not an adult , so he / she is not eligible for vote!.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age of a person: ");
        int age = sc.nextInt();
        adult(age);
        sc.close();
    }
}