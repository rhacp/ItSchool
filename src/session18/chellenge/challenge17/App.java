package session18.chellenge.challenge17;

import session18.chellenge.challenge17.models.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {

    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(
                new Person("Mihai", 21, "Metropolis"),
                new Person("Dan", 6, "SouthPark"),
                new Person("Kenny", 19, "metropolis")
        );

        System.out.println(filterPersons(personList, 18, "Metropolis"));
    }

    private static List<Person> filterPersons (List<Person> personList, int age, String city) {
        return personList.stream()
                .filter(person -> person.getAge() < age || person.getCity().equals(city))
                .toList();
    }
}
