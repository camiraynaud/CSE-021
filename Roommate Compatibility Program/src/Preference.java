public class Preference {
//public class for preference.java
	int quietTime;
	//integer called quiettime initialized
	int music;
	//integer called music initialized
	int reading;
	//integer called reading initialized
	int chatting;
	//integer called chatting initialized

	public Preference(int quietTime, int music, int reading, int chatting) {
		//public preference 
		//including int quiettime, music, reading, chatting
		if (0 <= quietTime && quietTime <= 10) {
			//if loop
			//0 less than or equal to quiettime
			//AND quiettime less than or equal to 10
			this.quietTime = quietTime;
			//this.quiettime equal to quiettime
		}
		if (0 <= music && music <= 10) {
			//if loop
			//0 less than or equal to music
			//AND music less than or equal to 10
			this.music = music;
			//this.music equal to music
		}
		if (0 <= reading && reading <= 10) {
			//if loop
			//0 less than or equal to reading
			//AND reading less than or equal to 10
			this.reading = reading;
			//this.reading equal to reading
		}
		if (0 <= chatting && chatting <= 10) {
			//if loop
			//0 less than or equal to chatting
			//AND chatting less than or equal to 10
			this.chatting = chatting;
			//this.chatting equal to chatting
		}
	}
	//bracket closes off this section of the code

	public int getQuietTime() {
		//public int called getquiettime
		return quietTime;
		//quiettime value is returned
	}

	public int getMusic() {
		//public int called getMusic
		return music;
		//music value is returned
	}

	public int getReading() {
		//public int called getReading
		return reading;
		//reading value is returned
	}

	public int getChatting() {
		//public int called getChatting
		return chatting;
		//chatting value is returned
	}

	public int compare(Preference pref) {
		//public int called compare
		//includes preference called pref
		return (Math.abs(quietTime - pref.quietTime) + Math.abs(chatting - pref.chatting)
				+ Math.abs(reading - pref.reading) + Math.abs(music - pref.music));
		//program returns this calulation value
	}
}
//end of program