package session11_oop_abstraction.practice.data_transfer_information;

import java.util.List;

public abstract class Report {

    private String title;
    private List<String> data;

    public abstract void showPreview();

    public void displayMetadata() {
        System.out.println("Title: " + title);
    }
}
