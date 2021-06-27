package interfaces.Menus;
import interfaces.Console.*;
import java.util.Scanner;


public class MenuAlbums { //classe regroupants le menu et les sous menus relatifs à la manipulation des albums
	
	/*public static void main (String[] Args){
		menuAlbums();
	}*/

//*****************************Menu relatif à la manipulation des albums****************************
	public void menuAlbums() {
		ClearConsole.clear();

		EnTeteConsole.enTeteMenu("  MENU ALBUMS");
		
		EnTeteConsole.question(false,"Que souhaitez-vous faire ?\n\n");
		System.out.print (	"	- Afficher les chansons d'un album ?            |Entrez 'c'|\n\n"+
							"	- Afficher la liste des albums ?                |Entrez 'l'|\n\n"+
							"	- Ajouter un nouvel album ?                     |Entrez 'n'|\n\n"+
							"	- Ajouter une chanson existante à un album ?    |Entrez 'a'|\n\n");
		BasConsole.afficheRetourMenuPrincipal();
		BasConsole.demanderReponse();
		switchMenuAlbums();
	}
	


	public void switchMenuAlbums() {
		String reponse = new String();
		Scanner sc = new Scanner(System.in);
		reponse = sc.nextLine();
		
		switch(reponse) {
		  case "c":
			  menuChansonsAlbum();
			  break;
		  case "l":
			  menuListesAlbums();
			  break;
		  case "n":
			  menuAjoutAlbum();
			  break;
		  case "a":
			  menuAjoutChansonAlbum();
			  break;
		  case "p":
			  //MenuPrincipal.menuPrincipal();
			  break;
		  default:
			  System.out.print ("Saisie incorrecte, veuillez réessayer : ");
			  this.menuAlbums();
		}		
	}
	
//============================Afficher les chansons d'un album=================================================
	public void menuChansonsAlbum(){
		EnTeteConsole.question(true, "Entrez ici le titre de l'album ('r' pour revenir au menu précédent) : \n");
		switchChansonsAlbum();
	}
	public void switchChansonsAlbum() {
		String reponse = new String();
		Scanner sc = new Scanner(System.in);
		reponse = sc.nextLine();
		switch(reponse) {
		  case "r":
			  menuAlbums();
			  break;
		  case "p":
			  //MenuPrincipal.menuPrincipal();
			  break;
		  default:
			  if (reponse.length() != 0){
				  //recupChansonsAlbum(reponse)
				  System.out.print("ICI METHODE POUR AFFICHER LES CHANSONS DE L'ALBUM SELECTIONNE");
					BasConsole.workInProgress("Lister les musiques d'un album", "albums");
					this.menuAlbums();
			  }else{
				  System.out.print ("Saisie incorrecte, veuillez réessayer : ");
				  switchChansonsAlbum();
			  }	  
		}
	}
	
//========================Afficher la liste des albums====================================================	
	public void menuListesAlbums(){
		
		EnTeteConsole.question(true, "Que voulez vous afficher ?\n\n");
		System.out.print (	"	- La liste de tous les albums existants ? |Entrez 't'|\n\n"+
							"	- La liste des albums d'un artiste ?      |Entrez 'a'|\n\n"+
							"|Entrez 'r'| pour retourner au menu des albums\n");
		BasConsole.afficheRetourMenuPrincipal();
		BasConsole.demanderReponse();
		switchListesAlbums();
	}
	
	public void switchListesAlbums(){
		String reponse = new String();
		Scanner sc = new Scanner(System.in);
		reponse = sc.nextLine();
		
		switch(reponse) {
		  case "t":
			  //EnTeteConsole.question(true, "Choisisez le critère de tri des albums :");
			  //reponse = sc.nextLine();
			  // ICI : methode d'affichage des albums avec parametre 'typeDeTri'/(réponse)
				BasConsole.workInProgress("Lister tous les albums/ avec choix de methode de tri", "albums");
				menuAlbums();
			  break;
		  case "a":
			  // ICI : methode d'affichage des albums d'un artiste par date de sortie
				BasConsole.workInProgress("Lister les albums d'un artiste par date de sortie", "albums");
				menuAlbums();
			  break;
		  case "r":
			  this.menuAlbums();
			  break;
		  case "p":
			 // MenuPrincipal.menuPrincipal();
			  break;
		  default:
				  System.out.print ("Saisie incorrecte, veuillez réessayer : ");
				  switchChansonsAlbum();
		}	  
	}
	
	public void menuAjoutAlbum(){
		//ICI : appel methode
		//logic.albumsLogic.ajoutAlbum
		BasConsole.workInProgress("Ajout d'un album", "albums");
		menuAlbums();
	}

	public void menuAjoutChansonAlbum(){
		//ICI : appel methode
		//logic.albumsLogic.ajoutChansonAlbum
		BasConsole.workInProgress("Ajout d'une musique à un album", "albums");
		menuAlbums();
	}

}
