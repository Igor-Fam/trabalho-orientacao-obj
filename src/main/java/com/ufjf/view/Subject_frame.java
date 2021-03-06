// Erick Peterman Mendes - 202065557C
// Igor Miranda Fam - 202065563C


package com.ufjf.view;

import com.ufjf.controller.Login;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.event.*;
import com.ufjf.model.Post;
import com.ufjf.model.Student;
import com.ufjf.model.Subject;
import com.ufjf.model.Teacher;
import com.ufjf.model.Test;
import com.ufjf.model.User;


public class Subject_frame extends javax.swing.JFrame implements ListSelectionListener{


    private Subject subj;
    private Main_frame mf;
    private JList list;
    private int selected_index;
    
    DefaultListModel<Post> post_model = new DefaultListModel<>();
    DefaultListModel<Test> test_model = new DefaultListModel<>();
    DefaultListModel<Object> users_model = new DefaultListModel<>();
    DefaultListModel<Object> all_users_model = new DefaultListModel<>();    
    public Subject_frame() {
        initComponents();
    }
    
    public Subject_frame(JList _list, Main_frame _mf){
        list=_list;
        mf=_mf;
        initComponents();
        if(Login.authUser.getuserType()!=2){
            registered_users_pane.remove(content_list_registered_users);
        }
        if(Login.authUser.getuserType()!=1){
            create_new_test_button.setVisible(false);
            create_new_post_button.setVisible(false);
        }
    }
    
    public Subject_frame(Subject _subj){
        subj=_subj;
        initComponents();
        setup_sf();
        if(Login.authUser.getuserType()!=2){
            registered_users_pane.remove(content_list_registered_users);
        }
        if(Login.authUser.getuserType()!=1){
            create_new_test_button.setVisible(false);
            create_new_post_button.setVisible(false);
        }
    }
    
    @Override
    public void valueChanged(ListSelectionEvent e){
        if(!e.getValueIsAdjusting()){
            selected_index = list.getSelectedIndex();
            subj = (Subject) list.getModel().getElementAt(selected_index);
            mf.dispose();
            new Main_frame().setVisible(true);
            this.setVisible(true);
            if(Login.authUser.getuserType()!=2){
                registered_users_pane.remove(content_list_registered_users);
            }
            if(Login.authUser.getuserType()!=1){
                create_new_test_button.setVisible(false);
                create_new_post_button.setVisible(false);
            }
            setup_sf();
        }
    }
    
    public void setup_sf(){
        title.setText(subj.getName());
        post_control();
        test_control();
        if(Login.authUser.getuserType()==2){
            registered_users_control();
            all_users_control();
        }
    }
    
    public void registered_users_control(){
        ArrayList<Student> students = subj.getStudents();
        for(Student std : students){
            users_model.addElement(std);
        }
        ArrayList<Teacher> teachers = subj.getTeachers();
        for(Teacher tcr : teachers){
            users_model.addElement(tcr);
        }
        registered_users_list.setModel(users_model);
    }
    
    public void all_users_control(){
        ArrayList<Student> students = Login.readStudents();
        for(Student std : students){
            all_users_model.addElement(std);
        }
        ArrayList<Teacher> teachers = Login.readTeachers();
        for(Teacher tcr : teachers){
            all_users_model.addElement(tcr);
        }
    }
    
    public void post_control(){
        for(Post pst : subj.getPosts()){
            post_model.addElement(pst);
        }
        content_list_post.setModel(post_model);
        content_list_post.addListSelectionListener(new Post_frame(content_list_post,this));
    }
    
    public void test_control(){
        for(Test tst : subj.getTests()){
            test_model.addElement(tst);
        }
        content_list_test.setModel(test_model);
        content_list_post.addListSelectionListener(new Test_Frame(content_list_post,this));
    }
    
    public JList getLista_post(){
        return content_list_post;
    }
    
    public JList getLista_test(){
        return content_list_test;
    }
    
    public Subject getSubj(){
        return subj;
    }
                         
