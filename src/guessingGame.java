import java.util.Scanner;

public class guessingGame {

    //create a number guessing game where the program selects a random number, and the user has
    //to guess it

    int random;

    guessingGame() {
        random = (int) Math.ceil(Math.random() * 100);
    }


    /*
    @param guessNumber the number that player guessed
    @return
    - negative if the guessed number is smaller
    0 zero if the guessed number is correct
    + positive if the guessed number is higher
     */

    int guess(int guessNumber) {
        return guessNumber - random;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        guessingGame game = new guessingGame();
        System.out.println("Welcome to the world of guessing game, guess a number between 1-100\n");
        int guess;
        int result;

        do {
            System.out.print("Guess a number: ");
            guess = input.nextInt();
            result = game.guess(guess);
            if (result == 0){
                System.out.println("Congrats, your guess is correct");
            } else if (result < 0){
                System.out.println("Please guess higher");
            } else {
                System.out.println("Please guess lower");
            }
        } while (result != 0);

    }

}
