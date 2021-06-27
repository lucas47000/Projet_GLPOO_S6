package models;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Playlist implements Serializable{
	
	String nom;
	int id;
	
	List<Piste> listPiste = new ArrayList<>();
	
	public void affiche(){
		System.out.println("id:"+id+" nom: "+nom);
	}

	public Playlist(String nom, int _id){
		this.nom = nom;
	}

	public String nom(){
		return this.nom;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return this.id;
	}	

	public void addChanson(int id){
		Piste p = new Piste('c',id);
		listPiste.add(p);
	}

	public void addLivre(int id){
		Piste p = new Piste('l',id);
		listPiste.add(p);
	}

	public List get(){
		return this.listPiste;
	}
}
