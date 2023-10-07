package session11_oop_abstraction.challenge.challenge02;

import session11_oop_abstraction.challenge.challenge01.Parent;

public class BankB extends Bank {

    @Override
    public void getBalance() {
        System.out.println("$150");
    }
}

