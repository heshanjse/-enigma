

package valkyrie.enigma.enigmaplus.view;

import java.beans.PropertyVetoException;
import static java.lang.Long.parseLong;
import java.text.SimpleDateFormat;
import java.util.Date;
import valkyrie.enigma.enigmaplus.Controller.AnswerController;
import valkyrie.enigma.enigmaplus.Controller.QuestionController;
import valkyrie.enigma.enigmaplus.Controller.UserController;
import valkyrie.enigma.enigmaplus.Controller.elapsedTime;
import static valkyrie.enigma.enigmaplus.EnigmaMain.jDesktopPane1;
import valkyrie.enigma.enigmaplus.model.Answer;


public class questionviewM extends javax.swing.JInternalFrame {
    long Qid = 0;
    Answer a;
    String ans;
    /**
     * Creates new form questionviewM
     */
    public questionviewM() {
        initComponents();
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        
        
//        elapsedTime et = new elapsedTime();        
//        AnswerPanel ap1 = new AnswerPanel();
//        
//        ac.viewAnswer(102109);  
//        System.out.println(102109);
//        System.out.println(ac.a.getAnswer());
//        System.out.println(ac.a.getDate());
        
//        answertest at = new answertest();
        
        
        
//        ap1.answerLabel.setText(ac.a.getAnswer());
//        ap1.answerDateLabel.setText(et.duration(ac.a.getDate()));
//        ap1.setBounds(10, 10, 1080, 100);
//        jPanel1.add(ap1);
        
        //this.setMainQuestion(WIDTH);
    }
    
