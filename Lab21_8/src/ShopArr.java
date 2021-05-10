//program code begins here
import java.util.*;
import java.text.DecimalFormat;
//scanner inputed here

public class ShopArr {
	//shop class initialized here 
	//Shop class is called ShopArr
	//Instance Variables
	private Cheese cheese[];
	//shop class initialized here 
	//shop class called cheese with cheese 
	static DecimalFormat numFormat = new DecimalFormat("#.00");
	//static for the number formating used which will be a decimal format
	//Shop constructor initializes the 3 types of cheeses sold, along with their prices.

	//Initialize method
	void init(int max) {
		//void = method will not return a value
		//init = sequential execution mode
		//integer maximum
		// Create max number of Cheese pointers
		cheese = new Cheese[max];
		//cheese initialized as a new cheese here
		//cheese is the type of cheese
		if (max > 0) {
			//if loop
			//max is greater than zero
			//the amount of cheese purchased has to be reater than zero
			cheese[0] = new Cheese();
			//the cheese is initialized at zero and its equal to the new cheese variable
			//humboldt fo cheese is associated with being cheese 0
			cheese[0].setName("Humboldt Fog");
			//the program out prints "Humboldt Fog" as a part of the program
			cheese[0].setPrice(25.00);
			//the set price is assigned to the Humboldt fog cheese 
		}
//bracket closes off this section of the program
		if (max > 1) {
			//if loop
			//if max is greater than 1
			//red hawk cheese is associated with being cheese number 1
			//then the following statement will print
			cheese[1] = new Cheese("Red Hawk");
			//cheese 1 is initialized with red hawk and the program will print out "Red Hawk"
			cheese[1].setPrice(40.50);
			//red hawk or cheese 1 is associated with the price of $40.50
		}
//bracket closes off this section of the code
		if (max > 2) {
			//if loop
			//max is greater than 2
			//if that statement is true then the following will print 
			cheese[2] = new Cheese("Teleme", 17.25);
			//cheese 2 associaced with Teleme cheese 
			//if 2 is printed then itll print out teleme 
			//teleme or cheese 2 is associated with the price of $17.25
			//cheese[2].setName("Wrong Name");
		}
		//bracket closes off the portion of the code
		Random ranGen = new Random(100);
		//random number generator here
		//new randomized generator
		//up to the value of 100
		//Cheese Randomization
		if (max > 3) {
			//if loop
			//if maximum is reater than 3 then
			for (int i = 3; i < max; i++) {
				//for loop
				//the inteer i is equal to 3 then i is less than the max value
				//i++ incremeents the value of the variable i by 1
				//i++ is a post increment operator
				cheese[i] = new Cheese("Cheese Type " + (char) ('A' + i));
				//cheese which is signified by the i symbol is equal to the value of new cheese 
				//the code that will be printed out is "Cheese Type " + plus whatever value is used to signify any cheeses past the three oriinal cheeses 
				cheese[i].setPrice(ranGen.nextInt(1000) / 100.0);
				//the set amount input that the program user will enter for cheese
			}
		}
	}
//brackets close off this section of the code
	public ShopArr() {
		//public class for ShopArr.java
		init(10);
		//init = sequential execution mode
		//integer maximum is set at 10
	}

