import java.util.Scanner;
class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int size = sc.nextInt();
        int numbers[] = new int[size];
        boolean isAssending = true;
        for(int i=0; i<size; i++) {
            numbers[i] = sc.nextInt();
        }
        for(int i=0; i<numbers.length - 1; i++) {
            if(numbers[i] > numbers[i+1]) {
                isAssending = false;
            }
        }
        if(isAssending) {
            System.out.println("Array elements are in assending order.");
        }
        else {
            System.out.println("Array elements are not in assending order.");
        }
        sc.close();
    }
}