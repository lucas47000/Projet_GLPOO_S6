package logic;
import java.util.Scanner;

public class LivreLogic {
	
	Livres listeLivre = new Livres();
	
	private static void newChanson() {
		Livre newLivre;
		newLivre = askNewLivre();
		newLivre.affiche();
		System.out.println("livre audio créée");
		listeLivre.add(newLivre);
	}
}