    public void setMainQuestion(long qid){
        
        this.Qid = qid;
        QuestionController qc1 = new QuestionController();
        UserController uc1 = new UserController();
        qc1.viewQuestion(qid);
        uc1.getUser(qc1.q.getUid());
        qviewpanel_title.setText(qc1.q.getTitle());
        qviewpanel_qnote.setText(qc1.q.getQ_short());
        qviewpanel_qdes.setText(qc1.q.getQuestion());
        jLabel78.setText(String.valueOf(qc1.q.getRate()));
        AnswerController ac = new AnswerController();
        ac.findAnswers(Qid);
        for(int j=0;j<ac.aid.length-1;j++){
            if(ac.aid[j]==null){
                return;
            }
         
        elapsedTime et = new elapsedTime();        
        AnswerPanel ap1 = new AnswerPanel();
        
        ac.viewAnswer(parseLong(ac.aid[j]));  
//        ac.viewAnswer(102109); 
        System.out.println(j+1);
        System.out.println(ac.a.getAnswer());
        System.out.println(ac.a.getDate());
        ap1.answerLabel.setText(ac.a.getAnswer());
        ap1.answerDateLabel.setText(et.duration(ac.a.getDate()));
        ap1.setBounds(10, 10, 1080, 100);
        jPanel1.add(ap1);        
        
        }
        
        this.hide();
        questionviewM intr = new questionviewM();
        intr.setMainQuestion(Qid);
        jDesktopPane1.add(intr);
        intr.show();
        try {
            intr.setMaximum(true);
        } catch (PropertyVetoException e) {
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane10 = new javax.swing.JScrollPane();
        panelquestion2 = new javax.swing.JPanel();
        jButton39 = new javax.swing.JButton();
        jButton41 = new javax.swing.JButton();
        jLabel78 = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        qviewpanel_qdes = new javax.swing.JLabel();
        qviewpanel_title = new javax.swing.JLabel();
        qviewpanel_qnote = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        qviewpanel_answertxt = new javax.swing.JTextArea();
        jLabel79 = new javax.swing.JLabel();
        jButton42 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();

        setBorder(null);
        setMaximizable(true);
        setResizable(true);

        panelquestion2.setBackground(new java.awt.Color(255, 255, 255));

        jButton39.setText("^");
        jButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton39ActionPerformed(evt);
            }
        });

        jButton41.setText("v");
        jButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton41ActionPerformed(evt);
            }
        });

        jLabel78.setBackground(new java.awt.Color(0, 102, 255));
        jLabel78.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel78.setText("0");

        jPanel27.setBackground(new java.awt.Color(255, 255, 255));

        qviewpanel_qdes.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        qviewpanel_qdes.setText("I am working on a photo sharing application where users will be able to upload their ");

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(qviewpanel_qdes, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(258, Short.MAX_VALUE))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(qviewpanel_qdes)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        qviewpanel_title.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        qviewpanel_title.setText("Mysql Show On Unseen");

        qviewpanel_qnote.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        qviewpanel_qnote.setText("views table has gone past 20 Million rows, the query takes a long time in preparing state,how to optimise it");

        jLabel80.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel80.setText("Question :");

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        qviewpanel_answertxt.setColumns(20);
        qviewpanel_answertxt.setRows(5);
        jScrollPane11.setViewportView(qviewpanel_answertxt);

        jLabel79.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel79.setText("Your Answer");

        jButton42.setText("post");
        jButton42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton42ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel79)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 869, Short.MAX_VALUE))
                            .addComponent(jScrollPane11)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton42)))
                .addGap(100, 100, 100))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel79)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton42)
                .addGap(64, 64, 64))
        );

        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 963, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 238, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout panelquestion2Layout = new javax.swing.GroupLayout(panelquestion2);
        panelquestion2.setLayout(panelquestion2Layout);
        panelquestion2Layout.setHorizontalGroup(
            panelquestion2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelquestion2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelquestion2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(panelquestion2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelquestion2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 982, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelquestion2Layout.createSequentialGroup()
                        .addGroup(panelquestion2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelquestion2Layout.createSequentialGroup()
                                .addComponent(jButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(panelquestion2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(84, 84, 84))))
            .addGroup(panelquestion2Layout.createSequentialGroup()
                .addGroup(panelquestion2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelquestion2Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(qviewpanel_title, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelquestion2Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(qviewpanel_qnote, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelquestion2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel80)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelquestion2Layout.setVerticalGroup(
            panelquestion2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelquestion2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(qviewpanel_title)
                .addGap(13, 13, 13)
                .addComponent(qviewpanel_qnote)
                .addGap(5, 5, 5)
                .addGroup(panelquestion2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton39)
                    .addGroup(panelquestion2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel80)))
                .addGap(1, 1, 1)
                .addGroup(panelquestion2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelquestion2Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelquestion2Layout.createSequentialGroup()
                        .addComponent(jLabel78)
                        .addGap(16, 16, 16)
                        .addComponent(jButton41)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(656, Short.MAX_VALUE))
        );

        jScrollPane10.setViewportView(panelquestion2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane10)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 836, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton42ActionPerformed
        
        UserController uc = new UserController();        
        AnswerController ac = new AnswerController();
        elapsedTime et = new elapsedTime();
        
        ans = qviewpanel_answertxt.getText();
        Date date = new Date();
        String modifiedDate = new SimpleDateFormat("yyyy/MM/dd").format(date);
        
        
        a = new Answer(ac.aidCounter(), this.Qid, 0, ans, modifiedDate); //public Answer(int aid, int qid, int vote, String answer, String date)
//        System.out.println(String.valueOf(a.getAid())+" hello1");
        ac.addAnswer(a.getAid(), a.getQid(), a.getVote(), uc.getUserLogged(), a.getAnswer(), a.getDate()); // addAnswer(long aid, long qid, int arate, long uid, String answer, String adate)
        
        int x = 60;
       
        
        AnswerPanel ap1 = new AnswerPanel();
        
        ac.viewAnswer(ac.aidCounter()-1);  
        System.out.println(ac.aidCounter()-1);
        System.out.println(ac.a.getAnswer());
        System.out.println(ac.a.getDate());                             
        ap1.answerLabel.setText(ac.a.getAnswer());
        ap1.answerDateLabel.setText(et.duration(ac.a.getDate()));
        ap1.setBounds(10, 110, 1080, 100);        
        jPanel1.add(ap1);
        
//        ac.viewAnswer(a.getAid());   
//        AnswerPanel ap1 = new AnswerPanel();
//        
//        System.out.println(a.getAid());
//        System.out.println(ac.a.getAnswer());
//        System.out.println(ac.a.getDate());
//  
//        
//        ap1.answerLabel.setText(ac.a.getDate());
//        ap1.answerDateLabel.setText(et.duration(ac.a.getDate()));
//        ap1.setBounds(10, 100, 1080, 50);
//        jPanel1.add(ap1);

        
//        this.hide();
//        questionviewM intr = new questionviewM();
//        intr.setMainQuestion(Qid);
//        jDesktopPane1.add(intr);
//        intr.show();
//        try {
//            intr.setMaximum(true);
//        } catch (PropertyVetoException e) {
//        }

//        Date date = new Date();
        //        String modifiedDate = new SimpleDateFormat("yyyy-MM-dd").format(date);
        //        String answer = qviewpanel_answertxt.getText();
        //        jPanel2.setVisible(true);
        //        qview_answer.setText(answer);
        //        Answer a = new Answer();
        //        a.setAnswer(answer);
        //        a.setDate(modifiedDate);
        //        a.setQid(001);
        //
        //        try {
            //            int res = AnswerController.addAnswer(a);
            //            if (res > 0) {
                //                //  JOptionPane.showMessageDialog(this, "Answer Added ");
                //            }
            //        } catch (ClassNotFoundException ex) {
            //            ex.printStackTrace();
            //        } catch (SQLException ex) {
            //            ex.printStackTrace();
            //        }
    }//GEN-LAST:event_jButton42ActionPerformed

    private void jButton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton41ActionPerformed
        //        if (x == true) {
            //            --points;
            //            x = false;
            //        }
        //        showrate();
         QuestionController qc1 = new QuestionController();
        qc1.qRate(Qid, false);
        this.setVisible(false);
        questionviewM intr = new questionviewM();
        intr.setMainQuestion(Qid);
        jDesktopPane1.add(intr);
        intr.show();
        try {
            intr.setMaximum(true);
        } catch (PropertyVetoException e) {
        }
    }//GEN-LAST:event_jButton41ActionPerformed

    private void jButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton39ActionPerformed
      QuestionController qc1 = new QuestionController();
        qc1.qRate(Qid, true);
        this.setVisible(false);
        questionviewM intr = new questionviewM();
        intr.setMainQuestion(Qid);
        jDesktopPane1.add(intr);
        intr.show();
        try {
            intr.setMaximum(true);
        } catch (PropertyVetoException e) {
        }
    }//GEN-LAST:event_jButton39ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JPanel panelquestion2;
    private javax.swing.JTextArea qviewpanel_answertxt;
    private javax.swing.JLabel qviewpanel_qdes;
    private javax.swing.JLabel qviewpanel_qnote;
    private javax.swing.JLabel qviewpanel_title;
    // End of variables declaration//GEN-END:variables
}
