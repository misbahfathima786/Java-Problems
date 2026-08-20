import java.util.*;

public class Smallest {
    public static int smallest(int arr[], int i) {
        if(arr.length-1 == i) {
            return arr[i];
        }
        int result = smallest(arr,i+1);
        if(arr[i]<result) {
          result = arr[i];
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of an array = ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        if(size == 0) {
          System.out.println("Array size should be greater than zero.");
          return;
        }
        for(int i = 0; i<size; i++) {
          arr[i] = sc.nextInt();
        }
        int result = smallest(arr,0);
        System.out.println("Smallest element in an given array = "+result);
        sc.close();
    }
}