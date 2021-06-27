package logic;

import java.util.Scanner;

import models.ChansonsList;
import models.LivresList;
import models.Playlist;
import models.PlaylistsList;

public class PlaylistLogic {
	PlaylistsList listePlaylist;
	LivresList listeLivre;
	ChansonsList listeChanson;
	
	public PlaylistLogic(){
	    listePlaylist = new PlaylistsList();
	    listeLivre = new LivresList();
	    listeChanson = new ChansonsList();
	}
	
	public void askNewPlaylist(){
		char choix;
		String nom;
		Scanner saisiePlaylist = new Scanner(System.in);	
		System.out.println("Saisir le nom: ");
		nom = saisiePlaylist.nextLine();
		Playlist playList = new Playlist(nom, 0);
		listePlaylist.add(playList);


		do{		
			System.out.println("1: chanson 2: livre audio 3: quitter");
			nom = saisiePlaylist.nextLine();
		 	choix = nom.charAt(0);
			
			if(choix == '1'){
				listeChanson.read("saveChanson.data");
				listeChanson.affiche();
				System.out.println("Saisir l'id de la chanson à insérer");
				int idChanson = new Integer(saisiePlaylist.nextLine());		
				playList.addChanson(idChanson);	
			}
			else if(choix == '2'){
				listeLivre.read("saveLivre.data");
				listeLivre.affiche();
				System.out.println("Saisir l'id du livre audio à insérer");
				int idLivre = new Integer(saisiePlaylist.nextLine());		
				playList.addLivre(idLivre);	
				
			}

		}while(choix != '3');

		Playlist newPlaylist = new Playlist(nom, 0);
		listePlaylist.save("savePlaylist.data");
	}	

	/*private static void savePlaylist(PlaylistsList listePlaylist){
		listePlaylist.save("savePlaylist.data");
	}
	
	private static void affichePlaylist(PlaylistsList listePlaylist){	
		listePlaylist.affiche();
	}*/


	public void affichePlaylists(){
		listePlaylist.affiche();
	}	

	public void savePlaylists(){
		listePlaylist.save("savePlaylist.data");
	}
	
	public void readLPlaylists(){
		listePlaylist.read("savePlaylist.data");
	}
	
}
