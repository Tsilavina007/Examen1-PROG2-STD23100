package StreamingMusical;

import java.util.ArrayList;

public class Album {
    private Artist artist;
    private ArrayList<Chansons> chansonsList;
    
    public Album(Artist artist) {
        this.artist = artist;
        this.chansonsList = new ArrayList<Chansons>();
    }

}
