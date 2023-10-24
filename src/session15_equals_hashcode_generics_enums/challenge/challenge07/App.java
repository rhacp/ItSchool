package session15_equals_hashcode_generics_enums.challenge.challenge07;

public class App {

    public static void main(String[] args) {
        DatabaseEntity firstData = new DatabaseEntity();
        System.out.println("FirstData entry created: ");
        firstData.setId("23445689");
        firstData.setName("First entry.");
        System.out.println("");

        DatabaseEntity secondData = new DatabaseEntity();
        System.out.println("SecondData entry created: ");
        secondData.setId("23445689");
        secondData.setName("Second entry.");
        System.out.println("");

        System.out.println("firstData equals secondData: " + firstData.equals(secondData));
        System.out.println("firstData hashCode: " + firstData.hashCode());
        System.out.println("secondData hashCode: " + secondData.hashCode());
        System.out.println("");

        System.out.println("SecondData: ");
        secondData.setName("First entry.");
        secondData.setId("abcdefgh");
        System.out.println("");

        System.out.println("firstData equals secondData: " + firstData.equals(secondData));
        System.out.println("firstData hashCode: " + firstData.hashCode());
        System.out.println("secondData hashCode: " + secondData.hashCode());
    }
}
