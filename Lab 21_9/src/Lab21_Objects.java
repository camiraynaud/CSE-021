//program code begins here
public class Lab21_Objects {
//public class for Lab21_Objects.java
	
	public static void main(String[] args) {
		//public class for the main program
		// DO NOT CREATE NEW VARIABLES
		
		Dummy[] dlist = new Dummy[11];
		//dummy dlist = new dummy method with 11 different sisplay calls
		int[] iarr = new int[11];
		//int iarr is equal to the new integer of 11 display calls
		double[] darr = new double[11];
		//double darr is equal to new double with 11 display calls

		// DO NOT USE ANY CONSTANTS OR NEW VARIABLES
		
		// Calls to Constructors 1 and 2  
		dlist[0] = new Dummy();
		//initial representation of the new dummy method
		dlist[1] = new Dummy(iarr[0]);
		//dlist object 1 with variable iarr[0]
		dlist[2] = new Dummy(darr[0]);
		//dlist object 2 with variable darr[0]
		dlist[3] = new Dummy(iarr);
		//dlist object 3 with variable iarr
		dlist[4] = new Dummy(darr);
		//dlist object 4 with variable darr
		dlist[5] = new Dummy(dlist[0]);
		//dlist object 5 with variable dlist[0]
		dlist[6] = new Dummy(dlist);
		//dlist object 6 with variable dlist
		dlist[7] = new Dummy(iarr[1], darr[1]);
		//dlist object 7 with variable iarr[1] and dar[1]
		dlist[8] = new Dummy(iarr, darr);
		//dlist object 8 with variable iarr and darr
		dlist[9] = new Dummy(iarr[2], darr[2], dlist[1]);
		//dlist object 9 with variable iarr[2], darr[2], and dlist[1]
		dlist[10] = new Dummy(iarr, darr, dlist);
		//dlist object 10 with variable iarr, darr, and dlist
		
		// Fill-in calls to Constructors 3-11 and assign them to dlist array indices 2-10
		
		// Calls to diplay methods 1 and 2
		dlist[0].display();
		//display call number 1 for dlist
		dlist[1].display(iarr[0]);
		//display call number 2 for dlist with variable iarr[0]
		dlist[2].display(darr[0]);
		//display call number 3 for dlist with variable darr[0]
		dlist[3].display(iarr);
		//display call number 4 for dlist with variable iarr
		dlist[4].display(darr);
		//display call number 5 for dlist with variable darr
		dlist[5].display(dlist[0]);
		//display call number 6 for dlist with variable dlist[0]
		dlist[6].display(dlist);
		//display call number 7 for dlist with variable dlist
		dlist[7].display(iarr[1], darr[1]);
		//display call number 8 for dlist with variable iarr[1] and darr[1]
		dlist[8].display(iarr, darr);
		//display call number 9 for dlist with variable iarr and darr
		dlist[9].display(iarr[2], darr[2], dlist[1]);
		//display call number 10 for dlist with variable iarr[2], darr[2], and dlist[1]
		dlist[10].display(iarr, darr, dlist);
		//display call number 11 for dlist with variable iarr, darr, and dlist
		// Fill-in calls to display methods 3-11 for the dlist objects at indices 2-10
	}
}
//end of program code here