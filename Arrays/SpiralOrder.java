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
        System.out.println("Given array is:");
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Spiral order of given array is:");
        int rowStart = 0;
        int rowEnd = rows-1;
        int colStart = 0;
        int colEnd = cols-1;
        while(rowStart<=rowEnd && colStart<=colEnd) {
            for(int col=colStart; col<=colEnd; col++) {
                System.out.print(nums[rowStart][col]+" ");
            }
            rowStart++;
            for(int row=rowStart; row<=rowEnd; row++) {
                System.out.print(nums[row][colEnd]+" ");
            }
            colEnd--;
            for(int col=colEnd; col>=colStart; col--) {
                System.out.print(nums[rowEnd][col]+" ");
            }
            rowEnd--;
            for(int row=rowEnd; row>=rowStart; row--) {
                System.out.print(nums[row][colStart]+" ");
            }
            colStart++;
        }
        sc.close();
    }
}