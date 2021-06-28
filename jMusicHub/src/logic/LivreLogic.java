package logic;

import java.util.Scanner;

import models.enumerations.Categories;
import models.enumerations.Genres;
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

	    int duree = 0;
		boolean flag;
		do {
			System.out.println("saisir la duree: ");
			flag = true;
			try {
				duree = new Integer(saisieLivre.nextLine());
			}catch(Exception e) {
				flag = false;
			}
		}while(flag != true);

		System.out.println("chemin du fichier");
		String fichier = saisieLivre.nextLine();	
		
		
		int categorieId;
		Categories[] valuesArray3 = Categories.values();
		do {
			System.out.println("choisir la categorie (saisir le numero)");
			for(int i = 0; i < valuesArray3.length; i++){
				System.out.println(valuesArray3[i].toString());
			}	
			categorieId = new Integer(saisieLivre.nextLine());
		}while(categorieId < 0 || categorieId > valuesArray3.length);
		String categorieStr = valuesArray3[categorieId - 1].getCategorie();
		
		int langueId;
		Langues[] valuesArray2 = Langues.values();	
		do {
			System.out.println("choisir la langue (saisir le numero)");
			for(int i = 0; i < valuesArray2.length; i++){
				System.out.println(valuesArray2[i].toString());	
			}
			langueId = new Integer(saisieLivre.nextLine());
		}while(langueId < 0 || langueId > valuesArray2.length);
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
