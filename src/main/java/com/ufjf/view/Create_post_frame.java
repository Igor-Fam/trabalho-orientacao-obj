// Erick Peterman Mendes - 202065557C
// Igor Miranda Fam - 202065563C


package com.ufjf.view;

import com.ufjf.model.*;


public class Create_post_frame extends javax.swing.JFrame {


    public Create_post_frame() {
        initComponents();
    }
    
    Post pst;
    
    public Create_post_frame(Post new_post) {
    	initComponents();
    	pst = new_post;
    }

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        frame_title = new javax.swing.JLabel();
        title_title = new javax.swing.JLabel();
        title_text = new javax.swing.JTextField();
        text_title = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        text_text = new javax.swing.JTextArea();
        create_post_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        frame_title.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        frame_title.setText("Criar nova Postagem:");
        frame_title.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        title_title.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        title_title.setText("Titulo:");

        title_text.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        text_title.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        text_title.setText("Texto:");

        text_text.setColumns(20);
        text_text.setLineWrap(true);
        text_text.setRows(5);
        text_text.setWrapStyleWord(true);
        jScrollPane1.setViewportView(text_text);

        create_post_button.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        create_post_button.setText("Criar Postagem");
        create_post_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                create_post_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(title_text)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(frame_title)
                    .addComponent(title_title)
                    .addComponent(text_title))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(create_post_button)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(frame_title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(title_title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(title_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(text_title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(create_post_button)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void create_post_buttonActionPerformed(java.awt.event.ActionEvent evt) {
        pst.setTitle(title_text.getText());
        pst.setText(text_text.getText());
        this.dispose();
    }


    private javax.swing.JButton create_post_button;
    private javax.swing.JLabel frame_title;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea text_text;
    private javax.swing.JLabel text_title;
    private javax.swing.JTextField title_text;
    private javax.swing.JLabel title_title;
}
