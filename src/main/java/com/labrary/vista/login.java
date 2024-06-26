/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.labrary.vista;

import java.awt.Color;
import com.labrary.control.LoginControl;
/**
 *
 * @author yimis
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form LOgin
     */
    public login() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgrond = new javax.swing.JPanel();
        exitPanel = new javax.swing.JPanel();
        exitBtn = new javax.swing.JLabel();
        loginPanel = new javax.swing.JPanel();
        nameProgram = new javax.swing.JLabel();
        loginText = new javax.swing.JLabel();
        userText = new javax.swing.JLabel();
        userTxt = new javax.swing.JTextField();
        userSeparator = new javax.swing.JSeparator();
        passwordText = new javax.swing.JLabel();
        passwordTxt = new javax.swing.JPasswordField();
        passwordSeparator = new javax.swing.JSeparator();
        logBtn = new javax.swing.JPanel();
        logText = new javax.swing.JLabel();
        infoPanel = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        otherOptions = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        backgrond.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exitPanel.setBackground(new java.awt.Color(255, 255, 255));
        exitPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitPanelMouseExited(evt);
            }
        });

        exitBtn.setFont(new java.awt.Font("Roboto Light", 0, 36)); // NOI18N
        exitBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitBtn.setText("x");
        exitBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        exitBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitBtnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitPanelLayout = new javax.swing.GroupLayout(exitPanel);
        exitPanel.setLayout(exitPanelLayout);
        exitPanelLayout.setHorizontalGroup(
            exitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );
        exitPanelLayout.setVerticalGroup(
            exitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        backgrond.add(exitPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        loginPanel.setBackground(new java.awt.Color(255, 255, 255));
        loginPanel.setForeground(new java.awt.Color(225, 225, 25));

        nameProgram.setFont(new java.awt.Font("Roboto Black", 0, 48)); // NOI18N
        nameProgram.setForeground(new java.awt.Color(234, 190, 63));
        nameProgram.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameProgram.setText("book loan system");
        nameProgram.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        loginText.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        loginText.setText("Login");

        userText.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        userText.setText("User");

        userTxt.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        userTxt.setForeground(new java.awt.Color(204, 204, 204));
        userTxt.setText("Enter your user name");
        userTxt.setBorder(null);
        userTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                userTxtMousePressed(evt);
            }
        });

        userSeparator.setForeground(new java.awt.Color(0, 0, 0));

        passwordText.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        passwordText.setText("Password");

        passwordTxt.setForeground(new java.awt.Color(204, 204, 204));
        passwordTxt.setText("**********");
        passwordTxt.setBorder(null);
        passwordTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                passwordTxtMousePressed(evt);
            }
        });

        passwordSeparator.setForeground(new java.awt.Color(0, 0, 0));

        logBtn.setBackground(new java.awt.Color(204, 204, 204));
        logBtn.setForeground(new java.awt.Color(234, 190, 63));
        logBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logBtnMouseExited(evt);
            }
        });

        logText.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        logText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logText.setText("Login");
        logText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logTextMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logTextMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logTextMouseExited(evt);
            }
        });

        javax.swing.GroupLayout logBtnLayout = new javax.swing.GroupLayout(logBtn);
        logBtn.setLayout(logBtnLayout);
        logBtnLayout.setHorizontalGroup(
            logBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logBtnLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(logText)
                .addContainerGap(61, Short.MAX_VALUE))
        );
        logBtnLayout.setVerticalGroup(
            logBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordText)
                    .addComponent(userText)
                    .addComponent(nameProgram, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginText)
                    .addComponent(userSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(passwordTxt, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(passwordSeparator, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE))
                    .addComponent(userTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(nameProgram, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(loginText)
                .addGap(61, 61, 61)
                .addComponent(userText)
                .addGap(18, 18, 18)
                .addComponent(userTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(passwordText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(logBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        backgrond.add(loginPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 580));

        infoPanel.setBackground(new java.awt.Color(51, 153, 255));

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setText("logo");
        logo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        otherOptions.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        otherOptions.setText("other ptiotions");
        otherOptions.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        otherOptions.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout infoPanelLayout = new javax.swing.GroupLayout(infoPanel);
        infoPanel.setLayout(infoPanelLayout);
        infoPanelLayout.setHorizontalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, infoPanelLayout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(otherOptions, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                    .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(42, 42, 42))
        );
        infoPanelLayout.setVerticalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoPanelLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115)
                .addComponent(otherOptions, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );

        backgrond.add(infoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 0, 210, 580));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgrond, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgrond, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBtnMouseClicked
        System.exit(0);        
    }//GEN-LAST:event_exitBtnMouseClicked

    private void logTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logTextMouseClicked
        // TODO add your handling code here:
        LoginControl loginControl=new LoginControl();
        if( loginControl.loginAuthenticate(userTxt.getText(),passwordTxt.getText())){
            new dashboard().setVisible(true);
            dispose();
        }
        
       
    }//GEN-LAST:event_logTextMouseClicked

    private void userTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userTxtMousePressed
        
        userTxt.setForeground(Color.black);
        passwordTxt.setForeground(Color.gray);
        
        if (passwordTxt.getText().equals("")) {
        passwordTxt.setText("**********");
    }
        
    if (userTxt.getText().equals("Enter your user name")) {
        userTxt.setText("");
    }
    }//GEN-LAST:event_userTxtMousePressed

    private void passwordTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordTxtMousePressed
        passwordTxt.setForeground(Color.black);
        userTxt.setForeground(Color.gray);
        
        if (userTxt.getText().equals("")) {
        userTxt.setText("Enter your user name");
        }
        if (passwordTxt.getText().equals("**********")) {
        passwordTxt.setText("");
         }
    }//GEN-LAST:event_passwordTxtMousePressed

    private void exitPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitPanelMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_exitPanelMouseExited

    private void exitPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitPanelMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_exitPanelMouseEntered

    private void exitBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBtnMouseEntered
        // TODO add your handling code here:
        exitPanel.setBackground(Color.red);
        exitBtn.setForeground(Color.white);
    }//GEN-LAST:event_exitBtnMouseEntered

    private void exitBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBtnMouseExited
        // TODO add your handling code here:
        exitPanel.setBackground(Color.white);
        exitBtn.setForeground(Color.black);
    }//GEN-LAST:event_exitBtnMouseExited

    private void logBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logBtnMouseEntered
        // TODO add your handling code here:
        logBtn.setBackground(Color.blue);
        logText.setForeground(Color.white);
    }//GEN-LAST:event_logBtnMouseEntered

    private void logBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logBtnMouseExited
        // TODO add your handling code here:
        logBtn.setBackground(Color.gray);
        logText.setForeground(Color.black);
        
    }//GEN-LAST:event_logBtnMouseExited

    private void logTextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logTextMouseEntered
        // TODO add your handling code here:
        logBtn.setBackground(Color.blue);
        logText.setForeground(Color.white);
    }//GEN-LAST:event_logTextMouseEntered

    private void logTextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logTextMouseExited
        // TODO add your handling code here:
        logBtn.setBackground(Color.gray);
        logText.setForeground(Color.black);
    }//GEN-LAST:event_logTextMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backgrond;
    private javax.swing.JLabel exitBtn;
    private javax.swing.JPanel exitPanel;
    private javax.swing.JPanel infoPanel;
    private javax.swing.JPanel logBtn;
    private javax.swing.JLabel logText;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JLabel loginText;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel nameProgram;
    private javax.swing.JLabel otherOptions;
    private javax.swing.JSeparator passwordSeparator;
    private javax.swing.JLabel passwordText;
    private javax.swing.JPasswordField passwordTxt;
    private javax.swing.JSeparator userSeparator;
    private javax.swing.JLabel userText;
    private javax.swing.JTextField userTxt;
    // End of variables declaration//GEN-END:variables
}
