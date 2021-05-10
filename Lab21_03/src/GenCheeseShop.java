import java.util.Random;
//random number scanner/generator we will use later
import java.util.Scanner;
//displaying the scanner we will use later in the code
public class GenCheeseShop {
//name of lab
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scnr = new Scanner(System.in);
		//scanner used for program to take account for users inputs 
		System.out.print("Enter the number of cheeses for shop setup: ");
		//program outprints this statement asking the user for the number of cheese during set up time
		final int MAXCHEESE = scnr.nextInt();
		//integer for MAXCHEESE program asks the user for an input number to enter
		Random randomNum = new Random(100);
		//randomNum new random number generator out of 100
		//random class is used to generate random numbers
		String[] names = new String[MAXCHEESE];
		//string is a sequence of characters that exist as an object of the class
		//here we have a new string for names 
		double[] prices = new double[MAXCHEESE];
		//decimals used for double
		//double holds the data type of prices for MAXCHEESE
		double[] amounts = new double[MAXCHEESE];
		//decimals used for double
		//double holds the data type of prices for MAXCHEESE
		//three Special Cheeses
		//keep track of total
		double[] subtotal = new double[MAXCHEESE];
		//new double for subtotal of MAXCHEESE
		//decimals used for double
		//this double holds the data type of the subtotal for MAXCHEESE
		double total = 0.0;
		//code establishes a double for the total
		int discount = 0;
		//code establishes a new integer of 0 for the discount
		double hFogDiscount = 0.0;
		//code establishes a new double for the Humbolt Fog cheese discount
		double redHawkDiscount = 0.0;
		//code establishes a new double for the red hawk cheese discount
		double discountAmount = 0.0;
		//code estabishes a new double for the discount amount of the cheese(s) 
		int list = 0;
		//code establishes a new integer for list = 0
		String cash = "$";
		//string is a sequence of characters that exist as an object of the class
		//here we have a new string for cash which is associated with the "$" sign
		//string is a sequence of characters that exist as an object of the class
		String minusCash = "-$";
		//string is a sequence of characters that exist as an object of the class
		//here we have a new string for minus cash which is associated with the "-$" sign
		//string is a sequence of characters that exist as an object of the class
		System.out.println("");
		//system prints out a space on a new line 
		System.out.println("We sell " + MAXCHEESE + " kinds of cheese, in 0.5 lb packages.");
		//system prints out on a new line "we sell (insert MAXCHEESE) kinds of cheese, in 0.5 lb packages."
		if(MAXCHEESE >0 && MAXCHEESE < 2) {//1
			//originally was 1 before it was changed
			//if MAXCHEESE is greater than zero AND MAXCHEESE is less than 2
			//changed value from 10 before that wasn't working with the program 
			names[0] = "Humboldt Fog";
			//first value for the names 
			//starts off at 0 and goes to 2
			prices[0] = 25.00;
			//price for "Humboldt Fog" cheese
			//starts off at 0 and goes to 2
			System.out.printf("%s: $%.1f per pound \n", names[0],prices[0]);
			//program prints out the prices and names of each cheese 
			//for example: Humboldt Fog: $25.0 per pound
			//The printf() method of Java PrintStream class is a convenience method which is used to write a String which is formatted to this output Stream
		}
		//bracket closes off first section of code before if statements, etc. 
		if(MAXCHEESE >1 && MAXCHEESE < 3) {//2
			//if MAXCHEESE is greater than one AND MAXCHEESE is less than 3
			//if these conditions are true then the print statements below shouldd function
			names[0] = "Humboldt Fog";
			prices[0] = 25.00;
			//code displays name and price of Humboldt fog cheese
			names[1] = "Red Hawk";
			prices[1] = 40.50;
			//code displays name and price of red hawk cheese
			System.out.printf("%s: $%.1f per pound \n", names[0],prices[0]);
			//program prints out this statement "Humboldt Fog: $25.0 per pound"
			//the [0] corresponds to the humboldt fog cheese
			System.out.printf("%s: $%.1f per pound \n", names[1],prices[1]);
			//program prints out this statement "Red Hawk: $40.5 per pound"
			//the [0] corresponds to the red hawk cheese
		}
		//bracket closes first if statement
		if(MAXCHEESE > 2) {//3
			//if MAXCHEESE is greater than two
			//if these conditions are true then the print statements below shouldd function
			names[0] = "Humboldt Fog";
			prices[0] = 25.00;
			//code displays name and price of Humboldt fog cheese
			names[1] = "Red Hawk";
			prices[1] = 40.50;
			//code displays name and price of red hawk cheese
			names[2] = "Teleme";
			prices[2] = 17.25;
			//code displays name and price of teleme cheese
			System.out.printf("%s: $%.1f per pound \n", names[0],prices[0]);
			//The printf() method of Java PrintStream class is a convenience method which is used to write a String
			//program prints out this statement "Humboldt Fog: $25.0 per pound"
			//the [0] corresponds to the humboldt fog cheese
			System.out.printf("%s: $%.1f per pound \n", names[1],prices[1]);
			//The printf() method of Java PrintStream class is a convenience method which is used to write a String
			//program prints out this statement "Red Hawk: $40.5 per pound"
			//the [0] corresponds to the red hawk cheese
			System.out.printf("%s: $%.2f per pound \n", names[2],prices[2]);
			//The printf() method of Java PrintStream class is a convenience method which is used to write a String
			//program prints out this statement "Teleme: $17.25 per pound"
			//the [2] corresponds to the teleme cheese
		}
		//curly brace marks the end of the if statement
		if(MAXCHEESE > 0 & MAXCHEESE <= 20) {
			//if MAXCHEESE is greater than zero AND MAXCHEESE is less than or equal to 20
			//changed value from 10 before that wasn't working with the program 
			for (int i = 3; i < MAXCHEESE; i++) {
				//for loop
				//i++ is the post increment operator
				//increments each value by 1 after original value is substituted in the equation
				//for example 1 <= 5 1 is not greater than or equal to 5 so therefore the program would print "No numbers were found"
				//since i is less than the arr.length it'll loop 0-one under the total of the array length
				names[i] = "Cheese Type " + (char)('A' + i);
				//name integer = system prints "Cheese Type" + letter and integer value stating the price 
				prices[i] = randomNum.nextInt(1000)/100.0;
				//calculation for the price of the cheese type
				//takes the random number generator number and multiplys it by 1000 and then divides by 100
				//for example 150(1000)/100.0
				amounts[i] = 0;
				//the amount is equal to zero here
				System.out.printf("%s: $%.2f per pound \n", names[i],prices[i]);
				//The printf() method of Java PrintStream class is a convenience method which is used to write a String
				//the program will print for example "Cheese Type D: $9.15 per pound"
				//list other cheeses than the 3 special ones
			}
			//curly brace closes off that if statement
			System.out.println("");
			//program prints out a blank line and moves to the next
			for (int i = 0; i < MAXCHEESE; i++) {
				//for loop
				//i++ is the post increment operator
				//increments each value by 1 after original value is substituted in the equation
				//for example 1 <= 5 1 is not greater than or equal to 5 so therefore the program would print "No numbers were found"
				//since i is less than the arr.length it'll loop 0-one under the total of the array length
				System.out.printf("Enter the amount of %s in lb: ", names[i]);
				//program will print out for example "Enter the amount of Cheese Type D in lb: "
				amounts[i] = scnr.nextDouble();
				//scanner for a double 
				//double variable is also used to hold floating point values
				//user can input any double number with a decimal
				while(amounts[i] % (.5) !=0 || amounts[i] <0) {
					while(amounts[i] % (.5) !=0){
						System.out.print("Invalid input. Enter a value that's multiple of 0.5:");
						//program will print out this message if its not a double "Invalid input. Enter a value that's multiple of 0.5:"
						amounts[i] = scnr.nextDouble();
						//scanner for a double 
						//double variable is also used to hold floating point values
						//user can input any double number with a decimal
					}
					//curly brace ends while statement
					while(amounts[i] < 0) {
						//if the amount[i] in the double scanner is less than zero
						//then the following statement will print
						System.out.print("Invalid input. Enter a value >=0:");
						//if these conditions are true then this statement will print "Invalid input. Enter a value >=0:"
						amounts[i] = scnr.nextDouble();
						//scanner double for the amounts[i] variable

					}
				}
				//curly braces close off while statement and section
				subtotal[i] = amounts[i] * prices[i];
				//calculation of subtotal is the amounts * the prices
				total = subtotal[i] + total;
				//calculation of the total is the subtotal plus the total
			}
			System.out.println("");
			//program will print out a blank line and go to the next line
			System.out.print("Display the itemized list? (1 for yes) ");
			//the program will print out this statement "Display the itemized list? (1 for yes) "
			list = scnr.nextInt();
			//user must input a 1 for the itemized list to be shown any other number or input wont show it
			if(list == 1) {
				//if statement
				//if the list is equal/comparable to 1
				//the == operator is used to check the reference of both the string objects and equals() 
				//method used to check the value equality of both strings
				if(total <= 0) {
				//if statement
				//total is less than or equal to zero
				//then the following statement will print out
					System.out.println("No items were purchased.");
				//if the conditions are true then this statement will print out "No items were purchased."
				}
				//curly brace closes off if statement
				if(total >0) {
					for(int i =0; i < MAXCHEESE; i++) {
						//for statement loop
						//i++ is the post increment operator
						//increments each value by 1 after original value is substituted in the equation
						//for example 1 <= 5 1 is not greater than or equal to 5 so therefore the program would print "No numbers were found"
						//since i is less than the arr.length it'll loop 0-one under the total of the array length
						if(amounts[i] != 0) {
							//if statement
							//if amount is not equal to zero
							System.out.printf("%.1f lb of %s @ $%.2f = $%.2f\n", amounts[i], names[i],
									prices[i], prices[i]*amounts[i]);
							//System.out.println(amounts[i] + " lb of " + names[i] + " @ $" + prices[i] + " = $"+ Math.round(subtotal[i]*100)/100.0);
						}
					}
				}
			}

		}			
		if(MAXCHEESE >= 1 && MAXCHEESE < 2) {//1
			hFogDiscount = amounts[0];
			hFogDiscount = Math.floor(hFogDiscount)/2;
			hFogDiscount = hFogDiscount * 25.0;
		//if MAXCHEESE is greater than or equal to 1 AND MAXCHEESE is less than 2
			//if these are all true then the humbolt fog discount will be factored in

		}
		//curly brace ends discount calculation for humbolt fog
		if(MAXCHEESE >= 2) {//2
			//if MAXCHEESE is greater than or equal to two
			hFogDiscount = amounts[0];
			hFogDiscount = Math.floor(hFogDiscount)/2;
			hFogDiscount = hFogDiscount * 25.0;
			//if these are all true then the humbolt fog discount will be factored in
			redHawkDiscount = amounts[1];
			redHawkDiscount = redHawkDiscount * 2;
			redHawkDiscount = redHawkDiscount /3;
			redHawkDiscount = (int)redHawkDiscount;
			redHawkDiscount = redHawkDiscount * 20.25;
			//includes all the calculations for the red hawk discount
			//if these are all true then the red hawk discount will also be factored in
		}
		//curly brace shows end of if statement for hfog and red hawk discount calculations
		System.out.println("");
		//program will print a blank line and go to the next line
		double originSub = Math.round(total*100)/100.0;
		//calculation for the originSub of the cheese type
		//takes the random number generator number and multiplys it by 1000 and then divides by 100
		//for example 150(1000)/100.0
		System.out.printf("Original Sub Total: %15s%.2f \n", cash,originSub);
		//The printf() method of Java PrintStream class is a convenience method which is used to write a String
		//program prints the Original Sub Total amount including the cash and originSub amount 
		System.out.println("Specials...");
		if(hFogDiscount >0) {
			System.out.printf("Humboldt Fog (Buy 1 Get 1 Free): %2s%.2f \n",minusCash, hFogDiscount);
			//The printf() method of Java PrintStream class is a convenience method which is used to write a String
			//program prints the discount amount for Humboldt fog
		}
		if(redHawkDiscount>0) {
			//if red hawk cheese discount is greater than zero then the following will be printed out
			System.out.printf("Red Hawk (Buy 2 Get 1 Free): %6s%.2f \n",minusCash,redHawkDiscount);
			//The printf() method of Java PrintStream class is a convenience method which is used to write a String
			//program prints the discount amount for red hawk if the conditions are right
		}
		double none = 0.0;
		//double variable for none as in no cheeses purchased or no specific cheese purchased
		//gets assigned zero for no cost
		if(hFogDiscount ==0 && redHawkDiscount ==0) {
			//if the humboldt fod discount is zero AND the red hawk discount is zero then the following will print
			System.out.printf("None %30s%.1f \n",minusCash,none);
			//The printf() method of Java PrintStream class is a convenience method which is used to write a String
			//program prints the amount as none because their is no discount and nothing to take away or there 
			//was no purchase so there is also none
		}
		//curly brace closes off if statement
		total = total -hFogDiscount;
		//total calculation would be the total minus the hfog discount
		total = total - redHawkDiscount;
		//total calulation would be the total minus the red hawk discount
		if(total < 0) {
			//if the total is less than zero
			total = 0;
			//then  the total is zero
		}
		double newSub = Math.round(total*100)/100.0;
		//calculation for the new sub total of the cheese type
		//takes the random number generator number and multiplys it by 1000 and then divides by 100
		//for example 150(1000)/100.0
		//Math. round() method in Java is used to round a number to its​ closest integer
		System.out.printf("New Sub Total: %20s%.2f \n", cash, newSub);
		//The printf() method of Java PrintStream class is a convenience method which is used to write a String
		//the program out prints "New Sub Total: (insert amount here)"
		if(total < 150) {
			//if the total is less than $150
			discount = 0;
			//then the discount would be $0 off
		}
		if(total >= 150 && total < 250) {
			//if the total is greater than or equal to $150 AND the total is less than $250
			discount = 10;
			//then the discount will be $10
		}
		if(total >= 250) {
			//if the total is greater than or equal to $250
			discount = 25;
			//then the discount will be $25
		}

