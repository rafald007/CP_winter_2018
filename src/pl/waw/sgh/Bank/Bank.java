package pl.waw.sgh.Bank;

import java.math.BigDecimal;
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
                acc = new CheckingAccount(lastAccID++, 0.0, cust);
        }
        accList.add(acc);
        return acc;


    }

//    private Account findAccCus (Integer cusID){
//
//        for (Account acc : accList){
//
//        }
//        for (Customer cus : custList){
//            if (cusID==cus.getCustomerID()){
//                Account
//
//            }
//        }
//      return
//    }

    public Account findAccID (Integer accID) throws NonExistingAccountException {
        int exist=0;
        // iterate through the account list and return the account with a given id
        for (Account acc : accList) {
            //if(accID.equals(acc.getAccountID()))
            if (accID == acc.getAccountID()) {
                exist=1;
                return acc;
            }


        } throw new NonExistingAccountException("Account id: " + accID + " does not exist!");
        /*if(exist==0) System.out.println("Account id: " + accID + " does not exist!");*/
//        return null;
    }



    public void transfer (Integer fromAccID, Integer toAccID, Double amount)throws NonExistingAccountException, NotEnoughMoneyException{
            Account fromAcc = findAccID(fromAccID);
            Account toAcc = findAccID(toAccID);
            if(fromAcc.getBalance().compareTo(new BigDecimal(amount))<0){
                throw new NotEnoughMoneyException("NO MONEY, PLS GIMME MOAR $$$. Your current balance is: " + fromAcc.getBalance());
             }
            else{
                fromAcc.charge(amount);
                toAcc.deposit(amount);
             }

    }

    @Override
    public String toString() {
        return "Bank{" +
                "cust= \n" + custList +
                ", \naccList= \n" + accList +
                '}';
    }



}
