import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to password checker\n");
        String password;
        do {
            System.out.print("Enter the password: ");
            password = input.next();
        } while (!isValid(password));

        System.out.println("Thanks for entering a valid password");
    }

    public static boolean isValid(String password){
        return password.length() > 6 ;
    }
}
