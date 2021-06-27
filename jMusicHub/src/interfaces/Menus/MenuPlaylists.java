package interfaces.Menus;

import java.util.Scanner;

import interfaces.Console.BasConsole;
import interfaces.Console.ClearConsole;
import interfaces.Console.EnTeteConsole;
import interfaces.Menus.*;

public class MenuPlaylists {
	
	public static void main(String[] Args){
		MenuPlaylists.menuPlaylists();
	}

	public static void menuPlaylists() {
		ClearConsole.clear();

		EnTeteConsole.enTeteMenu("MENU PLAYLISTS");
		EnTeteConsole.question(false, "Que souhaitez-vous faire ?\n\n");
		
		System.out.print (	"	- Afficher le titre des playlists par noms ? |Entrez 'a'|\n\n"+
							"	- Ajouter une nouvelle playlist ?            |Entrez 'n'|\n\n"
						+ 	"	- Supprimer une playlist                     |Entrez 's'|\n\n");
		BasConsole.afficheRetourMenuPrincipal();
		BasConsole.demanderReponse();
		switchMenuPlaylists();
	}

	public static void switchMenuPlaylists() {
		String reponse = new String();
		Scanner sc = new Scanner(System.in);
		reponse = sc.nextLine();
		
		switch(reponse) {
		  case "a":
			  //listePlaylists();
			  switchRetourMenuPlaylists();
			  break;
		  case "n":
			  //ajoutplaylist();
			  break;
		  case "s":
			  //supprimerplaylist();
			  break;
		  case "p":
			  MenuPrincipal.menuPrincipal();
			  break;
		  default:
			  System.out.print ("Saisie incorrecte, veuillez réessayer : ");
			  MenuPlaylists.menuPlaylists();
		}		
	}
	
	public static void switchRetourMenuPlaylists() {
		  BasConsole.afficheRetourMenuPrecedent("des playlists");
		  String reponse = new String();
		  Scanner sc = new Scanner(System.in);
		  reponse = sc.nextLine();
		  
		  switch(reponse) {
		  case "r":
			  MenuPlaylists.menuPlaylists();
			  break;
		  default:
			  System.out.print ("Saisie incorrecte, veuillez réessayer : \n\n");
			  switchRetourMenuPlaylists();
		  }
	}
	
}
