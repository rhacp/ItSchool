package session16.practice;

public class ThreadPractice {

    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println("A new thread has started");
        Thread thread = new Thread(runnable);
        thread.run();
    }
}
