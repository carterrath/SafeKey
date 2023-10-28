/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edu.csusm;

import java.awt.*;
import java.io.FileNotFoundException;
/**
 *
 * @author carterrath
 */
public class LoginScreen extends javax.swing.JFrame {
    User u;
    /**
     * Creates new form LoginScreen
     */
    public LoginScreen() {
        initComponents();
        setLocationRelativeTo(null); // set location to center of screen
        this.setVisible(true);
        loginFailed.setVisible(false);
        this.getRootPane().setDefaultButton(loginButton); // set enter key for button
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jColorChooser1 = new javax.swing.JColorChooser();
        loginPanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        userNameLabel = new javax.swing.JLabel();
        userNameText = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        createAccountLabel = new javax.swing.JLabel();
        createAccountButton = new javax.swing.JButton();
        recoverAccountButton = new javax.swing.JButton();
        recoverAccountLabel = new javax.swing.JLabel();
        passwordText = new javax.swing.JPasswordField();
        loginFailed = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        loginPanel.setBackground(new java.awt.Color(153, 204, 255));

        titleLabel.setFont(new java.awt.Font("Hiragino Mincho ProN", 0, 24)); // NOI18N
        titleLabel.setText("SafeKey");

        userNameLabel.setFont(new java.awt.Font("Hiragino Mincho ProN", 0, 13)); // NOI18N
        userNameLabel.setText("Username");

        userNameText.setFont(new java.awt.Font("Hiragino Mincho ProN", 0, 13)); // NOI18N

        passwordLabel.setFont(new java.awt.Font("Hiragino Mincho ProN", 0, 13)); // NOI18N
        passwordLabel.setText("Password");

        loginButton.setBackground(Color.BLACK);
        loginButton.setFont(new java.awt.Font("Hiragino Mincho ProN", 0, 13)); // NOI18N
        loginButton.setForeground(new java.awt.Color(153, 204, 255));
        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        createAccountLabel.setFont(new java.awt.Font("Hiragino Mincho ProN", 0, 13)); // NOI18N
        createAccountLabel.setText("New to SafeKey?");

        createAccountButton.setBackground(new java.awt.Color(0, 0, 0));
        createAccountButton.setFont(new java.awt.Font("Hiragino Mincho ProN", 0, 13)); // NOI18N
        createAccountButton.setForeground(new java.awt.Color(153, 204, 255));
        createAccountButton.setText("Create Account");
        createAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createAccountButtonActionPerformed(evt);
            }
        });

        recoverAccountButton.setBackground(new java.awt.Color(0, 0, 0));
        recoverAccountButton.setFont(new java.awt.Font("Hiragino Mincho ProN", 0, 13)); // NOI18N
        recoverAccountButton.setForeground(new java.awt.Color(153, 204, 255));
        recoverAccountButton.setText("Recover Account");
        recoverAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recoverAccountButtonActionPerformed(evt);
            }
        });

        recoverAccountLabel.setFont(new java.awt.Font("Hiragino Mincho ProN", 0, 13)); // NOI18N
        recoverAccountLabel.setText("Forgot Password?");

        passwordText.setFont(new java.awt.Font("Hiragino Mincho ProN", 0, 13)); // NOI18N

        loginFailed.setFont(new java.awt.Font("Hiragino Mincho ProN", 0, 13)); // NOI18N
        loginFailed.setForeground(new java.awt.Color(255, 0, 0));
        loginFailed.setText("Login failed");

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(loginPanelLayout.createSequentialGroup()
                                .addComponent(userNameLabel)
                                .addGap(57, 57, 57)
                                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(passwordLabel)
                            .addComponent(userNameText, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                            .addComponent(passwordText)))
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(createAccountLabel)
                            .addComponent(recoverAccountLabel)))
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(recoverAccountButton)
                            .addComponent(createAccountButton, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(loginFailed)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(userNameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE))
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(userNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginFailed, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(loginButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(createAccountLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(createAccountButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(recoverAccountLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(recoverAccountButton)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents



    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        // if passcode is correct, login to server
                String passStr = new String(passwordText.getPassword());
                u = new User(userNameText.getText(), passStr);
                AccountAccessIF account = new AccountAccessProtectionProxy();
                try {
                    if(account.accessHomePage(u, userNameText.getText(), passStr)){//if entered username and passcode
                        this.dispose(); // close login page
                    }
                    else{
                        userNameText.setText("");
                        passwordText.setText("");
                        loginFailed.setVisible(true);
                    }
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
    }//GEN-LAST:event_loginButtonActionPerformed

    private void createAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createAccountButtonActionPerformed
        // if create account is pressed, create account window on server
                new CreateAccountScreen();
                this.dispose(); // close login window
    }//GEN-LAST:event_createAccountButtonActionPerformed

    private void recoverAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recoverAccountButtonActionPerformed
        this.dispose();
        new RecoveryScreen();
    }//GEN-LAST:event_recoverAccountButtonActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new LoginScreen().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createAccountButton;
    private javax.swing.JLabel createAccountLabel;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel loginFailed;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JPasswordField passwordText;
    private javax.swing.JButton recoverAccountButton;
    private javax.swing.JLabel recoverAccountLabel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel userNameLabel;
    private javax.swing.JTextField userNameText;
    // End of variables declaration//GEN-END:variables
}