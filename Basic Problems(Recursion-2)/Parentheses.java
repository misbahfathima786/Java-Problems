import java.util.*;

public class Recursion {
    public static void generate(int n, int open, int close, String current) {
      if(open == n && close == n) {
        System.out.println(current);
        return;
      }
      else if(open<n) {
        current += "(";
        open += 1;
        generate(n,open,close,current);
      }
      if(close<open) {
        current += ")";
        close += 1;
        generate(n,open,close,current);
      }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer : ");
        int n = sc.nextInt();
        generate(n,0,0,"");
        sc.close();
    }
}