package NewStreaming;

import java.util.ArrayList;

public class Album {
    private String id;
    private String nameAlbum;
    private String shareDate;
    private Artist artistProps;
    private ArrayList<Song> songList;

    public Album(String id, String nameAlbum, String shareDate, Artist artistProps) {
        this.id = id;
        this.nameAlbum = nameAlbum;
        this.shareDate = shareDate;
        this.artistProps = artistProps;
        this.songList = new ArrayList<Song>();
    }
}
