package interfaces.Menus;
import java.util.Scanner;

import interfaces.Console.BasConsole;
import interfaces.Console.EnTeteConsole;
import logic.ChansonLogic;


public class MenuChansons {
	
	public static void main(String[] Args){
		MenuChansons.menuChansons();
	}

	public static void menuChansons() {
		EnTeteConsole.enTeteMenu("MENU CHANSONS");
		EnTeteConsole.question(false, "Que souhaitez-vous faire ?\n\n");
		
		System.out.print (	"	- Ajouter une nouvelle chanson ? |Entrez 'a'|\n\n"+
							"	- Lire une nouvelle chanson ?    |Entrez 'l'|\n\n");
		BasConsole.afficheRetourMenuPrincipal();
		BasConsole.demanderReponse();
		switchMenuChansons();
	}

	public static void switchMenuChansons() {
		String reponse = new String();
		Scanner sc = new Scanner(System.in);
		reponse = sc.nextLine();
		
		switch(reponse) {
		  case "a":
			  ChansonLogic.askNewChanson();
			  MenuPrincipal.menuPrincipal();
			  break;
		  case "n":
			  //menuAjoutAlbum();
			  break;
		  case "p":
			  MenuPrincipal.menuPrincipal();
			  break;
		  default:
			  System.out.print ("Saisie incorrecte, veuillez r�essayer : ");
			  MenuChansons.menuChansons();
		}		
	}
	
}
