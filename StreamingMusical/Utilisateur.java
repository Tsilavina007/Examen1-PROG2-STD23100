package StreamingMusical;

import java.util.ArrayList;

public class Utilisateur extends Personne {

    private ArrayList<Playlist> playlistFavoris;

    public Utilisateur(String nom, String prenom, String dateDeNaissanceString) {
        super(nom, prenom, dateDeNaissanceString);
        this.playlistFavoris = new ArrayList<Playlist>();
    }
    
    public ArrayList<Playlist> getPlaylistFavoris() {
        return this.playlistFavoris;
    }

    public void like(Playlist newPlaylist) {
        if (this.playlistFavoris.indexOf(newPlaylist) < 0 || this.playlistFavoris.isEmpty()) {
            this.playlistFavoris.add(newPlaylist);
        } else {
            this.playlistFavoris.remove(newPlaylist);
        }
    }
}
