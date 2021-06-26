package interfaces.Menus;

import java.util.Scanner;

import interfaces.Console.BasConsole;
import interfaces.Console.EnTeteConsole;

public class MenuPlaylists {
	
	public static void main(String[] Args){
		MenuPlaylists.menuPlaylists();
	}

	public static void menuPlaylists() {
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
			  //menuListesAlbums();
			  break;
		  case "n":
			  //menuAjoutAlbum();
			  break;
		  case "s":
			  //menuAjoutChansonAlbum();
			  break;
		  case "p":
			  MenuPrincipal.menuPrincipal();
			  break;
		  default:
			  System.out.print ("Saisie incorrecte, veuillez réessayer : ");
			  MenuPlaylists.menuPlaylists();
		}		
	}
}
