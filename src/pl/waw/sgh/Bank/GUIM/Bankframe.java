package pl.waw.sgh.Bank.GUIM;

import javax.swing.*;
import java.awt.*;

public class Bankframe {
    public static void main(String[] args) {

            JFrame bankFrame = new JFrame("Bank App");
            bankFrame.setSize(1000, 700);
            bankFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

            //bankFrame.setBackground(Color.GREEN);
            bankFrame.setMinimumSize(new Dimension(800, 600));
            JPanel myPanel = new JPanel();
            myPanel.add(new JLabel("My first label"));
            bankFrame.add(myPanel);
            bankFrame.setLayout(new FlowLayout());
            bankFrame.setVisible(true);


    }

}
