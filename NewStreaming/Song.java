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

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Duration getDurationSong() {
        return durationSong;
    }

    public void setDurationSong(Duration durationSong) {
        this.durationSong = durationSong;
    }

    public ArrayList<Genre> getGenre() {
        return genre;
    }

    public void setGenre(ArrayList<Genre> genre) {
        this.genre = genre;
    }
    
    
}
