package session11_oop_abstraction.challenge.challenge03;

import session10_java_oop_inheritance_encapsulation.challenges.challenge07.AccountList;
import session10_java_oop_inheritance_encapsulation.challenges.challenge07.BankAccount;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        A testStudent = new A(110, 50, 60);
        //test

        A firstStudent = new A(100, 50, 60);
        B secondStudent = new B(100, 90, 30, 40);
        System.out.println("");

        System.out.println("The percentage of the first student is: " + firstStudent.getPercentage());
        System.out.println("The percentage of the second student is: " + secondStudent.getPercentage());
    }
}
