package models;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import models.logs.Log;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Collections;

public class LivresList implements Serializable{

	List<Livre> listLivres = new ArrayList<>();

	public void add(Livre _livre){  //pour rajouter une chanson dans la liste
		int id = listLivres.size() + 1;
		_livre.setId(id);
		listLivres.add( _livre);
		Log.log("add livre\n");
	}

	public void save(String filePass){    //serialisation
		Log.log("save livre\n");
	
		ObjectOutputStream oos = null;

		try{
			final FileOutputStream fichierLivre = new FileOutputStream(filePass);
			oos = new ObjectOutputStream(fichierLivre);

			oos.writeObject(listLivres);

			oos.flush();
			oos.close();
		}
		catch (final java.io.IOException e){  
			System.err.println("erreur de sauvegarde");
		}

	}

	public void read(String filePass){  //deserialisation
		
		System.out.println("read livre");
	
		ObjectInputStream oos = null;	
	
		try{
			final FileInputStream fichierLivre = new FileInputStream(filePass);
			oos = new ObjectInputStream(fichierLivre);
	   		listLivres = (ArrayList) oos.readObject();
			oos.close();	
		}	
		catch (final java.io.IOException e){
			System.err.println("erreur de lecture");
		}
		catch (final Exception e){
			e.printStackTrace();
		}

	}

	public void affiche(){
		System.out.println("affiche livre");
		System.out.println(listLivres.size());

		Collections.sort(listLivres);

		for(int i = 0; i < listLivres.size(); i++){
			Livre _livre = listLivres.get(i);
			_livre.affiche();
		}

	}

}
