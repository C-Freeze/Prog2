/*
CFTitlePanel.java
Carter Freeze
4/25/22
So simple it'll blow you mind.
*/
import javax.swing.*;

public class CFTitlePanel extends JPanel {

    public CFTitlePanel() {
        setBackground(CFColors.COLOR_BACKGROUND);
        setForeground(CFColors.COLOR_TEXT);

        // Create the title label
        JLabel title = new CFComponets.StyledLabel("Joe's Automotive");
        add(title);
    }
}
