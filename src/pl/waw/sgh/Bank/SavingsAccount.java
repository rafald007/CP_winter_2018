package pl.waw.sgh.Bank;

public class SavingsAccount extends Account {

    public SavingsAccount(Integer accountID, Double balance, String currency, Customer customer) {
        super(accountID, balance, currency, customer); //runs from the parent class
    }

    public SavingsAccount(Integer accountID, Double balance, Customer customer) {
        super(accountID, balance, customer);
    }
}
