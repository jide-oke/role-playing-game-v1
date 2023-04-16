
public class LoadingDots {
	
	//This class handles the LoadingDots method in the Main Game. It just loads 3, 5, or 7 dots and uses Thread.sleep
	
	public static void threeDots () throws InterruptedException{
		Thread.sleep(300); System.out.print(".");Thread.sleep(300); System.out.print(".");Thread.sleep(300);System.out.print(".");Thread.sleep(300);
		System.out.println();
	}
	
	public static void fiveDots () throws InterruptedException{
		Thread.sleep(300); System.out.print(".");Thread.sleep(300); System.out.print(".");Thread.sleep(300);System.out.print(".");Thread.sleep(300);
		System.out.print(".");Thread.sleep(300);System.out.print(".");Thread.sleep(300);
		System.out.println();
	}
	
	public static void sevenDots () throws InterruptedException{
		Thread.sleep(300); System.out.print(".");Thread.sleep(300); System.out.print(".");Thread.sleep(300);System.out.print(".");Thread.sleep(300);
		System.out.print(".");Thread.sleep(300);System.out.print(".");Thread.sleep(300);System.out.print(".");Thread.sleep(300);System.out.print(".");Thread.sleep(300);
		System.out.println();
	}
	

}
