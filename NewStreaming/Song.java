package NewStreaming;

import java.lang.reflect.Type;
import java.time.Duration;
import java.util.ArrayList;

public class Song {
    private String id;
    private String title;
    private Duration durationSong;
    private ArrayList<Genre> genre;
    private Boolean isSingle;

    public Song(String id, String title, Duration durationSong, ArrayList<Genre> genre) {
        this.id = id;
        this.title = title;
        this.durationSong = durationSong;
        this.genre = genre;
        this.isSingle = true;
    }
}
