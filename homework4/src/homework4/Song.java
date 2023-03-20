package homework4;

public class Song {

	private String name;
    private String artist;
    private Album album;
    private int length;

    public Song(String name, String artist, Album album, int length) {
        this.name = name;
        this.artist = artist;
        this.album = album;
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public String getArtist() {
        return artist;
    }

    public Album getAlbum() {
        return album;
    }

    public int getLength() {
        return length;
    }
}
