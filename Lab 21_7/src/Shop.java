//program code begins here
import java.text.DecimalFormat;
//decimal format for the pricing 
import java.util.Random;
//random scanner
import java.util.Scanner;
//scanner inputed here
public class Shop {
	//shop class initialized here 
	Cheese HFog, RHawk, Teleme;
	//the three types of cheese from the Cheese.numCheese used in RunShop.java are initialized here
	static DecimalFormat numFormat = new DecimalFormat("#.00");
	//static for the number formating used which will be a decimal format
	/*
	 * Shop constructor initializes the 3 types of cheeses sold, along with their
	 * prices.
	 */
	public Shop() {
		//public class for Shop.java
		HFog = new Cheese();
		//Humboldt Fog cheese initialized as a new cheese here
		HFog.setName("Humboldt Fog");
		//Humboldt Fog cheese is set with a name within the printed code
		HFog.setPrice(25.00);
		//Humboldt Fog cheese is given a price of $25.00
		RHawk = new Cheese("Red Hawk");
		//Red Hawk Cheese is initialized as a new cheese
		//also given a name within the printed code
		RHawk.setPrice(40.50);
		//Red Hawk cheese is given a price of $40.50 within the code
		Teleme = new Cheese("Teleme", 17.25);
		//Teleme cheese is initialized as a new cheese
		//also given a name within the printed code
		//Teleme is given the price of $17.25 within the code
	}
	//close the cheese identification
	/*
	 * Displays the intro message informing the user of various cheeses sold and
	 * Gets the amount of each cheese the user would like to purchase.
	 */
	private void intro(Scanner input) {
		// Initialize all the entries of the scanner here
		//specific array of strings being used for this programs parameter
		System.out.println("We sell 3 kinds of Cheese (in 0.5 lb packages):");
		//the program prints out "We sell 3 kinds of Cheese (in 0.5 lb packages):" 
		//this is followed by a new line
		System.out.println(HFog.getName() + ": $" + HFog.getPrice() + " per pound");
		//the program prints out "Humboldt Fog: $25.00 per pounds"
		//this is followed by a new line
		System.out.println(RHawk.getName() + ": $" + RHawk.getPrice() + " per pound");
		//The program prints out "Red Hawk: $40.50 per pound"
		//this is followed by a new line
		System.out.println(Teleme.getName() + ": $" + Teleme.getPrice() + " per pound");
		//the program prints out "Teleme: $17.25 per pound"
		//this is followed by a new line
		System.out.println("");
		//program prints out a full blank line
		System.out.print("Enter the amount of " + HFog.getName() + " in lbs: ");
		//the program prints out "Enter the amount of Humboldt Fog in labs: "
		//this ISNT followed by a new line yet
		HFog.setAmount(input);
		//Humbolt Fog is set to the set amount of $25.00 
		while (HFog.getAmount() % 0.5 != 0 || HFog.getAmount() < 0) {
			//while loop
			//Humboldt fod amount inputed by the program user divided by 0.5 if not equal to zero AND the amount is not less than zero
			//for example the input number cannot be negative
			if (HFog.getAmount() % 0.5 != 0) {
				//if loop
				//the humboldt fog amount divided by 0.5 is not equal to zero
				System.out.print("Invalid input. Enter a value that's multiple of 0.5: ");
				//if that above statement is true than the following statement will print out
				//"Invalid input. Enter a value that's multiple of 0.5: "
				HFog.setAmount(input);
				//Humboldt fog is set to the amount that the user inputs
			} else if (HFog.getAmount() < 0) {
				//if loop
				//if that other statement isnt true then this statement will run
				//if the Humboldt fog amount is less than zero
				System.out.print("Invalid input. Enter a value >= 0: ");
				//then this statement will print out "Invalid input. Enter a value >= 0: "
				HFog.setAmount(input);
				//humboldt fog set amount inputed by the program user
			}
		}
		//end of this portion of the code
		System.out.print("Enter the amount of " + RHawk.getName() + " in lbs: ");
		//the system will out print this statement
		//"Enter the amount of " plus "Red Hawk" plus " in lbs: "
		RHawk.setAmount(input);
		//Red Hawk set amount will be inputed by the program user
		while (RHawk.getAmount() % 0.5 != 0 || RHawk.getAmount() < 0) {
			//while loop
			//Red Hawk amount is divided by 0.5 and if not equal to zero AND Red Hawk amount is less than zero
			if (RHawk.getAmount() % 0.5 != 0) {
				//if loop
				//the amount of Red Hawk is divided by 0.5 if not equal to zero
				System.out.print("Invalid input. Enter a value that's multiple of 0.5: ");
				//the program will out print "Invalid input. Enter a value that's multiple of 0.5: " if that statement above is true
				RHawk.setAmount(input);
				//the set amount of Red Hawk will be inputed by the program user
			} else if (RHawk.getAmount() < 0) {
				//else if loop
				//if Red Hawk get amount is less than zero the following statement will print out
				System.out.print("Invalid input. Enter a value >= 0: ");
				//"Invalid input. Enter a value >= 0: "
				RHawk.setAmount(input);
				//Red Hawk set amount is inputed by the program user
			}
		}
		//brackets close off this section of the code
		System.out.print("Enter the amount of " + Teleme.getName() + " in lbs: ");
		//system will out print this amount of function
		Teleme.setAmount(input);
		//set amount by the program user for teleme cheese
		while (Teleme.getAmount() % 0.5 != 0 || Teleme.getAmount() < 0) {
			//if this is true
			if (Teleme.getAmount() % 0.5 != 0) {
				//while this is true
				System.out.print("Invalid input. Enter a value that's multiple of 0.5: ");
				//then this statement will print out
				Teleme.setAmount(input);
				//set amount inputed by the program user for teleme
			} else if (Teleme.getAmount() < 0) {
				//if the above statements arent true but this is then
				System.out.print("Invalid input. Enter a value >= 0: ");
				//then this statement will print out
				Teleme.setAmount(input);
				//the set amount input that the program user will enter for teleme
			}
		}
	}
	//brackets close off this section of the code
	/*
	 * Displays the itemized list of all cheeses bought or a special message if none
	 * were purchased.
	 */
	private void itemizedList() {
		//shop class initalized here
		double amt = 0, price = 0;
		//prices initialized here
		if ((HFog.getAmount() + RHawk.getAmount() + Teleme.getAmount()) == 0) {
			//if humboldt fog and red hawk and teleme all together add up to zero purchased 
			System.out.println("No items were purchased.");
			//then the program will print out this statement
		}
		//bracket closes off this portion of the code
		else {
			//else loop
			if ((amt = HFog.getAmount()) > 0) {
				//if amt is equal to humboldt fog greater than zero
				price = HFog.getPrice();
				//the price is equal to the humboldt fog get price
				System.out.printf("%.1f lb of %s @ $%.2f = $%.2f\n", amt, HFog.getName(), price, price * amt);
				//then the program will outprint this statement calculating all the totals of the pricing under the loop condiiton
			}
			//bracket closes off this section of the code
			if ((amt = RHawk.getAmount()) > 0) {
				//if amt is equal to red hawk get amount and its greater than zero
				price = RHawk.getPrice();
				//price is equal to the red hawk get price
				System.out.printf("%.1f lb of %s @ $%.2f = $%.2f\n", amt, RHawk.getName(), price, price * amt);
				//then the program will outprint this statement calculating all the totals of the pricing under the loop condiiton
			}
			//bracket closes of this section of the code
			if ((amt = Teleme.getAmount()) > 0) {
				//if amt is equal to teleme get amoutn and its greater than zero
				price = Teleme.getPrice();
				//the price is equal to the teleme cheese get price
				System.out.printf("%.1f lb of %s @ $%.2f = $%.2f\n", amt, Teleme.getName(), price, price * amt);
				//then the program will outprint this statement calculating all the totals of the pricing under the loop condiiton
			}
		}
		//brackets close off this portion of the code
		System.out.println();
		//the program prints out a blank line
	}
	//bracket closes off this portion of the code
	/*
	 * Calculates the Original Sub Total, which is the price*amount of each cheese
	 * added together. Returns the Original Sub Total.
	 */
	private double calcSubTotal() {
		//shop class initialized here
		double subTotal = 0;
		//the subtotal is equal to zero
		//initialized value
		subTotal += HFog.getAmount() * HFog.getPrice();
		//subtotal calculation for humboldt fog
		subTotal += RHawk.getAmount() * RHawk.getPrice();
		//subtotal calculation for red hawk
		subTotal += Teleme.getAmount() * Teleme.getPrice();
		//subtotal calculation for teleme
		return subTotal;
		//returns the full subtotal for the program up to this point
	}
	//bracket closes off this section of the code
	/*
	 * Calculates discounts based on special offers on Humboldt Fog and Red Hawk,
	 * stores them in disSpecials[0] and disSpecials[1], and returns the array.
	 * Minor changes from Lab 04 (identical logic).
	 */
	private double[] discountSpecials() {
		//shop class initialized here
		double[] disSpecials = { 0, 0 };
		//discounted specials are equal to this value of 0,0
		double hfAmt = HFog.getAmount(), rhAmt = RHawk.getAmount();
		//humboldt fog amt is euqal to the hfog get amount 
		//the red hawk amt amount is equal to the red hawk get amount
		if (hfAmt > 0) {
			//if loop
			//if humboldt fog is greater than zero
			disSpecials[0] += (((int) hfAmt * HFog.getPrice()) / 2.0);
			//then the discounted special price will be calculated using these values
		}
		if (rhAmt > 0) {
			//if loop
			//if red hawk is greater than zero
			disSpecials[1] += ((int) ((rhAmt) / 1.5) * RHawk.getPrice() * 0.5);
			//then the discounted special price will be calculated using these values
		}
		return disSpecials;
		//the discounted specials are shown here in the code
	}
	//bracket closes off this portion of the code
	/*
	 * Displays the Original Sub Total, discounts based on specials, and the New Sub
	 * Total. Returns the New Sub Total. Identical to Lab 04.
	 */
	private double printSubTotals(double subTotal, double[] disSpecials) {
		//shop class initialized here
		System.out.println("Original Sub Total:	          $" + subTotal);
		//the program prints out the original sub total
		System.out.println("Specials...");
		//the program prints out this statement "Specials..."
		if (subTotal == 0) {
			//if loop
			//if the subtotal is equal to zero then the following will print
			System.out.println("None		   		 -$0.0");
			//no specials is printed out by the program
		}
		if (disSpecials.length > 0 && disSpecials[0] > 0) {
			//if loop
			//if this statement is true and this other statement
			//then the following statements will print in the program output
			System.out.println("Humboldt Fog (Buy one get one free): 		-$" + numFormat.format(disSpecials[0]));
			//the program will print out a discount special for humboldt fog
		}
		if (disSpecials.length > 1 && disSpecials[1] > 1) {
			//if loop
			//if this statement is true and this other statement
			//then the following statements will print in the program output
			System.out.println("Red Hawk (Buy two get one free): 		-$" + numFormat.format(disSpecials[1]));
			//the program will print out a discount special for red hawk
		}
		double newSubTotal = subTotal;
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
	//bracket closes off this section of the code
	/*
	 * Calculates the additional discount based on the New Sub Total and displays
	 * the Final Total. Identical to Lab 04.
	 */
	private void printFinalTotal(double newSubTotal) {
		//program class initialization here
		System.out.println("New Sub Total:		          $" + numFormat.format(newSubTotal));
		//the program out prints the new sub total calculation before the discount prices
		double addDiscount = 0;
		//double = decimal place
		//additional discount is initialized at the amount of zero
		if (newSubTotal >= 150) {
			//if loop
			//if the new sub total is greater than or equal to 150
			addDiscount = (newSubTotal * 0.10);
			//additional discount here is equal to the new subtotal time 0.10
			//10% discount here
		}
		if (newSubTotal >= 250) {
			//if loop
			//if the new subtotal is greater than or equal to 250
			addDiscount = (newSubTotal * 0.25);
			//the aditional discount is equal to the new sub total times 0.25
			//25% discount
		}
		if (newSubTotal < 150) {
			//if loop
			//if the new sub total is less than 150
			//then the following calculation will happen
			addDiscount = (newSubTotal * 0);
			//the additional discount is equal to the new sub total times zero
		}
		if(newSubTotal > 0) {
			//if loop
			//if the new sub total is greater than zero
			//then the following statement will print out
			System.out.println("Additional 10% Discount:      -$" + numFormat.format(addDiscount));
			//the program will print out the additional 10% discount if there is one
		}
		if(newSubTotal == 0) {
			//if loop
			//if the new sub total is equal to zero
			//then the following statement will print out
			System.out.println("Additional 0% Discount:          -$" + numFormat.format(addDiscount));
			//the program will display the additional discount function if there is one
		}
		double finalTotal = newSubTotal - addDiscount;
		//double = decimal character
		//final total is equal to the new subtotal subtracting the added discount
		System.out.printf("Final Total:	                  $%.2f", finalTotal);
		//the program prints out this statement displaying the final total of the program
	}
	//bracket closes off this portion of the code
	private void printFree() {
		//proigram class initalized here
		double amt;
		//double = decimal value
		//initialized amt here
		System.out.println();
		//the program prints out a blank line
		System.out.println("Today is your lucky day!");
		//the program prints out this statement
		//"Today is your lucky day!"
		if ((amt = HFog.getAmount()) > 0)
			//if loop
			//if amt is equal to humoldt fog get amount and its greater than zero
			//then the following statement will print 
			System.out.println(amt + " lb of Humboldt Fog @ $0 = $" + 0);
		//program prints out the amt value and " lb of Humboldt Fog @ $0 = $" with zero following the dollar sign
		if ((amt = RHawk.getAmount()) > 0)
			//if loop
			//if amt is equal to red hawk get amount and its greater than zero
			//then the following statement will print 
			System.out.println(amt + " lb of Red Hawk @ $0 = $" + 0);
		//program prints out the amt value and " lb of Red Hawk @ $0 = $" with zero following the dollar sign
		if ((amt = Teleme.getAmount()) > 0)
			//if loop
			//if amt is equal to teleme get amount and its greater than zero
			//then the following statement will print 
			System.out.println(amt + " lb of Teleme @ $0 = $" + 0);
		//program prints out the amt value and " lb of Teleme @ $0 = $" with zero following the dollar sign
		System.out.println("Total: FREE!!!\n");
		//the program prints out this statement with a new line fllowing it
	}
	//brackets close off this portion of the code
	public void run() {
		//program class initialized here
		Scanner input = new Scanner(System.in);
		//scanner for the input equal to new scanner for system.in function
		intro(input);
		//intro(input)
		double subTotal = calcSubTotal();
		//double = decimal point number
		//subtotal is equal to the calcualated sub total
		System.out.println();
		//the program will print out a blank line here
		System.out.print("Display the itemized list? (1 for yes): ");
		//the program prints out "Display the itemized list? (1 for yes): "
		//program is asking the user for an input based on the choice of 1 or nothing else
		int list = input.nextInt();
		//the list integer is printed out based on whatever integer the user of the program inputs
		System.out.println("");
		//the program prints out a blank line here
		if (list == 1)
			//if loop
			//if the loop is equal to 1 then 
			itemizedList();
		//the itemized list is printed out here
		int free = (new Random()).nextInt(100);
		//the integer free is equal to
		//the new random next integer out of 100
		if (free != 0) {
			//if loop
			//if free isnt equal to zero
			double newSubTotal = printSubTotals(subTotal, discountSpecials());
			//double newsubtotal is equal to the print sub totals which is made out of the sub total and the discount specials
			printFinalTotal(newSubTotal);
			//the final total would be the newsubtotal value
		} else {
			//else loop
			printFree();
			//print free
			return;
			//transfers back to the controller of the method
			//return type
		}
		//bracket closes off this section of the code
		System.out.println();
		//the program prints out a blank line here
		System.out.print("Do you wish to redo your whole order? (1 for yes): ");
		//the program prints out the statement "Do you wish to redo your whole order? (1 for yes): "
		//asks the program user for an input
		int redo = input.nextInt();
		//integer of a redo is equal to whatever input the program user puts in so 1 could be redo and 0 means the program would end
		System.out.println();
		//the program prints out a blank line
		if (redo == 1)
			//if loop
			//if the redo is equal to 1
			//1 means the program will redo
			run();
		//runnable object method
		//program runs again
		else
			//else loop
			System.out.println("Thanks for coming!");
		//the program outprints this statement "thanks for coming!" noting the end of the program 
	}
}
//brackets close off the code
//end of program code