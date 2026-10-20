import java.util.ArrayList;

public class Show {
    String title;
    int duration;
    Director director;
    ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public void printListOfActors() {
        for (Actor actor : listOfActors) {
            System.out.println(actor);
        }
    }

    public void addActor(Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.println("Этот актер уже есть в списке");
        } else {
            listOfActors.add(actor);
            System.out.println("Актер успешно добавлен");
        }
    }

    public void changeActor (Actor newActor, String surname) {
        for (Actor actorInList : listOfActors) {
            if (actorInList.surname.equals(surname)) {
                listOfActors.remove(actorInList);
                listOfActors.add(newActor);
                System.out.println("Актер успешно заменен");
                break;
            } else {
                System.out.println("Актера с такой фамилией нет в списке");
            }
        }
    }
}