    private void initComponents() {

        top_panel = new javax.swing.JPanel();
        student_name = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        registered_users_pane = new javax.swing.JTabbedPane();
        post_pane = new javax.swing.JPanel();
        create_new_post_button = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        content_list_post = new javax.swing.JList<>();
        test_pane = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        content_list_test = new javax.swing.JList<>();
        create_new_test_button = new javax.swing.JButton();
        content_list_registered_users = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        registered_users_list = new javax.swing.JList<>(users_model);
        register_user = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        all_users_list = new javax.swing.JList<>(all_users_model);
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        student_name.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        student_name.setText(Login.authUser.getName());

        jPanel1.setLayout(new java.awt.GridBagLayout());

        title.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Disciplina");
        jPanel1.add(title, new java.awt.GridBagConstraints());

        javax.swing.GroupLayout top_panelLayout = new javax.swing.GroupLayout(top_panel);
        top_panel.setLayout(top_panelLayout);
        top_panelLayout.setHorizontalGroup(
            top_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        registered_users_pane.setName(""); // NOI18N

        create_new_post_button.setText("Criar nova postagem");
        create_new_post_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                create_new_post_buttonActionPerformed(evt);
            }
        });

        content_list_post.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        content_list_post.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(content_list_post);
        content_list_post.getAccessibleContext().setAccessibleName("tab1");

        javax.swing.GroupLayout post_paneLayout = new javax.swing.GroupLayout(post_pane);
        post_pane.setLayout(post_paneLayout);
        post_paneLayout.setHorizontalGroup(
            post_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)
            .addGroup(post_paneLayout.createSequentialGroup()
                .addComponent(create_new_post_button)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        post_paneLayout.setVerticalGroup(
            post_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(post_paneLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(create_new_post_button))
        );

        registered_users_pane.addTab("Postagens", post_pane);

        content_list_test.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        content_list_test.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane3.setViewportView(content_list_test);

        create_new_test_button.setText("Criar nova avaliacao");
        create_new_test_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                create_new_test_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout test_paneLayout = new javax.swing.GroupLayout(test_pane);
        test_pane.setLayout(test_paneLayout);
        test_paneLayout.setHorizontalGroup(
            test_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(test_paneLayout.createSequentialGroup()
                .addComponent(create_new_test_button)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)
        );
        test_paneLayout.setVerticalGroup(
            test_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, test_paneLayout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(create_new_test_button))
        );

        registered_users_pane.addTab("Avaliacoes", test_pane);

        registered_users_list.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(registered_users_list);

        register_user.setText("<<<");
        register_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                register_userActionPerformed(evt);
            }
        });

        all_users_list.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane4.setViewportView(all_users_list);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Usuarios Registrados");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Usuarios");

        javax.swing.GroupLayout content_list_registered_usersLayout = new javax.swing.GroupLayout(content_list_registered_users);
        content_list_registered_users.setLayout(content_list_registered_usersLayout);
        content_list_registered_usersLayout.setHorizontalGroup(
            content_list_registered_usersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, content_list_registered_usersLayout.createSequentialGroup()
                .addGroup(content_list_registered_usersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(content_list_registered_usersLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(register_user)))
                .addGroup(content_list_registered_usersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(content_list_registered_usersLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel2))
                    .addGroup(content_list_registered_usersLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
        );
        content_list_registered_usersLayout.setVerticalGroup(
            content_list_registered_usersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(content_list_registered_usersLayout.createSequentialGroup()
                .addGroup(content_list_registered_usersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(content_list_registered_usersLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel2)
                        .addGroup(content_list_registered_usersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(content_list_registered_usersLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(register_user)
                                .addGap(116, 116, 116))
                            .addGroup(content_list_registered_usersLayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jScrollPane4))))
                    .addGroup(content_list_registered_usersLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38))
        );

        registered_users_pane.addTab("Usuarios", content_list_registered_users);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(top_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(registered_users_pane)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(top_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registered_users_pane)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void register_userActionPerformed(java.awt.event.ActionEvent evt) {                                          
        users_model.addElement(all_users_list.getSelectedValue());
        registered_users_list.setModel(users_model);
        ((User)all_users_list.getSelectedValue()).addSubject(subj.getId());
    }                                             

    private void create_new_post_buttonActionPerformed(java.awt.event.ActionEvent evt) {                                                       
        subj.createPost();
    }                                                      

    private void create_new_test_buttonActionPerformed(java.awt.event.ActionEvent evt) {                                                       
        subj.createTest();
    }                                                      

       
    private javax.swing.JList<Object> all_users_list;
    private javax.swing.JList<Post> content_list_post;
    private javax.swing.JPanel content_list_registered_users;
    private javax.swing.JList<Test> content_list_test;
    private javax.swing.JButton create_new_post_button;
    private javax.swing.JButton create_new_test_button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPanel post_pane;
    private javax.swing.JButton register_user;
    private javax.swing.JList<Object> registered_users_list;
    private javax.swing.JTabbedPane registered_users_pane;
    private javax.swing.JLabel student_name;
    private javax.swing.JPanel test_pane;
    private javax.swing.JLabel title;
    private javax.swing.JPanel top_panel;     
}
