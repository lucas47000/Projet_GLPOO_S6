package interfaces.Menus;

import java.util.Scanner;

import interfaces.Console.BasConsole;
import interfaces.Console.EnTeteConsole;

public class MenuLivresAudios {
	
	public static void main(String[] Args){
		MenuLivresAudios.menuLivresAudios();
	}

	public static void menuLivresAudios() {
		EnTeteConsole.enTeteMenu("MENU LIVRES AUDIOS");
		EnTeteConsole.question(false, "Que souhaitez-vous faire ?\n\n");
		
		System.out.print (	"	- Afficher les livres audios d'un auteur ? |Entrez 'a'|\n\n"+
							"	- Ajouter un nouveau livre audio ?         |Entrez 'n'|\n\n\n");
		BasConsole.afficheRetourMenuPrincipal();
		BasConsole.demanderReponse();
		switchMenuLivresAudios();
	}

	public static void switchMenuLivresAudios() {
		String reponse = new String();
		Scanner sc = new Scanner(System.in);
		reponse = sc.nextLine();
		
		switch(reponse) {
		  case "a":
			  System.out.print("ICI METHODE QUI DEMANDE NOM AUTEUR POUR AFFICHAGE LIVRES AUDIOS");
			  MenuLivresAudios.menuLivresAudios();
			  break;
		  case "n":
			  System.out.print("ICI METHODE AJOUT LIVRE AUDIO");
			  MenuLivresAudios.menuLivresAudios();
			  break;
		  case "p":
			  MenuPrincipal.menuPrincipal();
			  break;
		  default:
			  System.out.print ("Saisie incorrecte, veuillez réessayer : ");
			  MenuLivresAudios.menuLivresAudios();
		}		
	}
}
