package pl.waw.sgh.Bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private List<Customer> custList = new ArrayList<>();

    private List<Account> accList = new ArrayList<>();

    private Integer lastCustID = 0;

    private Integer lastAccID = 100;
    // Public API
    public Customer newCustomer(String firstName,
                                String lastName,
                                String email) {
        Customer cust = new Customer(lastCustID++, firstName, lastName, email);

        custList.add(cust);
        return cust;
    }

    public Account newAccount(Customer cust, String accType) {
        Account acc;
        switch (accType) {
            case "Savings":
                acc = new SavingsAccount(lastAccID++, 0.0, cust);
                break;
            case "Debit":
                acc = new DebitAccount(lastAccID++, 0.0, cust);
                break;
            default:
                acc = new CheckingAccount(lastAccID, 0.0, cust);
        }
        accList.add(acc);
        return acc;


    }

    private Account findAccID (Integer accID){
        // iterate through the account list and return the account with a given id
          for (Account acc : accList) {
            //if(accID.equals(acc.getAccountID()))
            if (accID == acc.getAccountID()) {
                return acc;
            }

        }
        return null;
    }

    public void transfer (Integer fromAccID, Integer toAccID, Double amount){
            Account fromAcc = findAccID(fromAccID);
            Account toAcc = findAccID(toAccID);
            fromAcc.charge(amount);
            toAcc.deposit(amount);
    }

    @Override
    public String toString() {
        return "Bank{" +
                "cust= \n" + custList +
                ", \naccList= \n" + accList +
                '}';
    }
}
