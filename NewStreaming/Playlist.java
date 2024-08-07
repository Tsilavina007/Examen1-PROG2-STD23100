package NewStreaming;

import java.util.ArrayList;

public class Playlist {
    private User playlistProp;
    private ArrayList<Song> listSongs;
    private ArrayList<User> listLikeFromUsers;

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


    public void addToPlaylist(Song song) {
        song.addToNewPlaylist(this);
        this.listSongs.add(song);
    }

    public void addToPlaylist(Album album) {
        for (Song song : album.getSongList()) {
            song.addToNewPlaylist(this);
        }
        this.listSongs.addAll(album.getSongList());
    }

    public void removeById(String id) {
        int index = -1;

        for (Song song : this.listSongs) {
            if (song.getId() == id) {
                index = this.listSongs.indexOf(song);
            }
        }
        if (index >= 0) {
            this.listSongs.remove(index);
        } else {
            System.out.println("id introuvable");
        }
    }

    public Playlist exclude(Genre genre) {
        ArrayList<Song> newListSongs = new ArrayList<Song>();
        for (Song song : this.listSongs) {
            if (song.getGenre().contains(genre)) {
                newListSongs.add(song);
            }
        }

        Playlist newPlaylist = new Playlist(this.playlistProp, new ArrayList<Song>());
        for (Song song : newListSongs) {
            newPlaylist.addToPlaylist(song);
        }

        return newPlaylist;
    }

    public void addNewUserLike(User user) {
        this.listLikeFromUsers.add(user);
    }

    public void removeUserLike(User user) {
        this.listLikeFromUsers.remove(user);
    }

    public int getTotalLikes() {
        return this.listLikeFromUsers.size();
    }
}
