public class Game {
    public static void main(String[] args) {
      
      Jar jarObj = new Jar();
      Prompter proObj = new Prompter();
      try{
      jarObj.adminInput(); //Enter item and max items allowed in jar
      } catch(IllegalArgumentException iae) {
       System.out.printf("ERROR: %s", iae.getMessage()); 
      }
      
      jarObj.jarFill(jarObj.mMaxItems); //Fills jar with random amount
      
      proObj.player(jarObj.mItem, jarObj.mMaxItems);
      
      while(jarObj.getItemNum() != proObj.guess()) {
        proObj.guessCounter();
      }
      System.out.printf("Congratulations! You guessed that there are %d %s in the jar. It took you %d guess(es) to win.", jarObj.getItemNum(), jarObj.mItem, proObj.mGuessMade);
    }
}