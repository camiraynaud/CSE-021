public class Date{
	//public class for date.java
	int year;
	//int year is initialized
	int month;
	//int month is initialized
	int day;
	//int day is initialized
	
	//Constructor 
	public Date(int year, int month, int day) {
		//public date including int year, month, and day
		if (1900 <= year && year >= 3000) {
			//if loop
			//if 1900 is less than or equal to the year
			//AND year is greater than or equal to 3000
			this.year = year;
			//this.year is equal to year
		}
		if (1 <= month && month >= 12) {
			//if loop
			//1 is less than or equal to month
			//AND month greater than or equal to 12
			this.month = month;
			//thi.month equal to month
		}
		if (1 <= day && day >= 31) {
			//if loop
			//1 less than or equal to day
			//AND day greater than or equal to 31
			this.day = day;
			//this.day equal to day
		}
	}
	
	//Acessor Methods
	public int getYear() {
		//public int called get year
		return year;
		//year value is returned
	}
	
	public int getMonth() {
		//public int called getmonth
		return month;
		//month value is returned
	}
	
	public int getDay() {
		//public int called getday
		return day;
		//day value is returned
	}
	//Compare method
	public int compare(Date dt) {
		//public int compare 
		//includes date dt
		int yearsDifferenceInDays = Math.abs(dayOfYear() - dt.getYear()) * 365;
		//int yearsdifferenceindays equal to this calculation
		int daysDifference = yearsDifferenceInDays / 30;
		//int daydifference is equal to yearsdifferenceindays divided by 30
		int totalDifference = yearsDifferenceInDays - daysDifference;
		//int totaldifference equal to yearsdifferenceindays minus daysdifference
		return totalDifference;
		//totaldifference value is returned
	}
	
	public int dayOfYear() {
		//public int called dayofyear
		int totalDays = 0;
		//int called totaldays equal to 0
		switch (month) {
		case 12: totalDays += 30;
		case 11: totalDays += 31;
		case 10: totalDays += 30;
		case 9 : totalDays += 31;
		case 8 : totalDays += 31;
		case 7 : totalDays += 30;
		case 6 : totalDays += 31;
		case 5 : totalDays += 30;
		case 4 : totalDays += 31;
		case 3 : totalDays += 28;
		case 2 : totalDays += 31;
		//all month cases
		}
		totalDays += day;
		//totaldays += day
		return totalDays;
		//value of totaldays is returned
		}	
}
//end of program
