//program code begins here
import java.util.Scanner;
//scanner for the program
public class Shop{
	//shop class initialized here for Shop.java
	//Global Variables
	static Scanner input = new Scanner(System.in);
	//static for the number formating used which will be a decimal format
	//new scanner for system.in initialized here
	static double discount = 0.0;
	//static for the number formating used which will be a decimal format
	//double = decimal holder
	//variable discount is equal to 0.0
	static int qualifyValue = 0;
	//static for the number formating used which will be a decimal format
	//integer qualifyValue is equal to zero
	//Functions 
	public static int setUp(String[] names, double[] prices, double[] discountAmount) {
		// Initialize all the entries of the array of int setUp
		//this array for setUp holds the string of names, double for prices, and double for discount amount
		System.out.print("Please enter the number of items to set up shop: ");
		//the program prints out this statement "Please enter the number of items to set up shop: "
		//the program waits for the program user to input a value to continue
		int numOfItems = input.nextInt();
		//integer numOfItems is equal to the inputed value from the program user
		System.out.println("");
		//the program prints out a fully blank line
		for(int i = 1; i <= numOfItems; i++) {
			//for loop
			//for the integer i equal to the set amount of 1
			//the integer i is less than the numOfItems
			//i++ incremeents the value of the variable i by 1
			//i++ is a post increment operator
			System.out.print("Enter the name of the " + numSuffix(i) + " product: ");
			//the program prints out "Enter the name of the " + the product name + " product: "
			names[i] = input.next();
			//the program user will then enter in an input for the product name
			System.out.print("Enter the per package price of " + names[i] + ": ");
			//the program will print out "Enter the per package price of " + the name of the product the user inputed + ": "
			prices[i] = input.nextDouble();
			//the program user wll then input a price value that is a double for the product
			System.out.println("Enter the number of packages('x') to qualify for Special Discount (buy 'x' get 1 free) ");
			//the program will print out "Enter the number of packages('x') to qualify for Special Discount (buy 'x' get 1 free) "
			System.out.print("for "+ names[i]+ ", or 0 if no Special Discount offered: ");
			//the program will print out "for " + the product name + ", or 0 if no Special Discount offered: "
			discountAmount[i] = input.nextInt();
			//the program will then ask the user for an input on the discount amount and the user will enter the discounted rate
		}
//bracket closes off this section of the code
		System.out.println("");//Spacing
		//the program will move to the next line
		System.out.print("Enter the dollar amount to qualify for Additional Discount (or 0 if none offered): ");
		//the program will print out this statement "Enter the dollar amount to qualify for Additional Discount (or 0 if none offered): "
		qualifyValue = input.nextInt();
		//then the program will ask the user for an input for the qualify value of the product

		if(qualifyValue == 0) {
			//if loop
			//if the qualift value is equal to zero then the following will print
			System.out.println("");
			//the program will move on to the next line of code
		}
		else {
			//else
			//if the if loop is not true the program will move on to this function
			System.out.print("Enter the Additional Discount rate (e.g., 0.1 for 10%): ");
			//the program will print out "Enter the Additional Discount rate (e.g., 0.1 for 10%): "
			discount = input.nextDouble();
			// the program is asking for the user to enter a discount amount for the product
			if(discount < 0 || discount > .5) {
				//if loop
				//if the discount is less than zero or greater than .5
				System.out.print("Invalid input. Enter a value > 0 and <= 0.5: ");
				//then the program will outprint "Invalid input. Enter a value > 0 and <= 0.5: "
				discount = input.nextDouble();
				//the program will then ask the user for another discount rate to apply to the product

			}
			//bracket closes off this portion of the code
			System.out.println("");

			//the program will move on to the next line
		}
		return numOfItems;
		//returns the full number of items for the program up to this point

	}
	//bracket closes off this portion of the code
	public static String numSuffix(int i) {
		//program class initialized here from the string numSuffix
		//includes the integer i value
		int rem = i % 10;
		//the interger rem is initialized here
		//its initial value is equal to i divided by 10
		switch (rem) {
		//switch statemet selects specific code blocks to be executed
		case 0:
			//case 0 is executed 
		case 4:
			//case 4 is executed
		case 5:
			//case 5 is executed
		case 6:
			//case 6 is executed
		case 7:
			//cse 7 is executed
		case 8:
			//case 8 is executed
		case 9:
			//case 9 is executed
			return (i + "th");
			//the program returns the integer i and "th"
		case 1:
			//case 1 is set up shop
			if (i % 100 != 11)
				//if loop
				//if i is divided by 100 and is not equal to 11
				return (i + "st");
			//the program will return the integer i and "st"
			else
				//else loop
				return (i + "th");
			//if the above isnt true the program will return the integer i and "th"
		case 2:
			//case 2 is buy
			if (i % 100 != 12)
				//if loop
				//if i is divided by 100 and is not equal to 12
				return (i + "nd");
			//the program will return the integer i and "nd"
			else
				//else loop
				return (i + "th");
			//if the above isnt true the program will return the integer i and "th"
		case 3:
			//case 3 is list items
			if (i % 100 != 13)
				//if loop
				//if i is divided by 100 and is not equal to 13
				return (i + "rd");
			//the program will return the integer i and "rd"
			else
				//else loop
				return (i + "th");
			//if the above isnt true the program will return the integer i and "th"
		default:
			//no access modifier is specified resulting to default
			break;
			//break loops/switch statements
			//moves on to the next portion of the code
		}
		return "";
		//the program returns to the next blank line
	}
//bracket closes off this portion of the codde

