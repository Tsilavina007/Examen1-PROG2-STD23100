package StreamingMusical;

import java.util.ArrayList;

public class Playlist {
    private Personne proprietaire;
    private int idChanson;
    private ArrayList<Chansons> chansonsList;

    public Playlist(Personne propietaire) {
        this.proprietaire = propietaire;
        this.chansonsList =  new ArrayList<Chansons>();
    }

    public ArrayList<Chansons> getChansonsList() {
        return this.chansonsList;
    }

    public void addNewChansons(Chansons newChanson) {
        this.chansonsList.add(newChanson);
    }

    public void removeById(int id) {
        int index = -1;
        // Chansons chansonsToRemove ;
        for (Chansons chansons : this.chansonsList) {
            if (chansons.getId() == id) {
                index = this.chansonsList.indexOf(chansons);
            }
        }
        if (index >= 0) {
            this.chansonsList.remove(index);
        } else {
            System.out.println("id introuvable");
        }
    }

    public Playlist exclude(String genre) {
        ArrayList<Chansons> newChansonsList = new ArrayList<Chansons>();
        for (Chansons chansons : this.chansonsList) {
            if (chansons.getGenre() != genre) {
                newChansonsList.add(chansons);
            }
        }

        Playlist newPlaylist = new Playlist(this.proprietaire);
        for (Chansons chansons : newChansonsList) {
            newPlaylist.addNewChansons(chansons);
        }
        
        return newPlaylist;
    }


}
