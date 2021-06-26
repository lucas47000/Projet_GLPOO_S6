package interfaces.Menus;
import java.util.Scanner;

import interfaces.Console.BasConsole;
import interfaces.Console.ClearConsole;
import interfaces.Console.EnTeteConsole;
import logic.LivreLogic;
import main.MainApp;
import models.Livre;
import models.LivresList;
import models.categories;
import models.langues;


public class MenuLivres {
	static LivresList livresList;
	
	public static void main(String[] Args){
		MenuLivres.menuLivres();
	}
	
	public static void menuLivres() {
		ClearConsole.clear();

		EnTeteConsole.enTeteMenu("MENU LIVRES AUDIOS");
		EnTeteConsole.question(false, "Que souhaitez-vous faire ?\n\n");
		
		System.out.print (	"	- Ajouter un nouveau livre audio ?        |Entrez 'a'|\n\n"+
							"	- Afficher les livres audio par auteur ?  |Entrez 'l'|\n\n");
		BasConsole.afficheRetourMenuPrincipal();
		BasConsole.demanderReponse();
		switchMenuLivres();
	}
	
	public void setLivresList(LivresList _livresList) {
		livresList = _livresList;
	}

	public static void switchMenuLivres() {
		String reponse = new String();
		Scanner sc = new Scanner(System.in);
		reponse = sc.nextLine();
		
		switch(reponse) {
		  case "a":
			  LivreLogic.askNewLivre();
			  LivreLogic.saveLivres(livresList);
			  MenuPrincipal.menuPrincipal();
			  break;
		  case "l":
			  System.out.println("liste des livres audio :");
			  LivreLogic.afficheLivres(livresList);
			  switchRetourMenuLivres();
			  break;
		  case "p":
			  MenuPrincipal.menuPrincipal();
			  break;
		  default:
			  System.out.print ("Saisie incorrecte, veuillez réessayer : ");
			  MenuLivres.menuLivres();
		}		
	}
	
	public static void switchRetourMenuLivres() {
		  BasConsole.afficheRetourMenuPrecedent("des livres audios");
		  String reponse = new String();
		  Scanner sc = new Scanner(System.in);
		  reponse = sc.nextLine();
		  
		  switch(reponse) {
		  case "r":
			  MenuLivres.menuLivres();
			  break;
		  default:
			  System.out.print ("Saisie incorrecte, veuillez réessayer : \n\n");
			  switchRetourMenuLivres();
		  }
	}
	
}
