import java.util.*;

public class Recursion {

    public static String removeDuplicates(String str) {

        if (str.length() <= 1) {
            return str;
        }

        if (str.charAt(0) == str.charAt(1)) {

            int i = 0;

            while (i < str.length() &&
                   str.charAt(i) == str.charAt(0)) {
                i++;
            }

            return removeDuplicates(str.substring(i));
        }

        return str.charAt(0) + removeDuplicates(str.substring(1));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.next();

        String result = removeDuplicates(str);

        System.out.println("Result: " + result);

        sc.close();
    }
}