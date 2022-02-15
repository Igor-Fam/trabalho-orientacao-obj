/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frame;

import control.*;
import java.util.ArrayList;
import javax.swing.*;
import moodle.Subject;

public class Main_frame extends javax.swing.JFrame {


    /**
     * Creates new form Main_frame
     */
    
    DefaultListModel<Subject> model = new DefaultListModel<>();
    ArrayList<Subject> disciplinas = new ArrayList<>();
    
    public Main_frame() {
        initComponents();
        for(String sub : Login.authUser.getSubjects()){
            model.addElement(SubjectFiles.readSubject(sub));
        }
        content_list.setModel(model);
        content_list.addListSelectionListener(new Subject_frame(content_list,this));
}
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        top_panel = new javax.swing.JPanel();
        student_name = new javax.swing.JLabel();
        leave_button = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        content_panel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        content_list = new javax.swing.JList<>();
        cadastrar_button = new javax.swing.JButton();
        create_subject_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        student_name.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        student_name.setText("(Nome do Aluno)");

        leave_button.setBackground(new java.awt.Color(204, 204, 204));
        leave_button.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        leave_button.setForeground(new java.awt.Color(0, 204, 204));
        leave_button.setText("Sair");
        leave_button.setBorderPainted(false);
        leave_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leave_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout top_panelLayout = new javax.swing.GroupLayout(top_panel);
        top_panel.setLayout(top_panelLayout);
        top_panelLayout.setHorizontalGroup(
            top_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(top_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(student_name)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(leave_button)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        top_panelLayout.setVerticalGroup(
            top_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(top_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(top_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(student_name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(leave_button)))
        );

        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        title.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Página Inicial");
        title.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(title);

        content_list.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        content_list.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(content_list);

        javax.swing.GroupLayout content_panelLayout = new javax.swing.GroupLayout(content_panel);
        content_panel.setLayout(content_panelLayout);
        content_panelLayout.setHorizontalGroup(
            content_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        content_panelLayout.setVerticalGroup(
            content_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
        );

        cadastrar_button.setText("Cadastrar Usuario");
        cadastrar_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrar_buttonActionPerformed(evt);
            }
        });

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
                .addComponent(top_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(292, 292, 292))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cadastrar_button)
                        .addGap(18, 18, 18)
                        .addComponent(create_subject_button)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(content_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(top_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(content_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastrar_button)
                    .addComponent(create_subject_button))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void leave_buttonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        this.dispose();
    }                                            

    private void cadastrar_buttonActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        new Create_user_frame().setVisible(true);
        this.dispose();
    }                                                

    private void create_subject_buttonActionPerformed(java.awt.event.ActionEvent evt) {                                                      
        new Create_subject_frame().setVisible(true);
        this.dispose();
    }                                                     

    public JList getLista(){
        return content_list;
    }
    
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
            java.util.logging.Logger.getLogger(Main_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_frame().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify                     
    private javax.swing.JButton cadastrar_button;
    private javax.swing.JList<Subject> content_list;
    private javax.swing.JPanel content_panel;
    private javax.swing.JButton create_subject_button;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton leave_button;
    private javax.swing.JLabel student_name;
    private javax.swing.JLabel title;
    private javax.swing.JPanel top_panel;
    // End of variables declaration                   
}
