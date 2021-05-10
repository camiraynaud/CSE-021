package oop;
//package class for Runner.java class is oop
public class Runner {
	//public class for Runner.java class 
	public static void main(String[] args) {
		//Initialize all the entries of the string of args
		testCounter();

		testCounter7Statements();

		testModNCounter2();

		testDecrementableCounter();

	    testSeasonCounter();
	    //all the tests for the classes in the oop package
	}
//bracket closes off this portion of the code
	public static void testCounter() {
		//public static void for testCounter
		System.out.println("-- Testing Counter");

		Counter c = new Counter();
		//counter c is a new counter
		c.increment();
		//counter c is incremented
		System.out.println("Current value: " + c.value());
//the system prints out the "Current value: " plus whatever the counter c value is
	}
	
	public static void testCounter7Statements() {
		//public static void for testCounter7Statements(
		Counter c = new Counter();
		//counter c is a new counter
		System.out.println("-- Testing 7 statements");
		// include exactly 7 increment() and reset() statements below
		//the program prints this statement "-- Testing 7 statements"
		System.out.println("Current value: " + c.value());
		//the system prints out the "Current value: " plus whatever the counter c value is
	}
	
	public static void testModNCounter2() {
		ModNCounter2 d = new ModNCounter2(5);
		System.out.print("Current ModN2 value: ");
		for (int i = 0; i <= 4; i++) {
			System.out.print(d.value() + " ");
			d.increment();
			//modncounter d is incremented
		}
		System.out.print(d.value() + " ");
		//the program outprints the d modncounter value and a blank space after
		d.increment();
		//modncounter d is incremented
		System.out.print(d.value() + " ");
		//the system prints out the d modncounter value and a blank space after
		System.out.println();
		//the program prints out a completly blank line
	}

	public static void testDecrementableCounter() {
		DecrementableCounter e = new DecrementableCounter();
		for (int i = 0; i < 4; i++) {
			//for loop
			//int i equal to 0
			//i less than 4
			//post increment add on two
			e.increment();
			//decrementable counter e is incremented
		}
		e.decrement();
		System.out.println("Current Decrement value: " + e.value());
		//the program prints out this statement "Current Decrement value: " plus the e decrementable counter
	}

	public static void testSeasonCounter() {
		//public static void for testSeasonCounter
		SeasonCounter f = new SeasonCounter();
		//f is a new SeasonCounter variable
		for (int i = 0; i < 6; i++) {
			System.out.print(f.toString() + " ");
			//the program prints out seasoncounter to a string and a blank space after
			f.increment();
			//varaible seasoncounter f is incremented
		}
	}

}
//end of code