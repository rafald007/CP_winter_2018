package pl.waw.sgh.Bank;

import java.math.BigDecimal;

public class DebitAccount extends Account {

    public DebitAccount(Integer accountID, Double balance, String currency, Customer customer) {
        super(accountID, balance, currency, customer);
    }

    public DebitAccount(Integer accountID, Double balance, Customer customer) {
        super(accountID, balance, customer);
    }


}
