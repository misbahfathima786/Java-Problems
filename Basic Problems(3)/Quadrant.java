import java.util.*;

public class Quadrant {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the value of x : ");
      int x = sc.nextInt();
      System.out.print("Enter the value of y : ");
      int y = sc.nextInt();
      if(x>0 && y>0) {
        System.out.println("Coordinate : ("+x+" , " +y+").");
        System.out.println("Point lies in the 1st Quadrant.");
      }
      else if(x<0 && y>0) {
        System.out.println("Coordinate : ("+x+" , " +y+").");
        System.out.println("Point lies in the 2nd Quadrant.");
      }
      else if(x<0 && y<0) {
        System.out.println("Coordinate : ("+x+" , " +y+").");
        System.out.println("Point lies in the 3rd Quadrant.");
      }
      else if(x>0 && y<0) {
        System.out.println("Coordinate : ("+x+" , " +y+").");
        System.out.println("Point lies in the 4th Quadrant.");
      }
      else if(x==0 && y!=0) {
        System.out.println("Coordinate : ("+x+" , " +y+").");
        System.out.println("Point lies on the Y-Axis."); 
      }
      else if(y==0 && x!=0) {
        System.out.println("Coordinate : ("+x+" , " +y+").");
        System.out.println("Point lies in the X-Axis.");
      }
      else {
        System.out.println("Coordinate : ("+x+" , " +y+").");
        System.out.println("Point is at the Origin.");
      }
      sc.close();
    }
}












