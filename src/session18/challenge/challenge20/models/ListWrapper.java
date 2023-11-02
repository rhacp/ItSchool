package session18.challenge.challenge20.models;

import java.util.ArrayList;
import java.util.List;

public class ListWrapper<T> {

    private List<T> genericList = new ArrayList();

    public void addItem(T input) {
        genericList.add(input);
    }

    public T getItemByIndex(int index) {
        return genericList.get(index);
    }

    public int getSize() {
        return genericList.size();
    }
}
