package oop;
//package for ModNCounter.java class is oop

/**
 * A counter class that cycles its internal value back to 0 when it
 * reaches a maximum value. 
 * 
 * e.g., A (new) ModNCounter with a cycleLength (maximum) of 5 will
 * have an internal value of 2 after increment() is called 7 times
 */
public class ModNCounter  extends Counter { 
//public class for ModNCounter.java extends the Counter.java class

    private int cycleLength; 
    //private integer cycleLength is initialized

    public ModNCounter (int n) { 
    	//public ModNCounter.java class int n is initialized
    	cycleLength = n; 
    	//cycleLength is equal to n variable initialized above
    }  
//bracket closes off this portion of the code
    
    @Override
	public void increment() { 
    	//public void increment initialized here
		if (value() < (cycleLength-1)) 
			//if loop
			//if value is less than cycleLength minus one
			super.increment();
			//then the value super is the reference variable that is used to refer parent class constructors
			//increment operator ++ increases the value of a variable by 1
		else
			//else loop
			reset();
		//resets variables maintaining the sum to zero
	}
} 
//end of code