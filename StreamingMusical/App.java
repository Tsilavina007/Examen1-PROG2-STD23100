package StreamingMusical;

/**
 * App
 */
public class App {

    public static void main(String[] args) {
        Personne utilisateur1 = new Personne("tsong", "Andria", "13-11-2025");
        Artist artist1 = new Artist("Agrad", "Ofisialy", "27-08-2002");
        Chansons chanson1 = new Chansons(1,"titre 1", "Metal", 4, 32, artist1);
        Chansons chanson2 = new Chansons(2,"titre 1", "Metal1", 4, 32, artist1);
        // System.out.println(chanson1.getDuration());

        Playlist playlist1 = new Playlist(utilisateur1);
        // playlist1.addNewChansons(chanson1);
        chanson1.addToPlaylist(playlist1);
        chanson2.addToPlaylist(playlist1);

        System.out.println(playlist1.getChansonsList());
        // playlist1.removeById(1);

        Playlist newPlaylist = playlist1.exclude("Metal") ;
        System.out.println(newPlaylist.getChansonsList());

    }
}