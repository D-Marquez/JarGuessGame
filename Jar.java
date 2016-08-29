import java.util.Scanner;
import java.util.Random;

public class Jar {
  public String mItem = "";
  private int mItemsInJar = 0;
  public int mMaxItems = 0;
  
  Scanner itemType = new Scanner(System.in);
  
  public void adminInput() {
   System.out.println("ADMINISTRATION SETUP\n====================");
   System.out.println("The items in the jar are: "); 
   mItem = itemType.next();
   if(mItem.contains("[0-9]+") && mItem.length() > 2) {
     throw new IllegalArgumentException("Please only use letters.\n\n");
   }
   
   
   System.out.println("Maximum number of items in the jar: ");
   mMaxItems = itemType.nextInt();
   if(mMaxItems == 0) {
    throw new IllegalArgumentException("Please use a number greater than 0.\n\n"); 
   }
  }  
  
  public String getItem() {
   return mItem; 
  }
  
  public int getItemNum() {
   return mItemsInJar; 
  }
  
  public void jarFill(int maxNum) {
    Random random = new Random();
    mItemsInJar = random.nextInt(maxNum);
  }
  
}