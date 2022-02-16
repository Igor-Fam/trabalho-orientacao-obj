// Erick Peterman Mendes - 202065557C
// Igor Miranda Fam - 202065563C


package com.ufjf.view;

import com.ufjf.controller.Login;
import com.ufjf.model.Admin;
import com.ufjf.model.User;

import static java.lang.String.valueOf;

public class Login_frame extends javax.swing.JFrame {

    public Login_frame() {
        initComponents();
    }

    private void initComponents() {

        title = new javax.swing.JLabel();
        login_details = new javax.swing.JPanel();
        email_label = new javax.swing.JLabel();
        username_textfield = new javax.swing.JTextField();
        senha_label = new javax.swing.JLabel();
        password_textfield = new javax.swing.JPasswordField();
        login_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        title.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        title.setText("Moodle");

        email_label.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        email_label.setText("Username:");

        username_textfield.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        senha_label.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        senha_label.setText("Senha:");

        password_textfield.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout login_detailsLayout = new javax.swing.GroupLayout(login_details);
        login_details.setLayout(login_detailsLayout);
        login_detailsLayout.setHorizontalGroup(
            login_detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(login_detailsLayout.createSequentialGroup()
                .addGroup(login_detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(email_label)
                    .addComponent(senha_label)
                    .addComponent(password_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 195, Short.MAX_VALUE))
            .addComponent(username_textfield)
        );
        login_detailsLayout.setVerticalGroup(
            login_detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(login_detailsLayout.createSequentialGroup()
                .addComponent(email_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(username_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(senha_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(password_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        login_button.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        login_button.setText("Login");
        login_button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        login_button.setBorderPainted(false);
        login_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(login_details, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(title)
                            .addComponent(login_button, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(login_details, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(login_button)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void login_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_buttonActionPerformed
        try{
            Login.Authenticate(username_textfield.getText(), valueOf(password_textfield.getPassword()));
            new Main_frame().setVisible(true);
            this.dispose();
        }catch(Exception e){
            System.out.println("Erro no login!");
        }

    }


    public static void main(String args[]) {
        if(Login.readAdmins().isEmpty()){
            User admin = new Admin("Admin", "admin", "admin");
            Login.writeUser(admin);
        }
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_frame().setVisible(true);
            }
        });
    }

    private javax.swing.JLabel email_label;
    private javax.swing.JButton login_button;
    private javax.swing.JPanel login_details;
    private javax.swing.JPasswordField password_textfield;
    private javax.swing.JLabel senha_label;
    private javax.swing.JLabel title;
    private javax.swing.JTextField username_textfield;
}
