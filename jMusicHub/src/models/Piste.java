package models;
import java.io.Serializable;


public class Piste implements Serializable{

	char type;
	int id;

	public Piste(char _type, int _id){
		this.type = _type;
		this.id = _id;
	}


	public char getType(){
		return this.type;
	}

	public int getId(){
		return this.id;
	}

}
