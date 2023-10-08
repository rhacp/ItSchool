package session11_oop_abstraction.challenge.challenge07;

import session10_java_oop_inheritance_encapsulation.challenges.challenge07.BankAccount;

import java.util.ArrayList;

public class UserList {

    private ArrayList<User> userList = new ArrayList();

    public void addUser(User user) {
        if (userList.size() == 0) {
            userList.add(user);
            System.out.println("Account created!");
        } else {
            int helpCounter = 0;
            for (User element : userList) {
                if (element.getAccountHolderName().equals(user.getAccountHolderName())) {
                    System.out.println("This person already has an account. Please try again.");
                    helpCounter = 1;
                    break;
                }
            }

            if (helpCounter == 0) {
                int secondHelp = 0;
                for (int index = userList.size() - 1; index >= 0; index--) {
                    if ((userList.get(index).getAccountHolderName()).compareToIgnoreCase(user.getAccountHolderName()) < 0) {
                        secondHelp = index + 1;
                        break;
                    }
                }
                userList.add(secondHelp, user);
                System.out.println("Account created!");
            }
        }
    }


}
