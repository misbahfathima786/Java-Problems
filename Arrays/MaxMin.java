import java.util.Scanner;
class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbers[] = {-2,10,18,17,-4};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int num : numbers) {
            if(num>max) {
                max = num;
            }
            if(num<min) {
                min = num;
            }
        }
        System.out.println("Maximum value in an array is : "+max);
        System.out.println("Minimum value in an array is : "+min);
        sc.close();
    }
}