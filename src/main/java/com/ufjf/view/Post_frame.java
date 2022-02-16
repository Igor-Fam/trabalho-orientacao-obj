// Erick Peterman Mendes - 202065557C
// Igor Miranda Fam - 202065563C


package com.ufjf.view;

import javax.swing.*;
import javax.swing.event.*;

import com.ufjf.controller.Login;
import com.ufjf.model.Post;
import com.ufjf.model.Subject;

public class Post_frame extends javax.swing.JFrame implements ListSelectionListener{

    private Post post;
    private JList list;
    private Subject subj;
    private Subject_frame sf;
    private int selected_index;
    
    public Post_frame() {
        initComponents();
    }

    public Post_frame(JList _list, Subject_frame _sf){
        list=_list;
        sf=_sf;
        subj=_sf.getSubj();
    }
    
    @Override
    public void valueChanged(ListSelectionEvent e) {
        System.out.println(list.getSelectedValue().getClass().getSimpleName());
        
        if((!e.getValueIsAdjusting()) && (list.getSelectedValue() instanceof Post)){
            initComponents();
            selected_index = list.getSelectedIndex();
            post = (Post) list.getModel().getElementAt(selected_index);
            sf.dispose();
            new Subject_frame(subj).setVisible(true);
            this.setVisible(true);
            title.setText(post.getTitle());
            post_text_area.setText(post.getText());
            post_date.setText(post.getSubtitle());
        }
    }

    private void initComponents() {

        top_panel = new javax.swing.JPanel();
        student_name = new javax.swing.JLabel();
        scroll_pane = new javax.swing.JScrollPane();
        post_text_area = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        post_date = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        student_name.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        student_name.setText(Login.authUser.getName());

        javax.swing.GroupLayout top_panelLayout = new javax.swing.GroupLayout(top_panel);
        top_panel.setLayout(top_panelLayout);
        top_panelLayout.setHorizontalGroup(
            top_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(top_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(student_name)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        top_panelLayout.setVerticalGroup(
            top_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(top_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(student_name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        scroll_pane.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        scroll_pane.setHorizontalScrollBar(null);

        post_text_area.setEditable(false);
        post_text_area.setColumns(20);
        post_text_area.setLineWrap(true);
        post_text_area.setRows(5);
        post_text_area.setText("Texto da postagem");
        post_text_area.setWrapStyleWord(true);
        scroll_pane.setViewportView(post_text_area);

        jPanel1.setLayout(new java.awt.GridBagLayout());

        title.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Postagem 1");
        jPanel1.add(title, new java.awt.GridBagConstraints());

        post_date.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        post_date.setForeground(new java.awt.Color(0, 204, 255));
        post_date.setText("Data");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(post_date)
                    .addComponent(scroll_pane, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(top_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(top_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scroll_pane, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(post_date)
                .addContainerGap())
        );

        pack();
    }


    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel post_date;
    private javax.swing.JTextArea post_text_area;
    private javax.swing.JScrollPane scroll_pane;
    private javax.swing.JLabel student_name;
    private javax.swing.JLabel title;
    private javax.swing.JPanel top_panel;

}
