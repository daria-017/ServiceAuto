package proiectjava.serviceauto;

import javax.swing.ImageIcon;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


/**
 *
 * @author Daria
 */
public class Login extends javax.swing.JFrame {

    ImageIcon logo200x = new ImageIcon("logo200x.png");
    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Right = new javax.swing.JPanel();
        copyrightLogin = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Left = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        emailLogin = new javax.swing.JTextField();
        passwordLogin = new javax.swing.JPasswordField();
        SignUpButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        LoginButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");

        jPanel1.setBackground(new java.awt.Color(242, 242, 242));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        Right.setBackground(new java.awt.Color(0, 102, 102));
        Right.setPreferredSize(new java.awt.Dimension(400, 500));

        copyrightLogin.setBackground(new java.awt.Color(0, 102, 102));
        copyrightLogin.setForeground(new java.awt.Color(216, 214, 196));
        copyrightLogin.setText("copyright © Dealership. All rights reserved.");
        copyrightLogin.setOpaque(true);

        jLabel5.setText("jLabel5");

        javax.swing.GroupLayout RightLayout = new javax.swing.GroupLayout(Right);
        Right.setLayout(RightLayout);
        RightLayout.setHorizontalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(copyrightLogin)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RightLayout.createSequentialGroup()
                .addContainerGap(102, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98))
        );
        RightLayout.setVerticalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightLayout.createSequentialGroup()
                .addContainerGap(157, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(141, 141, 141)
                .addComponent(copyrightLogin)
                .addContainerGap())
        );

        jLabel5.setIcon(logo200x);

        jPanel1.add(Right);
        Right.setBounds(0, 0, 400, 500);

        Left.setBackground(new java.awt.Color(216, 214, 196));
        Left.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel1.setBackground(new java.awt.Color(242, 242, 242));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("LOGIN");

        jLabel2.setBackground(new java.awt.Color(242, 242, 242));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Password");

        jLabel3.setBackground(new java.awt.Color(242, 242, 242));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Email");

        emailLogin.setBackground(new java.awt.Color(216, 214, 196));
        emailLogin.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        emailLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailLoginActionPerformed(evt);
            }
        });

        passwordLogin.setBackground(new java.awt.Color(216, 214, 196));

        SignUpButton1.setBackground(new java.awt.Color(216, 214, 196));
        SignUpButton1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        SignUpButton1.setForeground(new java.awt.Color(0, 102, 102));
        SignUpButton1.setText("Sign up");
        SignUpButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SignUpButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SignUpButton1MousePressed(evt);
            }
        });
        SignUpButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUpButton1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("I don't have an account");

        LoginButton1.setBackground(new java.awt.Color(0, 102, 102));
        LoginButton1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        LoginButton1.setForeground(new java.awt.Color(216, 214, 196));
        LoginButton1.setText("Login");
        LoginButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LoginButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LoginButton1MousePressed(evt);
            }
        });
        LoginButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LeftLayout = new javax.swing.GroupLayout(Left);
        Left.setLayout(LeftLayout);
        LeftLayout.setHorizontalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftLayout.createSequentialGroup()
                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LeftLayout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(jLabel1))
                    .addGroup(LeftLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(emailLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                            .addComponent(passwordLogin)
                            .addGroup(LeftLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(SignUpButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(LeftLayout.createSequentialGroup()
                    .addGap(155, 155, 155)
                    .addComponent(LoginButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(155, Short.MAX_VALUE)))
        );
        LeftLayout.setVerticalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109)
                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SignUpButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(65, Short.MAX_VALUE))
            .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeftLayout.createSequentialGroup()
                    .addContainerGap(314, Short.MAX_VALUE)
                    .addComponent(LoginButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(146, 146, 146)))
        );

        jPanel1.add(Left);
        Left.setBounds(400, 0, 400, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SignUpButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUpButton1ActionPerformed
        // TODO add your handling code here:
        SignUp SignUpFrame = new SignUp();
        SignUpFrame.setVisible(true);
        SignUpFrame.pack();
        SignUpFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_SignUpButton1ActionPerformed

    private void SignUpButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignUpButton1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_SignUpButton1MousePressed

    private void LoginButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginButton1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_LoginButton1MousePressed

    private void LoginButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButton1ActionPerformed
    // Obține datele introduse de utilizator
    String email = emailLogin.getText();
    String password = new String(passwordLogin.getPassword());

    // Verifică dacă toate câmpurile sunt completate
    if (email.isEmpty() || password.isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(this, "Toate câmpurile trebuie completate!", "Eroare", javax.swing.JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Verifică dacă datele există în fișier
    boolean isAuthenticated = false;

    try (java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.FileReader("users.txt"))) {
        String line;
        while ((line = reader.readLine()) != null) {
            String[] userData = line.split(",");
            if (userData.length == 3) {
                String savedEmail = userData[1];
                String savedPassword = userData[2];
                if (email.equals(savedEmail) && password.equals(savedPassword)) {
                    isAuthenticated = true;
                    break;
                }
            }
        }
    } catch (java.io.IOException e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Eroare la citirea datelor!", "Eroare", javax.swing.JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Afișează mesaj în funcție de rezultat
    if (isAuthenticated) {
        javax.swing.JOptionPane.showMessageDialog(this, "Autentificare reușită!", "Succes", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        
        // Redirecționează utilizatorul către pagina principală
        HomePage HomeFrame = new HomePage();
        HomeFrame.setVisible(true);
        HomeFrame.pack();
        HomeFrame.setLocationRelativeTo(null);
        this.dispose();
    } else {
        javax.swing.JOptionPane.showMessageDialog(this, "Email sau parolă incorecte!", "Eroare", javax.swing.JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_LoginButton1ActionPerformed

    private void emailLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailLoginActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Left;
    private javax.swing.JButton LoginButton1;
    private javax.swing.JPanel Right;
    private javax.swing.JButton SignUpButton1;
    private javax.swing.JLabel copyrightLogin;
    private javax.swing.JTextField emailLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField passwordLogin;
    // End of variables declaration//GEN-END:variables
}
