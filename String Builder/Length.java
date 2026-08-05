import java.util.Scanner;
class StringBuilders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int size = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        String names[] = new String[size];
        for(int i=0; i<size; i++) {
            names[i] = sc.next();
        }
        int toLength = 0;
        for(int i=0; i<names.length; i++) {
            toLength += names[i].length();
            System.out.println("Length of "+ names[i]+ " is = "+names[i].length());
            sb.append(names[i]);
            
        }
        System.out.println("Total Length = "+sb.length());
        
        sc.close();
    }
}