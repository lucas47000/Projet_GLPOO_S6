package models;

public class LivreAudio extends Piste {
	
	private String auteurLivreAudio;
	private String langueLivreAudio;
	private String categorieLivreAudio;
	
	public LivreAudio() {
	}
	
	public LivreAudio(String auteurLivreAudio, String langueLivreAudio, String categorieLivreAudio) {
		super();
		this.auteurLivreAudio = auteurLivreAudio;
		this.langueLivreAudio = langueLivreAudio;
		this.categorieLivreAudio = categorieLivreAudio;
	}

	public String getAuteurLivreAudio() {
		return auteurLivreAudio;
	}

	public void setAuteurLivreAudio(String auteurLivreAudio) {
		this.auteurLivreAudio = auteurLivreAudio;
	}

	public String getLangueLivreAudio() {
		return langueLivreAudio;
	}

	public void setLangueLivreAudio(String langueLivreAudio) {
		this.langueLivreAudio = langueLivreAudio;
	}

	public String getCategorieLivreAudio() {
		return categorieLivreAudio;
	}

	public void setCategorieLivreAudio(String categorieLivreAudio) {
		this.categorieLivreAudio = categorieLivreAudio;
	}
}
