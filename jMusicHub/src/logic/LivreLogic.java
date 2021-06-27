package logic;

import java.util.Scanner;

import models.enumerations.Categories;
import models.enumerations.Langues;
import models.Livre;
import models.LivresList;

public class LivreLogic {
	LivresList listeLivre;
	
	public LivreLogic(){
	    listeLivre = new LivresList();
	}
	
	 public void askNewLivre(){
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
		Categories[] valuesArray3 = Categories.values();
		
		for(int i = 0; i < valuesArray3.length; i++){
			System.out.println(valuesArray3[i].toString());
		}	
		
		int categorieId = new Integer(saisieLivre.nextLine());
		String categorieStr = valuesArray3[categorieId - 1].getCategorie();

		System.out.println("choisir la langue (saisir le numero)");
		Langues[] valuesArray2 = Langues.values();	
		for(int i = 0; i < valuesArray2.length; i++){
			System.out.println(valuesArray2[i].toString());
		}
		int langueId = new Integer(saisieLivre.nextLine());
		String langueStr = valuesArray2[langueId - 1].getLangue();

		Livre newLivre = new Livre(titre, auteur, duree, 0, fichier, categorieStr, langueStr);
		listeLivre.add(newLivre);
		
		//saisieLivre.close();
	}

	 //--------------------------------------------
	public void afficheLivres(){
			listeLivre.affiche();
	}

	public void saveLivres(){
			listeLivre.save("saveLivre.data");
	}
		
	public void readLivres(){
			listeLivre.read("saveLivre.data");
	}
	 
	//--------------------------------------------
	/*
	public void afficheLivres(LivresList listeLivre){
		listeLivre.affiche();
	}

	public void saveLivres(LivresList listeLivre){
		listeLivre.save("src\\dao\\data\\saveLivre.data");
	}
	
	public void readLivres(LivresList listeLivre){
		listeLivre.read("src\\dao\\data\\saveLivre.data");
	}
	*/
}
