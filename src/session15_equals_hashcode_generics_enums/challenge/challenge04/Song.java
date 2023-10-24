package session15_equals_hashcode_generics_enums.challenge.challenge04;

import java.time.LocalTime;
import java.util.Objects;

public class Song {

    private String title;
    private String artist;
    private LocalTime length;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
        System.out.println("Title set to: " + title);
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
        System.out.println("Artist set to: " + artist);
    }

    public LocalTime getLength() {
        return length;
    }

    public void setLength(LocalTime length) {
        this.length = length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return Objects.equals(getTitle(), song.getTitle()) && Objects.equals(getArtist(), song.getArtist());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), getArtist());
    }
}
