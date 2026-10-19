import java.util.ArrayList;

public class Ballet extends MusicalShow {
    String choreographer;

    public Ballet(String title, String musicAuthor, String librettoText, int duration, Director director, ArrayList<Actor> listOfActors, String choreographer) {
        super(title, musicAuthor, librettoText, duration, director, listOfActors);
        this.choreographer = choreographer;
    }
}
