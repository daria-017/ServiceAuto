package proiectjava.serviceauto;




/**
 *
 * @author Daria
 */
public class SignUp extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public SignUp() {
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
        logo = new javax.swing.JLabel();
        copyright = new javax.swing.JLabel();
        Left = new javax.swing.JPanel();
        titlu = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        passwordSignUp = new javax.swing.JPasswordField();
        LoginButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        SignUpButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        fullNameSignUp = new javax.swing.JTextField();
        emailSignUp = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");

        jPanel1.setBackground(new java.awt.Color(242, 242, 242));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        Right.setBackground(new java.awt.Color(0, 102, 102));
        Right.setPreferredSize(new java.awt.Dimension(400, 500));

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proiectjava/serviceauto/Dealership_logo_200px.png"))); // NOI18N
        logo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        logo.setMaximumSize(new java.awt.Dimension(100, 100));
        logo.setMinimumSize(new java.awt.Dimension(100, 100));
        logo.setPreferredSize(new java.awt.Dimension(100, 100));

        copyright.setBackground(new java.awt.Color(0, 102, 102));
        copyright.setForeground(new java.awt.Color(216, 214, 196));
        copyright.setText("copyright © Dealership. All rights reserved.");
        copyright.setOpaque(true);

        javax.swing.GroupLayout RightLayout = new javax.swing.GroupLayout(Right);
        Right.setLayout(RightLayout);
        RightLayout.setHorizontalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightLayout.createSequentialGroup()
                .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RightLayout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(RightLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(copyright)))
                .addContainerGap(108, Short.MAX_VALUE))
        );
        RightLayout.setVerticalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightLayout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 152, Short.MAX_VALUE)
                .addComponent(copyright)
                .addContainerGap())
        );

        logo.getAccessibleContext().setAccessibleName("Logo");

        jPanel1.add(Right);
        Right.setBounds(0, 0, 400, 500);

        Left.setBackground(new java.awt.Color(216, 214, 196));
        Left.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        titlu.setBackground(new java.awt.Color(242, 242, 242));
        titlu.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        titlu.setForeground(new java.awt.Color(0, 102, 102));
        titlu.setText("SIGN UP");

        jLabel2.setBackground(new java.awt.Color(242, 242, 242));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Password");

        jLabel3.setBackground(new java.awt.Color(242, 242, 242));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Email");

        passwordSignUp.setBackground(new java.awt.Color(216, 214, 196));

        LoginButton2.setBackground(new java.awt.Color(216, 214, 196));
        LoginButton2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        LoginButton2.setForeground(new java.awt.Color(0, 102, 102));
        LoginButton2.setText("Login");
        LoginButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LoginButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LoginButton2MousePressed(evt);
            }
        });
        LoginButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButton2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("I have an account");

        SignUpButton2.setBackground(new java.awt.Color(0, 102, 102));
        SignUpButton2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        SignUpButton2.setForeground(new java.awt.Color(216, 214, 196));
        SignUpButton2.setText("SIGN UP");
        SignUpButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SignUpButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SignUpButton2MousePressed(evt);
            }
        });
        SignUpButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUpButton2ActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(242, 242, 242));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Full Name");

        fullNameSignUp.setBackground(new java.awt.Color(216, 214, 196));
        fullNameSignUp.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        emailSignUp.setBackground(new java.awt.Color(216, 214, 196));
        emailSignUp.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        javax.swing.GroupLayout LeftLayout = new javax.swing.GroupLayout(Left);
        Left.setLayout(LeftLayout);
        LeftLayout.setHorizontalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftLayout.createSequentialGroup()
                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LeftLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(passwordSignUp)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeftLayout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(LoginButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(57, 57, 57))
                                .addComponent(fullNameSignUp, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                                .addComponent(emailSignUp, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE))))
                    .addGroup(LeftLayout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(titlu))
                    .addGroup(LeftLayout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(SignUpButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        LeftLayout.setVerticalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(titlu)
                .addGap(21, 21, 21)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fullNameSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SignUpButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LoginButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jPanel1.add(Left);
        Left.setBounds(400, 0, 400, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoginButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButton2ActionPerformed
        // TODO add your handling code here:
        Login LoginFrame = new Login();
        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_LoginButton2ActionPerformed

    private void LoginButton2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginButton2MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_LoginButton2MousePressed

    private void SignUpButton2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignUpButton2MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_SignUpButton2MousePressed

    private void SignUpButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUpButton2ActionPerformed
    // Obține datele introduse de utilizator
    String fullName = fullNameSignUp.getText();
    String email = emailSignUp.getText();
    String password = new String(passwordSignUp.getPassword());

    // Verifică dacă toate câmpurile sunt completate
    if (fullName.isEmpty() || email.isEmpty() || password.isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(this, "Toate câmpurile trebuie completate!", "Eroare", javax.swing.JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Salvare în fișier
    try (java.io.FileWriter writer = new java.io.FileWriter("users.txt", true)) {
        writer.write(fullName + "," + email + "," + password + "\n");
        javax.swing.JOptionPane.showMessageDialog(this, "Contul a fost creat cu succes!", "Succes", javax.swing.JOptionPane.INFORMATION_MESSAGE);

        // După salvare, curăță câmpurile
        fullNameSignUp.setText("");
        emailSignUp.setText("");
        passwordSignUp.setText("");
    } catch (java.io.IOException e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Eroare la salvarea datelor!", "Eroare", javax.swing.JOptionPane.ERROR_MESSAGE);
    
    }//GEN-LAST:event_SignUpButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    }
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
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Left;
    private javax.swing.JButton LoginButton2;
    private javax.swing.JPanel Right;
    private javax.swing.JButton SignUpButton2;
    private javax.swing.JLabel copyright;
    private javax.swing.JTextField emailSignUp;
    private javax.swing.JTextField fullNameSignUp;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logo;
    private javax.swing.JPasswordField passwordSignUp;
    private javax.swing.JLabel titlu;
    // End of variables declaration//GEN-END:variables
}
