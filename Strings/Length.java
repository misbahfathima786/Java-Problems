import java.util.Scanner;
class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int size = sc.nextInt();
        String names[] = new String[size];
        for(int i=0; i<size; i++) {
            names[i] = sc.next();
        }
        int toLength = 0;
        for(int i=0; i<names.length; i++) {
            toLength += names[i].length();
        }
        for(int i=0; i<names.length; i++) {
            System.out.println("Length of "+names[i]+" is : "+names[i].length());
        }
        System.out.println("Total Length of the strings in array is : "+toLength);
        sc.close();
    }
}