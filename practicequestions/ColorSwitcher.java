import java.awt.*;
import java.awt.event.*;

public class ColorSwitcher extends Frame implements ActionListener {
    Button btnRed, btnBlue;

    public ColorSwitcher() {
        // Setting Layout to FlowLayout for simple button arrangement
        setLayout(new FlowLayout());

        // Initializing buttons
        btnRed = new Button("Red");
        btnBlue = new Button("Blue");

        // Adding buttons to the frame
        add(btnRed);
        add(btnBlue);

        // Registering the buttons with the ActionListener
        btnRed.addActionListener(this);
        btnBlue.addActionListener(this);

        // Frame properties
        setTitle("Background Color Switcher");
        setSize(400, 400);
        setVisible(true);

        // Closing the window when the 'X' is clicked
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    // Handling button clicks
    public void actionPerformed(ActionEvent e) {
        String label = e.getActionCommand();

        if (label.equals("Red")) {
            setBackground(Color.RED);
        } else if (label.equals("Blue")) {
            setBackground(Color.BLUE);
        }
    }

    public static void main(String[] args) {
        new ColorSwitcher();
    }
}