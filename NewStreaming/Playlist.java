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

    public User getPlaylistProp() {
        return playlistProp;
    }

    public void setPlaylistProp(User playlistProp) {
        this.playlistProp = playlistProp;
    }

    public ArrayList<Song> getListSongs() {
        return listSongs;
    }

    public void setListSongs(ArrayList<Song> listSongs) {
        this.listSongs = listSongs;
    }

}