	public ShopArr(int max) {
		//public class for ShopArr.java with an integer of maximum
		init(max);
		//init = sequential execution mode
		//integer maximum is set at whatever value the max integer has
	}
//the bracket closes off the section of the code
	/*
	 * Displays the intro message informing the user of various cheeses sold and
	 * Gets the amount of each cheese the user would like to purchase.
	 */
	private void intro(Scanner input) {
		//public class for ShopArr.java with a scanner input needed from the program user
		System.out.println("We sell " + cheese.length + " kinds of Cheese, in 0.5 lb packages:");
		//the program prints out this statement "We sell" plus whatever the total amount of cheese used is plus " kinds of Cheese, in 0.5 lb packages:"
		for (int i = 0; i < cheese.length; i++) {
			//for loop
			//for the integer i equal to the set amount of zero
			//the integer i is less than the cheese.length
			//i++ incremeents the value of the variable i by 1
			//i++ is a post increment operator
			System.out.println(cheese[i].getName() + ": $" + cheese[i].getPrice() + " per pound");
			//the program prints out whatever out put this is for the calculation fo a certain amount of cheese
		}
		System.out.println(); //Spacing
		//the program moves to the next line of code/in the printed program
		for (int i = 0; i < cheese.length; i++) {
			//for loop
			//for the integer i equal to the set amount of zero
			//the integer i is less than the cheese.length
			//i++ incremeents the value of the variable i by 1
			//i++ is a post increment operator
			System.out.print("Enter the amount of " + cheese[i].getName() + " in lb: ");
			//the program prints out this statement plus the cheese name used in this specific part of the program
			cheese[i].setAmount(input);
			//whatever cheese is used the name and price is printed out here
			//example is Humbolt Fog is set to the set amount of $25.00 
			while (cheese[i].getAmount() % 0.5 != 0 || cheese[i].getAmount() < 0) {
				//while loop
				//Cheese amount inputed by the program user divided by 0.5 if not equal to zero AND the amount is not less than zero
				//for example the input number cannot be negative
				if (cheese[i].getAmount() % 0.5 != 0) {
					//if loop
					//the humboldt fog amount divided by 0.5 is not equal to zero
					System.out.print("Invalid input. Enter a value that's multiple of 0.5: ");
					//the program out prints this statement "Invalid input. Enter a value that's multiple of 0.5: "
					cheese[i].setAmount(input);
					//whatever cheese is used the name and price is printed out here
					//example is Humbolt Fog is set to the set amount of $25.00 
				} 
				else if (cheese[i].getAmount() < 0) {
					//if loop
					//if that other statement isnt true then this statement will run
					//example: if the Humboldt fog amount is less than zero
					System.out.print("Invalid input. Enter a value >= 0: ");
					//the program prints out this statement "Invalid input. Enter a value >= 0: "
					cheese[i].setAmount(input);
					//whatever cheese is used the name and price is printed out here
					//example is Humbolt Fog is set to the set amount of $25.00 
				}
			}
		}
	}
//brackets close off this portion of the code
	/*
	 * Displays the itemized list of all cheeses bought or a special message if none
	 * were purchased.
	 */

	private void itemizedList() {
		//shop class initalized here for the itemized list
		double amount = 0, price = 0;
		//prices initialized here for amount and price
		int lengthCheese = cheese.length;
		//the integer lengthcheese is equal to the cheese length variable
		for (int i = 0; i < cheese.length; i++) {
			//for loop
			//for the integer i equal to the set amount of zero
			//the integer i is less than the cheese.length
			//i++ incremeents the value of the variable i by 1
			//i++ is a post increment operator
			amount = cheese[i].getAmount();
			//prices initialized here

			if (amount > 0) {
				//if athe amount is greater than zero
				//then the following print statement will show in the program
				price = cheese[i].getPrice();
				//the price is equal to the cheese get price for whatever specific cheese this correlates to
				System.out.printf("%.1f lb of %s @ $%.2f = $%.2f\n", amount, cheese[i].getName(), price, price * amount);
				//then the program will outprint this statement calculating all the totals of the pricing under the loop condiiton
			}

			else if (amount == 0 && lengthCheese == 0) {
				//else is loop
				//is the amount is equal to zero AND the lengthcheese is equal to zero
				//then the following code will print out
				System.out.println("No items were purchased.");
				//the program prints out this statement "No items were purchased." if the above statement is true
			}

		}
		System.out.println("");
		//the program moves to the next line of the code
	}
//bracket closes off this section of the code
	//*
	//* Calculates the Original Sub Total, which is the price*amount of each cheese
	//* added together. Returns the Original Sub Total.
	//*/
	private double calcSubTotal() {
		//shop class initialized here for calcSubTotal
		double subTotal = 0;
		//the subtotal is equal to zero
		//initialized value
		for (int i = 0; i < cheese.length; i++) {
			//for loop
			//for the integer i equal to the set amount of zero
			//the integer i is less than the cheese.length
			//i++ incremeents the value of the variable i by 1
			//i++ is a post increment operator
			subTotal += cheese[i].getAmount() * cheese[i].getPrice();
			//subtotal calculation for whatever cheese correlates this postion of the code
		}
		return subTotal;
		//returns the full subtotal for the program up to this point
	}
//bracket closes off this section of the code
	/*
	 * Calculates discounts based on special offers on Humboldt Fog and Red Hawk,
	 * stores them in disSpecials[0] and disSpecials[1], and returns the array.
	 * Minor changes from Lab 07 (identical logic).
	 */
	private double[] discountSpecials() {
		//shop class initialized here
		double[] disSpecials = { 0, 0 };
		//discounted specials are equal to this value of 0,0

		if (cheese.length > 0) {
			//if loop
			//if the cheese.length is greater than 0
			//then the following part of the code will print out
			double hFogAmount = cheese[0].getAmount();
			//the humboldt fog cheese amount is equal to the red hawk get amount
			if (hFogAmount > 0) {
				//if loop
				//if humboldt fog is greater than zero
				disSpecials[0] += (((int) hFogAmount * cheese[0].getPrice()) / 2.0);
				//then the discounted special price will be calculated using these values
			}
		}
		//brackets close off this section of the code
		
		if (cheese.length > 1) {
			//if loop
			//if the cheese.length is greater than 1
			//then the following part of the code will print out
			double redHawkAmount = cheese[1].getAmount();
			//the red hawk amt amount is equal to the red hawk get amount
			if (redHawkAmount > 0) {
				//if loop
				//if red hawk is greater than zero
				disSpecials[1] += ((int) ((redHawkAmount) / 1.5) * cheese[1].getPrice() * 0.5);
				//then the discounted special price will be calculated using these values
			}
		}
//the brackets close off this section of the code
		return disSpecials;
		//the discounted specials are shown here in the code
	}
	//the bracket closes off this section of the code

