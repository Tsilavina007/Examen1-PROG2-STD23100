package NewStreaming;

import java.util.ArrayList;

public class ArtistGroup extends Artist {

    private ArrayList<ArtistSolo> listGroupArtist;

    public ArtistGroup(String id, String nameArtist, String startDate, String nationality, ArrayList<ArtistSolo> listGroupArtist) {
        super(id, nameArtist, startDate, nationality);
        this.listGroupArtist = listGroupArtist;
    }

    public ArrayList<ArtistSolo> getListGroupArtist() {
        return listGroupArtist;
    }

    public void setListGroupArtist(ArrayList<ArtistSolo> listGroupArtist) {
        this.listGroupArtist = listGroupArtist;
    }
    
}
