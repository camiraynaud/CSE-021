import java.util.Scanner;
public class CheeseShop {

	public static void main(String[] args) 
	{
		//curly braces used to group statements whether it be a statement or a loop, etc.
		// TODO Auto-generated method stub
		//Create Variables
		@SuppressWarnings("resource")
		Scanner scnr = new Scanner(System.in);
		//scanner used for program to take account for users inputs 

		double hFog = 0.0,teleme = 0.0, redHawk = 0.0, total = 0.0, hFogPrice = 0.0;
		double telemePrice = 0.0, redHawkPrice = 0.0, hFogDiscount = 0.0, redHawkDiscount =0.0;
		int itemList = 0;
		//here I defined various variables that were used to create cheeseshop.java including cheese prices and discount calculations for this lab
		System.out.println("We sell 3 kinds of Cheese (in 0.5 lb packages):");
		System.out.println("Humboldt Fog: $25.0 per pound");
		System.out.println("Red Hawk: $40.5 per pound");
		System.out.println("Teleme: $17.25 per pound");
		System.out.println("");
		//here I made the programs tell the user all the different prices of the various cheese types (humboldt fog, red hawk, teleme, etc.)
		//last line "" just signifies a line space/jump

		System.out.print("Enter the amount of Humboldt Fog in lbs: ");
		//here the program is asking the user for a variable input for the scanner signifying the amount of each cheese
		hFog = scnr.nextDouble();
		//scanner variable (double) aka can be a decimal number if its a multiple of 0.5
		while(hFog % (.5) !=0 || hFog <0) {
			//while loop where the scanner double variable has to be a multiple of 0.5 and not equal to zero
			//"||" signifying a "logical OR" meaning its either has to be a multiple of 0.5 and not equal to zero OR is less than zero
			while(hFog % (.5) !=0)
				//while loop number 2
			{
				System.out.print("Invalid input. Enter a value that's multiple of 0.5:");
				//system prints this message if its detected that the value isnt a multiple of 0.5, asks for a new variable
				hFog = scnr.nextDouble();
				//program stores new variable in this scanner
			}
			while(hFog < 0) 
				//while loop 3 states that its an issue if the hFog amount is less than 0
			{
				System.out.print("Invalid input. Enter a value >=0:");
				//Program asks user for a new input if its not greater than or equal to zero 
				hFog = scnr.nextDouble();
				//program stores the variable in this scanner
			}
		}
		System.out.print("Enter the amount of Red Hawk in lbs: ");
		//here the program is asking the user for a variable input for the scanner signifying the amount of each cheese
		redHawk = scnr.nextDouble();
		//scanner variable (double) aka can be a decimal number if its a multiple of 0.5
		while(redHawk % (.5) !=0 || redHawk <0) {
			//while loop for redHawk where the scanner double variable has to be a multiple of 0.5 and not equal to zero
			//"||" signifying a "logical OR" meaning its either has to be a multiple of 0.5 and not equal to zero OR is less than zero
			while(redHawk % (.5) != 0) {
				//while loop number 2
				System.out.print("Invalid input. Enter a value that's multiple of 0.5:");
				//system prints this message if its detected that the value isnt a multiple of 0.5, asks for a new variable
				redHawk = scnr.nextDouble();
				//program stores new variable in this scanner that is a multiple of 0.5
			}
			while(redHawk < 0) 
			{
				//while loop 3 states that its an issue if the hFog amount is less than 0
				System.out.print("Invalid input. Enter a value >=0: ");
				//Program asks user for a new input if its not greater than or equal to zero 
				redHawk = scnr.nextDouble();
				//program stores value greater than or equal to zero in this scanner
			}
		}
		//curly braces close out loops for redHawk
		System.out.print("Enter the amount of Teleme in lbs: ");
		//here the program is asking the user for a variable input for the scanner signifying the amount of each cheese
		teleme = scnr.nextDouble();
		//scanner variable (double) aka can be a decimal number if its a multiple of 0.5
		while(teleme %(.5) != 0 || teleme < 0) {
			//while loop for redHawk where the scanner double variable has to be a multiple of 0.5 and not equal to zero
			//"||" signifying a "logical OR" meaning its either has to be a multiple of 0.5 and not equal to zero OR is less than zero
			while(teleme % (.5) != 0) {
				//while loop number 2 where the amount of teleme cheese is not a multiple of 0.5 and not equal to zero
				System.out.print("Invalid input. Enter a value that's multiple of 0.5: ");
				//system prints this message if its detected that the value isnt a multiple of 0.5, asks for a new variable
				teleme = scnr.nextDouble();
				//program stores new variable that is a multiple of 0.5 in this scanner
			}
			while(teleme < 0) {
				//while loop 3 states that its an issue if the hFog amount is less than 0
				System.out.print("Invalid input. Enter a value >=0: ");
				//Program asks user for a new input if its not greater than or equal to zero 
				teleme = scnr.nextDouble();
				//program stores value greater than or equal to zero in this scanner
			}
		}
		//curly braces close out loops for teleme cheese
		System.out.println("");
		//represents a new blank line
		hFogDiscount = hFog * 12.5; 
		//represents calculation of hFog discount the price is multiplied by 12.5
		//hFog = hFog * 2;
		hFogPrice = hFog * 25.0;
		//the price of hFog is calculated by the amount stored in the scanner multiplied by the total per lb which is 25
		redHawkDiscount = redHawk * 0.5 * 20.25; //idk how to change the discounts lmao //changed to 20.25 instead of 40.5 //took out * .5
		//redHawk = redHawk + (int)redHawk * .5;
		//rdhwk discount calculated by multiplying by .5 and 20.25
		redHawkPrice = redHawk * 40.5;
		//redhwk price calcualted by the amount stored in the scanner multiplied by the total per lb which is 40.5
		telemePrice = teleme * 17.25;
		//teleme doesnt have a discount price
		//teleme price is calculated by the amount stored in the scanner multipled by the total per lb whicch is 17.25
		total = hFogPrice + redHawkPrice + telemePrice;
		//the total overall price is calculated by adding up all the calculated prices of the 3 cheeses
		System.out.print("Display the itemized list? (1 for yes) ");
		//program is asking the user if they want to see a totalled list of what they are purchasing
		itemList = scnr.nextInt();
		//program asks for an input from the user which would be 1 if they want to see the intemized list or 0 if they dont
		if(itemList == 1) {
			//program says if the itemList or item display list is equal to 1 then itll show the amount and quantity of cheese purchased
			if(hFog>0) {
				//if hfog is greater than zero
				System.out.println(hFog + " lb of Humbold Fog @ $25.0 = $" + hFogPrice);
				//then this statement will print including the amount purchased and total cost
			}
			if(redHawk>0) {
				//if redhawk is greater than zero
				System.out.println(redHawk + " lb of Red Hawk @ $40.5 = $" + redHawkPrice);
				//then this statement will print including the amount purchased and total cost
			}
			if(teleme>0) {
				//if telem is greater than zero
				System.out.println(teleme + " lb of Teleme @ $17.25 = $" + telemePrice);
				//then this statement will print including the amount purchased and the total cost included
			}
		}
		System.out.println("");
		//this part of the code resembles a new line that is blank
		System.out.println("Sub total:" + "\t" +"\t" +"\t" + "  " + "$" + total);
		//this line will write out the subtotal before discounts for all the cheese purchased
		System.out.println("Discounts...");
		//here marks the discount calculations for the cheese
		//if((redHawk ==0 && hFog == 0) && (teleme == 0)) {
		//System.out.println("No items were purchased");
		//System.out.println("Final Total:"+"\t" +"\t" + "\t" + "  " + "$" +(total)); // no - hFogDiscount - redHawkDiscount
		//}
		//System.out.println("Discounts...");
		//if(hFog < 0) {
		//System.out.println("None" + "\t "+ "\t" + "\t"+ "\t"+" -$" + (hFogDiscount + redHawkDiscount));
		//System.out.println("Final Total:"+"\t" +"\t" + "\t" + "  " + "$" +(total - hFogDiscount)); //no - redHawkDiscount
		//}
		if (redHawk ==0) {
			//if red hawk is equal to zero then the following lines will print
			System.out.println("None" + "\t "+ "\t" + "\t"+ "\t"+" -$" + (hFogDiscount + redHawkDiscount));
			//no discount
			System.out.println("Final Total:"+"\t" +"\t" + "\t" + "  " + "$" +(total - hFogDiscount )); //no - redHawkDiscount
			//prints final total - hfog discount if there is one
		}
		//	if(hFogDiscount >= 1) { //changing these values does nothing lmao
		//System.out.println("Humboldt Fog (Buy 1 Get 1 Free): -$" + hFogDiscount);
		//}
		if(redHawk >= 2 && hFog == 1) {
			//if redhawk is equal or greater than 2 AND hfog is equal to 1 then the following lines will print
			System.out.println("Humboldt Fog (Buy 1 Get 1 Free): -$" + hFogDiscount);
			//calculation of the humboldt fog discount
			System.out.println("Red Hawk (Buy 2 Get 1 Free):     -$" + redHawkDiscount);
			//calculation of the red hawk discount
			System.out.println("Final Total:"+"\t" +"\t" + "\t" + "  " + "$" +(total - redHawkDiscount- hFogDiscount));  
			//calculation of the final total minus the discounts for the redhawk and hfog purchased
		}
		else if (hFogDiscount >= 1) { //&& redHawkDiscount == 0
			//else if hfog is greater than or equal to one (amount purchased)
			System.out.println("Humboldt Fog (Buy 1 Get 1 Free): -$" + hFogDiscount);
			//then this line will print out calculating the discount amount for the humbolt fog purchased
			System.out.println("Final Total:"+"\t" +"\t" + "\t" + "  " + "$" +(total - hFogDiscount)); // no - redHawkDiscount
			//this line is the final total calcilation minus the discount from the hfog cheese purchased
		}
		//this curly brace closes out the else if
		//System.out.println("Final Total:"+"\t" +"\t" + "\t" + "  " + "$" +(total - hFogDiscount - redHawkDiscount));
	}
}
//end of program