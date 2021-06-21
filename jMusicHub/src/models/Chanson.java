package models;

public class Chanson extends Piste {

	String titre;
	String artiste;
	int duree;
	int id;
	String fichier;
	String genre;

	public void affiche(){
		System.out.println("id:"+id+" Titre:"+titre+" Artiste: "+artiste+" Duree: "+duree+" Genre: "+genre+" Fichier: "+fichier);
	}

	public chanson(String titre, String artiste, int duree, int _id, String fichier, String genre){
		this.titre = titre; 
		this.artiste = artiste;
		this.duree = duree;
		this.fichier = fichier;
		this.genre = genre;
	}

	public String titre(){
		return this.titre;
	}

	public String artiste(){
		return this.artiste;
	}

	public int duree(){
		return this.duree;
	}

	public int id(){
		return this.id;
	}	
	
	public String fichier(){
		return this.fichier;
	}
	
	public String genre(){
		return this.genre;
	}

	public void setId(int id){
		this.id = id;
	}
}
