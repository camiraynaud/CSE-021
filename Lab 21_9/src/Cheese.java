//program code begins here
import java.util.Scanner;
//scanner inputed here
public class Cheese {
	//shop class initialized here 
	private String name;
	//initialized string for name
	private double price;
	//initialized decimal for price
	private double amount;
	//initialized decimal for the amount
	public static int numCheese = 0;
	//program shop class initialized
	//numCheese initialized to equal zero

	public Cheese() { 
		//public class for Cheese.java
		// Constructor with no parameters
		name = "";
		//name is equal to whatever is used in the program at a specific time
		price = 0;
		//price is set to the amount of zero to start off 
		amount = 0;
		//amount is set to the amount of zero to start off 
		numCheese++;
		//post-increment operator
		//adds the value of 1
	}

	public Cheese(String name) { 
		// Constructor with name as paramter
		//public class for Cheese.java
		this.name = name;
		//instance variable where the name variable is a parameter
		price = 0;
		//price is set to the amount of zero to start off 
		amount = 0;
		//amount is set to the amount of zero to start off 
		numCheese++;
		//post-increment operator for numCheese
		//adds the value of 1
	}

	public Cheese(String name, double price) {
		// Constructor with 2 parameters
		//public class for Cheese.java
		//string and double types for the variables initialzied 
		this.name = name;
		//instance variable where the name variable is a parameter for name
		this.price = price;
		//instance variable where the price variable is a parameter for price
		amount = 0;
		//amount is set to the amount of zero to start off 
		numCheese++;
		//post-increment operator for numCheese
		//adds the value of 1
	}

	public String getName() { 
		//Accessor
		//public class for getName string
		return name;
		//complete execution for name string
	}

	public void setName(String newName) { 
		// Mutator 
		//public class for newName string
		name = newName;
		//name is equal to newName
	}

	public double getPrice() {
		//public class for getPrice double
		return price;
		//the price will be shown at the end
	}

	public void setPrice(double newPrice) {
		//public class for setPrice including the double new Price
		price = newPrice;
		//the price is equal to the new price
	}

	public double getAmount() {
		//public class for the double getAmount
		return amount;
		//complete execution for amount
	}

	public void setAmount(Scanner input) {
		//public class for setAmount including the scanner input from the begining
		amount = input.nextDouble();
		//the amount is equal to the input provided by the program user
	}
	//end of the programs code
}