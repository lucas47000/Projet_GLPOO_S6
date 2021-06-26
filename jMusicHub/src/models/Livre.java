package models;
import java.io.Serializable;

public class Livre implements Serializable, Comparable<Livre>{

	String titre;
	String auteur;
	int duree;
	int id;
	String fichier;
	String categorie;
	String langue;
	
	public void affiche(){
		System.out.println("id: "+id+" titre: "+titre+" auteur: "+auteur+" duree: "+duree+" fichier : "+fichier+" categorie: "+categorie+" langue: "+langue);
	}	

	public Livre(String titre, String auteur, int duree, int _id, String fichier, String categorie, String langue){
		this.titre = titre;
		this.auteur = auteur;
		this.duree = duree;
		this.fichier = fichier;
		this.categorie = categorie;
		this.langue = langue;
	}

	public String titre(){
		return this.titre;
	}

	public String auteur(){
		return this.auteur;
	}

	public int duree(){
		return this.duree;
	}

	public int id(){
		return this.id;
	}

	public String fichier() {
		return this.fichier;
	}

	public String categorie(){
		return this.categorie;
	}

	public String langue(){
		return this.langue();
	}

	public void setId(int id){
		this.id = id;
	}

	public int compareTo(Livre _livre){
		int rc;

		rc = this.auteur.compareTo(_livre.auteur());

		return rc;
	} 

}
