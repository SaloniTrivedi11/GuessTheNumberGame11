import java.util.Scanner;
import java.util.Random;

public class GuessTheNumberGame {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();

        int target = rnd.nextInt(100) + 1;
        int maxAttempts = 10;
        int currAttempts = 0;
        boolean hasWon = false;

        System.out.println("Welcome to The Number Guessing Game!!");
        System.out.println("You've at max 10 attempts to go.");

        while(currAttempts < maxAttempts && !hasWon) {
            System.out.println("Enter your number between 1 to 100!!");
            int n = sc.nextInt();
            currAttempts++;

            if(n == target) {
                System.out.println("Correct!! You Won in " + currAttempts + " tries.");
                hasWon = true;
            } else if (n < target){
                System.out.println("Your number is too low!");
                continue;
            } else {
                System.out.println("Your number is too high!");
                continue;
            }

            if(!hasWon) {
                System.out.println("Game Over!! The Value was " + target);
            }
        }

        sc.close();
    }
}