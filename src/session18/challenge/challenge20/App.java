package session18.challenge.challenge20;

import session18.challenge.challenge20.models.ListWrapper;

public class App {

    public static void main(String[] args) {
        ListWrapper<String> firstListWrapper = new ListWrapper<>();
        ListWrapper<Integer> secondListWrapper = new ListWrapper<>();

        firstListWrapper.addItem("Mama");
        firstListWrapper.addItem("Tata");

        secondListWrapper.addItem(2);
        secondListWrapper.addItem(5);
        secondListWrapper.addItem(8);

        System.out.println(firstListWrapper.getSize());
        System.out.println(secondListWrapper.getSize());
        System.out.println(" ");

        System.out.println(firstListWrapper.getItemByIndex(1));
        System.out.println(secondListWrapper.getItemByIndex(1));
    }
}
