package NewStreaming;

import java.util.ArrayList;

public class Album {
    private String id;
    private String nameAlbum;
    private String shareDate;
    private Artist artistProp;
    private ArrayList<Song> songList;

    public Album(String id, String nameAlbum, String shareDate, Artist artistProp) {
        this.id = id;
        this.nameAlbum = nameAlbum;
        this.shareDate = shareDate;
        this.artistProp = artistProp;
        this.songList = new ArrayList<Song>();
    }

    public String getId() {
        return id;
    }

    public String getNameAlbum() {
        return nameAlbum;
    }

    public void setNameAlbum(String nameAlbum) {
        this.nameAlbum = nameAlbum;
    }

    public String getShareDate() {
        return shareDate;
    }

    public void setShareDate(String shareDate) {
        this.shareDate = shareDate;
    }

    public Artist getArtistProp() {
        return artistProp;
    }

    public void setArtistProp(Artist artistProp) {
        this.artistProp = artistProp;
    }

    public ArrayList<Song> getSongList() {
        return songList;
    }

    public void setSongList(ArrayList<Song> songList) {
        this.songList = songList;
    }

}
