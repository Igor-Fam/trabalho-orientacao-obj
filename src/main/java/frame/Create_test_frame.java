// Erick Peterman Mendes - 202065557C
// Igor Miranda Fam - 202065563C


package frame;

import java.util.Enumeration;

import javax.swing.AbstractButton;

import control.SubjectFiles;
import moodle.Subject;
import moodle.Test;

public class Create_test_frame extends javax.swing.JFrame {

    Test tst;
    Subject subj;
    
    public Create_test_frame(Test _tst, Subject _subj) {
        initComponents();
        tst=_tst;
        subj=_subj;
    }

    public int getSelectedButtonIndex(int ind){
        int i=1;
        for(Enumeration<AbstractButton> buttons = alternativas_grupo[ind].getElements();buttons.hasMoreElements();){
            AbstractButton button = buttons.nextElement();
            if(button.isSelected()){
                return i;
            }
            i++;
        }
        return 0;
    }

    public javax.swing.ButtonGroup [] alternativas_grupo = new javax.swing.ButtonGroup[4];

    private void initComponents() {

        alternativas_grupo_1 = new javax.swing.ButtonGroup();
        alternativas_grupo_2 = new javax.swing.ButtonGroup();
        alternativas_grupo_3 = new javax.swing.ButtonGroup();
        alternativas_grupo_4 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        frame_title = new javax.swing.JLabel();
        title_title = new javax.swing.JLabel();
        title_text = new javax.swing.JTextField();
        text_title = new javax.swing.JLabel();
        create_post_button = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        question_1 = new javax.swing.JPanel();
        title_title_1 = new javax.swing.JLabel();
        title_text_1 = new javax.swing.JTextField();
        alternative_title_1 = new javax.swing.JLabel();
        alternative_text_1_1 = new javax.swing.JTextField();
        alternative_text_2_1 = new javax.swing.JTextField();
        alternative_text_3_1 = new javax.swing.JTextField();
        alternative_text_4_1 = new javax.swing.JTextField();
        correct_answer_button_1_1 = new javax.swing.JRadioButton();
        correct_answer_button_2_1 = new javax.swing.JRadioButton();
        correct_answer_button_3_1 = new javax.swing.JRadioButton();
        correct_answer_button_4_1 = new javax.swing.JRadioButton();
        question_2 = new javax.swing.JPanel();
        title_title_2 = new javax.swing.JLabel();
        title_text_2 = new javax.swing.JTextField();
        alternative_title_2 = new javax.swing.JLabel();
        alternative_text_1_2 = new javax.swing.JTextField();
        alternative_text_2_2 = new javax.swing.JTextField();
        alternative_text_3_2 = new javax.swing.JTextField();
        alternative_text_4_2 = new javax.swing.JTextField();
        correct_answer_button_1_2 = new javax.swing.JRadioButton();
        correct_answer_button_2_2 = new javax.swing.JRadioButton();
        correct_answer_button_3_2 = new javax.swing.JRadioButton();
        correct_answer_button_4_2 = new javax.swing.JRadioButton();
        question_3 = new javax.swing.JPanel();
        title_title_3 = new javax.swing.JLabel();
        title_text_3 = new javax.swing.JTextField();
        alternative_title_3 = new javax.swing.JLabel();
        alternative_text_1_3 = new javax.swing.JTextField();
        alternative_text_2_3 = new javax.swing.JTextField();
        alternative_text_3_3 = new javax.swing.JTextField();
        alternative_text_4_3 = new javax.swing.JTextField();
        correct_answer_button_1_3 = new javax.swing.JRadioButton();
        correct_answer_button_2_3 = new javax.swing.JRadioButton();
        correct_answer_button_3_3 = new javax.swing.JRadioButton();
        correct_answer_button_4_3 = new javax.swing.JRadioButton();
        question_4 = new javax.swing.JPanel();
        title_title_4 = new javax.swing.JLabel();
        title_text_4 = new javax.swing.JTextField();
        alternative_title_4 = new javax.swing.JLabel();
        alternative_text_1_4 = new javax.swing.JTextField();
        alternative_text_2_4 = new javax.swing.JTextField();
        alternative_text_3_4 = new javax.swing.JTextField();
        alternative_text_4_4 = new javax.swing.JTextField();
        correct_answer_button_1_4 = new javax.swing.JRadioButton();
        correct_answer_button_2_4 = new javax.swing.JRadioButton();
        correct_answer_button_3_4 = new javax.swing.JRadioButton();
        correct_answer_button_4_4 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        frame_title.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        frame_title.setText("Criar nova Avaliacao:");
        frame_title.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        title_title.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        title_title.setText("Titulo:");

        title_text.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        text_title.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        text_title.setText("Questoes:");

        create_post_button.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        create_post_button.setText("Criar Avaliacao");
        create_post_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                create_post_buttonActionPerformed(evt);
            }
        });

        title_title_1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        title_title_1.setText("Enunciado:");

        title_text_1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        alternative_title_1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        alternative_title_1.setText("Alternativas:");

        alternative_text_1_1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        alternative_text_2_1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        alternative_text_3_1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        alternative_text_3_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alternative_text_3_1ActionPerformed(evt);
            }
        });

        alternative_text_4_1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        alternativas_grupo_1.add(correct_answer_button_1_1);

        alternativas_grupo_1.add(correct_answer_button_2_1);

        alternativas_grupo_1.add(correct_answer_button_3_1);

        alternativas_grupo_1.add(correct_answer_button_4_1);

        javax.swing.GroupLayout question_1Layout = new javax.swing.GroupLayout(question_1);
        question_1.setLayout(question_1Layout);
        question_1Layout.setHorizontalGroup(
            question_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(question_1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(question_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title_text_1)
                    .addGroup(question_1Layout.createSequentialGroup()
                        .addGroup(question_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(title_title_1)
                            .addComponent(alternative_title_1))
                        .addGap(0, 419, Short.MAX_VALUE))
                    .addGroup(question_1Layout.createSequentialGroup()
                        .addGroup(question_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(correct_answer_button_1_1)
                            .addComponent(correct_answer_button_2_1)
                            .addComponent(correct_answer_button_3_1)
                            .addComponent(correct_answer_button_4_1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(question_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(alternative_text_4_1)
                            .addComponent(alternative_text_1_1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(alternative_text_2_1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(alternative_text_3_1, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        question_1Layout.setVerticalGroup(
            question_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(question_1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title_title_1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(title_text_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(alternative_title_1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(question_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alternative_text_1_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(correct_answer_button_1_1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(question_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alternative_text_2_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(correct_answer_button_2_1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(question_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alternative_text_3_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(correct_answer_button_3_1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(question_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alternative_text_4_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(correct_answer_button_4_1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Questao 1", question_1);

        title_title_2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        title_title_2.setText("Enunciado:");

        title_text_2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        alternative_title_2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        alternative_title_2.setText("Alternativas:");

        alternative_text_1_2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        alternative_text_2_2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        alternative_text_3_2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        alternative_text_3_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alternative_text_3_2ActionPerformed(evt);
            }
        });

        alternative_text_4_2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        alternativas_grupo_2.add(correct_answer_button_1_2);

        alternativas_grupo_2.add(correct_answer_button_2_2);

        alternativas_grupo_2.add(correct_answer_button_3_2);

        alternativas_grupo_2.add(correct_answer_button_4_2);

        javax.swing.GroupLayout question_2Layout = new javax.swing.GroupLayout(question_2);
        question_2.setLayout(question_2Layout);
        question_2Layout.setHorizontalGroup(
            question_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(question_2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(question_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title_text_2)
                    .addGroup(question_2Layout.createSequentialGroup()
                        .addGroup(question_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(title_title_2)
                            .addComponent(alternative_title_2))
                        .addGap(0, 419, Short.MAX_VALUE))
                    .addGroup(question_2Layout.createSequentialGroup()
                        .addGroup(question_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(correct_answer_button_1_2)
                            .addComponent(correct_answer_button_2_2)
                            .addComponent(correct_answer_button_3_2)
                            .addComponent(correct_answer_button_4_2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(question_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(alternative_text_4_2)
                            .addComponent(alternative_text_1_2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(alternative_text_2_2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(alternative_text_3_2, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        question_2Layout.setVerticalGroup(
            question_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(question_2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title_title_2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(title_text_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(alternative_title_2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(question_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alternative_text_1_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(correct_answer_button_1_2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(question_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alternative_text_2_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(correct_answer_button_2_2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(question_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alternative_text_3_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(correct_answer_button_3_2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(question_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alternative_text_4_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(correct_answer_button_4_2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Questao 2", question_2);

        title_title_3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        title_title_3.setText("Enunciado:");

        title_text_3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        alternative_title_3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        alternative_title_3.setText("Alternativas:");

        alternative_text_1_3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        alternative_text_2_3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        alternative_text_3_3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        alternative_text_3_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alternative_text_3_3ActionPerformed(evt);
            }
        });

        alternative_text_4_3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        alternativas_grupo_3.add(correct_answer_button_1_3);

        alternativas_grupo_3.add(correct_answer_button_2_3);

        alternativas_grupo_3.add(correct_answer_button_3_3);

        alternativas_grupo_3.add(correct_answer_button_4_3);

        javax.swing.GroupLayout question_3Layout = new javax.swing.GroupLayout(question_3);
        question_3.setLayout(question_3Layout);
        question_3Layout.setHorizontalGroup(
            question_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(question_3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(question_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title_text_3)
                    .addGroup(question_3Layout.createSequentialGroup()
                        .addGroup(question_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(title_title_3)
                            .addComponent(alternative_title_3))
                        .addGap(0, 419, Short.MAX_VALUE))
                    .addGroup(question_3Layout.createSequentialGroup()
                        .addGroup(question_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(correct_answer_button_1_3)
                            .addComponent(correct_answer_button_2_3)
                            .addComponent(correct_answer_button_3_3)
                            .addComponent(correct_answer_button_4_3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(question_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(alternative_text_4_3)
                            .addComponent(alternative_text_1_3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(alternative_text_2_3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(alternative_text_3_3, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        question_3Layout.setVerticalGroup(
            question_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(question_3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title_title_3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(title_text_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(alternative_title_3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(question_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alternative_text_1_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(correct_answer_button_1_3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(question_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alternative_text_2_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(correct_answer_button_2_3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(question_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alternative_text_3_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(correct_answer_button_3_3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(question_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alternative_text_4_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(correct_answer_button_4_3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Questao 3", question_3);

        title_title_4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        title_title_4.setText("Enunciado:");

        title_text_4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        alternative_title_4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        alternative_title_4.setText("Alternativas:");

        alternative_text_1_4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        alternative_text_2_4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        alternative_text_3_4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        alternative_text_3_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alternative_text_3_4ActionPerformed(evt);
            }
        });

        alternative_text_4_4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        alternativas_grupo_4.add(correct_answer_button_1_4);

        alternativas_grupo_4.add(correct_answer_button_2_4);

        alternativas_grupo_4.add(correct_answer_button_3_4);

        alternativas_grupo_4.add(correct_answer_button_4_4);

        javax.swing.GroupLayout question_4Layout = new javax.swing.GroupLayout(question_4);
        question_4.setLayout(question_4Layout);
        question_4Layout.setHorizontalGroup(
            question_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(question_4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(question_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title_text_4)
                    .addGroup(question_4Layout.createSequentialGroup()
                        .addGroup(question_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(title_title_4)
                            .addComponent(alternative_title_4))
                        .addGap(0, 419, Short.MAX_VALUE))
                    .addGroup(question_4Layout.createSequentialGroup()
                        .addGroup(question_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(correct_answer_button_1_4)
                            .addComponent(correct_answer_button_2_4)
                            .addComponent(correct_answer_button_3_4)
                            .addComponent(correct_answer_button_4_4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(question_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(alternative_text_4_4)
                            .addComponent(alternative_text_1_4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(alternative_text_2_4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(alternative_text_3_4, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        question_4Layout.setVerticalGroup(
            question_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(question_4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title_title_4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(title_text_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(alternative_title_4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(question_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alternative_text_1_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(correct_answer_button_1_4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(question_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alternative_text_2_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(correct_answer_button_2_4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(question_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alternative_text_3_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(correct_answer_button_3_4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(question_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alternative_text_4_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(correct_answer_button_4_4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Questao 4", question_4);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(title_text)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(frame_title)
                    .addComponent(title_title)
                    .addComponent(text_title))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(create_post_button)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
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
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>    

    private void create_post_buttonActionPerformed(java.awt.event.ActionEvent evt) {
        
        String [] alts = new String[4];

        alternativas_grupo[0]=alternativas_grupo_1;
        alternativas_grupo[1]=alternativas_grupo_2;
        alternativas_grupo[2]=alternativas_grupo_3;
        alternativas_grupo[3]=alternativas_grupo_4;
        
        tst.setTitle(title_text.getText());
        alts[0] = alternative_text_1_1.getText();
        alts[1] = alternative_text_2_1.getText();
        alts[2] = alternative_text_3_1.getText();
        alts[3] = alternative_text_4_1.getText();

        tst.addQuestion(title_text_1.getText(), alts, getSelectedButtonIndex(0));

        alts[0] = alternative_text_1_2.getText();
        alts[1] = alternative_text_2_2.getText();
        alts[2] = alternative_text_3_2.getText();
        alts[3] = alternative_text_4_2.getText();

        tst.addQuestion(title_text_2.getText(), alts, getSelectedButtonIndex(1));
        
        alts[0] = alternative_text_1_3.getText();
        alts[1] = alternative_text_2_3.getText();
        alts[2] = alternative_text_3_3.getText();
        alts[3] = alternative_text_4_3.getText();
        
        tst.addQuestion(title_text_3.getText(), alts, getSelectedButtonIndex(2));
        
        alts[0] = alternative_text_1_4.getText();
        alts[1] = alternative_text_2_4.getText();
        alts[2] = alternative_text_3_4.getText();
        alts[3] = alternative_text_4_4.getText();

        tst.addQuestion(title_text_4.getText(), alts, getSelectedButtonIndex(3));
        subj.getTests().add(tst);
        SubjectFiles.editSubject(subj);
        this.dispose();

    }

    private void alternative_text_3_1ActionPerformed(java.awt.event.ActionEvent evt) {                                                     

    }                                                    

    private void alternative_text_3_2ActionPerformed(java.awt.event.ActionEvent evt) {                                                     

    }                                                    

    private void alternative_text_3_3ActionPerformed(java.awt.event.ActionEvent evt) {                                                     

    }                                                    

    private void alternative_text_3_4ActionPerformed(java.awt.event.ActionEvent evt) {                                                     
 
    }                                                    


    

    
   private javax.swing.ButtonGroup alternativas_grupo_1;
   private javax.swing.ButtonGroup alternativas_grupo_2;
   private javax.swing.ButtonGroup alternativas_grupo_3;
   private javax.swing.ButtonGroup alternativas_grupo_4;
   private javax.swing.JTextField alternative_text_1_1;
   private javax.swing.JTextField alternative_text_1_2;
   private javax.swing.JTextField alternative_text_1_3;
   private javax.swing.JTextField alternative_text_1_4;
   private javax.swing.JTextField alternative_text_2_1;
   private javax.swing.JTextField alternative_text_2_2;
   private javax.swing.JTextField alternative_text_2_3;
   private javax.swing.JTextField alternative_text_2_4;
   private javax.swing.JTextField alternative_text_3_1;
   private javax.swing.JTextField alternative_text_3_2;
   private javax.swing.JTextField alternative_text_3_3;
   private javax.swing.JTextField alternative_text_3_4;
   private javax.swing.JTextField alternative_text_4_1;
   private javax.swing.JTextField alternative_text_4_2;
   private javax.swing.JTextField alternative_text_4_3;
   private javax.swing.JTextField alternative_text_4_4;
   private javax.swing.JLabel alternative_title_1;
   private javax.swing.JLabel alternative_title_2;
   private javax.swing.JLabel alternative_title_3;
   private javax.swing.JLabel alternative_title_4;
   private javax.swing.JRadioButton correct_answer_button_1_1;
   private javax.swing.JRadioButton correct_answer_button_1_2;
   private javax.swing.JRadioButton correct_answer_button_1_3;
   private javax.swing.JRadioButton correct_answer_button_1_4;
   private javax.swing.JRadioButton correct_answer_button_2_1;
   private javax.swing.JRadioButton correct_answer_button_2_2;
   private javax.swing.JRadioButton correct_answer_button_2_3;
   private javax.swing.JRadioButton correct_answer_button_2_4;
   private javax.swing.JRadioButton correct_answer_button_3_1;
   private javax.swing.JRadioButton correct_answer_button_3_2;
   private javax.swing.JRadioButton correct_answer_button_3_3;
   private javax.swing.JRadioButton correct_answer_button_3_4;
   private javax.swing.JRadioButton correct_answer_button_4_1;
   private javax.swing.JRadioButton correct_answer_button_4_2;
   private javax.swing.JRadioButton correct_answer_button_4_3;
   private javax.swing.JRadioButton correct_answer_button_4_4;
   private javax.swing.JButton create_post_button;
   private javax.swing.JLabel frame_title;
   private javax.swing.JPanel jPanel1;
   private javax.swing.JPanel jPanel2;
   private javax.swing.JTabbedPane jTabbedPane1;
   private javax.swing.JPanel question_1;
   private javax.swing.JPanel question_2;
   private javax.swing.JPanel question_3;
   private javax.swing.JPanel question_4;
   private javax.swing.JLabel text_title;
   private javax.swing.JTextField title_text;
   private javax.swing.JTextField title_text_1;
   private javax.swing.JTextField title_text_2;
   private javax.swing.JTextField title_text_3;
   private javax.swing.JTextField title_text_4;
   private javax.swing.JLabel title_title;
   private javax.swing.JLabel title_title_1;
   private javax.swing.JLabel title_title_2;
   private javax.swing.JLabel title_title_3;
   private javax.swing.JLabel title_title_4;
}
