package oop;
//package name for this class is oop
public class DecrementableCounter extends Counter {
//public class for DecrementableCounter.java extends Counter.java code
	public int decrement() {
		//public integer decrement initialized
		int m = value();
		//integer m is equal to value which is specified in counter.java
		reset();
		//resets variable sum to 0
		for (int i = 0; i < m-1; i++) {
			//for loop
			//integer i is equal to 0 and i is less than m-1 
			//has a post increment value
			increment(); 
			//increment operator ++ increases the value of a variable by 1
		}

		return value();
		//complete execution for int value
	}
}
//end of code