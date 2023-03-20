package homework4;
import java.util.Date;
import java.util.List;

public class Album {

	    private String albumName;
	    private String artistName;
	    private Date releaseDate;
	    private List<Song> songs;

	    public Album(String albumName, String artistName, Date releaseDate, List<Song> songs) {
	        this.albumName = albumName;
	        this.artistName = artistName;
	        this.releaseDate = releaseDate;
	        this.songs = songs;
	    }

	    public String getAlbumName() {
	        return albumName;
	    }

	    public String getArtistName() {
	        return artistName;
	    }

	    public Date getReleaseDate() {
	        return releaseDate;
	    }

	    public List<Song> getSongs() {
	        return songs;
	    }
}