	/*
	 * Displays the Original Sub Total, discounts based on specials, and the New Sub
	 * Total. Returns the New Sub Total. Identical to Lab 07.
	 */
	private double printSubTotals(double subTotal, double[] disSpecials) {
		//shop class initialized here
		int count = 0;
		//the integer count is initialized to the value of 0
		System.out.printf("Original Sub Total:				$%.2f \n", subTotal);
		//the program prints out the original sub total
		System.out.println("Specials...");
		//the program prints out this statement "Specials..."

		if (disSpecials.length > 0 && disSpecials[0] > 0) {
			//if loop
			//if this statement is true and this other statement
			//then the following statements will print in the program output
			System.out.printf("Humboldt Fog (Buy 1 Get 1 Free):  	       -$%.2f \n", disSpecials[0]);
			//the program will print out a discount special for humboldt fog
			count = count+1;
			//the count is equal to the count variable plus 1
			//whatever the value is for the count variable then it will be incremented by 1
		}
		if (disSpecials.length > 1 && disSpecials[1] > 1) {
			//if loop
			//if this statement is true and this other statement
			//then the following statements will print in the program output
			System.out.println("Red Hawk (Buy 2 Get 1 Free): 	               -$" + numFormat.format(disSpecials[1]));
			//the program will print out a discount special for red hawk
			count = count+1;
			//the count is equal to the count variable plus 1
			//whatever the value is for the count variable then it will be incremented by 1
		}
		else if(count == 0) {
			//else if loop
			//if the above isnt true then the following statement will print
			//if the subtotal is equal to zero then the following will print
			System.out.println("None		   		               -$0.00");
			//no specials is printed out by the program
		}
		double newSubTotal = subTotal;
		//double = new variable of the code with digits 
		//the new subtotal is equal to the subtotal
		for (int i = 0; i < disSpecials.length; i++) {
			//for loop
			//if the integer is equal to 0 and the zero is less than the discount specials
			newSubTotal -= disSpecials[i];
			//the new sub total is subtracted from the value of the expression of the discounted special
		}
		return newSubTotal;
		//the new subtotal is placed within the code
	}
	//bracket closes off the portion of the code
	/*
	 * Calculates the additional discount based on the New Sub Total and displays
	 * the Final Total. Identical to Lab 07.
	 */
	private void printFinalTotal(double newSubTotal) {
		//program class initialization here
		System.out.printf("New Sub Total:					$%.2f \n", newSubTotal);
		//the program out prints the new sub total calculation before the discount prices
		double addDiscount = 0;
		//double = decimal place
		//additional discount is initialized at the amount of zero

		if (newSubTotal >= 150 && newSubTotal < 250) {
			//if loop
			//if the new sub total is greater than or equal to 150 AND the new sub total is less than 250
			//then a 10% discount will be granted 
			addDiscount = (newSubTotal * 0.10);
			//additional discount here is equal to the new subtotal time 0.10
			//10% discount here
			System.out.println("Additional 10% Discount:		               -$" + numFormat.format(addDiscount));
			//the program will print out the additional 10% discount if there is one
		}
		//bracket closes off this portion of the code
		if (newSubTotal >= 250) {
			//if loop
			//if the new subtotal is greater than or equal to 250
			addDiscount = (newSubTotal * 0.25);
			//the aditional discount is equal to the new sub total times 0.25
			//25% discount
			System.out.println("Additional 15% Discount:		               -$" + numFormat.format(addDiscount));
			//the program will print out the additional 15% discount if there is one
		}
		//brackets close off this section of the code
		if (newSubTotal < 150) {
			//if loop
			//if the new sub total is less than 150
			//then the following statement will print out
			addDiscount = (newSubTotal * 0);
			//the additional discount is equal to the calculation of the newSubTotal times zero
			System.out.println("Additional 0% Discount:		                  -$0" + numFormat.format(addDiscount));
			//the program will display the additional discount function if there is one
		}
		//bracket closes off this section of the code
		double finalAmount = newSubTotal - addDiscount;
		//double = decimal character
		//final total is equal to the new subtotal subtracting the added discount
		System.out.println("Final Total:					$" + numFormat.format((finalAmount)));
		//the program prints out this statement displaying the final total of the program
	}
//bracket closes off this portion of the code
	private void printFree() {
		//proigram class initalized here
		double amount;
		//double = decimal point number
		//the amount variable will be a percentage and is incremented here 
		System.out.println();
		//the program will move to the next line
		System.out.println("Today is your lucky day!");
		//the program will outprint the statement of "Today is your lucky day!"
		for (int i = 0; i < cheese.length; i++)
			//for loop
			//if the integer is equal to 0
			//i is less than the cheese.length meaning that the cheese.length is any number greater than 0
			//i++ incremeents the value of the variable i by 1
			//i++ is a post increment operator
			if ((amount = cheese[i].getAmount()) > 0)
				//if loop
				//if amt is equal to teleme get amount and its greater than zero
				//then the following statement will print 
				System.out.println(amount + " lb of " + cheese[i].getName() + " @ $0 = $" + 0);
		//program prints out the amt value and " lb of Teleme @ $0 = $" with zero following the dollar sign
		System.out.println("Total Price: FREE!!!\n");
		//the program prints out this statement with a new line fllowing it
	}
//brackets close off this section of the code
	public void run() {
		//program class initialized here
		Scanner input = new Scanner(System.in);
		//scanner for the input equal to new scanner for system.in function
		intro(input);
		//intro(input)
		//prior code is used to explain this section
		double subTotal = calcSubTotal();
		//double = decimal point number
		//subtotal is equal to the calcualated sub total
		System.out.println();
		//the program will move to the next line
		System.out.print("Display the itemized list? (1 for yes): ");
		//the program will output "Display the itemized list? (1 for yes): "
		//this code is the program asking the user for either a 0 or a 1 to finish off the program
		int list = input.nextInt();
		//the list integer is printed out based on whatever integer the user of the program inputs
		if (list == 1) {
			//if loop
			//if the loop is equal to 1 then the following will be the output
			itemizedList();
			//the itemized list is printed out here
			//the code for this is all the cheese prices from an earlier section of the code
			if (list == 0) {
				//if loop
				//if the loop is equal to 0 then the following will be the output
				System.out.println("");
				//the program moves to the next line with this output
			}
		}
		//brackets close off this portion of the code

		int isFree = (new Random()).nextInt(100);
		//the integer free is equal to
		//the new random next integer out of 100
		if (isFree != 0) {
			//if loop
			//if free isnt equal to zero
			double newSubTotal = printSubTotals(subTotal, discountSpecials());
			//double newsubtotal is equal to the print sub totals which is made out of the sub total and the discount specials
			printFinalTotal(newSubTotal);
			//the final total would be the newsubtotal value
		} 
		//bracket closes off this portion of the code
		else {
			//else loop
			printFree();
			//print free
			return;
			//transfers back to the controller of the method
			//return type
		}
		//bracket closes off this portion of the code

		System.out.println();
		//the program moves to the next line
		System.out.print("Do you wish to redo your whole order? (1 for yes): ");
		//the program prints out "Do you wish to redo your whole order? (1 for yes): "
		//the program asks the program user if they would wish to re run the program
		int redo = input.nextInt();
		//integer of a redo is equal to whatever input the program user puts in so 1 could be redo and 0 means the program would end
		System.out.println();
		//the program will go to the next line
		if (redo == 1) {//re-run?
			//if loop
			//if the redo value amount is equal to 1 then the following will occur
			run();
			//runnable object method
			//program runs again
		}
		//bracket closes off this portion of the code
		else {
			//else loop
			//if the above statement isnt true then the following statement will print out instead
			System.out.println("Thanks for coming!");
			//the program prints out "Thanks for coming!"
		}
	}

}
//brackets close off the code
//end of program code
