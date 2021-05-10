import java.util.Scanner;
//scanner for the program

public class RunShop {
	//name of the class

	public static void main(String[] args) {
		//specific array of strings being used for this programs parameter
		
		Scanner input = new Scanner(System.in);
		//inputting the scanner in the program as a new scanner
		
		Shop shop = new Shop();
		//shop program identified as a new class
		
		shop.run();
		//begins the run of the shop program
		//Shop.java
		
		System.out.println("Ran with Cheese Total: " + Cheese.numCheese);
		//program prints out "Ran with Cheese Total: " and includes how ever many cheeses are used in the program which is 3
		
		input.close();
		//closes/ends the program run
	}
}
//end of program and lab