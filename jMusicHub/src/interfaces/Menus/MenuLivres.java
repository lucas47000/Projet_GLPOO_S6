package interfaces.Menus;
import java.util.Scanner;

import models.enumerations.Categories;
import models.enumerations.Langues;
import interfaces.Console.BasConsole;
import interfaces.Console.ClearConsole;
import interfaces.Console.EnTeteConsole;
import logic.LivreLogic;
import main.MainApp;
import models.Livre;
import models.LivresList;


public class MenuLivres {
	LivreLogic livreLogic;
	LivresList livresList;
	
	MenuLivres(){
		livreLogic = new LivreLogic();
		livreLogic.readLivres();
	}
	
	
	public void menuLivres() {
		ClearConsole.clear();
		EnTeteConsole.enTeteMenu("MENU LIVRES AUDIOS");
		EnTeteConsole.question(false, "Que souhaitez-vous faire ?\n\n");
		
		System.out.print (	"	- Ajouter un nouveau livre audio ?        |Entrez 'a'|\n\n"+
							"	- Afficher les livres audio par auteur ?  |Entrez 'l'|\n\n");
		BasConsole.afficheRetourMenuPrincipal();
		BasConsole.demanderReponse();
		this.switchMenuLivres();
	}
	
	public void setLivresList(LivresList _livresList) {
		livresList = _livresList;
	}

	public void switchMenuLivres() {
		String reponse = new String();
		Scanner sc = new Scanner(System.in);
		reponse = sc.nextLine();
		
		switch(reponse) {
		  case "a":
			  livreLogic.askNewLivre();
			  livreLogic.saveLivres();
			  //MenuPrincipal.menuPrincipal();
			  break;
		  case "l":
			  System.out.println("liste des livres audio :");
			  livreLogic.afficheLivres();
			  switchRetourMenuLivres();
			  break;
		  case "p":
			  //MenuPrincipal.menuPrincipal();
			  break;
		  default:
			  System.out.print ("Saisie incorrecte, veuillez r?essayer : ");
			  this.menuLivres();
		}		
	}
	
	public void switchRetourMenuLivres() {
		  BasConsole.afficheRetourMenuPrecedent("des livres audios");
		  String reponse = new String();
		  Scanner sc = new Scanner(System.in);
		  reponse = sc.nextLine();
		  
		  switch(reponse) {
		  case "r":
			  this.menuLivres();
			  break;
		  default:
			  System.out.print ("Saisie incorrecte, veuillez r?essayer : \n\n");
			  switchRetourMenuLivres();
		  }
	}
	
}
