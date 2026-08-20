import java.util.*;

public class Recursion {
    public static void permutation(String str, int start, int end) {
        if (start == end) {
            System.out.println(str);
            return;
        }
        for (int i = start; i < end; i++) {
            str = swap(str, start, i);
            permutation(str, start + 1, end);
            str = swap(str, start, i);
        }
    }

    public static String swap(String str, int i, int j) {
        char[] arr = str.toCharArray();
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return new String(arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = sc.next();
        System.out.println("Permutations of a string:");
        permutation(str, 0, str.length());
        sc.close();
    }
}