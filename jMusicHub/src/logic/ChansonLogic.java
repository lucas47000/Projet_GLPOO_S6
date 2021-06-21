package logic;

import java.util.Scanner;

public class ChansonLogic {
	
	chansons listeChanson = new chansons();
	

	
	private static void newChanson() {
		
		chanson newChanson;
		newChanson = askNewChanson();	
		newChanson.affiche();
		System.out.println("chanson créée");
		listeChanson.add(newChanson);
		
	}
	
	
	
	
	
}
