package session08_array_arraylist_linkedlist_wrapperclass.challenges.challenge10;


import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Journal {
    private ArrayList<Entries> journal = new ArrayList<>();
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public void addEntry(Entries entry) {
        if (journal.size() == 0) {
            journal.add(entry);
        } else {
            int help = 0;
            for (Entries element : journal) {
                if (element.getDate().equals(entry.getDate())) {
                    System.out.println("The date of your entry already exists! The text will be automatically added there.");
                    element.setEntryText(element.getEntryText() + entry.getEntryText());
                    entry.setEntryText(null);
                    help = 1;
//                    break;
                }
            }

            if (help == 0) {
                int secondHelp = 0;
                for (int index = journal.size() - 1; index >= 0; index--) {
                    if (journal.get(index).getDate().toEpochDay() < entry.getDate().toEpochDay()) {
                        secondHelp = index + 1;
                        break;
                    }
                }

                journal.add(secondHelp, entry);
            }
        }
    }


    public void deleteEntry(String date) {
        Entries help = new Entries(null, null);
        for (Entries element : journal) {
            if (element.getDate().format(formatter).equals(date)) {
                help = element;
            } else {
                System.out.println("There is no entry on this date.");
            }
        }
        journal.remove(help);
    }

    public void showAllEntries() {
        for (int index = journal.size() - 1; index >= 0; index--) {
            System.out.println(journal.get(index).getDate().format(formatter) + " : " + journal.get(index).getEntryText());
        }
    }

    public void editEntry(String date, String entryText) {
        for (Entries element : journal) {
            if (element.getDate().format(formatter).equals(date)) {
                element.setEntryText(entryText);
            } else {
                System.out.println("There is no entry on this date.");
            }
        }
    }
}
