import java.util.Random;

public class RandomVillainEncounter extends Villain{
	
	//This class is responsible for generating a random villain for each encounter. The villains are initialized in the Villain class.
	
	RandomVillainEncounter(String name, int health, int attack, int dhealth, int vCR) {
		super(name, health, attack, dhealth, vCR);
		
	}

	public static Villain EasyVillainsEncounter () {
		Random generator = new Random();
		int randomIndex = generator.nextInt(easyVillains.length);
		
		return easyVillains[randomIndex]; 		
	}
	
	public static Villain HarderVillainsEncounter () {
		Random generator = new Random();
		int randomIndex = generator.nextInt(harderVillains.length);
		
		return harderVillains[randomIndex]; 		
	}
	
	
	
public static void main(String[] args) {
	System.out.println(EasyVillainsEncounter().name);
	System.out.println(EasyVillainsEncounter().name);
	System.out.println(EasyVillainsEncounter().name);
	System.out.println(EasyVillainsEncounter().name);
	System.out.println(EasyVillainsEncounter().name);
	System.out.println(EasyVillainsEncounter().name);
}
}


