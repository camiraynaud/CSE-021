package oop;
//package for ModNCounter2.java class is oop
public class ModNCounter2 extends Counter{
	//public class ModNCounter2.java extends the Counter.java class

	private int cycleLength;
	//private integer cycleLength

	public ModNCounter2(int n) {
		//public ModNCounter2.java initializes integer n
		cycleLength = n;
		//the integer cycleLength is equal to the integer n
	}
//bracket closes off portion of the code
	@Override
	public int value() {
//public integer called value initialized
		if (super.value() != cycleLength)
			//if loop
			//if super.value is not equal to cycleLength
			return super.value();
		//then super.value will be transfered back to the caller of the method
		else
			//else loop
			//if the if loop isnt true then this will run
			return 0;
		//transfer back to the caller of a method of zero
	}
}
//end of code