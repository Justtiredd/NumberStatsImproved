/**
 * @author Nathan Henriques
 * @date 06/11/2024
 * a code that calculates whether or not it is true that the number is Odd, even or prime
 */

package Com.Nathan;
import java.util.Scanner;

public class NumberStats {

	/**
	 * the main method
	 * @param args The command line arguments
	 */
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        System.out.println("type in your number: ");
	        
	        // To ask the user for a number, use `input.nextInt()`
	        int num = input.nextInt();
	        MyNumber myNumber = new MyNumber(num);
	        System.out.println(myNumber.isEven());
	        System.out.println(myNumber.isOdd());
	        System.out.println(myNumber.isPrime());
	    }
	}

	// a constructor that holds the value of the number
	class MyNumber {
	    private int val;
	   public MyNumber(int val) {
		   this.val = val;
	   }
	   /**
	    * gives the value of the users input
	    * @return returns the value of the users input
	    */
	   // returns the value of the number
	   public int getVal() {
		   return val;
	   } 
	
	   /**
	    * calculates if the number provided by the user is odd
	    * @return returns if the number is odd or not
	    */   
	   
	   // creates a constructor to check if the number is odd
	   public boolean isOdd() {
		   return (val % 2 != 0);   
	   }
	   
	   /**
	    * calculates if the number provided by the user is even
	    * @return returns whether the number provided is even or not
	    */
	   
	  // creates a constructor that checks to see if the number is even
	   public boolean isEven() {
		   return (val % 2 == 0);   
	   }  
	   
	   /**
	    * checks the users number and checks to see if it is a prime number
	    * @return returns the value if it a prime number
	    */
	   
	   // defines isPrime to check if the number is prime or not
	   public boolean isPrime() {
		   if (val == 1) {
			   return false;
		   }
		   

		   for (int i = 2; i < val; i++) {
			  if (val % i == 0) {
			   return false;
			   
		   }
		   
	   }
		return true;

	   	}
	}
	