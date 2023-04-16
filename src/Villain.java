import java.util.Random;


public class Villain {
	
	//This class contains all the villains in the game, along with their statistics.
	
	public String name;
	public int health;
	public int defaultAttackDamage;
	public int defaultHealth;
	public int vCR;
	
	//Initialize the villain with these statistics
	Villain(String name, int health, int attack, int defaultHP, int vCR){
		this.name = name;
		this.health = health;
		this.defaultAttackDamage = attack;
		this.defaultHealth = defaultHP;
		this.vCR = vCR;
	}
	
	//Level 1 Villains
	public static Villain Caterpillar = new Villain("Caterpillar", 100, 7, 100, 2);  
	public static Villain BusinessMan = new Villain("Business Man", 100, 10, 100, 1); 
	public static Villain ChocolateChipCookies = new Villain("Chocolate Chip Cookie", 100, 5, 100, 2);
	//Level 2 Villains
	public static Villain BusinessWoman = new Villain("Business Woman", 100, 15, 100, 1);
	public static Villain Bee = new Villain("Bee", 100, 12, 100, 3);
	public static Villain Oreos = new Villain("Oreo", 100, 11, 100, 1);
	//Boss
	public static Villain NoEyes = new Villain("Woman with no Eyes", 150, 20, 100, 7);
	
	//Arrays containing Villains. This is used for the random villain encounter
	static Villain[] easyVillains = {Caterpillar, BusinessMan, ChocolateChipCookies};
	static Villain[] harderVillains = {BusinessWoman, Bee, Oreos};
	
	//This method runs whenever the villain is attacked	
	public void villainAttacked(int damage) {
	    this.health -= damage;
	}
	
	//This method runs whenever the villain attacks
	public void villainAttacks (Villain villain) throws InterruptedException {
		Thread.sleep(600);	
		System.out.println(villain.name + " Attacked!");
		//Initializes a random number to simulate a critical hit
		Random random = new Random();
		int randomNumber = random.nextInt(villain.vCR);
		
		if (randomNumber == villain.vCR - 1) {
			if (mainCharacter.defend == true) {
				Thread.sleep(600);
				System.out.println();
				System.out.println(mainCharacter.name + " defended against the attack!");
				Thread.sleep(600);
				System.out.println();
				mainCharacterAttackMenu.menu(villain);
			} else {
				mainCharacter.mainCharacterAttacked((int)Math.round(villain.defaultAttackDamage + (villain.defaultAttackDamage * .25)));
				Thread.sleep(600);
				System.out.println();
				System.out.println(villain.name + " got a critical hit!!");
				Thread.sleep(600);
				System.out.println();
				System.out.println(mainCharacter.name + "'s HP is now " + mainCharacter.mcHP + "!");
				Thread.sleep(1500);
				System.out.println();
				mainCharacterAttackMenu.menu(villain);
			}
		} else {				
		if (mainCharacter.defend == true) { 
			Thread.sleep(600);
			System.out.println();
			System.out.println(mainCharacter.name + " defended against the attack!");
			Thread.sleep(600);
			System.out.println();
			mainCharacterAttackMenu.menu(villain);
		} else {
		mainCharacter.mainCharacterAttacked(villain.defaultAttackDamage);
		Thread.sleep(600);
		System.out.println();
		System.out.println(mainCharacter.name + "'s HP is now " + mainCharacter.mcHP + "!");
		Thread.sleep(1500);
		System.out.println();
		mainCharacterAttackMenu.menu(villain);
		}
	}
	}

	//This method reloads the villains health after the Main Character wins and exits the battle
	public void reloadVillainHealth (Villain villain) {
		this.health = this.defaultHealth;
	}
	
	
	
	

}
