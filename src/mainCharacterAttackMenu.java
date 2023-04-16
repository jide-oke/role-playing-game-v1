import java.util.Scanner;
public class mainCharacterAttackMenu {
	// This class contains the main battle menu used to fight each villain
	
	public static void menu(Villain v) throws InterruptedException{
		
		//If the main character's health <= 0, Game Over
		if (mainCharacter.mcHP <= 0){
			Thread.sleep(2000);
			System.out.print(mainCharacter.name + " has no more energy left");LoadingDots.threeDots();
			System.out.println();
			Thread.sleep(3000);
			System.out.println(mainCharacter.name + " called it a day");
			System.out.println();
			continueOrStop();
		} else {
			
		//The Attack or Defend Menu
		mainCharacter.defend = false;
		System.out.println("What will you do?");
		System.out.println();
		System.out.println("============ Attack Menu =============\r\n"
				+ "1: Press '1' to ATTACK\r\n"
				+ "2. Press '2' to DEFEND\r\n"
				+ "======================================");
		Scanner askForInput = new Scanner(System.in);
		int menuInput = askForInput.nextInt();
		switch (menuInput) {
		//main character attacks.
		case 1: System.out.println();
				System.out.println(mainCharacter.name + " ATTACKED!");
				mainCharacter.mainCharacterAttacks(v, mainCharacter.critRate);
				Thread.sleep(200);
				System.out.println();
				System.out.println(v.name + "'s HP is now " + v.health +"!");
				Thread.sleep(1000);
				if (v.health <= 0) {
					System.out.println();
					System.out.println(mainCharacter.name + " defeated the " + v.name + "!!");
					Thread.sleep(3000);
					System.out.println();
					VampPowerUp.vamp(v);
					v.reloadVillainHealth(v);
					break;
				}
				System.out.println();
				v.villainAttacks(v);
				break;
		//main character defends. Hardly used.
		case 2: System.out.println();
				mainCharacter.mainCharacterDefends();
				System.out.println(mainCharacter.name + " DEFENDED");
				Thread.sleep(300);
				System.out.println();
				v.villainAttacks(v);
		 		break;
 		default:System.out.println("Invalid Response!");
 				System.out.println();
 		 		menu(v);
		}
	}
}
	
	//Do you want to continue? (After the main character is defeated)
	public static void continueOrStop() throws InterruptedException {
		System.out.println("Do you still want to continue?");
		Scanner input = new Scanner(System.in);
		String answer = input.nextLine().toLowerCase();
		
		switch (answer){
		
		case "yes": System.out.println(); 
					mainGame.main(null);
					break;
					
		case "no": System.out.println();
					Thread.sleep(500);
					System.out.println("Game Over :(");
					System.exit(0);
					break;
					
		default: System.out.println("Invalid Response!");
		System.out.println();
		}
		
	}

}
