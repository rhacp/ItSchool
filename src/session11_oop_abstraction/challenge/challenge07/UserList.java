package session11_oop_abstraction.challenge.challenge07;

import java.util.ArrayList;

public class UserList {

    private ArrayList<User> ownerList = new ArrayList();
    private ArrayList<User> familyList = new ArrayList();
    private ArrayList<User> guestList = new ArrayList();

    public void addOwner(User user) {
        if (ownerList.size() == 0) {
            ownerList.add(user);
            System.out.println("Account created!");
        } else {
            int helpCounter = 0;
            for (User element : ownerList) {
                if (element.getName().equals(user.getName())) {
                    System.out.println("This person already has an account. Please try again.");
                    helpCounter = 1;
                    break;
                }
            }

            if (helpCounter == 0) {
                int secondHelp = 0;
                for (int index = ownerList.size() - 1; index >= 0; index--) {
                    if ((ownerList.get(index).getName()).compareToIgnoreCase(user.getName()) < 0) {
                        secondHelp = index + 1;
                        break;
                    }
                }
                ownerList.add(secondHelp, user);
                System.out.println("Account created!");
            }
        }
    }

    public void addFamily(User user) {
        if (familyList.size() == 0) {
            familyList.add(user);
            System.out.println("Account created!");
        } else {
            int helpCounter = 0;
            for (User element : familyList) {
                if (element.getName().equals(user.getName())) {
                    System.out.println("This person already has an account. Please try again.");
                    helpCounter = 1;
                    break;
                }
            }

            if (helpCounter == 0) {
                int secondHelp = 0;
                for (int index = familyList.size() - 1; index >= 0; index--) {
                    if ((familyList.get(index).getName()).compareToIgnoreCase(user.getName()) < 0) {
                        secondHelp = index + 1;
                        break;
                    }
                }
                familyList.add(secondHelp, user);
                System.out.println("Account created!");
            }
        }
    }

    public void addGuest(User user) {
        if (guestList.size() == 0) {
            guestList.add(user);
            System.out.println("Account created!");
        } else {
            int helpCounter = 0;
            for (User element : guestList) {
                if (element.getName().equals(user.getName())) {
                    System.out.println("This person already has an account. Please try again.");
                    helpCounter = 1;
                    break;
                }
            }

            if (helpCounter == 0) {
                int secondHelp = 0;
                for (int index = guestList.size() - 1; index >= 0; index--) {
                    if ((guestList.get(index).getName()).compareToIgnoreCase(user.getName()) < 0) {
                        secondHelp = index + 1;
                        break;
                    }
                }
                guestList.add(secondHelp, user);
                System.out.println("Account created!");
            }
        }
    }

    public boolean checkIfOwner(String username, String password) {

        return true;
    }

    public boolean checkIfFamily(String username, String password) {

        return true;
    }

    public boolean checkIfGuest(String username, String password) {

        return true;
    }

}
