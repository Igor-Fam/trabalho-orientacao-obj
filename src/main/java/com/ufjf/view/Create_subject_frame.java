// Erick Peterman Mendes - 202065557C
// Igor Miranda Fam - 202065563C


package com.ufjf.view;

import com.ufjf.controller.SubjectFiles;
import com.ufjf.model.Subject;

public class Create_subject_frame extends javax.swing.JFrame {


    public Create_subject_frame() {
        initComponents();
    }
                     
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        name_textfield = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        dp_textfield = new javax.swing.JTextField();
        create_subject_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Nome da disciplina:");

        name_textfield.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Departamento:");

        dp_textfield.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        create_subject_button.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        create_subject_button.setText("Criar Disciplina");
        create_subject_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                create_subject_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(name_textfield)
                    .addComponent(dp_textfield)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(create_subject_button))
                        .addGap(0, 149, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(name_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dp_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                .addComponent(create_subject_button)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void create_subject_buttonActionPerformed(java.awt.event.ActionEvent evt) {                                                      
        SubjectFiles.writeSubject(new Subject(name_textfield.getText().replaceAll("\\s",""), name_textfield.getText(), dp_textfield.getText()));
        new Main_frame().setVisible(true);
        this.dispose();
    }                                                     
  
    private javax.swing.JButton create_subject_button;
    private javax.swing.JTextField dp_textfield;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField name_textfield;             
}
