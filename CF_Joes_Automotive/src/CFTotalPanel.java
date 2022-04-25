/*
CFTotalPanel.java
Carter Freeze
4/25/22
The total panel, shows calculations 
*/

import javax.swing.*;
import javax.swing.border.TitledBorder; //Explicitly import the TitledBorder class
import java.awt.*;

public class CFTotalPanel extends JPanel {

    public JTextField subtotal;
    public JTextField tax;
    public JTextField total;

    public CFTotalPanel() {
        setBackground(CFColors.COLOR_BACKGROUND);
        setForeground(CFColors.COLOR_TEXT);
        // Set up the labeled border
        TitledBorder border = BorderFactory.createTitledBorder("Total");
        border.setTitleColor(CFColors.COLOR_TEXT);
        setBorder(border);

        // TextFields
        subtotal = new CFComponets.StyledTextField();
        tax = new CFComponets.StyledTextField();
        total = new CFComponets.StyledTextField();

        JLabel subtotalLabel = new CFComponets.StyledLabel("Subtotal");
        JLabel taxLabel = new CFComponets.StyledLabel("Tax");
        JLabel totalLabel = new CFComponets.StyledLabel("Total");

        // Set up the panel
        setLayout(new GridLayout(3, 2));
        add(subtotalLabel);
        add(subtotal);
        add(taxLabel);
        add(tax);
        add(totalLabel);
        add(total);

    }

    public void setSubtotal(double d) {
        subtotal.setText(String.format("$%.2f", d));
    }

    public void setUI(double d) {
        tax.setText(String.format("$%.2f", d));
    }

    public void setTotal(double d) {
        total.setText(String.format("$%.2f", d));
    }

}
