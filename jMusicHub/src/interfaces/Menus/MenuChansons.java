package interfaces.Menus;
import java.util.Scanner;

import interfaces.Console.BasConsole;
import interfaces.Console.ClearConsole;
import interfaces.Console.EnTeteConsole;
import logic.ChansonLogic;
import models.ChansonsList;


public class MenuChansons {
	
	public static void main(String[] Args){
		MenuChansons.menuChansons();
	}

	public static void menuChansons() {
		ClearConsole.clear();
		EnTeteConsole.enTeteMenu("MENU CHANSONS");
		EnTeteConsole.question(false, "Que souhaitez-vous faire ?\n\n");
		
		System.out.print (	"	- Ajouter une nouvelle chanson ? |Entrez 'a'|\n\n"+
							"	- Lire une chanson ?             |Entrez 'l'|\n\n");
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
			  MenuChansons.menuChansons();
			  break;
		  case "l":
			  System.out.println("liste des chansons :");
			  ChansonLogic.afficheChansons(ChansonsList.listChansons);
			  switchRetourMenuChansons();
			  break;
		  case "p":
			  MenuPrincipal.menuPrincipal();
			  break;
		  default:
			  System.out.print ("Saisie incorrecte, veuillez réessayer : \n\n");
			  MenuChansons.menuChansons();
		}		
	}
	public static void switchRetourMenuChansons() {
		  BasConsole.afficheRetourMenuPrecedent("des chansons");
		  String reponse = new String();
		  Scanner sc = new Scanner(System.in);
		  reponse = sc.nextLine();
		  
		  switch(reponse) {
		  case "r":
			  MenuChansons.menuChansons();
			  break;
		  default:
			  System.out.print ("Saisie incorrecte, veuillez réessayer : \n\n");
			  switchRetourMenuChansons();
		  }
	}
}		
	
