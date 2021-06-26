package interfaces.Menus;
import java.util.Scanner;

import interfaces.Console.BasConsole;
import interfaces.Console.EnTeteConsole;
import logic.LivreLogic;
import models.Livre;
import models.LivresList;
import models.categories;
import models.langues;

public class MenuLivres {
	
	public static void main(String[] Args){
		MenuLivres.menuLivres();
	}

	public static void menuLivres() {
		EnTeteConsole.enTeteMenu("MENU LIVRES AUDIOS");
		EnTeteConsole.question(false, "Que souhaitez-vous faire ?\n\n");
		
		System.out.print (	"	- Ajouter un nouveau livre audio ?        |Entrez 'a'|\n\n"+
							"	- Afficher les livres audio par auteur ?  |Entrez 'l'|\n\n");
		BasConsole.afficheRetourMenuPrincipal();
		BasConsole.demanderReponse();
		switchMenuLivres();
	}

	public static void switchMenuLivres() {
		String reponse = new String();
		Scanner sc = new Scanner(System.in);
		reponse = sc.nextLine();
		
		switch(reponse) {
		  case "a":
			  LivreLogic.askNewLivre();
			  MenuPrincipal.menuPrincipal();
			  break;
		  case "n":
			  //menuAjoutAlbum();
			  break;
		  case "p":
			  MenuPrincipal.menuPrincipal();
			  break;
		  default:
			  System.out.print ("Saisie incorrecte, veuillez réessayer : ");
			  MenuLivres.menuLivres();
		}		
	}
	
}
