import java.util.Scanner;

public class ArrayUtility {
    public static void main(String[] args) {
        inputArray();
        }

        public static int[] inputArray(){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the length of the array: ");
            int size = input.nextInt();
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                System.out.print("Enter the array number  " + (i + 1) + " : ");
                arr[i] = input.nextInt();
        }
            return arr;
    }
}
