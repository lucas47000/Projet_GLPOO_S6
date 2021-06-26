package logic;
import java.util.Scanner;

import models.Livre;
import models.Livres;
import models.categories;
import models.langues;

public class LivreLogic {
	
	 public static Livre askNewLivre(){
		Scanner saisieLivre = new Scanner(System.in);

		System.out.println("saisir le titre");
		String titre = saisieLivre.nextLine();

		System.out.println("saisir l'auteur");
		String auteur = saisieLivre.nextLine();

		System.out.println("saisir la duree");
	    int duree = new Integer(saisieLivre.nextLine());	

		System.out.println("chemin du fichier");
		String fichier = saisieLivre.nextLine();	
		
		System.out.println("choisir la categorie (saisir le numero)");
		categories[] valuesArray = categories.values();
		for(int i = 0; i < valuesArray.length; i++){
			System.out.println(valuesArray[i]);
		}
		int categorieId = new Integer(saisieLivre.nextLine());
		String categorieStr = valuesArray[categorieId - 1].getCategorie();

		System.out.println("choisir la langue (saisir le numero)");
		langues[] valuesArray2 = langues.values();	
		for(int i = 0; i < valuesArray2.length; i++){
			System.out.println(valuesArray2[i]);
		}
		int langueId = new Integer(saisieLivre.nextLine());
		String langueStr = valuesArray2[langueId - 1].getLangue();

		Livre newLivre = new Livre(titre, auteur, duree, 0, fichier, categorieStr, langueStr);
		return newLivre;
	}

	private static void afficheLivres(Livres listeLivre){
		listeLivre.affiche();
	}

	private static void saveLivres(Livres listeLivre){
		listeLivre.save("saveLivre.data");
	}
}
