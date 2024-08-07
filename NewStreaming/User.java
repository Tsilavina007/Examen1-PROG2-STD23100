package NewStreaming;

import java.util.ArrayList;

public class User {
    private String firstName;
    private String lastName;
    private String birthDate;
    private ArrayList<Playlist> listPlaylists;
 
    public User(String firstName, String lastName, String birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.listPlaylists = new ArrayList<Playlist>();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public void like(Playlist newPlaylist) {
        if (this.listPlaylists.indexOf(newPlaylist) < 0 || this.listPlaylists.isEmpty()) {
            newPlaylist.addNewUserLike(this);
            this.listPlaylists.add(newPlaylist);
        } else {
            newPlaylist.removeUserLike(this);
            this.listPlaylists.remove(newPlaylist);
        }
    }


}
