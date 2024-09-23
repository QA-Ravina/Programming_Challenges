import java.util.Scanner;

public class MaxArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to calculation of the Greatest\n");
         int[] Arr = ArrayUtility.inputArray();

            int max = Integer.MIN_VALUE;
            for(int num : Arr){
                if (max < num){
                    max = num;
                }
            }
            System.out.println("Maximum number is : " + max);
        }

    }

