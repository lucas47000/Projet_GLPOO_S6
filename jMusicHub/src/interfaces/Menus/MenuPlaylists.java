package interfaces.Menus;

import java.io.Serializable;
import java.util.Scanner;

import interfaces.Console.BasConsole;
import interfaces.Console.ClearConsole;
import interfaces.Console.EnTeteConsole;
import interfaces.Menus.*;
import logic.LivreLogic;
import logic.PlaylistLogic;
import models.LivresList;
import models.PlaylistsList;

public class MenuPlaylists{
	
	PlaylistLogic playlistLogic;
	PlaylistsList playlistsList;
	
	MenuPlaylists(){
		playlistLogic = new PlaylistLogic();
		playlistLogic.readLPlaylists();
		
	}
	

	public void menuPlaylists() {
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

	public void switchMenuPlaylists() {
		String reponse = new String();
		Scanner sc = new Scanner(System.in);
		reponse = sc.nextLine();
		
		switch(reponse) {
		  case "a":
			  playlistLogic.affichePlaylists();
			  switchRetourMenuPlaylists();
			  break;
		  case "n":
			  playlistLogic.askNewPlaylist();
			  playlistLogic.savePlaylists();
			  switchRetourMenuPlaylists();
			  break;
		  case "s":
			  //supprimerplaylist();
			  switchRetourMenuPlaylists();
			  break;
		  case "p":
			  
			  break;
		  default:
			  System.out.print ("Saisie incorrecte, veuillez réessayer : ");
			  this.menuPlaylists();
		}		
	}
	
	public void switchRetourMenuPlaylists() {
		  BasConsole.afficheRetourMenuPrecedent("des playlists");
		  String reponse = new String();
		  Scanner sc = new Scanner(System.in);
		  reponse = sc.nextLine();
		  
		  switch(reponse) {
		  case "r":
			  this.menuPlaylists();
			  break;
		  default:
			  System.out.print ("Saisie incorrecte, veuillez réessayer : \n\n");
			  switchRetourMenuPlaylists();
		  }
	}
	
}
