import java.util.*;

public class Recursion {

    public static void subsets(int arr[], int index, ArrayList<Integer> current) {

        if (index == arr.length) {
            System.out.println(current);
            return;
        }

        // Include the current element
        current.add(arr[index]);
        subsets(arr, index + 1, current);

        // Remove the current element
        current.remove(current.size() - 1);

        // Exclude the current element
        subsets(arr, index + 1, current);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        ArrayList<Integer> current = new ArrayList<>();

        subsets(arr, 0, current);

        sc.close();
    }
}