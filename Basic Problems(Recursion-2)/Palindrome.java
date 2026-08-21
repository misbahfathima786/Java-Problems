import java.util.*;

public class Recursion {

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void palindrome(String str, int start, ArrayList<String> current) {

        if (start == str.length()) {
            System.out.println(current);
            return;
        }

        for (int end = start; end < str.length(); end++) {

            String res = str.substring(start, end + 1);

            if (isPalindrome(res)) {

                current.add(res);

                palindrome(str, end + 1, current);

                current.remove(current.size() - 1);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.next();

        ArrayList<String> current = new ArrayList<>();

        palindrome(str, 0, current);

        sc.close();
    }
}