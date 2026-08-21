import java.util.*;

public class Recursion {
    public static int pascal(int row, int col) {
      if(col==0 || col==row) {
        return 1;
      }
      else {
        return pascal(row-1,col-1)+pascal(row-1,col);
      }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Nth row value : ");
        int row = sc.nextInt();
        for(int col=0; col<=row; col++) {
          int res = pascal(row,col);
          System.out.print(res+" ");
        }
        sc.close();
    }
}