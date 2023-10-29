package session17_streams_optional_method_reference.challenge.challenge05;

import session17_streams_optional_method_reference.challenge.challenge05.models.Person;

import java.util.Arrays;
import java.util.List;

public class Challenge05 {

    public static void main(String[] args) {
        Person firstPerson = new Person("Andrei", "Toma", 21);
        Person secondPerson = new Person("Mihai", "Mihnea", 19);
        Person thirdPerson = new Person("Alex", "Marcel", 15);
        Person fourthPerson = new Person("Cristi", "Ionita", 34);
        List<Person> persons = Arrays.asList(firstPerson, secondPerson, thirdPerson, fourthPerson);

        printAdults(persons);
    }

    private static void printAdults(List<Person> personList) {
        List<Person> result = personList.stream()
                .filter(person -> person.getAge() > 17)
                .toList();
        System.out.println("Adults: " + result);
    }
}
