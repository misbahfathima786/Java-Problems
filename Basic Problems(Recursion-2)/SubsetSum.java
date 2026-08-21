import java.util.*;

public class Recursion {
    public static void subsetSum(int arr[], int index , int sum) {
        if(index == arr.length) {
          System.out.println(sum);
          return;
        } 
        subsetSum(arr,index+1,sum+arr[index]);
        subsetSum(arr,index+1,sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements of an array.");
        for(int i=0; i<size; i++) {
          arr[i] = sc.nextInt();
        }
        subsetSum(arr,0,0);
        sc.close();
    }
}