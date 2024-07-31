package StreamingMusical;

import java.time.Duration;

public class Chansons {
    private int id;
    private String titre;
    private String genre;
    private Artist artist;
    private int minDuration;
    private int sDuration;

    public Chansons(int id, String titre, String genre, int minDuration,int sDuration, Artist artist) {
        this.id = id;
        this.titre = titre;
        this.genre = genre;
        this.minDuration = minDuration;
        this.sDuration = sDuration;
        this.artist = artist;
    }
    public int getId() {
        return this.id;
    }

    public String getTitre() {
        return this.titre;
    }
    public void setTitre(String titre) {
        this.titre = titre;
    }

    public Artist getArtist() {
        return this.artist;
    }
    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public Duration getDuration() {
        Duration duration = Duration.ofMinutes(this.minDuration).plusSeconds(sDuration);

        return duration;
    }

    public String getGenre() {
        return this.genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void addToPlaylist(Playlist playlist) {
        playlist.addNewChansons(this);
    }


}
