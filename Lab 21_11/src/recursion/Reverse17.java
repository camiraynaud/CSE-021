package recursion;
//package recursion
public class Reverse17 extends Reverse16 {
//public class for reverse17.java
	//extention of reverse16.java
	// Assume there is a correct reverse16 method (inherited from Reverse16)

	
	// Fill-in reverse17 using the result of a call to reverse16
	public String reverse17(String s) {
		//public string for reverse17.java
		//includes string s
		String partial = reverse16(s.substring(1,17));
		//string partial equal to this 
		String firstLetter = s.substring(0,1);
		//string firstketter equal to s.substring(0,1)
		return (partial + firstLetter);
		//the calcualtion of partial + firstletter value is returned
	}
	
	
	//////// HELPER METHODS YOU MIGHT FIND USEFUL
	

	public static String allButFirst(String s) {
		//public static string for allbutfirst
		return s.substring(1);
		//s.substring(1) value is returned
	}
	

	public static String allButLast(String s) {
		//public static string allbutlast 
		//includes string s
		return s.substring(0, s.length());
		//s.substring(0, s.length() value is returned
	}
	

	public static void main(String[] args) {
		//public static void main 
		//includes string args
		Reverse17 obj = new Reverse17();
		//reverse17 objective equal to new reverse17
		System.out.println(obj.reverse17("disinterestedness"));
		//the program outprints this reversed
		System.out.println(obj.reverse17("uniformitarianism "));
		//the program outprints this reversed
		System.out.println(obj.reverse17("pseudohydrophobia"));
		//the program outprints this reversed 
	}
	
}
//end of program