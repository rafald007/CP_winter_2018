package pl.waw.sgh.Bank;

public class PlayWithBank {
    public static void main(String[] args) throws NonExistingAccountException {

        Bank bank = new Bank();
        Customer c1 = bank.newCustomer("John", "Smith", "john.smith@gmail.com");
        Customer c2 = bank.newCustomer("Bob", "Brown", "bob.brown@gmail.com");
        Account a1 = bank.newAccount(c1, "Debit");
        Account a2 = bank.newAccount(c1, "Savings");
        Account a3 = bank.newAccount(c1, "");


        Account a4 = bank.newAccount(c2, "Debit");
        Account a5= bank.newAccount(c2, "Savings");


        a1.deposit(21.0);
        a2.deposit(1421.0);
        a3.deposit(1025.0);


        try {
            a1.charge(20.0);
        } catch (NotEnoughMoneyException e) {
            e.printStackTrace();
        }

//        System.out.println(bank);
//        a2.deposit(29.0);

        try {
            bank.transfer(100, 102, 1000.00);
        } catch (NotEnoughMoneyException e) {
            e.printStackTrace();
//            System.out.println("Not enough money... choose other account: ");
//            Account acc = bank.findAccID(100);
//            Integer cust = acc.getCustomer().getCustomerID();
//            cust.getCustomerID();
        }

//        System.out.println(bank);



    }

}
