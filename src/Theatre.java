import java.util.ArrayList;
import java.util.List;

public class Theatre {

    public static void main(String[] args) {
        //Задача 1
        Actor actor1 = new Actor("Леонардо", "ДиКаприо", Person.Gender.MALE, 170);
        Actor actor2 = new Actor("Мэтью", "МакКонахи", Person.Gender.MALE, 180);
        Actor actor3 = new Actor("Энн", "Хэтэуэй", Person.Gender.FEMALE, 175);

        Director director1 = new Director("Кристофер", "Нолан", Person.Gender.MALE, 10);
        Director director2 = new Director("Кэтрин", "Бигелоу", Person.Gender.FEMALE, 10);

        //Задача 2
        Show show1 = new Show("Интерстеллар",
                180,
                director1,
                new ArrayList<>());
        Ballet ballet1 = new Ballet("Лебединое озеро",
                120,
                director2,
                new ArrayList<>(),
                "П. Чайковский",
                "Акт первый, акт второй",
                "Иван Иванов");
        Opera opera1 = new Opera("Призрак оперы",
                150,
                director1,
                new ArrayList<>(),
                "Х. Циммер",
                "Акт первый, акт второй, акт третий",
                12);

        //Задача 3
        show1.listOfActors.add(actor1);
        show1.listOfActors.add(actor2);
        show1.listOfActors.add(actor3);

        ballet1.listOfActors.add(actor2);
        ballet1.listOfActors.add(actor3);

        opera1.listOfActors.add(actor1);
        opera1.listOfActors.add(actor3);

        //Задача 4
        show1.printListOfActors();
        ballet1.printListOfActors();
        opera1.printListOfActors();

        //Задача 5
        opera1.changeActor(actor2, "ДиКаприо");
        opera1.printListOfActors();

        //Задача 6
        opera1.changeActor(actor1, "Депп");
        opera1.printListOfActors();

        //Задача 7
        opera1.printlibrettoText();
        ballet1.printlibrettoText();

    }
}
