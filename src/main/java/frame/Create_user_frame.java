// Erick Peterman Mendes - 202065557C
// Igor Miranda Fam - 202065563C


package frame;

import control.Login;
import javax.swing.*;
import moodle.Student;
import moodle.Teacher;

public class Create_user_frame extends javax.swing.JFrame {


    public Create_user_frame() {
        initComponents();
    }
                         
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        name_textfield = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        username_textfield = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        password_textfield = new javax.swing.JPasswordField();
        new_user_button = new javax.swing.JButton();
        professor_button = new javax.swing.JRadioButton();
        student_button = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Nome:");

        name_textfield.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Usuário:");

        username_textfield.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("Senha:");

        password_textfield.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        new_user_button.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        new_user_button.setText("Novo usuario");
        new_user_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new_user_buttonActionPerformed(evt);
            }
        });

        buttonGroup1.add(professor_button);
        professor_button.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        professor_button.setText("Professor");

        buttonGroup1.add(student_button);
        student_button.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        student_button.setText("Estudante");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(name_textfield)
                    .addComponent(username_textfield)
                    .addComponent(password_textfield)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(student_button)
                            .addComponent(professor_button)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(new_user_button))
                        .addGap(0, 178, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(name_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(username_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(password_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(professor_button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(student_button)
                .addGap(18, 18, 18)
                .addComponent(new_user_button)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void new_user_buttonActionPerformed(java.awt.event.ActionEvent evt) {                                                
        if(professor_button.isSelected()){
            Login.writeUser(new Teacher(username_textfield.getText(), name_textfield.getText(), new String(password_textfield.getPassword())));
            new Main_frame().setVisible(true);
            this.dispose();
        }else if(student_button.isSelected()){
            Login.writeUser(new Student(username_textfield.getText(), name_textfield.getText(), new String(password_textfield.getPassword())));
            new Main_frame().setVisible(true);
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(new JFrame(), "Selecione o tipo de usuario!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }                                               
                
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField name_textfield;
    private javax.swing.JButton new_user_button;
    private javax.swing.JPasswordField password_textfield;
    private javax.swing.JRadioButton professor_button;
    private javax.swing.JRadioButton student_button;
    private javax.swing.JTextField username_textfield;
}