	public static void buyItems(String[] names, double[] prices, int[] amounts,int numOfItems) {
		//public class for buyItems
		System.out.println("");
		//the program prints out a blank line and moves to the next line of code
		for(int i = 1; i <= numOfItems; i++) {
			//for loop
			//int i is equal to 1
			//integer i is less than or equal to numOfItems
			//i++ means this value is post incremented by 1
			System.out.print("Enter the number of " + names[i] + " packages to buy: ");
			//the program prints out this statmenet "Enter the number of " + names[i] + " packages to buy: " that addes in names to the line 
			amounts[i] = input.nextInt();
			//amounts integer is equal to the input from the program user
			while(amounts[i] < 0) {
				//while loop
				//ampounts integer is less than 0
				//the following statement will run
				System.out.print("Invalid input. Enter a value >=0: ");
				//the program prints out this statement "Invalid input. Enter a value >=0: "
				amounts[i] = input.nextInt();
				//amounts is equal to the input from the program user
			}
		}
		//the brackets close off this portion of the code
		System.out.println("");
		//the program prints out a blank line and moves to the next line of code
	}
	//the bracket closes off this portion of the code


	public static void listItems(String[] names, double[] prices, int[] amounts,int numOfItems) {
		//the public class for listItems
		double total = 0.0;
		//the double variable total is equal to 0.0
		System.out.println("");
		//the program prints out a blank line and moves to the next line of code

		for(int i = 1; i <= numOfItems; i++) {
			//for loop
			//int i is equal to 1
			//integer i is less than or equal to numOfItems
			//i++ means this value is post incremented by 1
			total = (double) (prices[i] * amounts[i]);
			//total is equal to the double of prices times amounts
			if(amounts[i] == 0) {
				//if loop
				//if amounts integer is equal to 0 then the following statement will print out
				System.out.print("");
				//the program prints out a blank line and moves to the next line of code
			}
			else {
				//System.out.println(amounts[i] +" packages of " + names[i] + " @ $" + prices[i] + " per pkg = $" + total);
				System.out.printf("%d packages of %s @ $%.2f per pkg = $%.2f \n", amounts[i],names[i],prices[i],total);
				//the program prints out the calculated amount of amounts name prices and total into the blank packages of blank per pkg = statmeent
			}
		}
		if(total == 0) {
			//if loop
			//if the total is equal to zero then the following will print out
			System.out.println("No items were purchased.");
			//program prints out this statement "No items were purchased."
		}
		System.out.println("");
		//program prints out a blank line and moves on to the next line of code
	}
//bracket closes off protion of the code
	public static double specialDiscount(int[] amounts, double[] price, double[] discountAmnt) {
		//public class name for specialDiscount
		double specialDiscount = 0.0;
		//double variable specialDiscount is equal to 0.0
		for(int i = 0; i < amounts.length; i++) {
			//for loop
			//integer i equal to 0
			//integer i is less than the amounts.;ength value
			//i++ means this value is post incremented by 1
			specialDiscount += (int)((amounts[i]*discountAmnt[i]) / (discountAmnt[i]) +1) * (price[i] * 2);
			//special discount is += to the integer of amounts times discountAmt divided by the discountAmt plus 1 times the price times 2
			if(discountAmnt[i] == 0) {
				//if loop
				//if discountAmt is equal to 0
				//System.out.println("No Special Discounts applied");
				break; 
				//break loops/switch statements
				//moves on to the next portion of the code
			}
		}
		return specialDiscount;
		//the program runs the specialDiscount code
	}
	//bracket closes off this section of the code
	public static void checkOut(int[] amounts, double[] price, double specialDiscount) {
		//public class for checkOut
		double subTotal = 0.0;
		//double variable called subTotal is equal to 0.0

		for(int i = 0; i < amounts.length; i++) {
			//for loop
			//for the integer i equal to 0 i is less than the amounts.length value
			//i++ means this value is post incremented by 1
			subTotal = (price[i] * amounts[i]) + subTotal;
			//subtotal is equal to the price initalized times the amounts plus the subtotal
		}
//bracket closes off this section of the code
		if(subTotal >= qualifyValue) {
			//if loop
			//of the subtotal is greater than or equal to the qualify value then the following will print out
			double newSubTotal = subTotal - specialDiscount;
			//double variable called newsubtotal is equal to the subtotal minus the special discount
			double newDiscount = subTotal * discount;
			//double variable called new discount is equal to the subtotal times the discount
			double total = newSubTotal - newDiscount;
			//double variable called total is equal to the new sub total minus the new discount amount
			int discountPercent = (int)(discount*100);
			//integer called discountPercent is equal to the integer of the discount times 100
			double minusDiscountPercent = total*discount;
			//double variable called minusDiscountPercent is equal to the total times the discount amount
			double finalTotal = total - minusDiscountPercent;
			//double variable called finalTOtal is equal to the total minus the discount percentage thats taken off the cost
			System.out.println("");//Spacing
			//System.out.println("Original Sub Total:       $" + subTotal);
			System.out.printf("Original Sub Total:        $%.2f \n",subTotal);
			//the program will print out "Original Sub Total: " plus the calculated subTotal
			if(newDiscount != 0) {
				//System.out.println("Special Discounts:       -$" + newDiscount);
				//if loop
				//if newDiscount isnt equal to zero 
				//then the following statement will print
				System.out.printf("Special Discounts:        -$%.2f \n", newDiscount);
				//the program will print out "Special Discounts: " olus the calculated newDiscount price

			}
			if(newDiscount == 0) {
				//if loop
				//if newDiscount is equal to zero
				//then the following statement will print out
				System.out.println("No Special Discounts applied");
				//the program prints out this statement "No Special Discounts applied"
			}
			//System.out.println("New Sub Total:            $" + total);
			System.out.printf("New Sub Total:             $%.2f \n", total);
			//the program outprints "New Sub Total: " plus the calculated total
			if(minusDiscountPercent != 0) {
				//System.out.println("Additional " + discountPercent + "% Discount: -$"+ minusDiscountPercent);
				System.out.printf("Additional %d%% Discount:  -$%.2f \n", discountPercent,minusDiscountPercent);
				//the program will print out "additional" + whatever the discount amount is + "Discount: " and the calculation
			}
			if(minusDiscountPercent ==0) {
				//if loop
				//minusDiscountPercent is equal to zero
				//then the following statement will print out
				System.out.println("You did not qualify for an Additional Discount");
				//the program prints out "You did not qualify for an Additional Discount"
			}
			System.out.printf("Final Sub Total:           $%.2f \n", finalTotal);
			//the program prints out the statement "Final Sub Total: " and the calculation of the finalTotal
			System.out.println("");
			//the program prints out a blank line and moves to the next line of code
			System.out.println("Thanks for coming!");
			//the program prints out the statement "Thanks for coming!"
			System.out.println("");
			//the program prints out a blank line and moves to the next line of code

		}
		else if(subTotal < qualifyValue) {
			//else if statement
			//if the other if loops arent true then this one will run
			//the subTotal is less than the qualifyValue then the following will print out
			System.out.println("");
			//the program prints out a blank line and moves to the next line of code
			System.out.println("Thanks for coming!");
			//the program prints out "Thanks for coming!"
			System.out.printf("Sub Total:    $%.2f \n",subTotal);
			//the program out prints "Sub Total: " plus the calculation of the subTotal
			System.out.println("You did not qualify for an additional discount");
			//the program out prints "You did not qualify for an additional discount"
			System.out.printf("Total: $%.2f \n", subTotal);
			//the program out prints  "Total: " plus the calculation of the subtotal variable


		}



	}
//brackets close off this section of the code
	
