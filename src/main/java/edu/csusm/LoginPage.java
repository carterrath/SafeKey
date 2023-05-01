package edu.csusm;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;

public class LoginPage {
    static JFrame frame1 = new JFrame();
    static JPanel panel1 = new JPanel();
    static JPanel recoverPanel = new JPanel();
    static JFrame recoverFrame = new JFrame();
    static JButton button = new JButton("Login");
    static JButton button2 = new JButton("Create Account");
    static JButton forgotPass = new JButton("Forgot Password");
    static JButton enter = new JButton("Enter");
    static JLabel pass, user, noAcct, loginLabel, question1, question2;
    static JTextField username, answer1, answer2;
    static final Color VERY_DARK_BLUE = new Color(0, 0, 153);
    static boolean access = false, correct = false; // will change to true if username & login is correct
    static JPasswordField passcode;
    User u = new User();

    public LoginPage() {
        frame1.setTitle("Login");
        frame1.setLocation(new Point(500, 200));
        frame1.add(panel1);
        frame1.setSize(500, 400);
        frame1.setResizable(false);

        panel1.setLayout(null);
        panel1.setBackground(VERY_DARK_BLUE);

        // Login label
        loginLabel = new JLabel("Login or Create Account");
        loginLabel.setBounds(140, 20, 300, 30);
        loginLabel.setForeground(Color.WHITE);
        loginLabel.setFont(new Font("Calibri light", Font.BOLD, 20));
        panel1.add(loginLabel);

        // Labels and textfield for username
        user = new JLabel("Username");
        user.setBounds(150, 65, 190, 30);
        user.setForeground(Color.WHITE);
        user.setFont(new Font("Calibri light", Font.BOLD, 16));
        panel1.add(user);
        username = new JTextField();
        username.setBounds(150, 90, 190, 30);
        username.setForeground(Color.WHITE);
        username.setBackground(Color.BLACK);
        panel1.add(username);

        // labels and textfield for password
        pass = new JLabel("Passcode");
        pass.setBounds(150, 135, 390, 30);
        pass.setForeground(Color.WHITE);
        pass.setFont(new Font("Calibri light", Font.BOLD, 16));
        panel1.add(pass);

        passcode = new JPasswordField();
        passcode.setBounds(150, 160, 190, 30);
        passcode.setForeground(Color.WHITE);
        passcode.setBackground(Color.BLACK);
        panel1.add(passcode);

        // login button
        button.setBounds(150, 200, 190, 30);
        button.setForeground(Color.WHITE);
        button.setBackground(Color.BLACK);

        // will ask user if they don't have an account
        noAcct = new JLabel("Don't have an Account?");
        noAcct.setBounds(165, 250, 190, 30);
        noAcct.setForeground(Color.WHITE);
        noAcct.setFont(new Font("Calibri light", Font.BOLD, 16));
        panel1.add(noAcct);

        // create account button
        button2.setBounds(150, 275, 190, 30);
        button2.setForeground(Color.WHITE);
        button2.setBackground(Color.BLACK);

        // Add a forgot password button that will call recovery from I_UserManagement
        forgotPass.setBounds(150, 315, 190, 30);
        forgotPass.setForeground(Color.WHITE);
        forgotPass.setBackground(Color.BLACK);

        // login button action
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                // if passcode is correct, login to server
                //User u = new User();
                AccountIF account = new AccountProxy();
                u.setAccount(account);
                String passStr = new String(passcode.getPassword());
                try {
                    if(account.accessHomePage(u, username.getText(), passStr)){//if entered username and passcode
                        panel1.remove(username);
                        panel1.remove(passcode);
                        frame1.dispose(); // close login page
                    }
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            }
        });

        // create account button
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                // if create account is pressed, create account window on server
                CreateAccountPage account = new CreateAccountPage();
                frame1.dispose(); // close login window
            }
        });

        // // forgot password button
        forgotPass.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                System.out.println("forgot password button works");
                // call recovery questions. Open new window?
                recoveryView();
            }
        });

        panel1.add(button);
        panel1.add(button2);
        panel1.add(forgotPass);

        frame1.add(panel1);
        frame1.setVisible(true);
    }

    public void recoveryView() {
        Recovery manageUser = new Recovery(u);

        recoverFrame.setTitle("Recover");
        recoverFrame.setLocation(new Point(500, 200));
        recoverFrame.add(recoverPanel);
        recoverFrame.setSize(500, 400);
        recoverFrame.setResizable(false);

        recoverPanel.setLayout(null);
        recoverPanel.setBackground(VERY_DARK_BLUE);

        question1 = new JLabel(manageUser.getQuestion1());
        question1.setBounds(150, 65, 190, 30);
        question1.setForeground(Color.WHITE);
        question1.setFont(new Font("Calibri light", Font.BOLD, 16));
        recoverPanel.add(question1);
        answer1 = new JTextField();
        answer1.setBounds(150, 90, 190, 30);
        answer1.setForeground(Color.WHITE);
        answer1.setBackground(Color.BLACK);
        recoverPanel.add(answer1);

        question2 = new JLabel(manageUser.getQuestion2());
        question2.setBounds(150, 135, 390, 30);
        question2.setForeground(Color.WHITE);
        question2.setFont(new Font("Calibri light", Font.BOLD, 16));
        recoverPanel.add(question2);
        answer2 = new JTextField();
        answer2.setBounds(150, 160, 190, 30);
        answer2.setForeground(Color.WHITE);
        answer2.setBackground(Color.BLACK);
        recoverPanel.add(answer2);

        enter.setBounds(150, 275, 190, 30);
        enter.setForeground(Color.WHITE);
        enter.setBackground(Color.BLACK);

        enter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                Recovery manageUser = new Recovery(u); //recovery for user u
                correct = manageUser.checkRecovery(answer1.getText(), answer2.getText());
                if (correct) {
                    HomePage newPage = new HomePage(u);
                    frame1.dispose();
                    recoverFrame.dispose();
                }
            }
        });

        recoverPanel.add(enter);

        recoverFrame.add(recoverPanel);
        recoverFrame.setVisible(true);
    }
}