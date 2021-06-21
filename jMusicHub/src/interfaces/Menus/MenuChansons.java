package interfaces.Menus;
import java.util.Scanner;

import models.Chanson;
import models.Chansons;
import models.genres;


public class MenuChansons {
	
	
	
	static Chanson askNewChanson(){
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
			System.out.println(valuesArray[i]);
		}
		int genreId = new Integer(saisieChanson.nextLine());
		String genreStr = valuesArray[genreId - 1].getGenre();
		

		Chanson newChanson = new Chanson(titre, artiste, duree, 0, fichier, genreStr);
		return newChanson;
	
	}
	
	private static void afficheChansons(Chansons listeChanson){	
		listeChanson.affiche();
	}

	private static void saveChansons(Chansons listeChanson){
		listeChanson.save("saveChanson.data");
	}
	
}
