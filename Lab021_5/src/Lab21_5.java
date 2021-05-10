public class Lab21_5 {
//begining of the lab
	public static void init(long[] arr) {
		// Initialize all the entries of the array to 0
		for (int i = 0; i < arr.length; i++) {
			//for loop
			//integer equal to zero
			//i less than array length
			//i++ is the post increment operator
			//increments each value by 1 after original value is substituted in the equation
			//for example 1 <= 5 1 is not greater than or equal to 5 so therefore the program would print "No numbers were found"
			//since i is less than the arr.length it'll loop 0-one under the total of the array length
			arr[i] = 0;
			//array for the variable of i is equal to zero
			//i stands for the identifier
		}
	}
	//curly braces close off the section of the program

	public static long sumAll(int max) {
		// Initialize all the entries of the array of sumAll
		//this array for sumAll has the integer of max
		long subTotal = 0;
		//long variable
		//subTotal is equal to zero for a base measure
		for (int i = 1; i <= max; i++) {
			//for loop
			//integer identifier is equal to one in this loop
			//the identifier is equal to of less than the max value
			//i++ is the post increment operator
			//increments each value by 1 after original value is substituted in the equation
			//for example 1 <= 5 1 is not greater than or equal to 5 so therefore the program would print "No numbers were found"
			//since i is less than the arr.length it'll loop 0-one under the total of the array length
			subTotal += i;
			//the subTotal is the added value of the right operand to a variable that is then assigned to the variable
			//addition assignment operator right here
			System.out.println("sumAll " + i + " value " + subTotal);
			//the program prints "sumAll " plus the identifier value plus the word " value" and then also the subTotal
			//the program prints this out and then moves on to the next line of the program
		}
		//curly brace closes off this section of the code
		return subTotal;
		//return is used to exit from a method with or without a value
		//return nothing
	}
	//curly brace closes off this section of the code
	public static long sumAll(long[] arr, int max) {
		//Initialize all the entries of the array of sumAll
		//this array for sumAll has the integer of max and a long array
		for (int i = 1; i <= max ; i++) {
			//for loop
			//integer identifier is equal to one in this loop
			//the identifier is equal to of less than the max value
			//i++ is the post increment operator
			//increments each value by 1 after original value is substituted in the equation
			//for example 1 <= 5 1 is not greater than or equal to 5 so therefore the program would print "No numbers were found"
			//since i is less than the arr.length it'll loop 0-one under the total of the array length
			if (arr[i] == 0) {
				//if array of the identifier is equal to zero
				arr[i] = arr[i-1] + i;	
				//array of the identifier is equal to the array identifier minus 1 plus the identifier
				System.out.println("sumAll[" + i + "] value " + arr[i]);
				//the program prints out this text
				//the program would display "sumAll [" and then the identifier and then "] value " and then the value of arr[i]
				//the program would then follow with a line or go to the next line
			}
		}
		//this part of the code is ended here with these curly braces
		return arr[max];
		//return is used to exit from a method with or without a value
		//return nothing

	}
	//close the above functions with curly brace
	public static long squareSum(int max) {
		//Initialize all the entries of the array of squareSum
		//this array for squareSum has the integer of max
		long squareSum = 0;
		//long is a 64 bit two's complement integer
		//values wider than provided than the int
		//squareSum is equal to zero
		
		for(int i = 1; i <= max; i++) {
			//for loop
			//integer identifier is equal to one in this loop
			//the identifier is equal to of less than the max value
			//i++ is the post increment operator
			//increments each value by 1 after original value is substituted in the equation
			//for example 1 <= 5 1 is not greater than or equal to 5 so therefore the program would print "No numbers were found"
			//since i is less than the arr.length it'll loop 0-one under the total of the array length
			squareSum += Math.pow(i, 2);
			//the squareSum is the added value of the right operand to a variable that is then assigned to the variable
			//addition assignment operator right here
			//Math.pow is used to calculate a number raised to the power of some other number
			System.out.println("squareSum " + i + " value " + squareSum);
			//the program will print out "squareSum " and then the identifier then " value " and the calculated sqaureSum value
		}
		//curly brace closes off this section of the code
		return squareSum;
		//return is used to exit from a method with or without a value
		//return nothing
	}
	//curly brace closes off the squareSum long value
	public static long squareSum(long arr[], int max) {
		//Initialize all the entries of the array of squareSum
		//this array for squareSum has the integer of max and the long array
		
		for(int i = 1; i <= max; i++) {
			//for loop
			//integer identifier is equal to one in this loop
			//the identifier is equal to of less than the max value
			//i++ is the post increment operator
			//increments each value by 1 after original value is substituted in the equation
			//for example 1 <= 5 1 is not greater than or equal to 5 so therefore the program would print "No numbers were found"
			//since i is less than the arr.length it'll loop 0-one under the total of the array length
			if(arr[i] == 0) {
				//if loop
				//array of the identifier is equal or set at the value of zero
			arr[i] = arr[i-1] + (i*i);
			//the array of the identifier is equal to the array identifier minus one plus the identifier times itself
			System.out.println("squareSum[" + i + "] value " + arr[i]);
			//the program prints out "squareSum[" plus the identifier plus "] value " plus the array of the identifier
		}
		}
		//curly braces close off this section of the code
		return arr[max];
		//return is used to exit from a method with or without a value
		//return nothing
		//return for the array of max
	}
	//curly brace closes off this section of the code
	
	public static long fib(int max) {
		//Initialize all the entries of the array of squareSum
		//this array for long fib has the integer of max
		long value1 = 0;
		//value1 is equal to 0
		long value2 = 1;
		//value2 is equal to 1 
		long fibTotal = 0;
		//fibTotal is equal to zero
		//values of value 1 and 2 and the fib value total 
		for (int i = 2; i <= max; i++) {
			//for loop
			//integer identifier is equal to one in this loop
			//the identifier is equal to of less than the max value
			//i++ is the post increment operator
			//increments each value by 1 after original value is substituted in the equation
			//for example 1 <= 5 1 is not greater than or equal to 5 so therefore the program would print "No numbers were found"
			//since i is less than the arr.length it'll loop 0-one under the total of the array length
			fibTotal = value1 + value2;
			//the fibTotal is equal to value1 plus value2
			//zero plus one?
			System.out.println("Fibonacci " + i + " value " + fibTotal);
			//the program prints out "Fibonacci " the identifier and then " value " and the fibonacci total
			value1 = value2;
			//these values are equal to eachother
			value2 = fibTotal;
			//value2 is equal to the fibonanci total
		}
		//closes off this section of the lab
		return fibTotal;
		//return is used to exit from a method with or without a value
		//return nothing
		//return for the fibTotal
	}
	//curly brace closes off this section of the code
	public static long fib(long[] arr, int max) {
		//Initialize all the entries of the array of squareSum
		//this array for long fib has the integer of max and long array
		arr[0] = 0;
		//array of zero is equal to zero
		arr[1] = 1;
		//array of one is equal to one
		@SuppressWarnings("unused")
		long fibTotal = 0;
		//the long identifier of fibTotal is equal to zero
		for (int i = 2; i <= max; i++) {
			//for loop
			//integer identifier is equal to one in this loop
			//the identifier is equal to of less than the max value
			//i++ is the post increment operator
			//increments each value by 1 after original value is substituted in the equation
			//for example 1 <= 5 1 is not greater than or equal to 5 so therefore the program would print "No numbers were found"
			//since i is less than the arr.length it'll loop 0-one under the total of the array length
			
			if(arr[i] == 0) {
				//if loop
				//if the array of the identifier is equal to zero
			arr[i] = arr[i - 2] + arr[i - 1];
			//array of the identifier is equal to the array of the identifier minus 2 plus the array of the identifier minus the value of 1
			System.out.println("Fibonacci[" + i + "] value " + arr[i]);
			//the program prints out "Fibonacci[" plus the identifier plus "] value " plus the array of the identifier
			fibTotal += arr[i];
			//the fibTotal is the added value of the right operand to a variable that is then assigned to the variable
			//addition assignment operator right here
			//array of the identifier
		}
		}
		//these curly braces close off the portion of the program
		return arr[max];
		//return is used to exit from a method with or without a value
		//return nothing
		//return for the array of max value
	}
//curly brace closes off this section of the code
	public static long factorial(int max) {
		//Initialize all the entries of the array of squareSum
		//this array for long factorial has the integer of max
		long factTotal = 1;
		//long for factTotal
		//equal to one
		for (int i = 2; i <= max; i++) {
			//for loop
			//integer identifier is equal to one in this loop
			//the identifier is equal to of less than the max value
			//i++ is the post increment operator
			//increments each value by 1 after original value is substituted in the equation
			//for example 1 <= 5 1 is not greater than or equal to 5 so therefore the program would print "No numbers were found"
			//since i is less than the arr.length it'll loop 0-one under the total of the array length
			factTotal *= i;
			//factTotal 
			//this means that the factTotal is equal to factTotal times the identifier 
			System.out.println("Factorial " + i + " value " + factTotal);
			//the program prints out "Factorial " plus the identifier plus the " value " plus the factTotal 
			//then is follwoed by a new line
		}
		//curly brace closes off this section of the code
		return factTotal;
		//return is used to exit from a method with or without a value
		//return nothing
		//return for the array of max value
	}
//curly brace closes off this section of the code
	public static long factorial(long[] arr, int max) {
		//Initialize all the entries of the array of squareSum
		//this array for long factorial has the integer of max and the long array
		arr[1] =1;
		//array of 1 is equal to 1
		for (int i = 2; i <= max; i++) {
			//for loop
			//integer identifier is equal to one in this loop
			//the identifier is equal to of less than the max value
			//i++ is the post increment operator
			//increments each value by 1 after original value is substituted in the equation
			//for example 1 <= 5 1 is not greater than or equal to 5 so therefore the program would print "No numbers were found"
			//since i is less than the arr.length it'll loop 0-one under the total of the array length
			if(arr[i] == 0) {
				//if loop
				//if the array of the identifier is equal to zero
			arr[i] = i * arr[i-1];
			//the array of the integer is equal to the identifier times the array of the identifier minus one 
			System.out.println("Factorial[" + i + "] value " + arr[i]);
			//the program prints out "Factorial[" plus the identifier plus "] value " plus the array of the identfiier
		}
		//curly brace closes off this section of the code
	}
		//curly brace closes off this section of the code
		return arr[max];
		//return is used to exit from a method with or without a value
		//return nothing
		//return for the array of max value
	}
//curly brace closes off this section of the code
   // Fill-in the appropriate methods to complete the lab

	public static void main(String[] args) {
		//Initialize all the entries of the array of squareSum
		//main
		//normal code
		final int MAXSIZE = 100;
		//the final int called MAXSIZE is equal to 100
		long[] arr = new long[MAXSIZE];
		//the long array is equal to the new long which is called MAXSIZE

		System.out.println("sumAll output for 5 is " + sumAll(5));
		//the program prints out "sumAll output for 5 is " and then the calculation for sumAll(5)
		//the program follows by moving on to a new line
		System.out.println("sumAll output for 10 is " + sumAll(10));
		//the program prints out "sumAll output for 10 is " and then the calculation for sumAll(10)
		//the program follows by moving on to a new line
		System.out.println("sumAll output for 20 is " + sumAll(20));
		//the program prints out "sumAll output for 20 is " and then the calculation for sumAll(20)
		//the program follows by moving on to a new line
		System.out.println("sumAll output for 15 is " + sumAll(15));
		//the program prints out "sumAll output for 15 is " and then the calculation for sumAll(15)
		//the program follows by moving on to a new line
		System.out.println();
		//the program prints out a blank line
		//the program follows by moving on to a new line

		init(arr);
		//init stands for instance initialization method
		//initialization of the specific array
		System.out.println("sumAll output for 5 is " + sumAll(arr, 5));
		//the program prints out "sumAll output for 5 is " and then the calculation for sumAll(arr, 5)
		//the program follows by moving on to a new line
		System.out.println("sumAll output for 10 is " + sumAll(arr, 10));
		//the program prints out "sumAll output for 10 is " and then the calculation for sumAll(arr, 10)
		//the program follows by moving on to a new line
		System.out.println("sumAll output for 20 is " + sumAll(arr, 20));
		//the program prints out "sumAll output for 20 is " and then the calculation for sumAll(arr, 20)
		//the program follows by moving on to a new line
		System.out.println("sumAll output for 15 is " + sumAll(arr, 15));
		//the program prints out "sumAll output for 15 is " and then the calculation for sumAll(arr, 15)
		//the program follows by moving on to a new line
		System.out.println();
		//the program prints out a blank line
		//the program follows by moving on to a new line
		
		System.out.println("squareSum output for 5 is " + squareSum(5));
		//the program prints out "squareSum output for 5 is " and then the calculation for squareSum(5)
		//the program follows by moving on to a new line
		System.out.println("squareSum output for 10 is " + squareSum(10));
		//the program prints out "squareSum output for 10 is " and then the calculation for squareSum(10)
		//the program follows by moving on to a new line
		System.out.println("squareSum output for 20 is " + squareSum(20));
		//the program prints out "squareSum output for 20 is " and then the calculation for squareSum(20)
		//the program follows by moving on to a new line
		System.out.println("squareSum output for 15 is " + squareSum(15));
		//the program prints out "squareSum output for 15 is " and then the calculation for squareSum(15)
		//the program follows by moving on to a new line
		System.out.println();
		//the program prints out a blank line
		//the program follows by moving on to a new line
		
		init(arr);
		//init stands for instance initialization method
		//initialization of the specific array
		System.out.println("squareSum output for 5 is " + squareSum(arr, 5));
		//the program prints out "squareSum output for 5 is " and then the calculation for squareSum(arr, 5)
		//the program follows by moving on to a new line
		System.out.println("squareSum output for 10 is " + squareSum(arr, 10));
		//the program prints out "squareSum output for 10 is " and then the calculation for squareSum(arr, 10)
		//the program follows by moving on to a new line
		System.out.println("squareSum output for 20 is " + squareSum(arr, 20));
		//the program prints out "squareSum output for 20 is " and then the calculation for squareSum(arr, 20)
		//the program follows by moving on to a new line
		System.out.println("squareSum output for 15 is " + squareSum(arr, 15));
		//the program prints out "squareSum output for 15 is " and then the calculation for squareSum(arr, 15)
		//the program follows by moving on to a new line
		System.out.println();
		//the program prints out a blank line
		//the program follows by moving on to a new line

		System.out.println("Fibonacci Number 5 is " + fib(5));
		//the program prints out "Fibonacci Number 5 is " and then the calculation for fib(5)
		//the program follows by moving on to a new line
		System.out.println("Fibonacci Number 10 is " + fib(10));
		//the program prints out "Fibonacci Number 10 is " and then the calculation for fib(10)
		//the program follows by moving on to a new line
		System.out.println("Fibonacci Number 20 is " + fib(20));
		//the program prints out "Fibonacci Number 20 is " and then the calculation for fib(20)
		//the program follows by moving on to a new line
		System.out.println("Fibonacci Number 15 is " + fib(15));
		//the program prints out "Fibonacci Number 15 is " and then the calculation for fib(15)
		//the program follows by moving on to a new line
		System.out.println();
		//the program prints out a blank line
		//the program follows by moving on to a new line

		init(arr);
		//init stands for instance initialization method
		//initialization of the specific array
		System.out.println("Fibonacci Number 5 is " + fib(arr, 5));
		//the program prints out "Fibonacci Number 5 is " and then the calculation for fib(arr, 5)
		//the program follows by moving on to a new line
		System.out.println("Fibonacci Number 10 is " + fib(arr, 10));
		//the program prints out "Fibonacci Number 10 is " and then the calculation for fib(arr, 10)
		//the program follows by moving on to a new line
		System.out.println("Fibonacci Number 20 is " + fib(arr, 20));
		//the program prints out "Fibonacci Number 20 is " and then the calculation for fib(arr, 20)
		//the program follows by moving on to a new line
		System.out.println("Fibonacci Number 15 is " + fib(arr, 15));
		//the program prints out "Fibonacci Number 15 is " and then the calculation for fib(arr, 15)
		//the program follows by moving on to a new line
		System.out.println();
		//the program prints out a blank line
		//the program follows by moving on to a new line

		System.out.println("Factorial of 5 is " + factorial(5));
		//the program prints out "Factorial of 5 is " and then the calculation for factorial(5)
		//the program follows by moving on to a new line
		System.out.println("Factorial of 10 is " + factorial(10));
		//the program prints out "Factorial of 10 is " and then the calculation for factorial(10)
		//the program follows by moving on to a new line
		System.out.println("Factorial of 20 is " + factorial(20));
		//the program prints out "Factorial of 20 is " and then the calculation for factorial(20)
		//the program follows by moving on to a new line
		System.out.println("Factorial of 15 is " + factorial(15));
		//the program prints out "Factorial of 15 is " and then the calculation for factorial(15)
		//the program follows by moving on to a new line
		System.out.println();
		//the program prints out a blank line
		//the program follows by moving on to a new line

		init(arr);
		//init stands for instance initialization method
		//initialization of the specific array
		System.out.println("Factorial of 5 is " + factorial(arr, 5));
		//the program prints out "Factorial of 5 is " and then the calculation for factorial(arr, 5)
		//the program follows by moving on to a new line
		System.out.println("Factorial of 10 is " + factorial(arr, 10));
		//the program prints out "Factorial of 10 is " and then the calculation for factorial(arr, 10)
		//the program follows by moving on to a new line
		System.out.println("Factorial of 20 is " + factorial(arr, 20));
		//the program prints out "Factorial of 20 is " and then the calculation for factorial(arr, 20)
		//the program follows by moving on to a new line
		System.out.println("Factorial of 15 is " + factorial(arr, 15));
		//the program prints out "Factorial of 15 is " and then the calculation for factorial(arr, 15)
		//the program follows by moving on to a new line
	} 

}
//curly braces close out the program
//end of program