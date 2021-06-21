package interfaces.Menus;
import java.util.Scanner;

import interfaces.Console.*;

public class MenuPrincipal {
	//Affiche le menu d'acceuil du programme :
	public static void main(String[] Args){
		MenuPrincipal.menuPrincipal();
	}
	
	public static void menuPrincipal() {
		EnTeteConsole.enTeteMenu("   |jMucicHub|");
		EnTeteConsole.question(false, "Bienvenue sur jMusicHub, que souhaitez-vous faire ?\n\n");
		System.out.print (	"	- Ajouter une nouvelle chanson ?       |Entrez 'c'|\n\n"+
							"	- Afficher le menu des livres audios ? |Entrez 'l'|\n\n"+
							"	- Afficher le menu des albums ?        |Entrez 'a'|\n\n"+
							"	- Afficher le menu des playlists ?     |Entrez 'p'|");
		BasConsole.demanderReponse();
		switchMenuPrincipal();
	}
	
	public static void switchMenuPrincipal() {
		String reponse = new String();
		Scanner sc = new Scanner(System.in);
		reponse = sc.nextLine();
		
		switch(reponse) {
		  case "c":
			  //ICI : appel methode
			  MenuChansons.askNewChanson();
			  break;
		  case "l":
			  MenuLivresAudios.askNewLivre();
			  break;
		  case "a":
			  MenuAlbums.menuAlbums();
			  break;
		  case "p":
			    MenuPlaylists.menuPlaylists();
			  break;
		  default:
			  System.out.print ("Saisie incorrecte, veuillez réessayer : ");
			  	switchMenuPrincipal();
		}
	}
}