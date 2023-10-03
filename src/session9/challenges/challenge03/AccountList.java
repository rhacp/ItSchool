package session9.challenges.challenge03;

import java.util.ArrayList;

public class AccountList {

    private ArrayList<Account> accountList = new ArrayList();

    public void addAccount(Account account) {
        if (accountList.size() == 0) {
            accountList.add(account);
        } else {
            int helpCounter = 0;
            for (Account element : accountList) {
                if (element.equals(account)) {
                    System.out.println("This person already has an account. Please try again.");
                    helpCounter = 1;
                    break;
                }
            }

            if (helpCounter == 0) {
                int secondHelp = 0;
                for (int index = accountList.size() - 1; index >= 0; index--) {
                    if ((accountList.get(index).getPersonName()).compareToIgnoreCase(account.getPersonName()) < 0) {
                        secondHelp = index + 1;
                        break;
                    }
                }
                accountList.add(secondHelp, account);
            }
        }
    }

    public Account getAccount(String name) {
        int helpCounter = 0;
        for (int index = 0; index < accountList.size(); index++) {
            if ((accountList.get(index).getPersonName()).equals(name)) {
                helpCounter = 1;
                return accountList.get(index);
            }
        }
        if (helpCounter == 0) {
            System.out.println("This person has no account. Try again.");
        }
        return null;
    }

    public void showAllAccounts() {
        for (int index = 0; index < accountList.size(); index++) {
            System.out.println(accountList.get(index).getPersonName() + ", ID: " + accountList.get(index).getId() + ", Sum: " + accountList.get(index).getSum());
        }
    }
}
