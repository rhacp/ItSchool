package session11_oop_abstraction.challenge.challenge07.user;

public interface UserID {

    /***
     * In Java , interface doesn't allow you to declare any instance variables.
     * Using a variable declared in an interface as an instance variable will return a compile time error.
     * You can declare a constant variable, using static final which is different from an instance variable.
     */
    void setUserId();
}