		discountAmount = (total*discount)/100;
		//calculation for the discount amount = the total times the discount in question divided by 100
		double discountInCash = Math.round(discountAmount*100)/100.0;
		//calculation for the discount in cash would equal to the discount amount times 100 divided by 100.0
		//Math. round() method in Java is used to round a number to its​ closest integer
		String percent = "%";
		//this displays a % symbol when its needed
		if(discountInCash < 1) {
			//if the discount in cash is less than one
			System.out.printf("Additional %d%s Discount: %11s%.1f \n", discount,percent, minusCash, discountInCash);
			//then the program will print out this statement 
			//The printf() method of Java PrintStream class is a convenience method which is used to write a String
		}
		else if(discountInCash >1) {
			//else if statement
			//if the discount in cash is greater than one
			System.out.printf("Additional %d%s Discount: %10s%.2f \n", discount,percent, minusCash, discountInCash);
			//The printf() method of Java PrintStream class is a convenience method which is used to write a String
		}
		double finalTotal =  Math.round((total - discountAmount)*100)/100.0;
		//the final total calculation is the total minus the discount amount time 100 divided by 100
		//Math. round() method in Java is used to round a number to its​ closest integer
		System.out.printf("Final Total : %21s%.2f",cash, finalTotal);
		//The printf() method of Java PrintStream class is a convenience method which is used to write a String

	}
}
//end of program