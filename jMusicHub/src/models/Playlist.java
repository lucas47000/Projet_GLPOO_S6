package models;

public class Playlist {

	private int idPlaylist;
	private String nomPlaylist;
	
	public Playlist(int idPlaylist, String nomPlaylist) {
		
		this.idPlaylist = idPlaylist;
		this.nomPlaylist = nomPlaylist;
	}
	
	public int getIdPlaylist() {
		return idPlaylist;
	}
	
	public void setIdPlaylist(int idPlaylist) {
		this.idPlaylist = idPlaylist;
	}
	
	public String getNomPlaylist() {
		return nomPlaylist;
	}
	
	public void setNomPlaylist(String nomPlaylist) {
		this.nomPlaylist = nomPlaylist;
	}
}
