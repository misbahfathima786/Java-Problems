import java.util.Scanner;
class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int size = sc.nextInt();
        String names[] = new String[size];
        for(int i=0; i<size; i++) {
            names[i] = sc.nextLine();
        }
        for(int i=0; i<size; i++) {
            System.out.print(names[i] + " ");
        }
        sc.close();
    }
}