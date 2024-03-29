/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edu.csusm;

/**
 *
 * @author carterrath
 */
public class RecoveryScreen extends javax.swing.JFrame {
    String[] userInfo;
    /**
     * Creates new form RecoveryScreen
     */
    public RecoveryScreen() {
        initComponents();
        setLocationRelativeTo(null);
        userNotFound.setVisible(false);
        wrongAnswer.setVisible(false);
        this.setVisible(true);
        questionPanel.setVisible(false);
        updatePasswordPanel.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AccountRecoverPanel = new javax.swing.JLayeredPane();
        userPanel = new javax.swing.JPanel();
        recoveryTitle = new javax.swing.JLabel();
        recoverUserLabel = new javax.swing.JLabel();
        userNameText = new javax.swing.JTextField();
        enterButton = new javax.swing.JButton();
        loginReturn = new javax.swing.JButton();
        userNotFound = new javax.swing.JLabel();
        questionPanel = new javax.swing.JPanel();
        questionLabel = new javax.swing.JLabel();
        verifyButton = new javax.swing.JButton();
        wrongAnswer = new javax.swing.JLabel();
        answerText = new javax.swing.JPasswordField();
        updatePasswordPanel = new javax.swing.JPanel();
        saveButton = new javax.swing.JButton();
        newPassLabel = new javax.swing.JLabel();
        newPassText = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 204, 255));

        AccountRecoverPanel.setBackground(new java.awt.Color(153, 204, 255));

        userPanel.setBackground(new java.awt.Color(153, 204, 255));

        recoveryTitle.setFont(new java.awt.Font("Hiragino Mincho ProN", 0, 18)); // NOI18N
        recoveryTitle.setText("SafeKey");

        recoverUserLabel.setFont(new java.awt.Font("Hiragino Mincho ProN", 0, 13)); // NOI18N
        recoverUserLabel.setText("Username");

        userNameText.setFont(new java.awt.Font("Hiragino Mincho ProN", 0, 13)); // NOI18N

        enterButton.setBackground(new java.awt.Color(0, 0, 0));
        enterButton.setFont(new java.awt.Font("Hiragino Mincho ProN", 0, 13)); // NOI18N
        enterButton.setForeground(new java.awt.Color(153, 204, 255));
        enterButton.setText("Enter");
        enterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterButtonActionPerformed(evt);
            }
        });

        loginReturn.setBackground(new java.awt.Color(0, 0, 0));
        loginReturn.setFont(new java.awt.Font("Hiragino Mincho ProN", 0, 13)); // NOI18N
        loginReturn.setForeground(new java.awt.Color(153, 204, 255));
        loginReturn.setText("Back to login");
        loginReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginReturnActionPerformed(evt);
            }
        });

        userNotFound.setFont(new java.awt.Font("Hiragino Mincho ProN", 0, 13)); // NOI18N
        userNotFound.setForeground(new java.awt.Color(255, 0, 0));
        userNotFound.setText("User does not exist");

        javax.swing.GroupLayout userPanelLayout = new javax.swing.GroupLayout(userPanel);
        userPanel.setLayout(userPanelLayout);
        userPanelLayout.setHorizontalGroup(
            userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, userPanelLayout.createSequentialGroup()
                .addGroup(userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, userPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(loginReturn)
                        .addGap(18, 18, 18)
                        .addComponent(enterButton))
                    .addGroup(userPanelLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(userPanelLayout.createSequentialGroup()
                                .addGap(0, 142, Short.MAX_VALUE)
                                .addComponent(recoveryTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(125, 125, 125))
                            .addComponent(userNameText)
                            .addGroup(userPanelLayout.createSequentialGroup()
                                .addComponent(recoverUserLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(userNotFound)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(62, 62, 62))
        );
        userPanelLayout.setVerticalGroup(
            userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userPanelLayout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(recoveryTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(recoverUserLabel)
                    .addComponent(userNotFound))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterButton)
                    .addComponent(loginReturn))
                .addGap(226, 226, 226))
        );

        questionPanel.setBackground(new java.awt.Color(153, 204, 255));

        questionLabel.setFont(new java.awt.Font("Hiragino Mincho ProN", 0, 13)); // NOI18N
        questionLabel.setText("Question");

        verifyButton.setBackground(new java.awt.Color(0, 0, 0));
        verifyButton.setFont(new java.awt.Font("Hiragino Mincho ProN", 0, 13)); // NOI18N
        verifyButton.setForeground(new java.awt.Color(153, 204, 255));
        verifyButton.setText("Verify");
        verifyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    verifyButtonActionPerformed(evt);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        });

        wrongAnswer.setFont(new java.awt.Font("Hiragino Mincho ProN", 0, 13)); // NOI18N
        wrongAnswer.setForeground(new java.awt.Color(255, 0, 0));
        wrongAnswer.setText("Answer is wrong");

        javax.swing.GroupLayout questionPanelLayout = new javax.swing.GroupLayout(questionPanel);
        questionPanel.setLayout(questionPanelLayout);
        questionPanelLayout.setHorizontalGroup(
            questionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, questionPanelLayout.createSequentialGroup()
                .addGroup(questionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, questionPanelLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(questionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(questionPanelLayout.createSequentialGroup()
                                .addComponent(questionLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(answerText)))
                    .addGroup(questionPanelLayout.createSequentialGroup()
                        .addContainerGap(215, Short.MAX_VALUE)
                        .addComponent(wrongAnswer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(verifyButton)))
                .addGap(55, 55, 55))
        );
        questionPanelLayout.setVerticalGroup(
            questionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(questionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(questionLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(answerText, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(questionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(verifyButton)
                    .addComponent(wrongAnswer))
                .addContainerGap(128, Short.MAX_VALUE))
        );

        updatePasswordPanel.setBackground(new java.awt.Color(153, 204, 255));

        saveButton.setBackground(new java.awt.Color(0, 0, 0));
        saveButton.setFont(new java.awt.Font("Hiragino Mincho ProN", 0, 13)); // NOI18N
        saveButton.setForeground(new java.awt.Color(153, 204, 255));
        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    saveButtonActionPerformed(evt);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        });

        newPassLabel.setFont(new java.awt.Font("Hiragino Mincho ProN", 0, 13)); // NOI18N
        newPassLabel.setText("New Password");

        javax.swing.GroupLayout updatePasswordPanelLayout = new javax.swing.GroupLayout(updatePasswordPanel);
        updatePasswordPanel.setLayout(updatePasswordPanelLayout);
        updatePasswordPanelLayout.setHorizontalGroup(
            updatePasswordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updatePasswordPanelLayout.createSequentialGroup()
                .addGroup(updatePasswordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, updatePasswordPanelLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(updatePasswordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(updatePasswordPanelLayout.createSequentialGroup()
                                .addComponent(newPassLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 253, Short.MAX_VALUE))
                            .addComponent(newPassText)))
                    .addGroup(updatePasswordPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(saveButton)))
                .addGap(57, 57, 57))
        );
        updatePasswordPanelLayout.setVerticalGroup(
            updatePasswordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updatePasswordPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(newPassLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newPassText, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(saveButton)
                .addGap(14, 14, 14))
        );

        AccountRecoverPanel.setLayer(userPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        AccountRecoverPanel.setLayer(questionPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        AccountRecoverPanel.setLayer(updatePasswordPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout AccountRecoverPanelLayout = new javax.swing.GroupLayout(AccountRecoverPanel);
        AccountRecoverPanel.setLayout(AccountRecoverPanelLayout);
        AccountRecoverPanelLayout.setHorizontalGroup(
            AccountRecoverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(userPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(AccountRecoverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(questionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(AccountRecoverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(updatePasswordPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        AccountRecoverPanelLayout.setVerticalGroup(
            AccountRecoverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(userPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(AccountRecoverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AccountRecoverPanelLayout.createSequentialGroup()
                    .addGap(0, 156, Short.MAX_VALUE)
                    .addComponent(questionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(AccountRecoverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AccountRecoverPanelLayout.createSequentialGroup()
                    .addGap(0, 257, Short.MAX_VALUE)
                    .addComponent(updatePasswordPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AccountRecoverPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AccountRecoverPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterButtonActionPerformed
        userInfo = UserDAO.parseFile(userNameText.getText());
        if(userInfo == null) {
            userNotFound.setVisible(true);
        }
        else{
            userNotFound.setVisible(false);
            questionLabel.setText(userInfo[2]);
            questionPanel.setVisible(true);
        }
    }//GEN-LAST:event_enterButtonActionPerformed

    private void verifyButtonActionPerformed(java.awt.event.ActionEvent evt) throws Exception {//GEN-FIRST:event_verifyButtonActionPerformed
        String answerStr = new String(answerText.getPassword());
        if(answerStr.equals(userInfo[3])){
            wrongAnswer.setVisible(false);
            updatePasswordPanel.setVisible(true);
        }
        else{
            wrongAnswer.setVisible(true);
        }
    }//GEN-LAST:event_verifyButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
        String passStr = new String(newPassText.getPassword());
        UserDAO.updateAccountPassword(userNameText.getText(), passStr);
        this.dispose();
        new LoginScreen();
    }                                          

    private void loginReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginReturnActionPerformed
        this.dispose();
        new LoginScreen();
    }//GEN-LAST:event_loginReturnActionPerformed

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
//            java.util.logging.Logger.getLogger(RecoveryScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(RecoveryScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(RecoveryScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(RecoveryScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new RecoveryScreen().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane AccountRecoverPanel;
    private javax.swing.JPasswordField answerText;
    private javax.swing.JButton enterButton;
    private javax.swing.JButton loginReturn;
    private javax.swing.JLabel newPassLabel;
    private javax.swing.JPasswordField newPassText;
    private javax.swing.JLabel questionLabel;
    private javax.swing.JPanel questionPanel;
    private javax.swing.JLabel recoverUserLabel;
    private javax.swing.JLabel recoveryTitle;
    private javax.swing.JButton saveButton;
    private javax.swing.JPanel updatePasswordPanel;
    private javax.swing.JTextField userNameText;
    private javax.swing.JLabel userNotFound;
    private javax.swing.JPanel userPanel;
    private javax.swing.JButton verifyButton;
    private javax.swing.JLabel wrongAnswer;
    // End of variables declaration//GEN-END:variables
}
