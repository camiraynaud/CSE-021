public class Student{
	//public class for this is student.java
	String name;
	//string name is initiialized
	char gender;
	//character gender is initialized
	Date birthDate;
	//date birthdate is initialized
	Preference pref;
	//preferenece pref is initialized
	boolean matched;
	//boolean matched is initialized
	
	//Constructor
	public Student(String name, char gender, Date birthDate, Preference pref) {
		this.name = name;
		//this.name is equal to name
		this.gender = gender;
		//this gender is equal to gender
		this.birthDate = birthDate;
		//this birthdate is equal to birthdate
		this.pref = pref;
		//this pref is equal to pref
	}
	//Acessor Methods
	public String getName() {
		//public string for get name
		return name;
		//the value of name is returned
	}
	
	public char getGender() {
		return gender;
		//the value of gender is returned
	}
	
	public Date getBirthDate() {
		return birthDate;
		//the value of birthdate is returned
	}
	
	public Preference getPref() {
		return pref;
		//the value of pref is returned
	}
	
	public boolean getMatched() {
		return matched;
		//the value of matched is returned
	}
	
	//Mutator method for matched
	public void setMatched(boolean matched) {
		//public void setmatched for the boolean matched variable
		this.matched = matched;
		//this.matched is equal to matched
	}
	//bracket closes off this portion of the code
	//Compare method
	public int compare(Student st) {
		//Abs value isnt needed if you just flip it
		//public int compare for student st
		int score = (60 - birthDate.compare(st.birthDate)) + (40 - pref.compare(st.pref));
		//int score is equal to this calculation

		if (score < 0) {
			//if loop
			//if score is less than 0
			return 0;
			//the program will return to 0
		} else if (score >= 100) {
			//else if loop
			//score is greater than or equal to 100
			return 100;
			//program will return to 100
		}
		if (gender != st.gender) {
			//if loop
			//if gender isnt equal to st.gender
			//then the following will print
			return 0;
			//program returns to 0
		}
		return score;
		//score is printed out from base value
	}
	}
//end of program