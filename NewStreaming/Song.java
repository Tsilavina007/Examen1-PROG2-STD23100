package NewStreaming;

import java.time.Duration;
import java.util.ArrayList;

public class Song {
    private String id;
    private String title;
    private Duration durationSong;
    private ArrayList<Genre> genre;
    private Boolean isSingle;
    private ArrayList<Playlist> listPlaylistForThisSong;
    private Album album;

    public Song(String id, String title, Duration durationSong, ArrayList<Genre> genre) {
        this.id = id;
        this.title = title;
        this.durationSong = durationSong;
        this.genre = genre;
        this.isSingle = true;
        this.listPlaylistForThisSong = new ArrayList<Playlist>();
        this.album = null;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Duration getDurationSong() {
        return durationSong;
    }

    public void setDurationSong(Duration durationSong) {
        this.durationSong = durationSong;
    }

    public ArrayList<Genre> getGenre() {
        return genre;
    }

    public void setGenre(ArrayList<Genre> genre) {
        this.genre = genre;
    }
    
    public Boolean getIsSingle() {
        return isSingle;
    }

    public void setIsSingle(Boolean isSingle) {
        this.isSingle = isSingle;
    }

    public ArrayList<Playlist> getListPlaylistForThisSong() {
        return listPlaylistForThisSong;
    }

    public Album getAlbum() {
        return this.album;
    }
    public void setAlbum(Album album) {
        this.album = album;
    }

    public void addToNewPlaylist(Playlist playlist) {
        this.listPlaylistForThisSong.add(playlist);
    }

    public int getNumberOfPlaylistIncludeThisSong() {
        return this.listPlaylistForThisSong.size();
    }

    
}
