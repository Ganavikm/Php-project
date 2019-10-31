package assgnmnt;

public class Baseclass {
	
	//post
	public static String Post() {
		String Res ="/update.json";
		return Res;
	}
	//Twitter1

	public static String Tweet() {
		String Res ="home_timeline.json";
		return Res;
	}
	//username
	public static String user() {
		String Res ="/tweets.json";
		return Res;
}
	//tuser
	public static String tuser() {
		String Res="/user_timeline.json";
		return Res;
	}
}

