import java.util.Scanner;
import java.util.NoSuchElementException;
import java.io.FileNotFoundException;
import java.io.FileReader;
//import file readers and scanners, etc.

public class Match {
	//public class for match.java

	static int i = 0;
	//static int i is equal to 0

	public static void main(String[] args) {
		//public static void main string args

		Student[] students = new Student[100];
		//students is equal to new student 100
		Scanner kbd = new Scanner(System.in);
		//scanner initialized here
		System.out.println("Enter file address: ");
		//program outprints "Enter file address: "
		String fileName = kbd.next();
		//string filename scanner
		kbd.close();
		//close

		try {
			Scanner input = new Scanner(new FileReader(fileName));
			//scanner initialized

			while (input.hasNextLine()) {
				Scanner line = new Scanner(input.nextLine());
				line.useDelimiter("[\t\r]");
				String name = line.next();
				String gender = line.next();
				String birthDate = line.next();
				//strings initalized here
				Scanner birthDateReader = new Scanner(birthDate);
				//scanner for birthdatereader
				birthDateReader.useDelimiter("-");//Used for whitespace
				int month = birthDateReader.nextInt();
				int day = birthDateReader.nextInt();
				int year = birthDateReader.nextInt();
				int quietTimePreference = line.nextInt();
				int musicPreference = line.nextInt();
				int readingPreference = line.nextInt();
				int chattingPreference = line.nextInt();
//int intialized for the program
				Date birth = new Date(year, month, day);
				//date birth equal to new date includes year month day
				Preference pref = new Preference(quietTimePreference, musicPreference, readingPreference,
						chattingPreference);
				Student studentAdd = new Student(name, gender.charAt(0), birth, pref);
				students[i++] = studentAdd;

				birthDateReader.close();
				line.close();
				//closed
			}
			int max = i;
			//integer max equal to i

			for (int i = 0; i < max; i++) {
				//for loop
				//int i equal to 0
				//i less than max
				//i++ post incremental value
				if (!students[i].getMatched()) {
					//if loop
					int bestScore = 0, bestMatch = 0;
					//int best score equal to 0 and best match equal to 0
				for (int j = i + 1; j < max; j++) {
					//for loop
					//int j equal to i + 1
					//j less than max
					//j++ post incrmeental value
						if (!students[j].getMatched()) {
							//if loop
							int score = students[i].compare(students[j]);
							//int score equal to student calculation
							if (score > bestScore) {
								//if loop score greater than bestscore
								bestScore = score;
								//bestscore equal to score
								bestMatch = j;
								//bestmatch equal to j
							}
						}
					}
				//brackets close off section of the code
					if (bestScore != 0) {
						//if loop
						//bestscore not equal to 0
						students[i].setMatched(true);
						students[bestMatch].setMatched(true);
						System.out.println(students[i].getName() + " matches with " + students[bestMatch].getName()
								+ " with the score " + bestScore);
						//program outprints this statement along with calcualtions 
					} 
					else if (!students[i].getMatched()) {
						//else if loop
						System.out.println(students[i].getName() + " has no matches.");
						//program outprints this calculation plus " has no matches."
				}
				}
			}
//brackets close off this section of the code
			input.close();

		} 
		catch (FileNotFoundException e) { 
			System.out.println(e);//Error Handling
			//program output
		} 
		catch (NoSuchElementException e) { 
			System.out.println(e);//Error Handling
			//program output
		}
	}
}
//end of program