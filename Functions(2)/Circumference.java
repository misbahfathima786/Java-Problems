import java.util.Scanner;
class Functions {
    public static double circumference(int r) {
        return (double)2*3.14*r;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a radius of a circle: ");
         int r = sc.nextInt();
        double result = circumference(r);
        System.out.println("Circumference of a circle is : " +result);
        sc.close();
    }
}