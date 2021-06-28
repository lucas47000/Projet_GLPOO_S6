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



public class PlaylistsList implements Serializable{

	 List<Playlist> listPlaylists = new ArrayList<>();

        public void add(Playlist _playlist){  //pour rajouter une playlist dans la liste
                int id = listPlaylists.size() + 1;
                _playlist.setId(id);
                listPlaylists.add( _playlist);
                Log.log("add playlist");
        }

        public void save(String filePass){  //serialisation
        	Log.log("save playlist");

                ObjectOutputStream oos = null;

                try{
                        final FileOutputStream fichier = new FileOutputStream(filePass);
                        oos = new ObjectOutputStream(fichier);

                        oos.writeObject(listPlaylists);

                        oos.flush();
                        oos.close();
                }
                catch (final java.io.IOException e) {
                        e.printStackTrace();
                }

        }


        public void read(String filePass){  //deserialisation

                System.out.println("read playlist");

                ObjectInputStream oos = null;

                try{
                        final FileInputStream fichier = new FileInputStream(filePass);
                        oos = new ObjectInputStream(fichier);
                        listPlaylists = (ArrayList) oos.readObject();
                        oos.close();
                }
                catch (final java.io.IOException e){
                        e.printStackTrace();
                }
                catch (final Exception e){
                        e.printStackTrace();
                }

        }

        public void affiche(){                  //affiche la liste des playlists
                System.out.println("affiche");
                System.out.println(listPlaylists.size());

                for(int i = 0; i < listPlaylists.size(); i++){
                        Playlist _playlist = listPlaylists.get(i);
                        _playlist.affiche();
                }

        }

	
	public Playlist getPlaylist(int id){
		Playlist _playlist = null;
		for(int i=0; i<listPlaylists.size() ; i++){
			_playlist = listPlaylists.get(i);
			if(_playlist.getId() == id){
				break;
			}
		}
		return _playlist;
	}

	public Playlist getPlaylist(String _nom){
	
		Playlist _playlist = null;
		for(int i=0; i<listPlaylists.size() ; i++){
			_playlist = listPlaylists.get(i);
			if(_playlist.nom() == _nom){
				break;
			}
		}
		return _playlist;
	}
}
