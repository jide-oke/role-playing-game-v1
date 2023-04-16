import java.util.Scanner;
public class mainGame {
	//This is the driver class. The Main Game.
	
	public static void main(String[] args) throws InterruptedException{	
		Greeting.greeting();
		Scanner userInput = new Scanner(System.in);
		String characterName = userInput.nextLine();
		
		mainCharacter.setMCNameAndStats(characterName, 100, 40, 5);
		Thread.sleep(500);
		System.out.println();
		System.out.println("Thank you " + mainCharacter.name + "!");
		Thread.sleep(800);
		System.out.println();
		System.out.print("Your Journey Begins now");
		Thread.sleep(300); System.out.print(".");Thread.sleep(300); System.out.print(".");Thread.sleep(300); System.out.print(".");Thread.sleep(300);
		System.out.println();
		System.out.println();
		Villain villain1 = RandomVillainEncounter.EasyVillainsEncounter();
		System.out.println("You ran into a wild " +  villain1.name + "! (HP: " + villain1.health + ")");
		Thread.sleep(1000);
		System.out.println();	
		mainCharacterAttackMenu.menu(villain1);		
		System.out.print("Your Journey Continues");
		Thread.sleep(300); System.out.print(".");Thread.sleep(300); System.out.print(".");Thread.sleep(300); System.out.print(".");Thread.sleep(300); System.out.print(".");Thread.sleep(300); System.out.print(".");Thread.sleep(300);
		System.out.println();
		System.out.println();
		Villain villain2 = RandomVillainEncounter.EasyVillainsEncounter();
		System.out.println("You ran into a wild " +  villain2.name + "! (HP: " + villain2.health + ")");
		Thread.sleep(1000);
		System.out.println();
		mainCharacterAttackMenu.menu(villain2);
		System.out.print("You are progressing in your journey");LoadingDots.fiveDots();
		System.out.println();
		System.out.println("You come to a cross road.");
		Thread.sleep(700);
		System.out.println();
		System.out.print("You can either go Left or go Right.");LoadingDots.sevenDots();
		System.out.println();
		Thread.sleep(500);
		System.out.println("Which do you choose?");
		System.out.println();
		leftOrRight();
	}
	
	//This method is a bridge between Level 1 and Level 2. It runs at the end of this class' main method (Level 1).
	public static void leftOrRight () throws InterruptedException {
		Scanner userInput = new Scanner(System.in);
		String leftOrRight = userInput.nextLine().toLowerCase();	
		
		switch (leftOrRight){
		case "left": System.out.println(); 
					 System.out.println(mainCharacter.name + " goes LEFT!");
					 mainGameLevel2.main(null);
					 break;		
		case "right": System.out.println();
					  System.out.println(mainCharacter.name + " goes RIGHT!");
					  mainGameLevel2.main(null);
					  break;		
		default: System.out.println("Invalid choice");
		System.out.println();
		leftOrRight();
		}
	}
	
	//This method was used to troubleshoot the MC defense boolean. It is not ran in the game, but can be used as a tool to determine when the MC.defend is turned on.
		public static void mcdefense () {
			System.out.println("MC defence is currently: " + mainCharacter.defend);
		}
}

