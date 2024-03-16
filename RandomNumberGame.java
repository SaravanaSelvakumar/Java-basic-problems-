import java.util.Random;
import java.util.Scanner;

public class RandomNumberGame {
    public static void main(String[] args) {
        // Initialize Random and Scanner objects
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // Generate a random number between 1 and 5
        int num = random.nextInt(5) + 1;

        int user;

        // Loop until the user guesses the correct number
        while (true) {
            // Read user input
            user = scanner.nextInt();

            // Check if the guessed number matches the random number
            if (num != user) {
                System.out.println("try-again");
            } else if (num == user) {
                System.out.println("you-win");
                break; // Exit the loop if the user guesses correctly
            }
        }
    }
}
