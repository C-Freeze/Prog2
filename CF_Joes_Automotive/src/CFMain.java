//CFMain.java

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CFMain extends JFrame {
    public static final int WIDTH = 800;
    public static final int HEIGHT = 600; 

    public CFMain() {
        super("Joe's Automotive"); // Set the window title
        JPanel mainPane = new JPanel();
        
        baseSetup();
        setColors(mainPane);
        
        
        
        // Add the title panel
        mainPane.add(new CFTitlePanel(WIDTH, 20), BorderLayout.NORTH);
        
        add(mainPane);
        setVisible(true);
    }

    private void setColors(Container pane) {
        pane.setBackground(CFColors.COLOR_BACKGROUND);
        pane.setForeground(CFColors.COLOR_TEXT);
    }

    public void baseSetup() {
        setSize(WIDTH, HEIGHT); // Set the window size
        setResizable(false); // Set the window to not be resizable
        setUndecorated(true); // Remove the window decorations, going to use a custom one
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Set the default close operation
        FrameDragListener fdl = new FrameDragListener(this);
        addMouseListener(fdl); //This makes the window draggable
        addMouseMotionListener(fdl);

        // Set the window to be in the center of the screen
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(dim.width / 2 - getSize().width / 2, dim.height / 2 - getSize().height / 2);
    }

    //Sweet, sweet, dragging.
    public static class FrameDragListener extends MouseAdapter {

        private final JFrame frame;
        private Point mouseDownCompCoords = null;

        public FrameDragListener(JFrame frame) {
            this.frame = frame;
        }

        public void mouseReleased(MouseEvent e) {
            mouseDownCompCoords = null;
        }

        public void mousePressed(MouseEvent e) {
            mouseDownCompCoords = e.getPoint();
        }

        public void mouseDragged(MouseEvent e) {
            Point currCoords = e.getLocationOnScreen();
            frame.setLocation(currCoords.x - mouseDownCompCoords.x, currCoords.y - mouseDownCompCoords.y);
        }
    }

    public static void main(String[] args) throws Exception {
        CFMain app = new CFMain();
    }
}
