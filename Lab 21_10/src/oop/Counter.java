package oop;
//pacckage naame

public class Counter {
//public class for Counter.java
	private int myCount = 0;
	//private intger called myCount is initialized to 0
	public void increment() {
		//public void for increment
		myCount++;
		//myCount
		//post incremental value
	}
	//bracket closes off this section of the code
	public int value() {
		//public integer for value
		return myCount;
		//complete execution for name myCount
	}
	//bracket closes off portion of the code
	public void reset() {
		//public void for reset
		myCount = 0;
		//myCount is initialized to the value of 0
	}

}
//end of code