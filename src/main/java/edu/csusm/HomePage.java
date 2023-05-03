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

public class HomePage {
    static final Color VERY_DARK_BLUE = new Color(0,0,153);

    static JFrame frame3 = new JFrame();
    static JPanel panel3 = new JPanel();
    static JLabel welcomeLabel, accountLabel, passwordLabel, recoveryLabel, q1, a1, q2, a2, changePassLabel, oldPass, newPass1, newPass2, addPassLabel, newNameLabel, newPassLabel, deletePassLabel, editOldPassLabel, editNewPassLabel;
    static JTextField recoverQuestion1, recoverQuestion2, recoverAnswer1, recoverAnswer2, oldPassTxt, newPassTxt, newPassTxt2, newName, newPass, deletePass, editOldPass, editNewPass;

    //Save Recovery Buttons
    static JButton recoveryButton = new JButton("Set Up Recovery");
    static JButton saveRecovery = new JButton("SAVE"); //save button for saveRecovery
    static JButton recoveryExit = new JButton("EXIT"); //exit button for saveRecovery

    //Change Account Passcode Buttons
    static JButton chngPassButton = new JButton("Change Account Passcode");
    static JButton saveChange = new JButton("SAVE"); //save button for change passcode
    static JButton changePassExit = new JButton("EXIT"); //exit button for changeAccountPasscode

    //Add Password Buttons
    static JButton addPassButton = new JButton("Add Password");
    static JButton saveNewPass = new JButton("SAVE"); //save button for adding new password
    static JButton newExit = new JButton("EXIT"); //exit button for addPassword

    //Edit Password Buttons
    static JButton editPassButton = new JButton("Edit Password");
    static JButton saveEdit = new JButton("SAVE"); //save button for edit password
    static JButton exitEdit = new JButton("EXIT"); //exit button for editPassword

    //View All Passwords Buttons
    static JButton viewPassButton = new JButton("View All Passwords");
    static JLabel viewPassLabel = new JLabel("All Passwords");
    static JButton exitView = new JButton("EXIT"); //delete button for deletepassword

    //Delete A Password Buttons
    static JButton deletePassButton = new JButton("Delete A Password");
    static JButton saveDelete = new JButton("SAVE"); //save button for deletePassword
    static JButton deleteButton = new JButton("DELETE"); //delete button for deletepassword
    static JButton exitDelete = new JButton("EXIT"); //exit button for deletePassword

    //Logout Button
    static JButton logout = new JButton("Log out");

    User user;
    Recovery recovery;
    KeyManager managePassword = new KeyManager();

