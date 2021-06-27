package logic;

public class PlaylistLogic {
	private static playlist askNewPlaylist(chansons listeChansons, livres listeLivres, playlists listePlaylists){
		char choix;
		String nom;
		Scanner saisiePlaylist = new Scanner(System.in);	
		System.out.println("Saisir le nom: ");
		nom = saisiePlaylist.nextLine();
		playlist playList = new playlist(nom, 0);
		listePlaylists.add(playList);


		do{		
			System.out.println("1: chanson 2: livre audio 3: quitter");
			nom = saisiePlaylist.nextLine();
		 	choix = nom.charAt(0);
			
			if(choix == '1'){
				listeChansons.affiche();
				System.out.println("Saisir l'id de la chanson à insérer");
				int idChanson = new Integer(saisiePlaylist.nextLine());		
				playList.addChanson(idChanson);	
			}
			else if(choix == '2'){
				listeLivres.affiche();
				System.out.println("Saisir l'id du livre audio à insérer");
				int idLivre = new Integer(saisiePlaylist.nextLine());		
				playList.addLivre(idLivre);	
			}

		}while(choix != '3');

		playlist newPlaylist = new playlist(nom, 0);
		return newPlaylist;
	}	

	private static void savePlaylist(playlists listePlaylist){
		listePlaylist.save("savePlaylist.data");
	}
	
	private static void affichePlaylist(playlists listePlaylist){	
		listePlaylist.affiche();
	}
}
