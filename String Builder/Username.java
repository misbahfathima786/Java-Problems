import java.util.Scanner;
class StringBuilders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an email : ");
        String email = sc.next();
        StringBuilder sb = new StringBuilder();
        sb.append(email);
        for(int i=0; i<email.length(); i++) {
            if(email.charAt(i)=='@') {
                sb.delete(i,sb.length());
                break;
            }
        }
        System.out.println("Username = "+sb);
    }
}