import java.util.Scanner;

public class MultiplicationTableFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Multiplication table\n");
        System.out.print("Enter the number for which you want to print the table: ");
        int num = input.nextInt();
        for (int i = 1; i <= 10; i++){
            System.out.println(num + " * " + i + " = " + (num*i));
        }

    }
}
