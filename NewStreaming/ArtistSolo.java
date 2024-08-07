package NewStreaming;

public class ArtistSolo extends Artist {

    private String firstName;
    private String lastName;
    private String birthDate;

    public ArtistSolo(String id, String nameArtist, String startDate, String nationality, String firstName, String lastName, String birthDate) {
        super(id, nameArtist, startDate, nationality);
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
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
    
}
