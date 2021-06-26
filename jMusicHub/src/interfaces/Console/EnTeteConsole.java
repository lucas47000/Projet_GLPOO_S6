package interfaces.Console;

public class EnTeteConsole {

	public static void enTeteMenu(String titreEnTete) {
		System.out.print ("\n___________________________________________________________________\n\n"+
							"                         "+ titreEnTete + "\n"+
							"___________________________________________________________________\n\n");
	}
	
	public static void question(boolean trait, String question) {
		if(trait == true ) {
		System.out.print ("\n___________________________________________________________________\n\n"+
							 question);
		}else{
			System.out.print ("\n"+question);
		}
	}
}