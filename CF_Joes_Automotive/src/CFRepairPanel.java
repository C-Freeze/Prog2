import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class CFRepairPanel extends JPanel {

    private JTextField parts;
    private JTextField labor;

    public CFRepairPanel() {
        setBackground(CFColors.COLOR_BACKGROUND);
        setForeground(CFColors.COLOR_TEXT);
        // Set up the labeled border
        TitledBorder border = BorderFactory.createTitledBorder("Non-Routine Repairs");
        border.setTitleColor(CFColors.COLOR_TEXT);
        setBorder(border);

        // TextFields
        parts = new StyledTextField();
        labor = new StyledTextField();
        JLabel partsLabel = new StyledLabel("Parts Cost   ");
        JLabel laborLabel = new StyledLabel("Labor Hours  ");

        // Set up the panel
        setLayout(new GridLayout(2, 2));
        add(partsLabel);
        add(parts);
        add(laborLabel);
        add(labor);
    }

    private class StyledLabel extends JLabel {
        public StyledLabel(String text) {
            super(text);
            setBackground(CFColors.COLOR_BACKGROUND);
            setForeground(CFColors.COLOR_TEXT);
        }

    }

    private class StyledTextField extends JTextField {
        public StyledTextField() {
            super();
            setBackground(CFColors.COLOR_BACKGROUND);
            setForeground(CFColors.COLOR_TEXT);
        }
    }

    public double getNonRoutineSubTotal() {
        try {
            
            double partsCost = Double.parseDouble(parts.getText());
            double laborHours = Double.parseDouble(labor.getText());
            return partsCost + (laborHours * 20.00); // Yes I am aware that this is a magic number,
                                                     // yes I am hardcoding it,
                                                     // yes I am both the pricing department and the programmer
        } catch (Exception e) {
            return 0.0;
        }
    }
}