import java.util.Scanner;
class Roots {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a : ");
        double a = sc.nextDouble();
        System.out.print("Enter the value of b : ");
        double b = sc.nextDouble();
        System.out.print("Enter the value of c : ");
        double c = sc.nextDouble();
        double d = (b*b) - 4*a*c;
        double root1 = 0;
        double root2 = 0;
        double root = 0;
        if(d>0) {
          root1 = ((-b+Math.sqrt(d)) / (2*a));
          root2 = ((-b-Math.sqrt(d)) / (2*a));
          System.out.println("Root 1 = "+root1);
          System.out.println("Root 2 = "+root2);
        }
        else if(d==0) {
          root = ((-b+Math.sqrt(d)) / (2*a));
          System.out.println("Root = "+root);
        }
        else {
          System.out.println("Equation has no real roots");
        }
        sc.close();
    }
}