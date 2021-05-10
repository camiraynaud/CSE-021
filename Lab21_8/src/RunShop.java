import java.util.Scanner;
//scanner for the program

public class RunShop {
	//name of the class

	public static void main(String[] args) {
		//specific array of strings being used for this programs parameter
		Scanner input = new Scanner(System.in);
		//inputting the scanner in the program as a new scanner

		System.out.print("Enter the number of Cheeses for shop setup: ");
		//program displays this statement asking the program user for an input
		//"Enter the number of Cheeses for shop setup: "
		int max = input.nextInt();
		//integer max is equal to the input from the program user

		ShopArr shop = new ShopArr();
		//shop arr program identified as a new shop arr class

		shop.init(max);
		//shop instance initialization method for max

		shop.run();
		//begins the run of the shop program
		//Shop.java

		System.out.println("Ran with Cheese Total: " + max);
		//program prints out "Ran with Cheese Total: " + max and includes how ever many cheeses are used in the program which is 3

		input.close();
		//closes/ends the program run
	}
}
//end of program and lab