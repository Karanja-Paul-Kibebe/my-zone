import java.util.Random;
import java.util.Scanner;
public class Game{
    public static void main(String[] args) {
        Random rand = new Random();
        int secretNumber = rand.nextInt(100) +1;
        int guess;
        int attempts = 0;
        //My Game Title
        System.out.println("Number Guessing Game by Karanja Paul K.");
        System.out.println("Guess the number between 1 and 100!");
        try (Scanner input = new Scanner(System.in)){
        while(true) {
            System.out.println("Enter your guess: ");
            guess = input.nextInt();
            attempts++;
            if (guess == secretNumber) {
                System.out.println("Corect! You guessed it in! Atleast Wewe sio mjinga!" + "" + attempts + "tries.");
                break;
            } else if (guess < secretNumber) {
                System.out.println("Too low! You must be totally Iliterate");
            } else {
                System.out.println("Too high! Very Foolish!");
            }
        }
    }
    }
}