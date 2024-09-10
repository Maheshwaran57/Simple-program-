import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        int numberToGuess = rand.nextInt(100) + 1;
        int numberOfTries = 0;
        int guess;
        boolean win = false;

        while (!win) {
            System.out.print("Guess a number between 1 and 100: ");
            guess = scanner.nextInt();
            numberOfTries++;

            if (guess == numberToGuess) {
                win = true;
            } else if (guess < numberToGuess) {
                System.out.println("Too low!");
            } else {
                System.out.println("Too high!");
            }
        }

        System.out.println("You win! The number was " + numberToGuess);
        System.out.println("It took you " + numberOfTries + " tries.");
    }
}
