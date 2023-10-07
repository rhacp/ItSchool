package session11_oop_abstraction.practice.config_example;

public class ApiService implements Config {

    void fetchData() {
        System.out.println("Fetching data from: " + API_ENDPOINT);
    }
}
