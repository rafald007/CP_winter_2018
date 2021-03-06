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

    private List<Account> custaccList = new ArrayList<>();
    public String findAccCus (Integer accID, Integer toAccID, Double amount) throws NonExistingAccountException {
        custaccList.clear();
        Account Tacc = findAccID(accID);
        Integer cust = Tacc.getCustomer().getCustomerID();
        Integer idkonto = 0;
            for(Customer cus : custList){
                if(cust==cus.getCustomerID()){
                    for (Account acc : accList) {
                        if (acc.getCustomer()==cus) {
                            if (acc.getAccountID() != toAccID) {
                                 if(acc.getBalance().compareTo(new BigDecimal(amount))>=0) {
                                     custaccList.add(acc);

//                                accID=acc.getAccountID();
//                                try {
//                                    transfer(accID,toAccID,amount);
//                                    break;
//                                } catch (NotEnoughMoneyException e) {
//                                    e.printStackTrace();
//                                }
                                 }
                            }
//                            return acc;
                        }
                    }

                }
            }
            String list = custaccList.toString();
            System.out.println(list);
         return list;
//            for(Account subacc:custaccList){
////                return subacc;
////            }

//        throw new NonExistingAccountException("Other account do not exist");
    }


/* Dlaczego w ac nie zapisuje ID, tylko przez cały czas dziaąłnia pozostaje tak jak na początku?
    public Integer findAccID2 (List<Account> listofaccount) {
        Integer ac = 1;
        for (Account acc : listofaccount) {
                ac=acc.getAccountID();
        }
        return ac;
    }
*/

    private int findCurCustIdx(Integer curCustID){
        for(Customer cust : custList) {
            if (cust.getCustomerID().equals(curCustID))
                return custList.indexOf(cust);
        }
        return -1;
    }

    public Customer getPrevCustomer(Integer curCustID){
        int curCustIdx = -1;
        for(Customer cust : custList){
            if(cust.getCustomerID().equals(curCustID))
                custList.indexOf(cust);
        }
        if(curCustID>0)
            return custList.get(curCustIdx-1);
        else
            return null;
    }

    public Customer getNextCustomer (Integer curCustID){
        int curCustIdx = findCurCustIdx(curCustID);
        if(curCustID< custList.size()-1)
            return custList.get(curCustID+1);
        else
            return null;
    }


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
//    public Account reading() {
//        for(Account read:custaccList){
//            System.out.println(read);
//        }
//        try {
//            throw new NonExistingAccountException("THere is no other accounts");
//        } catch (NonExistingAccountException e) {
//            e.printStackTrace();
//        }
//        return null;
//    }


    public void transfer (Integer fromAccID, Integer toAccID, Double amount)throws NonExistingAccountException, NotEnoughMoneyException{
            Account fromAcc = findAccID(fromAccID);
            Account toAcc = findAccID(toAccID);
            if(fromAcc.getBalance().compareTo(new BigDecimal(amount))<0){
                /*Integer a=findAccID2(custaccList);*/
                throw new NotEnoughMoneyException("NO MONEY, PLS GIMME MOAR $$$. Your current balance is: " + fromAcc.getBalance() + " \nChoose other account: " + findAccCus(fromAccID, toAccID, amount) /*+ "\nTransfer made from account ID: " + a +
                        "\n"+ transfer(a,toAccID,amount) + "Current balance is: " + findAccID(a).getBalance()*/ );


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
