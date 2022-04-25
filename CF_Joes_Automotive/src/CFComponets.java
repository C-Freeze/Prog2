
/*
CFComponets.java
Carter Freeze
4/25/22
I keep my compents 
*/
import javax.swing.*;
import java.awt.*;

public class CFComponets {

    public static class StyledLabel extends JLabel {
        public StyledLabel(String text) {
            super(text);
            setBackground(CFColors.COLOR_BACKGROUND);
            setForeground(CFColors.COLOR_TEXT);
            setFont(new Font("Arial", Font.BOLD, 12));
        }
    }

    public static class StyledTextField extends JTextField {
        public StyledTextField() {
            super();
            setBackground(CFColors.COLOR_BACKGROUND);
            setFont(new Font("Arial", Font.BOLD, 12));
            setForeground(CFColors.COLOR_TEXT);
        }
    }

    public static class StyledCheckBox extends JCheckBox {
        public StyledCheckBox(String text, double serviceCost) {
            super(String.format("%s - $%.2f", text, serviceCost));
            setBackground(CFColors.COLOR_BACKGROUND);
            setForeground(CFColors.COLOR_TEXT);
        }
    }
}