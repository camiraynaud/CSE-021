//no use for a scanner here
public class FindDuplicateCount {

	public static void main(String[] args) {
		
		int[] arr = {4, 2, 7, 3, 4, 2, 1, 3, 0, 5, 3, 2, 5, 0};
		//int arr holds the integer of the array type 
		//here are the declared variables that are apart of the array

		int i = 0, j = 1;
		//here I declared two integer variables i and j and assigned them an integer of either 0 or 1
		
		for(i = 0; i<arr.length; i++){
		//for loop
		//i++ is the post increment operator
		//increments each value by 1 after original value is substituted in the equation
		//for example 1 <= 5 1 is not greater than or equal to 5 so therefore the program would print "No numbers were found"
		//since i is less than the arr.length it'll loop 0-one under the total of the array length
		int c = 0;
		//here I declared an integer variable c and assigned c an integer of 0

		for(j = i+1; j<arr.length; j++){
		//increment statement for variable j
		//i++ is the post increment operator
		//increments each value by 1 after original value is substituted in the equation
		//for example 1 <= 5 1 is not greater than or equal to 5 so therefore the program would print "No numbers were found"
		//since j is less than the arr.length it'll loop 0-one under the total of the array length
			
		if(arr[i]==arr[j])
		//if loop
		//if the array variable i is equal to the array variable j then the statement will 
		//increment the number after the expression is evaluated

		c++;
		//increment statement for variable c
		//++ after the variable increments the number after the expression is evaluated

			}

			if(c==0)
			//if c is equal to 0 then it'll print the statement below

			System.out.println("There are no duplicates with value "+arr[i]+" beyond index "+i);
			//if c is equal to 0 then that statement will print with a line following it

			else if(c==1)
			//if c is equal to 1 then it'll print the statement below

			System.out.println("There is only " + c + " more occurance of value " + arr[i] + " starting at index " + i);
			//or if c is equal to 1 then this statement will print with a line following it
			//there is only (value of c based on array integer in this case its 1) more occurrence of the value
			//(next array element following previous) starting at index (following the last used element in the array)
			else
			//if neither of those are true then this statement below will print

			System.out.println("There are " + c + " more occurance of value " + arr[i] + " starting at index " + i);
			// if neither of those are true then this statement will print with a line following the statement

		}
	}
}