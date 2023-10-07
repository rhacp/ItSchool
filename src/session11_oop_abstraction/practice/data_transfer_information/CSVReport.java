package session11_oop_abstraction.practice.data_transfer_information;

public class CSVReport extends Report implements CSVExportable{

    @Override
    public void showPreview() {

    }

    @Override
    public void displayMetadata() {
        super.displayMetadata();
    }

    @Override
    public void exportToCSV() {

    }
}
