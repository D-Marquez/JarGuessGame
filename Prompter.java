import java.util.Scanner;

public class Prompter {
  
  Scanner guessInput = new Scanner(System.in);
  
  public int mGuess = 0;
  public int mGuessMade = 1;
  
   public void player(String a, int b) {
    System.out.println("PLAYER\n====================");
    System.out.printf("Your goal is to guess how many %s are in the jar. Your guess should be between 1 and %d.\n\n", a, b);
   }
  
  public int guess() {
   System.out.println("Guess: ");
   mGuess = guessInput.nextInt();
    return mGuess;
  }
  
  public int guessCounter() {
   ++mGuessMade;
   return mGuessMade;
  }
  
}