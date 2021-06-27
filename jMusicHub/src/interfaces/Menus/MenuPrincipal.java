package interfaces.Menus;
import logic.ChansonLogic;
import java.util.Scanner;
import logic.LivreLogic;
import models.ChansonsList;
import models.LivresList;
import models.PlaylistsList;
import models.AlbumsList;
import interfaces.Console.*;

public class MenuPrincipal {
	static LivresList livresList;
	static ChansonsList chansonsList;
	static PlaylistsList playlistsList;
	static AlbumsList albumsList;
	
	MenuLivres menuLivres;
	MenuChansons menuChansons;
	MenuPlaylists menuPlaylists;
	MenuAlbums menuAlbums;
	
	public MenuPrincipal() {
		menuLivres = new MenuLivres();
		menuChansons = new MenuChansons();
		menuPlaylists = new MenuPlaylists();
		menuAlbums = new MenuAlbums();
	}
	
	public void setLivresList(LivresList _livresList) {
		livresList = _livresList;
	}
	
	public void setLivresList(ChansonsList _chansonsList) {
		chansonsList = _chansonsList;
	}
	
	public void setPlaylistsList(PlaylistsList _playlistsList) {
		playlistsList = _playlistsList;
	}
	
	public void setAlbumList(AlbumsList _albumsList) {
		albumsList = _albumsList;
	}
	
	
	public void menuPrincipal() {
		
		do {
			ClearConsole.clear();

			EnTeteConsole.enTeteMenu("   |jMucicHub|");
			EnTeteConsole.question(false, "Bienvenue sur jMusicHub, que souhaitez-vous faire ?\n\n");
			System.out.print (	"	- Ajouter une nouvelle chanson ?       |Entrez 'c'|\n\n"+
								"	- Afficher le menu des livres audios ? |Entrez 'l'|\n\n"+
								"	- Afficher le menu des albums ?        |Entrez 'a'|\n\n"+
								"	- Afficher le menu des playlists ?     |Entrez 'p'|\n\n"+
								"	- Quitter jMusicHub                    |Entrez 'q'|\n\n");
		BasConsole.demanderReponse();
			this.switchMenuPrincipal();
		}while(true);
	}
	
	public void switchMenuPrincipal() {
		String reponse = new String();
		Scanner sc = new Scanner(System.in);
		reponse = sc.nextLine();
		
		switch(reponse) {
		  case "c":
			  menuChansons.menuChansons();
			  this.menuPrincipal();
			  break;
		  case "l":
			  menuLivres.menuLivres();
			  this.menuPrincipal();
			  break;
		  case "a":
			  menuAlbums.menuAlbums();
			  this.menuPrincipal();
			  break;
		  case "p":
			  menuPlaylists.menuPlaylists();
			  this.menuPrincipal();
			  break;
		  case "q":
			  System.exit(0);
		  default:
			  System.out.print ("Saisie incorrecte, veuillez réessayer : ");
			
		}
	}
}