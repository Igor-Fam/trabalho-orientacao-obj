// Erick Peterman Mendes - 202065557C
// Igor Miranda Fam - 202065563C


package com.ufjf.view;

import com.ufjf.controller.Login;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.JList;
import javax.swing.event.*;
import com.ufjf.model.*;



public class Test_Frame extends javax.swing.JFrame implements ListSelectionListener{
    
    private User user;
    private Test test;
    private JList list;
    private Subject subj;
    private Subject_frame sf;
    private int selected_index;
    private int quest_number;
    private int nota;
    
    
    public Test_Frame() {
        initComponents();
    }

    public Test_Frame(JList _list, Subject_frame _sf){
        list=_list;
        sf=_sf;
        subj=_sf.getSubj();
        quest_number = 1;
        nota=0;
        user = Login.authUser;
    }
    
    @Override
    public void valueChanged(ListSelectionEvent e) {
        
        if(!e.getValueIsAdjusting() && (list.getSelectedValue() instanceof Test)){
            initComponents();
            selected_index = list.getSelectedIndex();
            test =(Test) list.getModel().getElementAt(selected_index);
            sf.dispose();
            new Subject_frame(subj).setVisible(true);
            this.setVisible(true);
            title.setText(test.getTitle());
            setup();
        }
    }
    
    public void setup(){
        question_details.setText(test.getQuestion(quest_number-1).getStatement());
        switch (quest_number){
            case 1:
                alternative_1.setText(test.getQuestion(quest_number-1).getAlternative(quest_number-1));
                break;
            case 2:
                alternative_2.setText(test.getQuestion(quest_number-1).getAlternative(quest_number-1));
                break;
            case 3:
                alternative_3.setText(test.getQuestion(quest_number-1).getAlternative(quest_number-1));
                break;
            case 4:
                alternative_4.setText(test.getQuestion(quest_number-1).getAlternative(quest_number-1));
                break;
        }
    }
    
    public int getSelectedButtonIndex(){
        int i=1;
        for(Enumeration<AbstractButton> buttons = alternativas_grupo.getElements();buttons.hasMoreElements();){
            AbstractButton button = buttons.nextElement();
            if(button.isSelected()){
                return i;
            }
            i++;
        }
        return 0;
    }
    
    private void initComponents() {

        alternativas_grupo = new javax.swing.ButtonGroup();
        top_panel = new javax.swing.JPanel();
        student_name = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        next_question_button = new javax.swing.JButton();
        question_panel = new javax.swing.JPanel();
        question_title = new javax.swing.JPanel();
        question_number = new javax.swing.JLabel();
        question_details = new javax.swing.JLabel();
        alternatives_panel = new javax.swing.JPanel();
        alternative_1 = new javax.swing.JRadioButton();
        alternative_2 = new javax.swing.JRadioButton();
        alternative_3 = new javax.swing.JRadioButton();
        alternative_4 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        student_name.setBackground(new java.awt.Color(255, 255, 255));
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
                .addComponent(student_name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setLayout(new java.awt.GridBagLayout());

        title.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Avaliacao 1");
        jPanel1.add(title, new java.awt.GridBagConstraints());

        next_question_button.setText("Pr??xima quest??o >>");
        next_question_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                next_question_buttonActionPerformed(evt);
            }
        });

        question_number.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        question_number.setText("Quest??o 1)");

        question_details.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        question_details.setText("<html>\nEnunciado\n<br>\nda Questao");

        javax.swing.GroupLayout question_titleLayout = new javax.swing.GroupLayout(question_title);
        question_title.setLayout(question_titleLayout);
        question_titleLayout.setHorizontalGroup(
            question_titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(question_titleLayout.createSequentialGroup()
                .addComponent(question_number)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(question_details, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 326, Short.MAX_VALUE))
        );
        question_titleLayout.setVerticalGroup(
            question_titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(question_titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(question_number)
                .addComponent(question_details, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        alternativas_grupo.add(alternative_1);
        alternative_1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        alternative_1.setText("Alternativa 1");

        alternativas_grupo.add(alternative_2);
        alternative_2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        alternative_2.setText("Alternativa 2");

        alternativas_grupo.add(alternative_3);
        alternative_3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        alternative_3.setText("Alternativa 3");

        alternativas_grupo.add(alternative_4);
        alternative_4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        alternative_4.setText("Alternativa 4");
        alternative_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alternative_4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout alternatives_panelLayout = new javax.swing.GroupLayout(alternatives_panel);
        alternatives_panel.setLayout(alternatives_panelLayout);
        alternatives_panelLayout.setHorizontalGroup(
            alternatives_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(alternatives_panelLayout.createSequentialGroup()
                .addGroup(alternatives_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(alternative_1)
                    .addComponent(alternative_2)
                    .addComponent(alternative_3)
                    .addComponent(alternative_4))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        alternatives_panelLayout.setVerticalGroup(
            alternatives_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(alternatives_panelLayout.createSequentialGroup()
                .addComponent(alternative_1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(alternative_2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(alternative_3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(alternative_4))
        );

        javax.swing.GroupLayout question_panelLayout = new javax.swing.GroupLayout(question_panel);
        question_panel.setLayout(question_panelLayout);
        question_panelLayout.setHorizontalGroup(
            question_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(question_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(question_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(question_title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(alternatives_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        question_panelLayout.setVerticalGroup(
            question_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(question_panelLayout.createSequentialGroup()
                .addComponent(question_title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(alternatives_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(top_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(question_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(next_question_button)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(top_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(question_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(next_question_button)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void alternative_4ActionPerformed(java.awt.event.ActionEvent evt) {
       
    }

    private void next_question_buttonActionPerformed(java.awt.event.ActionEvent evt) {
        if(test.getQuestion(quest_number-1).answerQuestion(getSelectedButtonIndex())){
            nota++;
        }
        quest_number++;
        setup();
        if(quest_number==5){
            ((Student)user).addNota(subj.getId(), test.getId(), nota);
            this.dispose();
        }
    }

    private javax.swing.ButtonGroup alternativas_grupo;
    private javax.swing.JRadioButton alternative_1;
    private javax.swing.JRadioButton alternative_2;
    private javax.swing.JRadioButton alternative_3;
    private javax.swing.JRadioButton alternative_4;
    private javax.swing.JPanel alternatives_panel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton next_question_button;
    private javax.swing.JLabel question_details;
    private javax.swing.JLabel question_number;
    private javax.swing.JPanel question_panel;
    private javax.swing.JPanel question_title;
    private javax.swing.JLabel student_name;
    private javax.swing.JLabel title;
    private javax.swing.JPanel top_panel;
}
