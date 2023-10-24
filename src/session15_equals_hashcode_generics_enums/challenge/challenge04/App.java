package session15_equals_hashcode_generics_enums.challenge.challenge04;

public class App {

    public static void main(String[] args) {
        Song firstSong = new Song();
        System.out.println("First song created:");
        firstSong.setTitle("You Know You're Right");
        firstSong.setArtist("Nirvana");
        System.out.println("");

        Song secondSong = new Song();
        System.out.println("Second song created:");
        secondSong.setTitle("You Know You're Right");
        secondSong.setArtist("Nirvana");
        System.out.println("");

        System.out.println("firstSong equals secondSong: " + firstSong.equals(secondSong));
        System.out.println("firstSong hashCode: " + firstSong.hashCode());
        System.out.println("secondSong hashCode: " + secondSong.hashCode());
    }
}
