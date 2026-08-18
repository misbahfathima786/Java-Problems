import java.util.Scanner;
class Days {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number of month (1 for Jan , 2 for Feb etc...): ");
        int n = sc.nextInt();
        System.out.print("Enter a year : ");
        int year = sc.nextInt();
        switch(n) {
          case 1,3,5,10,12:
            System.out.println("Month "+n+" has 31 Days");
            break;
          case 4,6,9,11:
            System.out.println("Month "+n+" has 30 Days");
            break;
          case 2:
            if(year%400 == 0 || ((year%4==0) && (year%100 != 0))) {
              System.out.println("Month "+n+" has 29 Days");
            }
            else {
              System.out.println("Month "+n+" has 28 Days");
            }
            break;
          default:
            System.out.println("Invalid month number(Enter only between 1 and 12)");
        }
        sc.close();
    }
}













