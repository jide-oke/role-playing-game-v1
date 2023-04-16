import java.util.Scanner;
public class mainGameLevel2 {
	//This is Level 2 of the Game. It is a bridge between mainGame.java and BossFight.java
	
	public static void main(String[] args) throws InterruptedException {
		
		VampPowerUp.unlockVamp1();
		Villain villain3 = RandomVillainEncounter.EasyVillainsEncounter();
		System.out.println("You ran into a wild " +  villain3.name + "! (HP: " + villain3.health + ")");
		Thread.sleep(1000);
		System.out.println();	
		mainCharacterAttackMenu.menu(villain3);
		Thread.sleep(1000);
		System.out.print("You hear a voice");LoadingDots.threeDots();
		Thread.sleep(1000);
		System.out.println();
		Thread.sleep(1000);
		System.out.println("\"You don't know how much she's done for you....you can't even fathom\"");
		Thread.sleep(5000);
		System.out.println();
		Villain villain4 = RandomVillainEncounter.HarderVillainsEncounter();
		System.out.println("You ran into a wild " +  villain4.name + "! (HP: " + villain4.health + ")");
		Thread.sleep(1000);
		System.out.println();	
		mainCharacterAttackMenu.menu(villain4);
		System.out.print("You continue to progress in your journey");LoadingDots.sevenDots();
		System.out.println();
		Villain villain5 = RandomVillainEncounter.HarderVillainsEncounter();
		System.out.println("You ran into a wild " +  villain5.name + "! (HP: " + villain5.health + ")");
		Thread.sleep(1000);
		System.out.println();	
		mainCharacterAttackMenu.menu(villain5);
		LoadingDots.fiveDots();
		System.out.println();
		System.out.println(mainCharacter.name + " found a Chobani Flip Yogurt!");
		Thread.sleep(1000);
		mainCharacter.mcHP = 100;
		System.out.println();
		System.out.println(mainCharacter.name + "'s HP is now " + mainCharacter.mcHP + "!");
		Thread.sleep(1000);
		System.out.println();
		Question();
	}
	
	//This question is the bridge between Level 2 and the Boss Fight
		public static void Question () throws InterruptedException{
			System.out.println("You arrive at a door. Are you going to open it? (yes or no)");
			Scanner userInput = new Scanner(System.in);
			String answer = userInput.nextLine();
			
			switch (answer) {
			
			case "yes":
			case "y": {
				BossFight.main(null);
				break;
			}
			
			default: Thread.sleep(4000);
			System.out.println();
			mainGameLevel2.Question();
			break;
			}
		}
}
