import java.util.Scanner;

public class FibonacciRecursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to printing of Fibonacci series\n");
        System.out.print("Enter the position upto which you want to print FS: ");
        int position = input.nextInt();
        for (int i = 1; i <= position ; i++ ) {
            System.out.println(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int position){
        System.out.print("."); //to show how many times the method is called
            if (position == 1){
                return 0;
            }
            if( position == 2){
                return 1;
            }

        return fibonacci(position -1 )
                + fibonacci(position - 2);
    }
}
