//code begins here
import java.util.*;
//scanner inputted here
public class Lab21_Vars {
//public class for Lab21_Vars.java
	public static void main(String[] args) {
		//public class for the main code

		int i=0, j = 0;
		//int i is initialized to 0
		//int j is also initialized to 0
		@SuppressWarnings("unused")
		int var0, var1;
		//int var0 and var 1 are initialized here
		// Fix 1: Correctly typecast 5.0 to an int so it can assigned to var3.
		@SuppressWarnings("unused")
		int var2 = 0, var3 = (int)5.0;
		//int var2 is initialized to 0
		//int var3 is initialized to the int value of 5.0
		
		// Fix 2: Correctly declare a variable as an array.
		@SuppressWarnings("unused")
		int arri0[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
		//int arri0 is equal to the array containing these values 
		//values are as follows 10, 9, 8, 7, 6, 5, 4, 3, 2, 1
		
		@SuppressWarnings("unused")
		double[] arrd0 = {0.0, 1.0, 2.0, 3.0, 4.0};
		//double variable arrd0 is equal to the array containing these values 
		//values are as follows 0.0, 1.0, 2.0, 3.0, 4.0
		
		// Fix 3: What's wrong with temp? Fix it.
		int temp = 0;
		//int variable called temp is initialized to the value of 0
		if (i < j) {
			//if loop
			//if i is less than j
			temp = 0;
			//temp variable is initalized to 0
			System.out.println("Temp is " + temp);
			//the program prints out "Temp is " plus the value of the temp variable
		} else {
			//else loop
			temp = 1;
			//temp variable is initialized to 1
			System.out.println("Temp is " + temp);
			//the program prints out "Temp is " plus the temp variable
		}
		//bracket closes off this portion of the code
		// Fix 4: Correctly calculate square of sums and print it as total.
		int total = 0;
		//integer total is initialized to the value of 0
		for (i = 0; i < 10; i++) {
			//for loop
			//integer i is equal to 0
			//if i is less than 10 then the following code will run
			//i++ is a post increment addition of 1
			total += i*i;
			//total is += integer i times the value of integer i
		}
		//bracket closes off this portion of the code
		System.out.println("i value is " + i);
		//the program prints out "i value is " plus the value of the integer i
		System.out.println("Total is " + total);
		//the program prints out "Total is " plus the value of the total
		
		// Fix 5: Figure out the logical error in lines 36-42, and correct it.
		Cheese jack = new Cheese("Jack");
		//cheese jack is equal to a new cheese called jack
		Cheese monterey = new Cheese("Monterey");
		//cheese monterey is equal to a new cheese called monterey
		jack = monterey;
		//jack is initialized to monterey
		//making monterey jack
		System.out.println("Monterey name is " + monterey.getName());
		//the program prints out "Monterey name is " plus "Monterey Jack"
		jack.setName("Jack");
		//jacks set name is called and printed out as "Jack"
		System.out.println("Jack name is " + jack.getName());
		//the program prints out "Jack name is " plus "Jack"
		System.out.println("Monterey name is still " + monterey.getName());
		//the program prints out "Monterey name is still " and "Monterey Jack"
	
		// Fix 6: Make the following code shorter by combining redundant 
		//        (unnecessary/duplicate) statements
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		//the scanner for the program is initialized here 
		System.out.print("Enter first number: ");
		//the program prints out "Enter first number: "
		int num1 = input.nextInt();
		//integer num 1 is equal to whatever input the program user enters
		int num2 = 0;
		//integer num2 is equal to the value of 0
		if (num1 > var3) {
			//if loop
			//num1 is greater than var3
			//then the following lines of code will print out
			System.out.print("Enter second number: ");
			//the program outprints "Enter second number"
			num2 = input.nextInt();
			//num2 is equal to whatever input the program user enters
			System.out.println("First is greater");
			//the program outprints "First is greater"
		} 
		else {
			//else loop
			//if the above if loops arent true then this situation will print out
			System.out.print("Enter second number: ");
			//the program outprints "Enter second number: "
			num2 = input.nextInt();
			//num2 is equal to the input that the program user enters 
			System.out.println("First is Less than or equal");
			//the program out prints this statement "First is Less than or equal"
		}
		if (num2 < var3) {
			//if loop
			//if num2 is less than var3 then the following will print out
			System.out.println("Second is Less than");
			//the program outprints this statement "Second is Less than"
		} 
		else {
			//if the above if loop statement isnt true than this else statement will print
			System.out.println("Second is Greater or equal");
			//the program out prints this statement "Second is Greater or equal"
		}
//the bracket closes off this portion of the code
		System.out.println("First number is: " + num1);
//the program out prints this statement "First number is : " plus the num1 variable
		
		// Fix 7: Print out the first number entered by the user
		//        (Hint - You will need to modify the above code)
		
	}

}
//this bracket marks the end of the code for this program