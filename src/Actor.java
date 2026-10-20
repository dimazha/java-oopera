import java.util.Objects;

public class Actor extends Person {
    int height;

    public Actor(String name, String surname, Gender gender, int height) {
        super(name, surname, gender);
        this.height = height;
    }

    @Override
    public String toString() {
        return name + " " + surname + " (рост: " + height + " см)";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        Actor actorForCheck = (Actor) obj;
        return (height == actorForCheck.height) &&
                Objects.equals(name, actorForCheck.name) &&
                Objects.equals(surname, actorForCheck.surname) &&
                Objects.equals(gender, actorForCheck.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, gender, height);
    }
}
