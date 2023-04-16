import java.time.LocalTime;

public class Greeting {
	
	//This class handles the initial "Good Morning" or "Good Afternoon" Text when the game starts up
	
	public static LocalTime currentTime = LocalTime.now();
	public static LocalTime NOON = LocalTime.NOON;
	
	
	public static void greeting () {
		if (currentTime.isAfter(NOON)) {
			System.out.println("Good Afternoon! What is your name?");}
			else {
				System.out.println("Good Morning! What is your name?");
			}
		}
	
	public static void main(String[] args) {
	}
		
	

}
