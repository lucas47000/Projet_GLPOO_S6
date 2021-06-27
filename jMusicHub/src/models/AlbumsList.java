package models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Collections;

//la class albums permet la gestion de l'objet  album (création, lecture, sauvegarde)



public class AlbumsList implements Serializable{

	 List<Album> listAlbums = new ArrayList<>();

        public void add(Album _album){  //pour rajouter une chanson dans la liste
                int id = listAlbums.size() + 1;
                _album.setId(id);
                listAlbums.add( _album);
                System.out.println("add album");
        }

        public void save(String filePass){  //serialisation
                System.out.println("save album");

                ObjectOutputStream oos = null;

                try{
                        final FileOutputStream fichier = new FileOutputStream(filePass);
                        oos = new ObjectOutputStream(fichier);

                        oos.writeObject(listAlbums);

                        oos.flush();
                        oos.close();
                }
                catch (final java.io.IOException e) {
                        e.printStackTrace();
                }

        }


        public void read(String filePass){  //deserialisation

                System.out.println("read album");

                ObjectInputStream oos = null;

                try{
                        final FileInputStream fichier = new FileInputStream(filePass);
                        oos = new ObjectInputStream(fichier);
                        listAlbums = (ArrayList) oos.readObject();
                        oos.close();
                }
                catch (final java.io.IOException e){
                        e.printStackTrace();
                }
                catch (final Exception e){
                        e.printStackTrace();
                }

        }

        public void affiche(){                  //affiche la liste des chansons
                System.out.println("affiche");
                System.out.println(listAlbums.size());
				Collections.sort(listAlbums);
                for(int i = 0; i < listAlbums.size(); i++){
                        Album _album = listAlbums.get(i);
                        _album.affiche();
                }

        }

	
	public Album getAlbum(int id){
		Album _album = null;
		for(int i=0; i<listAlbums.size() ; i++){
			_album = listAlbums.get(i);
			if(_album.getId() == id){
				break;
			}
		}
		return _album;
	}
}