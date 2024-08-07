package NewStreaming;

import java.util.ArrayList;

public class Playlist {
    private User playlistProp;
    private ArrayList<Song> listSongs;
    private Boolean isLike;

    public Playlist(User playlistProp,ArrayList<Song> listSongs) {
        this.playlistProp = playlistProp;
        this.listSongs = listSongs;
    }

}
