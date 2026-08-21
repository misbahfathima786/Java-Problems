import java.util.*;

public class Recursion {
    public static int F(int n) {
        if(n==0) 
          return 0;
        else if(n==1)
          return 1;
        else 
          return F(n-1)+F(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer : ");
        int n = sc.nextInt();
        int res = F(n);
        System.out.println("F("+n+") th term = "+res);
        sc.close();
    }
}