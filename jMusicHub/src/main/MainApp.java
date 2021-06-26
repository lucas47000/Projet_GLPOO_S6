package main;

import interfaces.Menus.MenuPrincipal;
import logic.LivreLogic;
import models.ChansonsList;
import models.LivresList;


public class MainApp {

//Constructeur===
	public MainApp() {
	} //=============
	
	public static void main(String[] args) {
		
		ChansonsList chansonsList = new ChansonsList();
		LivresList livresList = new LivresList();
		
		//albums listeAlbum = new albums();
	//	playlists listePlaylist = new playlists();
		chansonsList.read("src\\dao\\data\\saveChanson.data");
		livresList.read("src\\dao\\data\\saveLivre.data");

		
		MenuPrincipal.menuPrincipal();
		
	}

}
