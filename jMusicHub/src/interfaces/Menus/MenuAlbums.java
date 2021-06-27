package interfaces.Menus;
import interfaces.Console.*;
import logic.AlbumLogic;
import logic.LivreLogic;

import java.util.Scanner;


public class MenuAlbums { //classe regroupants le menu et les sous menus relatifs � la manipulation des albums
	AlbumLogic albumLogic;

	MenuAlbums() {
		albumLogic = new AlbumLogic();
		albumLogic.readAlbums();
	}
	
	
//*****************************Menu relatif � la manipulation des albums****************************
	public void menuAlbums() {
		
		ClearConsole.clear();

		EnTeteConsole.enTeteMenu("  MENU ALBUMS");
		
		EnTeteConsole.question(false,"Que souhaitez-vous faire ?\n\n");
		System.out.print (	"	- Afficher les chansons d'un album ?            |Entrez 'c'|\n\n"+
							"	- Afficher la liste des albums ?                |Entrez 'l'|\n\n"+
							"	- Ajouter un nouvel album ?                     |Entrez 'n'|\n\n"+
							"	- Ajouter une chanson existante � un album ?    |Entrez 'a'|\n\n");
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
			  System.out.print ("Saisie incorrecte, veuillez r�essayer : ");
			  this.menuAlbums();
		}		
	}
	
//============================Afficher les chansons d'un album=================================================
	public void menuChansonsAlbum(){
		EnTeteConsole.question(true, "Entrez ici le titre de l'album ('r' pour revenir au menu pr�c�dent) : \n");
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
				  System.out.print ("Saisie incorrecte, veuillez r�essayer : ");
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
			  albumLogic.afficheAlbums();
				menuAlbums();
			  break;
		  case "a":
			  // ICI : methode d'affichage des albums d'un artiste par date de sortie
				//BasConsole.workInProgress("Lister les albums d'un artiste par date de sortie", "albums");
			  this.menuAlbums();
			  break;
		  case "r":
			  this.menuAlbums();
			  break;
		  case "p":
			 // MenuPrincipal.menuPrincipal();
			  break;
		  default:
				  System.out.print ("Saisie incorrecte, veuillez r�essayer : ");
				  switchChansonsAlbum();
		}	  
	}
	
	public void menuAjoutAlbum(){
		albumLogic.askNewAlbum();
		albumLogic.saveAlbums();
		menuAlbums();
	}

	public void menuAjoutChansonAlbum(){
		albumLogic.addChansonToAlbum();
		albumLogic.saveAlbums();
		menuAlbums();
	}

}
