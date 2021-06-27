package logic;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;

import models.Album;
import models.AlbumsList;
import models.ChansonsList;
import models.LivresList;


public class AlbumLogic {
	
	AlbumsList listeAlbum;
	ChansonsList listeChanson;
	
	public AlbumLogic(){
	    listeAlbum = new AlbumsList();
	    listeChanson = new ChansonsList();
	}
	
	public void askNewAlbum(){
		Scanner saisieAlbum = new Scanner(System.in);
		boolean lecture = false;
		String date = null;

		System.out.println("Saisir le titre: ");
		String titre = saisieAlbum.nextLine();

		System.out.println("Saisir l'artiste: ");
		String artiste = saisieAlbum.nextLine();

		System.out.println("saisir la duree: ");
		int duree = new Integer(saisieAlbum.nextLine());

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		do{
			try{
				System.out.println("saisir la date de sortie au format jj/mm/aaaa: ");
				date = saisieAlbum.nextLine();
				simpleDateFormat.parse(date);
				lecture = true;
			}
			catch (ParseException e){
				System.err.println("erreur de saisie");
			}
		}while(lecture == false);

		Album newAlbum = new Album(titre, artiste, duree, date, 0);
		listeAlbum.save("saveAlbum.data");
	
	}
	
	public void afficheAlbums(AlbumsList listeAlbum){	
		listeAlbum.affiche();
	}

	public void saveAlbums(AlbumsList listeAlbum){
		listeAlbum.save("saveAlbum.data");
	}

	
//-----------------------------------------------------------------------
	public void addChansonToAlbum(){	
		Album _album = null;
		Scanner saisie = new Scanner(System.in); 
		afficheAlbums(listeAlbum);
		
		System.out.println("Saisir l'id de l'album à éditer");
		int idAlbum = new Integer(saisie.nextLine());
		
		_album = listeAlbum.getAlbum(idAlbum);	
		_album.affiche();
	
		listeChanson.affiche();
		System.out.println("Saisir l'id de la chanson à insérer");
		int idChanson = new Integer(saisie.nextLine());		
		_album.add(idChanson);	
	}
	
	
//-----------------------------------------------------------------------------
	public void afficheChansonAlbum(){
		Album _album = null;
		Scanner saisie = new Scanner(System.in); 
		afficheAlbums(listeAlbum);
		
		System.out.println("Saisir l'id de l'album à afficher");
		int idAlbum = new Integer(saisie.nextLine());
		
		_album = listeAlbum.getAlbum(idAlbum);	
		_album.affiche();
		
		List liste = _album.get();
		for (int i=0; i<liste.size();i++){
			listeChanson.affiche((int) liste.get(i));
		}

	}
	public void afficheAlbums(){
		listeAlbum.affiche();
	}

	public void saveAlbums(){
		listeAlbum.save("saveAlbum.data");
	}
	
	public void readAlbums(){
		listeAlbum.read("saveAlbum.data");
	}
	
}
