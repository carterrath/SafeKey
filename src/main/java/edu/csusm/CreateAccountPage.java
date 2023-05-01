package edu.csusm;

import java.awt.Color;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CreateAccountPage {

    static JFrame frame2 = new JFrame();
    static JPanel panel2 = new JPanel();
    static JButton createButton = new JButton("Create Account");
    static JLabel firstLabel, lastLabel, emailLabel, dobLabel, userLabel, passLabel, passLabel2;
    static JTextField firstText, lastText, emailText, dobText, userText, passText, passText2;
    static final Color VERY_DARK_BLUE = new Color(0,0,153);
    static String writeInfo = "";


    public CreateAccountPage() {
        frame2.setTitle("Create Account");
        frame2.setLocation(new Point(450, 200));
        frame2.add(panel2);
        frame2.setSize(600, 450);
        frame2.setResizable(false);

        panel2.setLayout(null);
        panel2.setBackground(VERY_DARK_BLUE);

        // Labels and textfield for first name
        firstLabel = new JLabel("First Name");
        firstLabel.setBounds(100, 20, 75, 30);
        firstLabel.setForeground(Color.WHITE);
        firstLabel.setFont(new Font("Calibri light", Font.BOLD, 16));
        panel2.add(firstLabel);
        firstText = new JTextField();
        firstText.setBounds(100,45,190,30);
        firstText.setForeground(Color.WHITE);
        firstText.setBackground(Color.BLACK);
        panel2.add(firstText);

        // Labels and textfield for last name
        lastLabel = new JLabel("Last Name");
        lastLabel.setBounds(300, 20, 75, 30);
        lastLabel.setForeground(Color.WHITE);
        lastLabel.setFont(new Font("Calibri light", Font.BOLD, 16));
        panel2.add(lastLabel);
        lastText = new JTextField();
        lastText.setBounds(300,45,190,30);
        lastText.setForeground(Color.WHITE);
        lastText.setBackground(Color.BLACK);
        panel2.add(lastText);

        // Labels and textfield for email
        emailLabel = new JLabel("Email");
        emailLabel.setBounds(100, 90, 75, 30);
        emailLabel.setForeground(Color.WHITE);
        emailLabel.setFont(new Font("Calibri light", Font.BOLD, 16));
        panel2.add(emailLabel);
        emailText = new JTextField();
        emailText.setBounds(100,115,390,30);
        emailText.setForeground(Color.WHITE);
        emailText.setBackground(Color.BLACK);
        panel2.add(emailText);

        // Labels and textfield for dob
        dobLabel = new JLabel("Date of Birth");
        dobLabel.setBounds(100, 160, 90, 30);
        dobLabel.setForeground(Color.WHITE);
        dobLabel.setFont(new Font("Calibri light", Font.BOLD, 16));
        panel2.add(dobLabel);
        dobText = new JTextField();
        dobText.setBounds(100,185,190,30);
        dobText.setForeground(Color.WHITE);
        dobText.setBackground(Color.BLACK);
        panel2.add(dobText);

        // Labels and textfield for username
        userLabel = new JLabel("Username");
        userLabel.setBounds(300, 160, 75, 30);
        userLabel.setForeground(Color.WHITE);
        userLabel.setFont(new Font("Calibri light", Font.BOLD, 16));
        panel2.add(userLabel);
        userText = new JTextField();
        userText.setBounds(300,185,190,30);
        userText.setForeground(Color.WHITE);
        userText.setBackground(Color.BLACK);
        panel2.add(userText);

        // Labels and textfield for password
        passLabel = new JLabel("Password");
        passLabel.setBounds(100, 230, 90, 30);
        passLabel.setForeground(Color.WHITE);
        passLabel.setFont(new Font("Calibri light", Font.BOLD, 16));
        panel2.add(passLabel);
        passText = new JTextField();
        passText.setBounds(100,255,190,30);
        passText.setForeground(Color.WHITE);
        passText.setBackground(Color.BLACK);
        panel2.add(passText);

        // Labels and textfield for password2
        passLabel2 = new JLabel("Re-Enter Password");
        passLabel2.setBounds(300, 230, 130, 30);
        passLabel2.setForeground(Color.WHITE);
        passLabel2.setFont(new Font("Calibri light", Font.BOLD, 16));
        panel2.add(passLabel2);
        passText2 = new JTextField();
        passText2.setBounds(300,255,190,30);
        passText2.setForeground(Color.WHITE);
        passText2.setBackground(Color.BLACK);
        panel2.add(passText2);

        // create account button
        createButton.setBounds(100, 310, 390, 40);
        createButton.setForeground(Color.WHITE);
        createButton.setBackground(Color.BLACK);
        createButton.setFont(new Font("Calibri light", Font.BOLD, 16));


        // login button action
        createButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                UserDAO userInfo = new UserDAO();
                userInfo.setName(firstText.getText(), lastText.getText());
                userInfo.setEmail(emailText.getText());
                userInfo.setDOB(dobText.getText());
                userInfo.setUsername(userText.getText());
                userInfo.setPasscode(passText.getText());

                writeInfo += userInfo.getName() + " " +
                        userInfo.getEmail() + " " +
                        userInfo.getDOB() + " " +
                        userInfo.getUsername() + " " +
                        userInfo.getPasscode();

                User newUser = new User();
                try {
                    newUser.writeFile(writeInfo);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                HomePage home = new HomePage(newUser); //automatically logs in when creating account
                frame2.dispose();
            }
        });
        panel2.add(createButton);
        frame2.add(panel2);
        frame2.setVisible(true);
    }
}
