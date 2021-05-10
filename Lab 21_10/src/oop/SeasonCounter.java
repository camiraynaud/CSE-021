package oop;
//package for SeasonCounter.java
public class SeasonCounter extends ModNCounter {
	//public class for SeasonCounter.java class
	
	private static String[] names =  {"spring", "summer", "fall", "winter"};
	//private static string class for SeasonCounter.java class
	//string names are spring, summer, fall, and winter
	
	public SeasonCounter() {
		//public class for SeasonCounter
        // fill-in by creating an object with 4 as the modulus
		super(4);
    }
	//bracket closes off section of code

	@Override
	public String toString() {
        // fill-in so it returns the season name
		return names[value()];
		//string returns to the season name and value
	}
  	
}
//end of program