/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package valkyrie.enigma.enigmaplus.view;



/**
 *
 * @author HELLFIRE
 */
public class questionview extends javax.swing.JInternalFrame {

    /**
     * Creates new form questionview
     */
    public questionview() {
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

        panelquestionview = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        panelquestion1 = new javax.swing.JPanel();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        qpanel1_qtitle1 = new javax.swing.JLabel();
        qpanel1_qnote1 = new javax.swing.JLabel();
        qpanel1_qnote2 = new javax.swing.JLabel();
        qpanel1_qnote4 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        qpanel1_qnote6 = new javax.swing.JLabel();
        qpanel1_qnote8 = new javax.swing.JLabel();
        qpanel1_qnote9 = new javax.swing.JLabel();
        qpanel1_qnote10 = new javax.swing.JLabel();
        qpanel1_qnote11 = new javax.swing.JLabel();
        qpanel1_qnote12 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton35 = new javax.swing.JButton();
        qpanel1_qnote3 = new javax.swing.JLabel();

        setMaximizable(true);
        setResizable(true);

        panelquestionview.setBackground(new java.awt.Color(255, 255, 255));

        panelquestion1.setBackground(new java.awt.Color(255, 255, 255));

        jButton33.setText("^");
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });

        jButton34.setText("^");
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });

        qpanel1_qtitle1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        qpanel1_qtitle1.setText("Mysql Show On Unseen");

        qpanel1_qnote1.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        qpanel1_qnote1.setText("yes -ishara abesekara");

        qpanel1_qnote2.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        qpanel1_qnote2.setText("views table has gone past 20 Million rows, the query takes a long time in preparing state,how to optimise it");

        qpanel1_qnote4.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        qpanel1_qnote4.setText("To make it efficient, make sure you have an index on views.picture_id.");

        jLabel41.setBackground(new java.awt.Color(0, 102, 255));
        jLabel41.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel41.setText("1");

        jLabel42.setText("Your Answer");

        jLabel43.setText("Question :");

        qpanel1_qnote6.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        qpanel1_qnote6.setText("do you try this? -nipun thathsara");

        qpanel1_qnote8.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        qpanel1_qnote8.setText("Use a JOIN");

        qpanel1_qnote9.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        qpanel1_qnote9.setText("SELECT p.*");

        qpanel1_qnote10.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        qpanel1_qnote10.setText("FROM pictures AS p");

        qpanel1_qnote11.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        qpanel1_qnote11.setText("LEFT JOIN views AS v ON v.picture_id = p.picture_id AND v.user_id = 255");

        qpanel1_qnote12.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        qpanel1_qnote12.setText("WHERE v.picture_id IS NULL");

        jLabel44.setText("1 Answers ");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane6.setViewportView(jTextArea1);

        jButton35.setText("post");
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelquestion1Layout = new javax.swing.GroupLayout(panelquestion1);
        panelquestion1.setLayout(panelquestion1Layout);
        panelquestion1Layout.setHorizontalGroup(
            panelquestion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelquestion1Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(qpanel1_qtitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelquestion1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(qpanel1_qnote2))
            .addGroup(panelquestion1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel41)
                .addGap(40, 40, 40)
                .addComponent(jLabel43))
            .addGroup(panelquestion1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(qpanel1_qnote3, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelquestion1Layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(qpanel1_qnote6))
            .addGroup(panelquestion1Layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(qpanel1_qnote1))
            .addGroup(panelquestion1Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jLabel44))
            .addGroup(panelquestion1Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(qpanel1_qnote8))
            .addGroup(panelquestion1Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(qpanel1_qnote9))
            .addGroup(panelquestion1Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(qpanel1_qnote10))
            .addGroup(panelquestion1Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(qpanel1_qnote11))
            .addGroup(panelquestion1Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(qpanel1_qnote12))
            .addGroup(panelquestion1Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(qpanel1_qnote4))
            .addGroup(panelquestion1Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jLabel42))
            .addGroup(panelquestion1Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jScrollPane6)
                .addGap(161, 161, 161))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelquestion1Layout.createSequentialGroup()
                .addContainerGap(761, Short.MAX_VALUE)
                .addComponent(jButton35)
                .addGap(208, 208, 208))
        );
        panelquestion1Layout.setVerticalGroup(
            panelquestion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelquestion1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(qpanel1_qtitle1)
                .addGap(3, 3, 3)
                .addGroup(panelquestion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton33)
                    .addGroup(panelquestion1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(qpanel1_qnote2)))
                .addGap(5, 5, 5)
                .addGroup(panelquestion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel41)
                    .addGroup(panelquestion1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel43)))
                .addGap(16, 16, 16)
                .addGroup(panelquestion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton34)
                    .addComponent(qpanel1_qnote3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(qpanel1_qnote6)
                .addGap(15, 15, 15)
                .addComponent(qpanel1_qnote1)
                .addGap(15, 15, 15)
                .addComponent(jLabel44)
                .addGap(26, 26, 26)
                .addComponent(qpanel1_qnote8)
                .addGap(15, 15, 15)
                .addComponent(qpanel1_qnote9)
                .addGap(15, 15, 15)
                .addComponent(qpanel1_qnote10)
                .addGap(15, 15, 15)
                .addComponent(qpanel1_qnote11)
                .addGap(15, 15, 15)
                .addComponent(qpanel1_qnote12)
                .addGap(15, 15, 15)
                .addComponent(qpanel1_qnote4)
                .addGap(25, 25, 25)
                .addComponent(jLabel42)
                .addGap(16, 16, 16)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jButton35))
        );

        jScrollPane5.setViewportView(panelquestion1);

        javax.swing.GroupLayout panelquestionviewLayout = new javax.swing.GroupLayout(panelquestionview);
        panelquestionview.setLayout(panelquestionviewLayout);
        panelquestionviewLayout.setHorizontalGroup(
            panelquestionviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5)
        );
        panelquestionviewLayout.setVerticalGroup(
            panelquestionviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1044, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panelquestionview, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 802, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panelquestionview, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton33ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed

    }//GEN-LAST:event_jButton34ActionPerformed

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton35ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JPanel panelquestion1;
    private javax.swing.JPanel panelquestionview;
    private javax.swing.JLabel qpanel1_qnote1;
    private javax.swing.JLabel qpanel1_qnote10;
    private javax.swing.JLabel qpanel1_qnote11;
    private javax.swing.JLabel qpanel1_qnote12;
    private javax.swing.JLabel qpanel1_qnote2;
    private javax.swing.JLabel qpanel1_qnote3;
    private javax.swing.JLabel qpanel1_qnote4;
    private javax.swing.JLabel qpanel1_qnote6;
    private javax.swing.JLabel qpanel1_qnote8;
    private javax.swing.JLabel qpanel1_qnote9;
    private javax.swing.JLabel qpanel1_qtitle1;
    // End of variables declaration//GEN-END:variables
}
