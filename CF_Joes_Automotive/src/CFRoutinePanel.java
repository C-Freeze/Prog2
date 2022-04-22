import javax.swing.*;
import javax.swing.border.TitledBorder; //Explicitly import the TitledBorder class
import java.awt.*;
import java.awt.event.*;

public class CFRoutinePanel extends JPanel {

    // Standard Services -
    private JCheckBox oilChange;
    private JCheckBox lubeJob;
    private JCheckBox radiatorFlush;
    private JCheckBox transmissionFlush;
    private JCheckBox inspection;
    private JCheckBox replaceMuffler;
    private JCheckBox tireRotation;

    // Instance Variables
    private double servicesSubTotal;

    public CFRoutinePanel() {

        setBackground(CFColors.COLOR_BACKGROUND);
        setForeground(CFColors.COLOR_TEXT);
        // Set up the labeled border
        TitledBorder border = BorderFactory.createTitledBorder("Routine");
        border.setTitleColor(CFColors.COLOR_TEXT);
        setBorder(border);

        // Set up the check boxes
        oilChange = new StyledCheckBox("Oil Change", 26.00);
        lubeJob = new StyledCheckBox("Lube Job", 18.00);
        radiatorFlush = new StyledCheckBox("Radiator Flush", 30.00);
        transmissionFlush = new StyledCheckBox("Transmission Flush", 80.00);
        inspection = new StyledCheckBox("Inspection", 15.00);
        replaceMuffler = new StyledCheckBox("Replace Muffler", 100.00);
        tireRotation = new StyledCheckBox("Tire Rotation", 20.00);

        // Set up the panel
        setLayout(new GridLayout(0, 2));
        add(oilChange);
        add(lubeJob);
        add(radiatorFlush);
        add(transmissionFlush);
        add(inspection);
        add(replaceMuffler);
        add(tireRotation);

    }

    private class StyledCheckBox extends JCheckBox {
        public StyledCheckBox(String text, double serviceCost) {
            super(String.format("%s - $%.2f", text, serviceCost));
            setBackground(CFColors.COLOR_BACKGROUND);
            setForeground(CFColors.COLOR_TEXT);

            // the listener
            addItemListener(new ItemListener() {
                @Override
                public void itemStateChanged(ItemEvent e) {
                    if (e.getStateChange() == ItemEvent.SELECTED) {
                        // add the price to the subtotal
                        servicesSubTotal += serviceCost;
                    } else {
                        // remove the price from the subtotal
                        servicesSubTotal -= serviceCost;
                    }
                }
            });
        }
    }

    public double getServicesSubTotal() {
        return servicesSubTotal;
    }
}
