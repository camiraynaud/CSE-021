import java.util.Random;

public class Error {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		//curly braces used to group statements whether it be a statement or a loop, etc.
		final int MAXCHEESE = 1;
		//this is the variable that needs to be changed to show different outputs
		//final integer of MAXCHEESE is 0
		//constant

		String[] names = new String[MAXCHEESE];
		//string for names 
		//combined array type with type name 
		double[] prices = new double[MAXCHEESE];
		//decimals used for double
		//double holds the data type of prices for MAXCHEESE
		double[] amounts = new double[MAXCHEESE];
		//decimals used for double
		//double holds the data type of prices for MAXCHEESE
		// Three Special Cheeses
		if (MAXCHEESE > 0 & MAXCHEESE <= 20) {
			//if MAXCHEESE is greater than zero AND MAXCHEESE is less than or equal to 20
			//changed value from 10 before that wasn't working with the program 
			names[0] = "Humboldt Fog";
			//first value for the names 
			//starts off at 0 and goes to 2
			prices[0] = 25.00;
			//price for "Humboldt Fog" cheese
			//starts off at 0 and goes to 2
			names[1] = "Red Hawk";
			//second value for the names of the cheese
			//starts off at 0 and goes to 2
			prices[1] = 40.50;
			//price for "Red Hawk" cheese
			//starts off at 0 and goes to 2
			names[2] = "Teleme";
			//third value for the names of the cheese
			//starts off at 0 and goes to 2
			//this is the last data for the names of cheeses
			prices[2] = 17.25;
			//price for the "Teleme" cheese is 17.25

			System.out.println("We sell " + MAXCHEESE + " kinds of cheese:");
			//the program prints out "we sell" + MAXCHEESE + " kind of cheese" for the user 
			//this outprint from the program depends on the value of MAXCHEESE at the begining of the code

			System.out.println(names[0] + ": $" + prices[0] + " per pound");
			//the system prints Humboldt Fog: $25.00 per pound
			//if coded correctly lol
			System.out.println(names[1] + ": $" + prices[1] + " per pound");
			//the system prints Red Hawk: $40.50 per pound
			System.out.println(names[2] + ": $" + prices[2] + " per pound");
			//the system prints Teleme: $17.25 per pound

			Random ranGen = new Random(200); 
			//change to 100?
			//random number generator
			//out of 200

			for (int i = 3; i < MAXCHEESE; i++) {
				//for loop
				//i++ is the post increment operator
				//increments each value by 1 after original value is substituted in the equation
				//for example 1 <= 5 1 is not greater than or equal to 5 so therefore the program would print "No numbers were found"
				//since i is less than the arr.length it'll loop 0-one under the total of the array length
				names[i] = "Cheese Type " + (char)('A' + i);
				//name integer = system prints "Cheese Type" + letter and integer value stating the price 
				prices[i] = ranGen.nextInt(1000)/100.0;
				//calculation for the price of the cheese type
				//takes the random number generator number and multiplys it by 1000 and then divides by 100
				//for example 150(1000)/100.0
				amounts[i] = 0;
				//the amount is equal to zero here

				System.out.println(names[i] + ": $" + prices[i] + " per pound");
				//the program will print "Red Hawk: $40.5 per pound"
			}

		}
		//brackets close off section
		if(MAXCHEESE <= 0) {
			//if final MAXCHEESE value is equal to or less than zero 
			System.out.println("We sell 0 kinds of cheese (in 0.5 lb packages)");
			//then the program will print out this message saying "We sell 0 kinds of cheese (in 0.5 lb packages)"

		}
		//System.out.println("Cheese " + 'A' + 10); System.out.println("Cheese " + (char)'A' + 10); System.out.println("Cheese " + (int)'A' + 10); System.out.println("Cheese " + (char)('A' + 10)); System.out.println("Cheese " + (int)('A' + 10));
	// this was for the questions for this lab lol
	}
}
//end of program code
