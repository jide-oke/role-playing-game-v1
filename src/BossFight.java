
public class BossFight {
	
	// Class for the final Boss Fight. This class's main method runs at the end of mainGameLevel2.java
	
	
	public static void main(String[] args) throws InterruptedException{
		System.out.println();
		Thread.sleep(1000);
		System.out.print(mainCharacter.name + " see's a woman with no eyes");LoadingDots.threeDots();
		Thread.sleep(1000);
		System.out.println();
		mainCharacterAttackMenu.menu(Villain.NoEyes);
		LoadingDots.fiveDots();
		System.out.println();
		System.out.println("\"When twilight drops her curtain down");
		Thread.sleep(1000);
		System.out.println("And pins it with a star");
		Thread.sleep(1000);
		System.out.println("Remember that you have a friend");
		Thread.sleep(1000);
		System.out.println("Though she may wander far\"");
		Thread.sleep(800);
		System.out.println("-L.M. Montgomery");
		System.out.println();
		System.out.println("GAME OVER");
	}

}
