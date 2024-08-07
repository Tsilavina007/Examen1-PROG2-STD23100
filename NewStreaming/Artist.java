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


}
