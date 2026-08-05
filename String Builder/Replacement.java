import java.util.Scanner;
class StringBuilders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String string = sc.next();
        StringBuilder sb = new StringBuilder();
        sb.append(string);
        for(int i=0; i<string.length(); i++) {
            if(string.charAt(i)=='e') {
                sb.setCharAt(i,'i');
            }
        }
        System.out.println("Resultant String after replacement of character = "+sb);
    }
}