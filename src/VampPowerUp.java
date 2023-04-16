
public class VampPowerUp {
	
	//This class is responsible for the VAMP(IRE) power up obtained in Level 2
	
	public static boolean vamp1 = false;
	
	public static void vamp (Villain v) throws InterruptedException{
		
		if (vamp1) {
			
			int hpBonus = (int)Math.abs(v.health)  ;
			mainCharacter.mcHP += hpBonus;
			Thread.sleep(1000);
			System.out.println(mainCharacter.name + " gained " + hpBonus + " HP! " + mainCharacter.name + "'s HP is now " + mainCharacter.mcHP + "!");
			System.out.println();
			Thread.sleep(1000);
		}
	}
	
	public static void unlockVamp1 () throws InterruptedException {
		System.out.println();
		LoadingDots.fiveDots(); LoadingDots.fiveDots();
		System.out.println();
		System.out.println(mainCharacter.name + " learned VAMP(IRE)!");
		vamp1 = true;
		System.out.println();
		Thread.sleep(1000);
		System.out.println(mainCharacter.name + " can now absorb the negative damaged dealt to the opponent after defeating them!");
		Thread.sleep(3000);
		System.out.println();
		
	}

}
