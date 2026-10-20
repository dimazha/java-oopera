import java.util.ArrayList;

public class Theatre {

    public static void main(String[] args) {
        //Задача 1
        Actor actor1 = new Actor("Леонардо", "ДиКаприо", Person.Gender.MALE, 170);
        Actor actor2 = new Actor("Мэтью", "МакКонахи", Person.Gender.MALE, 180);
        Actor actor3 = new Actor("Энн", "Хэтэуэй", Person.Gender.FEMALE, 175);

        Director director1 = new Director("Кристофер", "Нолан", Person.Gender.MALE, 10);
        Director director2 = new Director("Кэтрин", "Бигелоу", Person.Gender.FEMALE, 10);

        MusicAuthor musicAuthor1 = new MusicAuthor("Ханс", "Циммер", Person.Gender.MALE);
        Choreographer choreographer1 = new Choreographer("Иван", "Иванов", Person.Gender.MALE);

        //Задача 2
        Show show1 = new Show("Интерстеллар",
                180,
                director1,
                new ArrayList<>());
        Ballet ballet1 = new Ballet("Лебединое озеро",
                120,
                director2,
                new ArrayList<>(),
                musicAuthor1,
                "Акт первый, акт второй",
                choreographer1);
        Opera opera1 = new Opera("Призрак оперы",
                150,
                director1,
                new ArrayList<>(),
                musicAuthor1,
                "Акт первый, акт второй, акт третий",
                12);

        //Задача 3
        show1.addActor(actor1);
        show1.addActor(actor2);
        show1.addActor(actor3);

        ballet1.addActor(actor2);
        ballet1.addActor(actor3);

        opera1.addActor(actor1);
        opera1.addActor(actor3);

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
