package models.enumerations;


public enum Genres{

	JAZZ(1, "jazz"),
	CLASSIQUE(2, "classique"),
	HIPHOP(3, "hiphop"),
	ROCK(4, "rock"),
	POP(5, "pop"),
	RAP(6, "rap");

	private int numero;
	private String genre;

	private Genres(int numero, String genre){
		this.numero = numero;
		this.genre = genre;
	}

	public int getNumero(){
		return this.numero;
	}

	public String getGenre(){
		return this.genre;
	}

	public String toString(){
		String s = this.numero +": "+this.genre;
		return s;
	}

}
