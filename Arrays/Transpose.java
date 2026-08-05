import java.util.Scanner;
class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns : ");
        int cols = sc.nextInt();
        int nums[][] = new int[rows][cols];
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                nums[i][j] = sc.nextInt();
            }
        }
        System.out.println("Given array");
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Transpose of given array");
        for(int j=0; j<cols; j++) {
            for(int i=0; i<rows; i++) {
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }
        
        sc.close();
    }
}