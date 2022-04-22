//CFMain.java

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CFMain extends JFrame {
    public static final int WIDTH = 600;
    public static final int HEIGHT = 200;

    public CFMain() {
        super("Joe's Automotive"); // Set the window title
        JPanel mainPane = new JPanel();
        mainPane.setLayout(new GridLayout(1, 3));

        baseSetup();
        setColors(mainPane);
        setLayout(new BorderLayout());
        mainPane.setLayout(new GridLayout(1,3));
        // create the subpanels
        // mainPane.add(new CFTitlePanel(WIDTH, 20), BorderLayout.NORTH);
        CFRoutinePanel sp = new CFRoutinePanel(); // Routine services
        CFRepairPanel rp = new CFRepairPanel();
        CFTotalPanel tp = new CFTotalPanel(sp, rp);
        CFTitlePanel tp2 = new CFTitlePanel(WIDTH, 20);
        JButton magicButton = new JButton("Calculate");
        magicButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double subTotal = sp.getServicesSubTotal() + rp.getNonRoutineSubTotal();
                System.out.println("Subtotal: " + subTotal);
            }
        });

        // mainPane.add(new CFTotalPanel(), BorderLayout.SOUTH);

        mainPane.add(rp);
        mainPane.add(sp);
        mainPane.add(tp);
        add(tp2, BorderLayout.NORTH);
        add(magicButton, BorderLayout.SOUTH);
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
        addMouseListener(fdl); // This makes the window draggable
        addMouseMotionListener(fdl);

        // Set the window to be in the center of the screen
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(dim.width / 2 - getSize().width / 2, dim.height / 2 - getSize().height / 2);
    }

    // Sweet, sweet, dragging.
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
