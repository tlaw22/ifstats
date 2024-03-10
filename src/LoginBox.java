
// Importing the necessary packages
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// Creating a class that extends JFrame and implements ActionListener
public class LoginBox extends JFrame implements ActionListener {

    // Declaring the components of the login box
    private JLabel userLabel, passLabel;
    private JTextField userField;
    private JPasswordField passField;
    private JButton loginButton, cancelButton;

    // Creating a constructor for the login box
    public LoginBox() {
        // Setting the title, size, layout, and location of the login box
        super("Login Box");
        setSize(300, 150);
        setLayout(new GridLayout(3, 2));
        setLocationRelativeTo(null);

        // Initializing the components of the login box
        userLabel = new JLabel("Username:");
        passLabel = new JLabel("Password:");
        userField = new JTextField();
        passField = new JPasswordField();
        loginButton = new JButton("Login");
        cancelButton = new JButton("Cancel");

        // Adding action listeners to the buttons
        loginButton.addActionListener(this);
        cancelButton.addActionListener(this);

        // Adding the components to the login box
        add(userLabel);
        add(userField);
        add(passLabel);
        add(passField);
        add(loginButton);
        add(cancelButton);

        // Setting the default close operation and the visibility of the login box
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    // Overriding the actionPerformed method to handle the button clicks
    @Override
    public void actionPerformed(ActionEvent e) {
        // Getting the source of the action event
        Object source = e.getSource();

        // If the login button is clicked
        if (source == loginButton) {
            // Getting the username and password entered by the user
            String username = userField.getText();
            String password = new String(passField.getPassword());

            // Checking if the username and password are valid
            // For simplicity, we assume that the valid username and password are "admin"
            // and "1234"

            if (username.equals("admin") && password.equals("1234")) {
                // If the login is successful, show a message dialog and dispose the login box
                JOptionPane.showMessageDialog(this, "Login successful!");
                dispose();
            } else {
                // If the login is unsuccessful, show a message dialog and clear the fields
                JOptionPane.showMessageDialog(this, "Invalid username or password!");
                userField.setText("");
                passField.setText("");
            }
        }

        // If the cancel button is clicked
        if (source == cancelButton) {
            // Dispose the login box
            dispose();
        }
    }

    // Creating a main method to test the login box
    public static void main(String[] args) {
        // Creating an instance of the login box
        LoginBox loginBox = new LoginBox();
    }
}