import javax.swing.*;
import java.awt.*;

public class CFTitlePanel extends JPanel {

    public CFTitlePanel() {
        setBackground(CFColors.COLOR_BACKGROUND);
        setForeground(CFColors.COLOR_TEXT);

        // Create the title label
        JLabel title = new JLabel("Joe's Automotive");
        title.setFont(new Font("Arial", Font.BOLD, 12));
        title.setForeground(CFColors.COLOR_TEXT);
        title.setBackground(CFColors.COLOR_BACKGROUND);

        add(title);
    }
}
