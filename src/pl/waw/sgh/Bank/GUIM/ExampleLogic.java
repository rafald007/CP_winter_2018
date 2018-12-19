package pl.waw.sgh.Bank.GUIM;

import pl.waw.sgh.Bank.Bank;
import pl.waw.sgh.Bank.Customer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExampleLogic extends ExampleUI {

    private Bank bank = new Bank();

    public ExampleLogic() {
        super();
        addNewCustomerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                //formattedTextField1
            }
        });

        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Customer newCust = bank.newCustomer(FirstNameTextField.getText(),
                        LastNameTextField.getText(), emailTF.getText());

            }
        });
        leftbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try{
                    Integer curCustID = Integer.parseInt(customerIDLabel.getText());
                    Customer prevCust = bank.getPrevCustomer(curCustID);
                    displayCustomer(prevCust);
                }
                catch(NumberFormatException e){

                }
            }
        });
        rightbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try{
                    Integer curCustID = Integer.parseInt(customerIDLabel.getText());
                    Customer nextCust = bank.getNextCustomer(curCustID);
                    displayCustomer(nextCust);
                }
                catch(NumberFormatException e){

                }
            }
        });
    }

    public void displayCustomer (Customer cust){
        FirstNameTextField.setText(cust.getFirstName());
        LastNameTextField.setText(cust.getLastName());
        emailTF.setText(cust.getEmail());
        customerIDLabel.setText(cust.getCustomerID().toString());
    }


    public JPanel getCustomerMainPanel() {
        return CustomerMainPanel;
    }

    public static void main(String[] args) {
        JFrame bankFrame = new JFrame("Bank App");
        bankFrame.setSize(500, 400);
        bankFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        ExampleLogic exampleLogic = new ExampleLogic();
        bankFrame.add(exampleLogic.getCustomerMainPanel());
        bankFrame.setVisible(true);


    }
}
