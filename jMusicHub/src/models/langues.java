package models;

public enum langues{

	FRANCAIS(1, "francais"),
	ANGLAIS(2, "anglais"),
	ITALIEN(3, "italien"),
	ESPAGNOL(4, "espagnol"),
	ALLEMAND(5, "allemand");
	
	private int numero;
	private String langue;

	private langues(int numero, String langue){
		this.numero = numero;
		this.langue = langue;
	}

	public int getNumero(){
		return this.numero;
	}

	public String getLangue(){
		return this.langue;
	}

	public String toString(){
		String s = this.numero+": "+this.langue;
		return s;
	}

}
