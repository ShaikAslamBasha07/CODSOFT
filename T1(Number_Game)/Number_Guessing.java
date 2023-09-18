import java.util.Scanner;
import java.util.Random;

public class Number_Guessing {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand1 = new Random();
        int scores = 0;
        boolean plays = true;
        while (plays) {
            System.out.println("Welcome to the Number Guessing Game!");
            System.out.println("I have generated a random number between 1 and 100.");
            int randomNum = rand1.nextInt(100) + 1;
            int attempt = 0;
            while (true) {
                System.out.print("Enter your guess: ");
                int guesses = scan.nextInt();
                attempt++;
                if (guesses == randomNum) {
                    System.out.println("Congratulations! Your guess is correct!");
                    scores++;
                    break;
                } else if (guesses < randomNum) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }
                if (attempt== 3) {
                    System.out.println("sorry!! You have reached the maximum number of attempts.");
                    System.out.println("The correct number was " + randomNum);
                    break;
                }
            }
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainInput = scan.next().toLowerCase();
            plays = playAgainInput.equals("yes");
        }
        System.out.println("Game over!");
        System.out.println("Your score is " + scores);
    }
}