    //Homepage window
    public HomePage(User u) {
        user = u;

        // display home page window
        frame3.setTitle("Home Page");
        frame3.setLocation(new Point(200, 10));
        frame3.setSize(1200, 800);
        frame3.setResizable(false);
        frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel3.setLayout(null);
        panel3.setBackground(VERY_DARK_BLUE);

        //Welcome Label
        welcomeLabel = new JLabel("Welcome to Safe-Key! Select any option to continue");
        welcomeLabel.setBounds(50, 30, 1000, 40);
        welcomeLabel.setForeground(Color.WHITE);
        welcomeLabel.setFont(new Font("Calibri light", Font.BOLD, 40));
        panel3.add(welcomeLabel);

        //Account Label
        accountLabel = new JLabel("Account Management:");
        accountLabel.setBounds(100, 100, 400, 40);
        accountLabel.setForeground(Color.WHITE);
        accountLabel.setFont(new Font("Calibri light", Font.BOLD, 30));
        panel3.add(accountLabel);

        //Password Label
        passwordLabel = new JLabel("Password Management:");
        passwordLabel.setBounds(100, 300, 400, 40);
        passwordLabel.setForeground(Color.WHITE);
        passwordLabel.setFont(new Font("Calibri light", Font.BOLD, 30));
        panel3.add(passwordLabel);

        //Recovery Button UI
        recoveryButton.setBounds(100, 150, 390, 40);
        recoveryButton.setForeground(Color.WHITE);
        recoveryButton.setBackground(Color.BLACK);
        recoveryButton.setFont(new Font("Calibri light", Font.BOLD, 20));

        //Recovery Button Action
        recoveryButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                System.out.println("Recovery button works");
                // call recovery view
                recoveryView();
                HomePage newHome = new HomePage(user);
            }
        });
        panel3.add(recoveryButton);

        //ChangeAccountPasscode Button UI
        chngPassButton.setBounds(100, 200, 390, 40);
        chngPassButton.setForeground(Color.WHITE);
        chngPassButton.setBackground(Color.BLACK);
        chngPassButton.setFont(new Font("Calibri light", Font.BOLD, 20));

        //ChangeAccountPasscode Action
        chngPassButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                System.out.println("Chng pass button works"); // test if button works
                changePassView();
                HomePage newHome = new HomePage(user);
            }
        });
        panel3.add(chngPassButton);

        //AddPassword Button UI
        addPassButton.setBounds(100, 350, 390, 40);
        addPassButton.setForeground(Color.WHITE);
        addPassButton.setBackground(Color.BLACK);
        addPassButton.setFont(new Font("Calibri light", Font.BOLD, 20));

        //AddPassword Action
        addPassButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                System.out.println("add pass button works"); // test if button works
                addAPassword();
                HomePage newHome = new HomePage(user);
            }
        });
        panel3.add(addPassButton);

        //EditPassword Button UI
        editPassButton.setBounds(100, 400, 390, 40);
        editPassButton.setForeground(Color.WHITE);
        editPassButton.setBackground(Color.BLACK);
        editPassButton.setFont(new Font("Calibri light", Font.BOLD, 20));

        //EditPassword Action
        editPassButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                System.out.println("edit pass button works"); // test if button works
                editAPassword();
                HomePage newHome = new HomePage(user);
            }
        });
        panel3.add(editPassButton);

        //ViewAllPasswords Button UI
        viewPassButton.setBounds(100, 450, 390, 40);
        viewPassButton.setForeground(Color.WHITE);
        viewPassButton.setBackground(Color.BLACK);
        viewPassButton.setFont(new Font("Calibri light", Font.BOLD, 20));

        //ViewAllPassword Action
        viewPassButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                System.out.println("view pass button works"); // test if button works
                viewPasswords();
                HomePage newHome = new HomePage(user);
            }
        });
        panel3.add(viewPassButton);

        //DeleteAPassword Button UI
        deletePassButton.setBounds(100, 500, 390, 40);
        deletePassButton.setForeground(Color.WHITE);
        deletePassButton.setBackground(Color.BLACK);
        deletePassButton.setFont(new Font("Calibri light", Font.BOLD, 20));

        //DeleteAPassword Action
        deletePassButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                System.out.println("delete pass button works"); // test if button works
                deleteAPassword();
                HomePage newHome = new HomePage(user);
            }
        });
        panel3.add(deletePassButton);

        //Logout Button UI
        logout.setBounds(100, 600, 390, 40);
        logout.setForeground(Color.WHITE);
        logout.setBackground(Color.BLACK);
        logout.setFont(new Font("Calibri light", Font.BOLD, 20));

        //Logout Action
        logout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                System.out.println("logout button works"); // test if button works
                LoginPage newloginPage = new LoginPage();
                frame3.dispose();
            }
        });
        panel3.add(logout);

        //Application Frame Visbility
        frame3.add(panel3);
        frame3.setVisible(true);
    }

    //Recovery View
    public void recoveryView() {
        recoveryLabel = new JLabel("Enter Recovery Questions and Answers Below:");
        recoveryLabel.setBounds(600, 125, 500, 40);
        recoveryLabel.setForeground(Color.WHITE);
        recoveryLabel.setFont(new Font("Calibri light", Font.BOLD, 20));
        panel3.add(recoveryLabel);

        //Question 1 Label
        q1 = new JLabel("Q1:");
        q1.setBounds(600, 195, 50, 50);
        q1.setForeground(Color.WHITE);
        q1.setFont(new Font("Calibri light", Font.BOLD, 20));
        panel3.add(q1);

        //Question 1 Textfield
        recoverQuestion1 = new JTextField();
        recoverQuestion1.setBounds(650,200,400,30);
        recoverQuestion1.setForeground(Color.WHITE);
        recoverQuestion1.setBackground(Color.BLACK);
        panel3.add(recoverQuestion1);

        //Answer 1 Label
        a1 = new JLabel("A1:");
        a1.setBounds(600, 295, 50, 50);
        a1.setForeground(Color.WHITE);
        a1.setFont(new Font("Calibri light", Font.BOLD, 20));
        panel3.add(a1);

        //Answer 1 Textfield
        recoverAnswer1 = new JTextField();
        recoverAnswer1.setBounds(650,300,190,30);
        recoverAnswer1.setForeground(Color.WHITE);
        recoverAnswer1.setBackground(Color.BLACK);
        panel3.add(recoverAnswer1);

        //Question 2 Label
        q2 = new JLabel("Q2:");
        q2.setBounds(600, 395, 50, 50);
        q2.setForeground(Color.WHITE);
        q2.setFont(new Font("Calibri light", Font.BOLD, 20));
        panel3.add(q2);

        //Question 2 Textfield
        recoverQuestion2 = new JTextField();
        recoverQuestion2.setBounds(650,400,400,30);
        recoverQuestion2.setForeground(Color.WHITE);
        recoverQuestion2.setBackground(Color.BLACK);
        panel3.add(recoverQuestion2);

        //Answer 2 Label
        a2 = new JLabel("A2:");
        a2.setBounds(600, 495, 50, 50);
        a2.setForeground(Color.WHITE);
        a2.setFont(new Font("Calibri light", Font.BOLD, 20));
        panel3.add(a2);

        //Answer 2 Textfield
        recoverAnswer2 = new JTextField();
        recoverAnswer2.setBounds(650,500,190,30);
        recoverAnswer2.setForeground(Color.WHITE);
        recoverAnswer2.setBackground(Color.BLACK);
        panel3.add(recoverAnswer2);

        //save recovery button ui
        saveRecovery.setBounds(700, 550, 190, 30);
        saveRecovery.setForeground(Color.WHITE);
        saveRecovery.setBackground(Color.BLACK);
        saveRecovery.setFont(new Font("Calibri light", Font.BOLD, 20));

        //save recovery exit button ui
        recoveryExit.setBounds(900, 550, 190, 30);
        recoveryExit.setForeground(Color.WHITE);
        recoveryExit.setBackground(Color.BLACK);
        recoveryExit.setFont(new Font("Calibri light", Font.BOLD, 20));

        //save recovery button functionality
        saveRecovery.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                System.out.println("save recovery button works"); // test if button works
                //Recovery manageUser = new Recovery(user); // rcovery for user
                recovery = new Recovery(user);
                recovery.setUpRecovery(recoverQuestion1.getText(), recoverAnswer1.getText(), recoverQuestion2.getText(), recoverAnswer2.getText());

                // remove contents
                panel3.remove(recoveryLabel);
                panel3.remove(q1);
                panel3.remove(recoverQuestion1);
                panel3.remove(a1);
                panel3.remove(recoverAnswer1);
                panel3.remove(q2);
                panel3.remove(recoverQuestion2);
                panel3.remove(a2);
                panel3.remove(recoverAnswer2);
                panel3.remove(recoveryExit);
                panel3.remove(saveRecovery);
                HomePage newHome = new HomePage(user);
            }
        });

        //save recovery exit button functionality
        recoveryExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                System.out.println("exit button works"); // test if button works

                // remove contents
                panel3.remove(recoveryLabel);
                panel3.remove(q1);
                panel3.remove(recoverQuestion1);
                panel3.remove(a1);
                panel3.remove(recoverAnswer1);
                panel3.remove(q2);
                panel3.remove(recoverQuestion2);
                panel3.remove(a2);
                panel3.remove(recoverAnswer2);
                panel3.remove(recoveryExit);
                panel3.remove(saveRecovery);
                HomePage newHome = new HomePage(user);
            }
        });

        panel3.add(saveRecovery);
        panel3.add(recoveryExit);

    }

    public void changePassView() {

        //Change Account Password Label
        changePassLabel = new JLabel("Change Account Password");
        changePassLabel.setBounds(600, 125, 500, 40);
        changePassLabel.setForeground(Color.WHITE);
        changePassLabel.setFont(new Font("Calibri light", Font.BOLD, 20));
        panel3.add(changePassLabel);

        //label old password
        oldPass = new JLabel("Enter Old Password:");
        oldPass.setBounds(650, 175, 400, 30);
        oldPass.setForeground(Color.WHITE);
        oldPass.setFont(new Font("Calibri light", Font.BOLD, 20));
        panel3.add(oldPass);

        //textfield old password
        oldPassTxt = new JTextField();
        oldPassTxt.setBounds(650,200,190,30);
        oldPassTxt.setForeground(Color.WHITE);
        oldPassTxt.setBackground(Color.BLACK);
        panel3.add(oldPassTxt);

        //label new password
        newPass1 = new JLabel("Enter New Password:");
        newPass1.setBounds(650, 265, 400, 50);
        newPass1.setForeground(Color.WHITE);
        newPass1.setFont(new Font("Calibri light", Font.BOLD, 20));
        panel3.add(newPass1);

        //textfield new password
        newPassTxt = new JTextField();
        newPassTxt.setBounds(650,300,190,30);
        newPassTxt.setForeground(Color.WHITE);
        newPassTxt.setBackground(Color.BLACK);
        panel3.add(newPassTxt);

        //label for confirm new password
        newPass2 = new JLabel("Re-Enter Password:");
        newPass2.setBounds(650, 365, 400, 50);
        newPass2.setForeground(Color.WHITE);
        newPass2.setFont(new Font("Calibri light", Font.BOLD, 20));
        panel3.add(newPass2);

        //textfield confirming new password
        newPassTxt2 = new JTextField();
        newPassTxt2.setBounds(650,400,190,30);
        newPassTxt2.setForeground(Color.WHITE);
        newPassTxt2.setBackground(Color.BLACK);
        panel3.add(newPassTxt2);

        //save button ui for change passcode
        saveChange.setBounds(700, 550, 190, 30);
        saveChange.setForeground(Color.WHITE);
        saveChange.setBackground(Color.BLACK);
        saveChange.setFont(new Font("Calibri light", Font.BOLD, 20));

        //exit button ui for change passcode
        changePassExit.setBounds(900, 550, 190, 30);
        changePassExit.setForeground(Color.WHITE);
        changePassExit.setBackground(Color.BLACK);
        changePassExit.setFont(new Font("Calibri light", Font.BOLD, 20));

        //save button for change passcode
        saveChange.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                System.out.println("save change button works"); // test if button works
                recovery = new Recovery(user);
                try {
                    recovery.changeAccountPasscode(newPassTxt.getText());
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }

                // remove contents
                panel3.remove(changePassLabel);
                panel3.remove(oldPass);
                panel3.remove(oldPassTxt);
                panel3.remove(newPass1);
                panel3.remove(newPassTxt);
                panel3.remove(newPass2);
                panel3.remove(newPassTxt2);
                panel3.remove(changePassExit);
                panel3.remove(saveChange);
                HomePage newHome = new HomePage(user);
            }
        });

        //exit button change passcode
        changePassExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                System.out.println("exit button works"); // test if button works

                // remove contents
                panel3.remove(changePassLabel);
                panel3.remove(oldPass);
                panel3.remove(oldPassTxt);
                panel3.remove(newPass1);
                panel3.remove(newPassTxt);
                panel3.remove(newPass2);
                panel3.remove(newPassTxt2);
                panel3.remove(changePassExit);
                panel3.remove(saveChange);
                HomePage newHome = new HomePage(user);
            }
        });

        panel3.add(saveChange);
        panel3.add(changePassExit);
    }


    //Add Password View
    public void addAPassword(){

        //addpass label
        addPassLabel = new JLabel("Adding New Password");
        addPassLabel.setBounds(650, 210, 500, 40);
        addPassLabel.setForeground(Color.WHITE);
        addPassLabel.setFont(new Font("Calibri light", Font.BOLD, 20));
        panel3.add(addPassLabel);

        //name label
        newNameLabel = new JLabel("Enter Name:");
        newNameLabel.setBounds(650, 250, 400, 30);
        newNameLabel.setForeground(Color.WHITE);
        newNameLabel.setFont(new Font("Calibri light", Font.BOLD, 20));
        panel3.add(newNameLabel);

        //name box
        newName = new JTextField();
        newName.setBounds(650,275,190,30);
        newName.setForeground(Color.WHITE);
        newName.setBackground(Color.BLACK);
        panel3.add(newName);

        //pass label
        newPassLabel = new JLabel("Enter Password:");
        newPassLabel.setBounds(900, 250, 400, 30);
        newPassLabel.setForeground(Color.WHITE);
        newPassLabel.setFont(new Font("Calibri light", Font.BOLD, 20));
        panel3.add(newPassLabel);

        //pass text
        newPass = new JTextField();
        newPass.setBounds(900,275,190,30);
        newPass.setForeground(Color.WHITE);
        newPass.setBackground(Color.BLACK);
        panel3.add(newPass);

        //add password save button
        saveNewPass.setBounds(650, 350, 190, 30);
        saveNewPass.setForeground(Color.WHITE);
        saveNewPass.setBackground(Color.BLACK);
        saveNewPass.setFont(new Font("Calibri light", Font.BOLD, 20));

        //add password exit button
        newExit.setBounds(900, 350, 190, 30);
        newExit.setForeground(Color.WHITE);
        newExit.setBackground(Color.BLACK);
        newExit.setFont(new Font("Calibri light", Font.BOLD, 20));

        //button action
        //save name and pass
        saveNewPass.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                System.out.println("save change button works"); // test if button works
                managePassword.setPassword(newPass.getText());

                try {
                    managePassword.passwordCommand(1); // command 1 to add
                } catch (Exception e) {
                    e.printStackTrace();
                }

                // remove contents
                panel3.remove(addPassLabel);
                panel3.remove(newNameLabel);
                panel3.remove(newName);
                panel3.remove(newPassLabel);
                panel3.remove(newPass);
                panel3.remove(saveNewPass);
                panel3.remove(newExit);
                HomePage newHome = new HomePage(user);
            }
        });

        //exit button, remove all content
        newExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                System.out.println("new password exit button works"); // test if button works

                // remove contents
                panel3.remove(addPassLabel);
                panel3.remove(newNameLabel);
                panel3.remove(newName);
                panel3.remove(newPassLabel);
                panel3.remove(newPass);
                panel3.remove(saveNewPass);
                panel3.remove(newExit);
                HomePage newHome = new HomePage(user);
            }
        });

        //add button to panel
        panel3.add(saveNewPass);

        //add exit button to panel
        panel3.add(newExit);
    }

    //Edit Password view
    public void editAPassword() {

        // show list of passwords above textfields
        // to let user scroll through and see what password they want to edit


        // search by name
        editOldPassLabel = new JLabel("Enter name of password to edit:");
        editOldPassLabel.setBounds(650, 350, 500, 40);
        editOldPassLabel.setForeground(Color.WHITE);
        editOldPassLabel.setFont(new Font("Calibri light", Font.BOLD, 20));
        panel3.add(editOldPassLabel);

        // textfield edit old password
        editOldPass = new JTextField();
        editOldPass.setBounds(650,395,190,30);
        editOldPass.setForeground(Color.WHITE);
        editOldPass.setBackground(Color.BLACK);
        panel3.add(editOldPass);

        // new password for the account - label
        editNewPassLabel = new JLabel("Enter the new password for this account:");
        editNewPassLabel.setBounds(650, 450, 500, 40);
        editNewPassLabel.setForeground(Color.WHITE);
        editNewPassLabel.setFont(new Font("Calibri light", Font.BOLD, 20));
        panel3.add(editNewPassLabel);

        // new password for account - textfield
        editNewPass = new JTextField();
        editNewPass.setBounds(650,495,190,30);
        editNewPass.setForeground(Color.WHITE);
        editNewPass.setBackground(Color.BLACK);
        panel3.add(editNewPass);

        // save button ui
        saveEdit.setBounds(650, 550, 190, 30);
        saveEdit.setForeground(Color.WHITE);
        saveEdit.setBackground(Color.BLACK);
        saveEdit.setFont(new Font("Calibri light", Font.BOLD, 20));

        //save button functionality
        saveEdit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                System.out.println("save button works"); // test if button works
                managePassword.setPassword(editNewPass.getText()); // new password from textfields
                try {
                    managePassword.passwordCommand(3); // command 1 to add
                } catch (Exception e) {
                    e.printStackTrace();
                }
                //remove contents
                panel3.remove(editOldPassLabel);
                panel3.remove(editOldPass);
                panel3.remove(editNewPassLabel);
                panel3.remove(editNewPass);
                panel3.remove(saveEdit);
                panel3.remove(exitEdit);

                HomePage newHome = new HomePage(user);
            }
        });

        // exit button ui
        exitEdit.setBounds(900, 550, 190, 30);
        exitEdit.setForeground(Color.WHITE);
        exitEdit.setBackground(Color.BLACK);
        exitEdit.setFont(new Font("Calibri light", Font.BOLD, 20));

        // exit button functionality
        exitEdit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                System.out.println("exit button works"); // test if button works

                //remove contents
                panel3.remove(editOldPassLabel);
                panel3.remove(editOldPass);
                panel3.remove(editNewPassLabel);
                panel3.remove(editNewPass);
                panel3.remove(saveEdit);
                panel3.remove(exitEdit);

                HomePage newHome = new HomePage(user);
            }
        });

        panel3.add(saveEdit);
        panel3.add(exitEdit);
    }

    //View Password View
    public void viewPasswords() {
        // search by name
        //managePasswprd.viewAllPasswords(newName.getText());
        //view all password
    }

    //Delete Password View
    public void deleteAPassword() {

        // show the list of passwords here

        // search by name
        deletePassLabel = new JLabel("Enter name of password to delete:");
        deletePassLabel.setBounds(650, 350, 500, 40);
        deletePassLabel.setForeground(Color.WHITE);
        deletePassLabel.setFont(new Font("Calibri light", Font.BOLD, 20));
        panel3.add(deletePassLabel);

        // name label
        deletePass = new JTextField();
        deletePass.setBounds(650,395,190,30);
        deletePass.setForeground(Color.WHITE);
        deletePass.setBackground(Color.BLACK);
        panel3.add(deletePass);

        // delete button ui
        deleteButton.setBounds(650, 450, 190, 30);
        deleteButton.setForeground(Color.WHITE);
        deleteButton.setBackground(Color.BLACK);
        deleteButton.setFont(new Font("Calibri light", Font.BOLD, 20));

        // delete button functionality
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                System.out.println("delete button works"); // test if button works
                managePassword.setPassword(deletePass.getText());

                try{
                    managePassword.passwordCommand(2); // command 2 to delete
                }catch (Exception e){
                    e.printStackTrace();
                }

                //remove contents
                panel3.remove(deletePassLabel);
                panel3.remove(deletePass);
                panel3.remove(exitDelete);
                panel3.remove(deleteButton);
                HomePage newHome = new HomePage(user);
            }
        });

        // save button functionality
     	/*
     	saveDelete.addActionListener(new ActionListener() {
     		@Override
     	    public void actionPerformed(ActionEvent event) {
     	        System.out.println("save button works"); // test if button works
     	        I_KeyManagement manageUser = new KeyManager();
     	       HomePage newHome = new HomePage();
     	     }
     	});
     	*/

        // exit button ui
        exitDelete.setBounds(900, 450, 190, 30);
        exitDelete.setForeground(Color.WHITE);
        exitDelete.setBackground(Color.BLACK);
        exitDelete.setFont(new Font("Calibri light", Font.BOLD, 20));

        // exit button functionality
        exitDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                System.out.println("exit button works"); // test if button works

                //remove contents
                panel3.remove(deletePassLabel);
                panel3.remove(deletePass);
                panel3.remove(exitDelete);
                panel3.remove(deleteButton);

                HomePage newHome = new HomePage(user);
            }
        });

        panel3.add(deleteButton);
        panel3.add(saveDelete);
        panel3.add(exitDelete);

    }
}
