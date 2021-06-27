package models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

// album est la classe qui permet de rajouter des chansons dans un album
//
//un album a un id, un titre, un artiste, une duree et une date de sortie

public class Album implements Serializable, Comparable<Album>{
	
	String titre;
	String artiste;
	int duree;
	String dateDeSortie;
	int id;
	
	List<Integer> listChansons = new ArrayList<>();
	
	public void affiche(){
		System.out.println("id:"+id+" titre: "+titre+" artiste: "+artiste+"durée: "+duree+"date de sortie: "+dateDeSortie);
	}

	public Album(String titre, String artiste, int duree, String dateDeSortie, int _id){
		this.titre = titre;
		this.artiste = artiste;
		this.duree = duree;
		this.dateDeSortie = dateDeSortie;
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

	public String dateDeSortie(){
		return this.dateDeSortie;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return this.id;
	}	

	public void add(Chanson _chanson){
		id = _chanson.id();
		listChansons.add(id);
	}
	
	public void add(int id){
		listChansons.add(id);
	}

	public List get(){
		return this.listChansons;
	}

	public int compareTo(Album _album){
		int rc;

		rc = this.dateDeSortie.compareTo(_album.dateDeSortie());

		return rc;
	}

} 