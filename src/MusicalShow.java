import java.util.ArrayList;

public class MusicalShow extends Show {
    String musicAuthor;
    String librettoText;

    public MusicalShow(String title, String musicAuthor, String librettoText, int duration, Director director, ArrayList<Actor> listOfActors) {
        super(title, duration, director, listOfActors);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }
}
