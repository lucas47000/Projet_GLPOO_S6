package interfaces.Console;

public class BasConsole {
	public static void afficheRetourMenuPrincipal() {
		System.out.print ("|Entrez 'p'| pour retourner au menu principal\n");
	}
	
	public static void afficheRetourMenuPrecedent(String titreMenu) {
		System.out.print ("|Entrez 'r'| pour retourner au menu "+titreMenu+"\n");
	}
	
	public static void demanderReponse() {
		System.out.print ("\n\nEntrez ici votre réponse : ");
	}
	
	public static void workInProgress(String fonctionnalite, String menu) {
		System.out.print ("\n("+fonctionnalite+") Work in progress, redirection vers le menu "+ menu +" ! ");
	}
}
