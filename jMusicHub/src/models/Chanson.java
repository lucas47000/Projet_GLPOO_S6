package models;

public class Chanson extends Piste {

	private String artisteChanson;
	private String genreChanson;
	private String dateSortieChanson;
	
	public Chanson() {		
	}
	
	public Chanson(String artisteChanson, String genreChanson, String dateSortieChanson) {
		super();
		this.artisteChanson = artisteChanson;
		this.genreChanson = genreChanson;
		this.dateSortieChanson = dateSortieChanson;
	}

	public String getArtisteChanson() {
		return artisteChanson;
	}

	public void setArtisteChanson(String artisteChanson) {
		this.artisteChanson = artisteChanson;
	}

	public String getGenreChanson() {
		return genreChanson;
	}

	public void setGenreChanson(String genreChanson) {
		this.genreChanson = genreChanson;
	}

	public String getDateSortieChanson() {
		return dateSortieChanson;
	}

	public void setDateSortieChanson(String dateSortieChanson) {
		this.dateSortieChanson = dateSortieChanson;
	}
}
