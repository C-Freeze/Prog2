import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder; //Explicitly import the TitledBorder class
import java.awt.*;
import java.awt.event.*;


public class CFTotalPanel extends JPanel{

    public CFTotalPanel(CFRoutinePanel RoutineServices, CFRepairPanel repairCosts){
        setBackground(CFColors.COLOR_BACKGROUND);
        setForeground(CFColors.COLOR_TEXT);
        // Set up the labeled border
        TitledBorder border = BorderFactory.createTitledBorder("Total");
        border.setTitleColor(CFColors.COLOR_TEXT);
        setBorder(border);

        // TextFields
        JTextField subtotal = new JTextField();
        JTextField tax = new JTextField();
        JTextField total = new JTextField();
        JLabel subtotalLabel = new JLabel("Subtotal");
        JLabel taxLabel = new JLabel("Tax");
        JLabel totalLabel = new JLabel("Total");

        // Set up the panel
        setLayout(new GridLayout(3, 2));
        add(subtotalLabel);
        add(subtotal);
        add(taxLabel);
        add(tax);
        add(totalLabel);
        add(total);

        // Set up the event listener for the exit button
        JButton exit = new JButton("X");
        exit.setBackground(CFColors.COLOR_EXIT);
        exit.setForeground(CFColors.COLOR_TEXT);
        exit.setBorder(new EmptyBorder(10, 10, 10, 10));
        exit.setSize(new Dimension(50, 50));

        // Set the event listener for the exit button
        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        // Place the exit button in the second column
        GridBagConstraints c = new GridBagConstraints();
        c.anchor = GridBagConstraints.NORTHEAST;
        c.gridwidth = 1; // Set the width of the button
        c.gridheight = 1; // Set the height of the button
        c.weightx = 0.0; // Set the weight of the button
        c.weighty = 0.0; // Set the weight of the button
        c.insets = new Insets(0, 0, 0, 0);

    }

}
