public class Person {
    public enum Gender {
        MALE, FEMALE
    }

    String name;
    String surname;
    final Gender gender;

    public Person(String name, String surname, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }
}
