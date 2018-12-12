package pl.waw.sgh.Bank;

public class NonExistingAccountException extends BankException {

    private Integer accountID;

    public NonExistingAccountException(String message) {
        super(message);
    }

    public NonExistingAccountException(Integer accountID){
        super("No such account exists, requested account ID is: " + accountID);
        this.accountID=accountID;
    }

}
