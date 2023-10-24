package session15_equals_hashcode_generics_enums.challenge.challenge02;

public class App {

    public static void main(String[] args) {
        Person firstPerson = new Person();
        System.out.println("First person created:");
        firstPerson.setAge((short)10);
        firstPerson.setName("Marcel");
        System.out.println("");

        Person secondPerson = new Person();
        System.out.println("Second person created:");
        secondPerson.setAge((short)10);
        secondPerson.setName("Marcel");
        System.out.println("");

        System.out.println("firstPerson equals secondPerson: " + firstPerson.equals(secondPerson));
        System.out.println("firstPerson hashcode: " + firstPerson.hashCode());
        System.out.println("secondPerson hashcode: " + secondPerson.hashCode());
    }
}
