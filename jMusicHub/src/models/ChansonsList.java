package models;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import models.Chanson;

public class ChansonsList implements Serializable{
	public static List<Chanson> listChansons = new ArrayList<>();
	
	public void add(Chanson _chanson){  //pour rajouter une chanson dans la liste
		int id = listChansons.size() + 1;
		_chanson.setId(id);
		listChansons.add( _chanson);
		System.out.println("add chanson");
	}

	public void save(String filePass){  //serialisation
		System.out.println("save chanson");

		ObjectOutputStream oos = null;

		try{
			final FileOutputStream fichier = new FileOutputStream(filePass);
			oos = new ObjectOutputStream(fichier);

			oos.writeObject(listChansons);

			oos.flush();
			oos.close();
		}
		catch (final java.io.IOException e) {
			e.printStackTrace();
		}	

	}
	
	
	public void read(String filePass){  //deserialisation
	
		System.out.println("read chanson");
		
		ObjectInputStream oos = null;
		
		try{
			final FileInputStream fichier = new FileInputStream(filePass);
			oos = new ObjectInputStream(fichier);
			listChansons = (ArrayList) oos.readObject();
			oos.close();
		}
		catch (final java.io.IOException e){
			e.printStackTrace();
		}	
		catch (final Exception e){
			e.printStackTrace();
		}
	
	}

	public void affiche(){			//affiche la liste des chansons
		System.out.println("affiche");
		System.out.println(listChansons.size());

		for(int i = 0; i < listChansons.size(); i++){
			Chanson _chanson = listChansons.get(i);
			_chanson.affiche();
		}
	}

	public void affiche(int j){			//affiche la liste des chansons
		System.out.println("affiche");
		System.out.println(listChansons.size());

		for(int i = 0; i < listChansons.size(); i++){
			Chanson _chanson = listChansons.get(i);
			if(_chanson.id() == j){
				_chanson.affiche();
			}
		}
	}

}
