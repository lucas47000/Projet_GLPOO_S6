package main;

import interfaces.Menus.MenuPrincipal;
import logic.LivreLogic;
import models.ChansonsList;
import models.LivresList;
import models.logs.Log;


public class MainApp {

//Constructeur===
	public MainApp() {
	} //=============
	
	public static void main(String[] args) {
		
		Log.log("Application start");
		//ChansonsList chansonsList = new ChansonsList();
		//LivresList livresList = new LivresList();
		MenuPrincipal  menuPrincipal = new MenuPrincipal();
		
		//albums listeAlbum = new albums();
	//	playlists listePlaylist = new playlists();
		//chansonsList.read("src\\dao\\data\\saveChanson.data");
		//livresList.read("src\\dao\\data\\saveLivre.data");

		//menuPrincipal.setLivresList(livresList);
		menuPrincipal.menuPrincipal();
		
		
	}

}