	public static void main(String args[]) {
		//public class for the main code including a string
		final int MAX = 100;
		//final int variable called maximum is initialized to 100
		int numOfItems = 0;
		//int varaible called numOfItems is initialized to the value of 0
		String[] names = new String[MAX];
		//string for names is equal to the new string maximum
		double[] prices = new double [MAX];
		//the double variable called prices is equal to the new double maximum
		int[] amounts = new int[MAX];
		//the int variable called amounts is equal to the new integer maximum
		double[] discAmount = new double[MAX];
		//the double variable called discAmount is equal to the new double maximum
		boolean isSetUp = false;
		//the boolean variable isSetUp is initialized to the value of false
		boolean isItemsBought = false;
		//the boolean variable isItemsBought is initialized to the value of false
		boolean isDone = false;
		//the boolean variable isDone is initialized to the value of false
		@SuppressWarnings("unused")
		double specialDiscount = 0;
		//the double variable called specialDiscount is initialized to the value of 0

		do {
			System.out.println("This program supports 4 functions:");
			//the program outprints this statement "This program supports 4 functions:"
			System.out.println("    1. Set up shop");
			//the program outprints this statement "    1. Set up shop"
			System.out.println("    2. Buy");
			//the program outprints this statement "    2. Buy"
			System.out.println("    3. List Items");
			//the program outprints this statement "    3. List Items"
			System.out.println("    4. Checkout");
			//the program outprints this statement "    4. Checkout"
			System.out.print("Please type the function you want: ");
			//the program outprints this statement "Please type the function you want: "
			int functionChoice = input.nextInt();
			//interger functionChoice is initialized 
			switch(functionChoice) {
			case 1: {//1 Setup Shop
				//case 1 is setup shop
				if(isSetUp== false) {
					//if loop
					//isSetUp is equal to false then the following will run 
					numOfItems = setUp(names,prices,discAmount);
					//numOfItems is equal to setUp which includes names, prices, and discount amount of cheeses purchased
				}
				if(isSetUp == true) {
					//if loop
					//if isSetUp equal to true then the following will run
					numOfItems = setUp(names,prices,discAmount);
					//numOfItems is equal to the setUp value which includes the names, prices, and discount amount of the cheese purchased
				}
				isSetUp = true;
				//isSetUp equal to true then the next line of code will run
				break;
				//break loops/switch statements
				//moves on to the next portion of the code
			}
			//this bracket closes off case number 1
			case 2:{
				//case number 2 for this program
				//case two is buying the cheese
				if(isSetUp == true) {
					//if loop
					//isSetUp equal to true
					//then the following will program
					buyItems(names,prices,amounts, numOfItems);
					//the buyItems variable includes names, prices, amounts, and numOfItems
					isItemsBought = true;
					//isItemsBought is true
				}
				//bracket closes off if loop
				else {
					//else loop
					System.out.println("");
					//the program prints out a blank line and moves on to the next line
					System.out.println("The shop has not been set up yet!");
					//the program prints out this statement "The shop has not been set up yet!"
					System.out.println("");
					//the program prints out a blank line and moves on to the next line
					
					break;
					//break loops/switch statements
					//moves on to the next portion of the code
				}
				//bracket closes off this else statement
				isItemsBought = true;
				//isItemsBought is true then the code will jump to case 3 or 4
				break;
				//break loops/switch statements
				//moves on to the next portion of the code

			}
			//bracket closes off if loop
			case 3:{
				//case number 3 for this program
				//case 3 lists off the cheeses purchased
				if(isSetUp == true && isItemsBought == true) {
					//if loop
					//if isSetUp is true AND isItemsBought true 
					//then the following will be programmed
					listItems(names, prices, amounts, numOfItems);
					//listItems includes the names, prices, amounts, and numOfItems for the cheeses chosen
					break;
					//break loops/switch statements
					//moves on to the next portion of the code
				}
				//bracket closes off if loop
				if(isSetUp == true && isItemsBought == false) {
					//if loop
					//if isSetUp is equal to true AND isItemsBought is equal to false then the following will print out
					System.out.println("");
					//the program prints out a blank line and moves on to the next line
					System.out.println("You have not bought anything!");
					//the program prints out the statement "You have not bought anything!"
					System.out.println("");
					//the program prints out a blank line and moves on to the next line

					break;
					//break loops/switch statements
					//moves on to the next portion of the code
				}
				//bracket closes off if loop
				if(isSetUp == false) {
					//if loop
					//if isSetUp equal to false then the following code will print out
					System.out.println("");
					//the program prints out a blank line and moves on to the next line
					System.out.println("The shop has not been set up yet!");
					//the program prints out the statement "Items have not been bought yet!"
					System.out.println("");
					//the program prints out a blank line and moves on to the next line
					break;
					//break loops/switch statements
					//moves on to the next portion of the code
				}
			}
			//brackets close off this section of the code
			case 4:{
				//case number 4 for this program
				//case 4 is the checkout option
				if(isSetUp == true && isItemsBought == true) {
					//if loop
					//if isSet up is true AND isItemsBought is also true then the following code will be programmed
					double theRealDiscount = specialDiscount(amounts,prices,discAmount);
					//theRealDiscount is a double variable so itll be a decimal
					//theRealDiscount is equal to the specialDiscount variable which includes amounts, prices, and discAmount
					checkOut(amounts, prices,theRealDiscount);
					//the checkOut included the amounts, prices, and theRealDiscount of the specific cheeses
					isDone = true;
					//isDone variable is equal to true
				}
				if(isSetUp == true && isItemsBought == false) {
					//if loop
					//if the isSetUp variable is true AND the isItemsBought variable is false then this will print out
					//following statement and lines of code will print out
					System.out.println("");
					//the program prints out a blank line and moves on to the next line
					System.out.println("Items have not been bought yet!");
					//the program prints out the statement "Items have not been bought yet!"
					System.out.println("");
					//the program prints out a blank line and moves on to the next line
					break;
					//break loops/switch statements
					//moves on to the next portion of the code
				}
			}
			}
			//brackets close off section of the code
			if(functionChoice > 4) {
				//if loop
				//if the function choice is greater than 4 then itll bbe invalid because there are no function choices greater than 4
				System.out.println("");
				//the program moves on to the next line of the program
				System.out.println("Error do not know the function: "+ functionChoice);
				//the program prints out "Error do not know the function: " + function choice
				System.out.println("");
				//the program moves on to the next line of the program
			}
			//bracket closes off the portion of the code
			if(isDone == true) {
				//if loop
				//if isDone variable is true then the following statments will print out
				System.out.println("---------------------------------------------");
				//the program will print a consistant line of dashes to close out the program
				System.out.print("Would you like to re-run (1 for yes, 0 for no)? ");
				//the program prints out this statement "Would you like to re-run (1 for yes, 0 for no)? "
				//program is asking the user if they want to rerun the program
				int reRun = input.nextInt();
				//the program asks the user for an input for whether the program should rerun or not
				if(reRun == 1) {
					//if loop
					//the program will rerun if the value of the rerun input is equal to 1
					System.out.println("---------------------------------------------");
					//the program will print a consistant line of dashes to close out the program
					System.out.println("");
					//the program continues to the next line of the program

					main(args);
					//runs main function
				}
				//bracket closes off if loop
				else {
					//else loop
					//if the before if is not true then this will run
					System.out.println("---------------------------------------------");
					//the program will print a consistant line of dashes to close out the program
					System.exit(0);
					//exits program
				}

			}
		}while(true);
		//while loop
		//true then end of prpogram
	}
}
//brackets close of program code
//end of program