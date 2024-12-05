import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame { 

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in); 
    Random randomGenerator = new Random(); 
    int totalRoundsPlayed = 0; 
    int totalGuesses = 0; 
    int gamesWon = 0; 
    int gamesLost = 0; 

    while (true) {
      totalRoundsPlayed++;
      int targetNumber = randomGenerator.nextInt(100) + 1; 
      System.out.println("Round " + totalRoundsPlayed + ": Guess the number between 1 and 100!");
      int currentAttempt = 0; 
      boolean guessCorrect = false; 
      while (currentAttempt < 10) {
        System.out.print("Enter your guess: ");
        int userGuess = input.nextInt();
        currentAttempt++;

        if (userGuess == targetNumber) {
          System.out.println("Correct! You guessed the number!");
          guessCorrect = true;
          gamesWon++;
          break;
        } else if (userGuess < targetNumber) {
          System.out.println("Too low. Try again!");
        } else {
          System.out.println("Too high. Try again!");
        }
      }

      if (!guessCorrect) {
        System.out.println("You ran out of tries. The number was: " + targetNumber);
        gamesLost++;
      }

      totalGuesses += currentAttempt;

      System.out.print("Do you want to play again? (yes/no): ");
      String response = input.next();

      if (response.equalsIgnoreCase("no")) {
        break;
      }
    }

    System.out.println("\nGame Over!");
    System.out.println("Total rounds played: " + totalRoundsPlayed);
    System.out.println("Total wins: " + gamesWon);
    System.out.println("Total losses: " + gamesLost);
    System.out.println("Total attempts: " + totalGuesses);
    System.out.println("Average attempts per round: " + (double) totalGuesses / totalRoundsPlayed);

    input.close();
  }
}