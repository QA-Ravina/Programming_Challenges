import java.util.Scanner;

public class OccurencesForEach {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to finding occurences\n");
        int[] num = ArrayUtility.inputArray();
        System.out.print("Now enter the number you want to search: ");
        int element = input.nextInt();
        int occ =  countOccurences(num, element);
        System.out.println("Your element was found " + occ + " times");
    }

    public static int countOccurences(int[] num, int element){
        int occ = 0;
        for ( int arr : num) {
            if( arr == element){
                occ++;
            }
        }
        return occ;
    }
}
