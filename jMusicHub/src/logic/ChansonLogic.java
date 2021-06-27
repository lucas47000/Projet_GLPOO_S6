package logic;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import models.Chanson;
import models.ChansonsList;
import models.LivresList;
import models.genres;

public class ChansonLogic {
	
	ChansonsList listeChanson;
	
	public ChansonLogic(){
		listeChanson = new ChansonsList();
	}
	
	public void askNewChanson(){
		Scanner saisieChanson = new Scanner(System.in);

		System.out.println("Saisir le titre: ");
		String titre = saisieChanson.nextLine();

		System.out.println("Saisir l'artiste: ");
		String artiste = saisieChanson.nextLine();

		System.out.println("saisir la duree: ");
		int duree = new Integer(saisieChanson.nextLine());

		System.out.println("chemin du fichier: ");
		String fichier = saisieChanson.nextLine();

		System.out.println("choisir le genre (saisir le numero): ");
		genres[] valuesArray = genres.values();
		for(int i = 0; i < valuesArray.length; i++){
			System.out.println(valuesArray[i].toString());
		}
		int genreId = new Integer(saisieChanson.nextLine());
		String genreStr = valuesArray[genreId - 1].getGenre();
		

		Chanson newChanson = new Chanson(titre, artiste, duree, 0, fichier, genreStr);
		listeChanson.add(newChanson);
	
	}
	

	public void saveChansons(){
		listeChanson.save("src\\dao\\data\\saveChanson.data");
	}
	
	public void readChansons(){
		listeChanson.read("src\\dao\\data\\saveChanson.data");
	}
	
	//====================BLOC AFFICHAGE==================================
	
	public void afficheChansons(List<Chanson> listChansons){	
		affiche();
	}
	
	public void affiche(){			//affiche la liste des chansons
		System.out.println("affiche");
		System.out.println(ChansonsList.listChansons.size());

		for(int i = 0; i < ChansonsList.listChansons.size(); i++){
			Chanson _chanson = ChansonsList.listChansons.get(i);
			_chanson.affiche();
		}
	}


}
