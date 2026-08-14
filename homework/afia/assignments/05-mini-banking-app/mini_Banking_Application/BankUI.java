package mini_Banking_Application;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class BankUI extends JFrame {

    // Uses your existing BankApplication class
    private final BankApplication bankApp = new BankApplication();

    private final CardLayout cardLayout = new CardLayout();
    private final JPanel mainPanel = new JPanel(cardLayout);

    // Registration fields
    private JTextField nameField;
    private JTextField emailField;
    private JPasswordField createPinField;

    private JLabel nameErrorLabel;
    private JLabel emailErrorLabel;
    private JLabel pinErrorLabel;

    // Login
    private JPasswordField loginPinField;
    private JLabel loginErrorLabel;

    // Dashboard
    private JLabel nameLabel;
    private JLabel emailLabel;
    private JLabel accountNumberLabel;
    private JLabel balanceLabel;
    private JLabel transactionMessageLabel;

    private JTextField amountField;

    public BankUI() {

        setTitle("Mini Banking Application");
        setSize(600, 580);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mainPanel.add(createWelcomePanel(), "WELCOME");
        mainPanel.add(createRegistrationPanel(), "REGISTER");
        mainPanel.add(createLoginPanel(), "LOGIN");
        mainPanel.add(createDashboardPanel(), "DASHBOARD");

        add(mainPanel);

        cardLayout.show(mainPanel, "WELCOME");
    }

    // =====================================================
    // WELCOME SCREEN
    // =====================================================

    private JPanel createWelcomePanel() {

        JPanel panel = new JPanel(new BorderLayout(20, 20));
        panel.setBorder(BorderFactory.createEmptyBorder(90, 80, 90, 80));
        panel.setBackground(new Color(235, 243, 252));

        JLabel title = new JLabel("Welcome to Mini Bank");
        title.setHorizontalAlignment(SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 29));

        JButton registerButton = new JButton("Create New Account");
        JButton loginButton = new JButton("Login");

        registerButton.setFont(new Font("Arial", Font.BOLD, 17));
        loginButton.setFont(new Font("Arial", Font.BOLD, 17));

        JPanel buttonPanel = new JPanel(new GridLayout(2, 1, 15, 15));
        buttonPanel.setOpaque(false);

        buttonPanel.add(registerButton);
        buttonPanel.add(loginButton);

        registerButton.addActionListener(e -> {

            clearRegistrationFields();

            cardLayout.show(mainPanel, "REGISTER");

            nameField.requestFocus();
        });

        loginButton.addActionListener(e -> {

            // The program only remembers a user during the current run
            if (bankApp.user == null) {

                JOptionPane.showMessageDialog(
                        this,
                        "No registered user found.\n"
                                + "Please create an account first."
                );

                return;
            }

            loginPinField.setText("");
            loginErrorLabel.setText(" ");

            cardLayout.show(mainPanel, "LOGIN");

            loginPinField.requestFocus();
        });

        panel.add(title, BorderLayout.NORTH);
        panel.add(buttonPanel, BorderLayout.CENTER);

        return panel;
    }

    // =====================================================
    // REGISTRATION SCREEN
    // =====================================================

    private JPanel createRegistrationPanel() {

        JPanel panel = new JPanel(new BorderLayout(15, 15));
        panel.setBorder(BorderFactory.createEmptyBorder(25, 45, 25, 45));
        panel.setBackground(new Color(235, 243, 252));

        JLabel title = new JLabel("Create Your Bank Account");
        title.setHorizontalAlignment(SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 26));

        JPanel formPanel = new JPanel(new GridLayout(9, 1, 5, 5));
        formPanel.setOpaque(false);

        nameField = new JTextField();

        nameErrorLabel = createErrorLabel();

        emailField = new JTextField();

        emailErrorLabel = createErrorLabel();

        createPinField = new JPasswordField();

        pinErrorLabel = createErrorLabel();

        formPanel.add(new JLabel("Name:"));
        formPanel.add(nameField);
        formPanel.add(nameErrorLabel);

        formPanel.add(new JLabel("Email:"));
        formPanel.add(emailField);
        formPanel.add(emailErrorLabel);

        formPanel.add(new JLabel("Create 4-Digit PIN:"));
        formPanel.add(createPinField);
        formPanel.add(pinErrorLabel);

        JButton backButton = new JButton("Back");
        JButton registerButton = new JButton("Register");

        registerButton.setFont(new Font("Arial", Font.BOLD, 16));

        JPanel buttonPanel = new JPanel(new GridLayout(1, 2, 10, 10));
        buttonPanel.setOpaque(false);

        buttonPanel.add(backButton);
        buttonPanel.add(registerButton);

        backButton.addActionListener(e ->
                cardLayout.show(mainPanel, "WELCOME")
        );

        registerButton.addActionListener(e -> registerUser());

        // Enter moves to the next field
        nameField.addActionListener(e ->
                emailField.requestFocus()
        );

        emailField.addActionListener(e ->
                createPinField.requestFocus()
        );

        // Enter in PIN field performs registration
        createPinField.addActionListener(e ->
                registerUser()
        );

        panel.add(title, BorderLayout.NORTH);
        panel.add(formPanel, BorderLayout.CENTER);
        panel.add(buttonPanel, BorderLayout.SOUTH);

        return panel;
    }

    // =====================================================
    // LOGIN SCREEN
    // =====================================================

    private JPanel createLoginPanel() {

        JPanel panel = new JPanel(new BorderLayout(20, 20));
        panel.setBorder(BorderFactory.createEmptyBorder(90, 80, 90, 80));
        panel.setBackground(new Color(235, 243, 252));

        JLabel title = new JLabel("Account Login");
        title.setHorizontalAlignment(SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 28));

        JPanel formPanel = new JPanel(new GridLayout(3, 1, 8, 8));
        formPanel.setOpaque(false);

        loginPinField = new JPasswordField();
        loginErrorLabel = createErrorLabel();

        formPanel.add(new JLabel("Enter Your PIN:"));
        formPanel.add(loginPinField);
        formPanel.add(loginErrorLabel);

        JButton backButton = new JButton("Back");
        JButton loginButton = new JButton("Login");

        loginButton.setFont(new Font("Arial", Font.BOLD, 16));

        JPanel buttonPanel = new JPanel(new GridLayout(1, 2, 10, 10));
        buttonPanel.setOpaque(false);

        buttonPanel.add(backButton);
        buttonPanel.add(loginButton);

        backButton.addActionListener(e ->
                cardLayout.show(mainPanel, "WELCOME")
        );

        loginButton.addActionListener(e -> loginUser());

        loginPinField.addActionListener(e -> loginUser());

        panel.add(title, BorderLayout.NORTH);
        panel.add(formPanel, BorderLayout.CENTER);
        panel.add(buttonPanel, BorderLayout.SOUTH);

        return panel;
    }

    // =====================================================
    // DASHBOARD SCREEN
    // =====================================================

    private JPanel createDashboardPanel() {

        JPanel panel = new JPanel(new BorderLayout(15, 15));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 30, 20, 30));
        panel.setBackground(new Color(235, 243, 252));

        JLabel title = new JLabel("Mini Bank Dashboard");
        title.setHorizontalAlignment(SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 26));

        JPanel informationPanel =
                new JPanel(new GridLayout(4, 1, 7, 7));

        informationPanel.setBorder(
                BorderFactory.createTitledBorder("Account Information")
        );

        nameLabel = new JLabel("Name:");
        emailLabel = new JLabel("Email:");
        accountNumberLabel = new JLabel("Account Number:");
        balanceLabel = new JLabel("Balance: $0.00");

        balanceLabel.setFont(new Font("Arial", Font.BOLD, 21));

        informationPanel.add(nameLabel);
        informationPanel.add(emailLabel);
        informationPanel.add(accountNumberLabel);
        informationPanel.add(balanceLabel);

        amountField = new JTextField();

        JButton depositButton = new JButton("Deposit");
        JButton withdrawButton = new JButton("Withdraw");
        JButton showBalanceButton = new JButton("Show Balance");
        JButton logoutButton = new JButton("Logout");

        JPanel transactionPanel =
                new JPanel(new GridLayout(3, 2, 10, 10));

        transactionPanel.setBorder(
                BorderFactory.createTitledBorder("Transactions")
        );

        transactionPanel.add(new JLabel("Enter Amount:"));
        transactionPanel.add(amountField);

        transactionPanel.add(depositButton);
        transactionPanel.add(withdrawButton);

        transactionPanel.add(showBalanceButton);
        transactionPanel.add(logoutButton);

        transactionMessageLabel = new JLabel(" ");
        transactionMessageLabel.setHorizontalAlignment(
                SwingConstants.CENTER
        );

        depositButton.addActionListener(e -> depositMoney());
        withdrawButton.addActionListener(e -> withdrawMoney());
        showBalanceButton.addActionListener(e -> showBalance());
        logoutButton.addActionListener(e -> logoutUser());

        JPanel centerPanel = new JPanel(new BorderLayout(15, 15));
        centerPanel.setOpaque(false);

        centerPanel.add(informationPanel, BorderLayout.NORTH);
        centerPanel.add(transactionPanel, BorderLayout.CENTER);
        centerPanel.add(transactionMessageLabel, BorderLayout.SOUTH);

        panel.add(title, BorderLayout.NORTH);
        panel.add(centerPanel, BorderLayout.CENTER);

        return panel;
    }

    // =====================================================
    // REGISTRATION BUTTON LOGIC
    // =====================================================

    private void registerUser() {

        String name = nameField.getText().strip();

        String email =
                emailField.getText().strip().toLowerCase();

        String pinText =
                new String(createPinField.getPassword()).strip();

        clearRegistrationErrors();

        boolean validInput = true;

        // UI validation only
        if (name.length() < 8) {

            nameErrorLabel.setText(
                    "Please enter a valid name with at least 8 characters."
            );

            validInput = false;
        }

        boolean validEmail =
                email.length() >= 4
                && email.contains("@")
                && (email.endsWith(".com")
                || email.endsWith(".org")
                || email.endsWith(".net"));

        if (!validEmail) {

            emailErrorLabel.setText(
                    "Please enter a valid email address."
            );

            validInput = false;
        }

        if (pinText.length() != 4) {

            pinErrorLabel.setText(
                    "PIN must contain exactly 4 digits."
            );

            validInput = false;
        }

        int pin = 0;

        if (pinText.length() == 4) {

            try {

                pin = Integer.parseInt(pinText);

            } catch (NumberFormatException exception) {

                pinErrorLabel.setText(
                        "PIN must contain numbers only."
                );

                validInput = false;
            }
        }

        if (!validInput) {
            return;
        }

        /*
         * These are your existing methods.
         * The UI is only calling them.
         */
        bankApp.register(name, email);

        bankApp.user.setpin(pin);

        bankApp.user.createAccount();

        JOptionPane.showMessageDialog(
                this,
                "Registration successful.\n"
                        + "Your bank account has been created."
        );

        loginPinField.setText("");
        loginErrorLabel.setText(" ");

        cardLayout.show(mainPanel, "LOGIN");

        loginPinField.requestFocus();
    }

    // =====================================================
    // LOGIN BUTTON LOGIC
    // =====================================================

    private void loginUser() {

        loginErrorLabel.setText(" ");

        if (bankApp.user == null) {

            loginErrorLabel.setText(
                    "No registered user found."
            );

            return;
        }

        String enteredPinText =
                new String(loginPinField.getPassword()).strip();

        if (enteredPinText.isEmpty()) {

            loginErrorLabel.setText(
                    "Please enter your PIN."
            );

            return;
        }

        int enteredPin;

        try {

            enteredPin = Integer.parseInt(enteredPinText);

        } catch (NumberFormatException exception) {

            loginErrorLabel.setText(
                    "PIN must contain numbers only."
            );

            return;
        }

        // Calls your existing login method
        bankApp.login(enteredPin);

        if (bankApp.LoggedIn) {

            updateDashboard();

            cardLayout.show(mainPanel, "DASHBOARD");

            amountField.requestFocus();

        } else {

            loginErrorLabel.setText("Incorrect PIN.");

            loginPinField.setText("");
            loginPinField.requestFocus();
        }
    }

    // =====================================================
    // DEPOSIT BUTTON
    // =====================================================

    private void depositMoney() {

        if (!bankApp.LoggedIn) {
            return;
        }

        Double amount = readAmount();

        if (amount == null) {
            return;
        }

        // Calls your existing Deposit method
        bankApp.user.account.Deposit(amount);

        updateBalanceLabel();

        showTransactionMessage(
                "Deposit completed.",
                false
        );

        amountField.setText("");
        amountField.requestFocus();
    }

    // =====================================================
    // WITHDRAW BUTTON
    // =====================================================

    private void withdrawMoney() {

        if (!bankApp.LoggedIn) {
            return;
        }

        Double amount = readAmount();

        if (amount == null) {
            return;
        }

        double oldBalance =
                bankApp.user.account.balance;

        // Calls your existing Withdraw method
        bankApp.user.account.Withdraw(amount);

        updateBalanceLabel();

        if (bankApp.user.account.balance < oldBalance) {

            showTransactionMessage(
                    "Withdrawal completed.",
                    false
            );

        } else {

            showTransactionMessage(
                    "Withdrawal failed. Insufficient balance.",
                    true
            );
        }

        amountField.setText("");
        amountField.requestFocus();
    }

    // =====================================================
    // SHOW BALANCE BUTTON
    // =====================================================

    private void showBalance() {

        // Calls your existing ShowBalance method
        bankApp.user.account.ShowBalance();

        updateBalanceLabel();

        showTransactionMessage(
                "Current balance: $"
                        + String.format(
                                "%.2f",
                                bankApp.user.account.balance
                        ),
                false
        );
    }

    // =====================================================
    // LOGOUT BUTTON
    // =====================================================

    private void logoutUser() {

        // Calls your existing logout method
        bankApp.logout();

        loginPinField.setText("");
        amountField.setText("");
        transactionMessageLabel.setText(" ");

        cardLayout.show(mainPanel, "WELCOME");

        JOptionPane.showMessageDialog(
                this,
                "Logout successful."
        );
    }

    // =====================================================
    // READ AMOUNT FROM UI
    // =====================================================

    private Double readAmount() {

        String amountText =
                amountField.getText().strip();

        if (amountText.isEmpty()) {

            showTransactionMessage(
                    "Please enter an amount.",
                    true
            );

            return null;
        }

        try {

            double amount =
                    Double.parseDouble(amountText);

            if (amount <= 0) {

                showTransactionMessage(
                        "Amount must be greater than zero.",
                        true
                );

                return null;
            }

            return amount;

        } catch (NumberFormatException exception) {

            showTransactionMessage(
                    "Please enter a valid number.",
                    true
            );

            return null;
        }
    }

    // =====================================================
    // DISPLAY EXISTING OBJECT INFORMATION
    // =====================================================

    private void updateDashboard() {

        nameLabel.setText(
                "Name: " + bankApp.user.name
        );

        emailLabel.setText(
                "Email: " + bankApp.user.email
        );

        accountNumberLabel.setText(
                "Account Number: "
                        + bankApp.user.account.accountNumber
        );

        updateBalanceLabel();
    }

    private void updateBalanceLabel() {

        balanceLabel.setText(
                String.format(
                        "Balance: $%.2f",
                        bankApp.user.account.balance
                )
        );
    }

    // =====================================================
    // HELPER METHODS
    // =====================================================

    private JLabel createErrorLabel() {

        JLabel label = new JLabel(" ");

        label.setForeground(Color.RED);
        label.setFont(new Font("Arial", Font.PLAIN, 12));

        return label;
    }

    private void clearRegistrationErrors() {

        nameErrorLabel.setText(" ");
        emailErrorLabel.setText(" ");
        pinErrorLabel.setText(" ");
    }

    private void clearRegistrationFields() {

        nameField.setText("");
        emailField.setText("");
        createPinField.setText("");

        clearRegistrationErrors();
    }

    private void showTransactionMessage(
            String message,
            boolean isError
    ) {

        transactionMessageLabel.setText(message);

        if (isError) {
            transactionMessageLabel.setForeground(Color.RED);
        } else {
            transactionMessageLabel.setForeground(
                    new Color(0, 120, 0)
            );
        }
    }

    // =====================================================
    // UI MAIN METHOD
    // =====================================================

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {

            BankUI bankUI = new BankUI();

            bankUI.setVisible(true);
        });
    }
}