package logic;

import java.util.List;
import java.util.Scanner;

import models.enumerations.*;

import java.util.ArrayList;
import models.Chanson;
import models.ChansonsList;
import models.LivresList;

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
		
		
		int duree = 0;
		boolean flag;
		do {
			System.out.println("saisir la duree: ");
			flag = true;
			try {
				duree = new Integer(saisieChanson.nextLine());
			}catch(Exception e) {
				flag = false;
			}
		}while(flag != true);
		
	
		System.out.println("chemin du fichier: ");
		String fichier = saisieChanson.nextLine();
		
		
		int genreId;
		Genres[] valuesArray = Genres.values();
		do {
			System.out.println("choisir le genre (saisir le numero): ");
			
			for(int i = 0; i < valuesArray.length; i++){
				System.out.println(valuesArray[i].toString());
			}
			
			genreId = new Integer(saisieChanson.nextLine());
		}while(genreId < 0 || genreId > valuesArray.length);
		String genreStr = valuesArray[genreId - 1].getGenre();	
		
		Chanson newChanson = new Chanson(titre, artiste, duree, 0, fichier, genreStr);
		listeChanson.add(newChanson);
		

		//saisieChanson.close();
	}
	

	public void saveChansons(){
		listeChanson.save("saveChanson.data");
	}
	
	public void readChansons(){
		listeChanson.read("saveChanson.data");
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
