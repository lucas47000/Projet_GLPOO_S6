package interfaces.Menus;
import java.util.Scanner;

import interfaces.Console.BasConsole;
import interfaces.Console.ClearConsole;
import interfaces.Console.EnTeteConsole;
import logic.ChansonLogic;
import models.ChansonsList;
import models.LivresList;


public class MenuChansons {
	ChansonsList chansonsList;
	ChansonLogic chansonLogic;
	
	MenuChansons(){
		chansonLogic = new ChansonLogic();
		chansonLogic.readChansons();
	}
	
	/*public void main(String[] Args){
	MenuChansons.menuChansons();
}*/
	
	public void menuChansons() {
		ClearConsole.clear();
		EnTeteConsole.enTeteMenu("MENU CHANSONS");
		EnTeteConsole.question(false, "Que souhaitez-vous faire ?\n\n");
		
		System.out.print (	"	- Ajouter une nouvelle chanson ? |Entrez 'a'|\n\n"+
							"	- Lire une chanson ?             |Entrez 'l'|\n\n");
		BasConsole.afficheRetourMenuPrincipal();
		BasConsole.demanderReponse();
		this.switchMenuChansons();
	}
	
	public void setChansonsList(ChansonsList _chansonsList) {
		chansonsList = _chansonsList;
	}

	public void switchMenuChansons() {
		String reponse = new String();
		Scanner sc = new Scanner(System.in);
		reponse = sc.nextLine();
		
		switch(reponse) {
		  case "a":
			  chansonLogic.askNewChanson();
			  chansonLogic.saveChansons();
			  this.menuChansons();
			  break;
		  case "l":
			  System.out.println("liste des chansons :");
			  chansonLogic.affiche();
			  switchRetourMenuChansons();
			  break;
		  case "p":
			  break;
		  default:
			  System.out.print ("Saisie incorrecte, veuillez réessayer : \n\n");
			  this.menuChansons();
		}		
	}
	public void switchRetourMenuChansons() {
		  BasConsole.afficheRetourMenuPrecedent("des chansons");
		  String reponse = new String();
		  Scanner sc = new Scanner(System.in);
		  reponse = sc.nextLine();
		  
		  switch(reponse) {
		  case "r":
			  this.menuChansons();
			  break;
		  default:
			  System.out.print ("Saisie incorrecte, veuillez réessayer : \n\n");
			  switchRetourMenuChansons();
		  }
	}
}		
	
