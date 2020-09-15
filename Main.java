import java.util.Scanner;
/**
 *Making program to orgnaize numbers from least to greatest
 * @author Gavin Sandhar
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // organize number from least to greatest

    // Create a scanner for user input
    Scanner input = new Scanner(System.in);
    
    // ask user to enter two numbers
    System.out.print("Please enter a number:");
    int number1 = input.nextInt();

    System.out.print("Please enter another number:");
    int number2 = input.nextInt();

    // determine which number is greater    
    if(number1>number2){
      // tell them if the number is greater
      System.out.print("Your numbers in ascending order are" + number2 + "," + number1 );
    }else if(number1==number2){
      // tell them the numbers are equal
      System.out.print("Your numbers in ascending order are" + number1 + "," + number2);
    }else {
      // or if the other number is greater
      System.out.println("Your numbers in ascending order are" + number1 + "," + number2);
    }

  
    
  }
}