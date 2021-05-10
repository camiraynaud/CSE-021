import java.util.Scanner;
public class RemainderFunc {

	public static void main(String[] args) {
		//curly braces used to group statements whether it be a statement or a loop, etc.
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the max number: ");
		//program asks user for a max number for maxNum integer value
		int maxNum = input.nextInt();
		//input from program user

		while (maxNum < 0) {
			//while statement must put out a boolean number
			//while statement for maxNum less than 0
			System.out.print("Invalid input, Please enter a valid max number (>= 0): ");
			//program asks user for a valid max number integer 
			maxNum = input.nextInt();
			//input for valid maxNum from program user
			
		}
		//end of while loop statement
		
		System.out.print("Please enter the divisor: ");
		//program prints this asking user for a divisor integer
		int divisor = input.nextInt();
		//input for divisor integer from program user
		
		while (divisor <= 0) {
			//while statement begins for if divisor is less than or equal to 0
			System.out.print("Invalid input, Please enter a valid max divisor (> 0): ");
			//program prints this statement is divisor is less than or equal to 0 asking for an integer greater than 0
			divisor = input.nextInt();
			//input from user for valid max divisor goes here
			
		}
		//end of while loop statement
		
		System.out.println("Multiples of " + divisor + " between 1 and "+ maxNum + " (inclusive) are: ");
		// system prints this statement and plugs in the divisor and manNum values with a line after followed by the appropriate statements
		
		for(int i = 1; i <= maxNum; i++) {
			//i++ is the post increment operator
			//increments each value by 1 after original value is substituted in the equation
			//for example 1 <= 5 1 is not greater than or equal to 5 so therefore the program would print "No numbers were found"
			 if (maxNum < divisor) {
				 //if divisor is larger than maxNum
				System.out.println("No numbers were found");
				//system types out that no numbers were found if the divisor is larger than the max number such as maxNum=2 and divisor=5
				break;			
				//break statement terminates the loop and program continues to the next statement
			}
			 //end of for if loop statement
			 else if(i % divisor == 0) { 
				 // % represents the remainder operator so if i=1 then 1%divisor is "equal to" (==) 0 so it would print 1 as a multiple of the number
					System.out.println(i);
					//system prints i when i=1 so the output would be 1
			}
		//end of else if loop statement
	}
	}

}
//end of program code