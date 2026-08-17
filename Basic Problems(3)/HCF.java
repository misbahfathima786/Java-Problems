import java.util.Scanner;
class HCF {
    public static int hcf(int a,int b) {
        int result;
        if(b==0) {
            return a;
        }
        else {
            return hcf(b,a%b);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two values..");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = hcf(a,b);
        System.out.println("HCF("+a+", "+b +") = "+result);
        sc.close();
    }
}