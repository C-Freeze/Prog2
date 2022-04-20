import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class CFTitlePanel extends JPanel {

    public CFTitlePanel(int width, int height) {
        setBackground(CFColors.COLOR_BACKGROUND);
        setForeground(CFColors.COLOR_TEXT);
        setPreferredSize(new Dimension(width, height));

        // Set the layout
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        // Create the title label
        JLabel title = new JLabel("Joe's Automotive");
        title.setFont(new Font("Arial", Font.BOLD, 12));
        title.setForeground(CFColors.COLOR_TEXT);
        title.setBackground(CFColors.COLOR_BACKGROUND);

        // Place the Title label in the first column
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.weightx = 1;
        c.weighty = 1;
        c.fill = GridBagConstraints.BOTH;
        c.anchor = GridBagConstraints.CENTER;
        c.insets = new Insets(0, 0, 0, 0);

        add(title, c);

        // Create the exit button
        JButton exit = new JButton("X");
        exit.setBackground(CFColors.COLOR_EXIT);
        exit.setForeground(CFColors.COLOR_TEXT);
        exit.setBorder(new EmptyBorder(10, 10, 10, 10));
        exit.setSize(new Dimension(height, height));

        // Set the event listener for the exit button
        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        // Place the exit button in the second column
        c.anchor = GridBagConstraints.NORTHEAST;
        c.gridwidth = 1; // Set the width of the button
        c.gridheight = 1; // Set the height of the button
        c.weightx = 0.0; // Set the weight of the button
        c.weighty = 0.0; // Set the weight of the button
        c.insets = new Insets(0, 0, 0, 0); // Set the padding of the button

        add(exit, c);

    }
}
