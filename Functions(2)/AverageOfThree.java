import java.util.Scanner;
class Functions {
    public static float averageOfThree(int a,int b,int c) {
        return (float)(a+b+c)/3;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        float average = averageOfThree(a,b,c);
        System.out.println("Average of three numbers : "+average);
        sc.close();
    }
}