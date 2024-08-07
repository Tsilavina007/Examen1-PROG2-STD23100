package NewStreaming;

import java.util.ArrayList;

import StreamingMusical.Chansons;

public class Artist {
    private String id;
    private String nameArtist;
    private String startDate;
    private String nationality;
    private ArrayList<Album> albumList;

    public Artist(String id, String nameArtist, String startDate, String nationality) {
        this.id = id;
        this.nameArtist = nameArtist;
        this.startDate = startDate;
        this.nationality = nationality;
        this.albumList = new ArrayList<Album>();
    }

    public String getId() {
        return id;
    }

    public String getNameArtist() {
        return nameArtist;
    }

    public void setNameArtist(String nameArtist) {
        this.nameArtist = nameArtist;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public ArrayList<Album> getAlbumList() {
        return albumList;
    }

    public void setAlbumList(ArrayList<Album> albumList) {
        this.albumList = albumList;
    }
    
}
