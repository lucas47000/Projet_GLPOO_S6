package models;
//la classe categories permet de recenser
//
public enum categories{

	JEUNESSSE(1, "jeunesse"),
	ROMAN(2, "roman"),
	THEATRE(3, "theatre"),
	DISCOURS(4, "discours"),
	DOCUMENTAIRE(5, "documentaires");
	
	private int numero;
	private String categorie;

	private categories(int numero, String categorie){
		this.numero = numero;
		this.categorie = categorie;
	}

	public int getNumero(){
		return this.numero;
	}

	public String getCategorie(){
		return this.categorie;
	}

	public String toString(){
		String s = this.numero +": "+this.categorie;
		return s;
	}

}
