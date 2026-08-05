import java.util.Scanner;
class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String string = sc.next();
        String result = "";
        for(int i=0; i<string.length(); i++) {
            if(string.charAt(i)=='e') {
                result += 'i';
            }
            else{
                result += string.charAt(i);
            }
        }
        System.out.println("Resultant String after replacement of character = "+result);
        sc.close();
    }
}