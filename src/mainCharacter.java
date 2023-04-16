import java.util.Random;

public class mainCharacter {
	//This class handles all of the statistic information regarding the main character
	
	public static String name;
	public static int mcHP;
	public static int attackRate;
	public static boolean defend = false;
	public static int critRate;
	
	//The MC is initialized with these statistics
	public mainCharacter(String nameInput, int HP, int initialAttackRate, int cR ){
		name = nameInput;
		mcHP = HP;
		attackRate = initialAttackRate;
		critRate = cR;
	}
	
	//This method runs in the beginning of mainGame.java. It sets the MC's default statistics
	public static void setMCNameAndStats(String nameInput, int HP, int attack, int cR) {
		name = nameInput;
		mcHP = HP;
		attackRate = attack;
		critRate = cR;
	}
	
	//This method runs whenever the MC is attacked
	public static void mainCharacterAttacked (int damage) {
		mcHP = mcHP - damage;
		
	}
	
	//This method runs whenever the MC defends
	public static void mainCharacterDefends () {
		defend = true;
	}
	
	//This method runs whenever the MC attacks
	public static void mainCharacterAttacks (Villain v, int cR) throws InterruptedException{
		Random random = new Random();
		
		int randomNumber = random.nextInt(cR);
		
		if (randomNumber == (cR - 1)) {
			System.out.println();
			Thread.sleep(500);
			System.out.println(mainCharacter.name + " got a Critical Hit!!");
			Thread.sleep(300);
			v.health -= Math.round(mainCharacter.attackRate + (mainCharacter.attackRate * .25));
		} else {
			v.health -= mainCharacter.attackRate;
		}	
	}
	}
	
	