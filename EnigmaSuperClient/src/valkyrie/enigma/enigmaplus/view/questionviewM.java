

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
        
        jPanel2.setVisible(false);
        jPanel3.setVisible(false);
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
      //  jPanel1.add(ap1);        
        
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
        qviewpanel_title = new javax.swing.JLabel();
        qviewpanel_qnote = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton40 = new javax.swing.JButton();
        jLabel81 = new javax.swing.JLabel();
        jButton43 = new javax.swing.JButton();
        jLabel82 = new javax.swing.JLabel();
        qviewpanel_qdes1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton44 = new javax.swing.JButton();
        jLabel83 = new javax.swing.JLabel();
        jButton45 = new javax.swing.JButton();
        jLabel84 = new javax.swing.JLabel();
        qviewpanel_qdes2 = new javax.swing.JLabel();
        qviewpanel_qdes = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        qviewpanel_answertxt = new javax.swing.JTextArea();
        jButton42 = new javax.swing.JButton();

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

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 970, Short.MAX_VALUE)
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 57, Short.MAX_VALUE)
        );

        qviewpanel_title.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        qviewpanel_title.setText("Mysql Show On Unseen");

        qviewpanel_qnote.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        qviewpanel_qnote.setText("views table has gone past 20 Million rows, the query takes a long time in preparing state,how to optimise it");

        jLabel80.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel80.setText("Question :");

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jButton40.setText("^");
        jButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton40ActionPerformed(evt);
            }
        });

        jLabel81.setBackground(new java.awt.Color(0, 102, 255));
        jLabel81.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel81.setText("0");

        jButton43.setText("v");
        jButton43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton43ActionPerformed(evt);
            }
        });

        jLabel82.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel82.setText("Answer :");

        qviewpanel_qdes1.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        qviewpanel_qdes1.setText("I am working on a photo sharing application where users will be able to upload their ");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jButton44.setText("^");
        jButton44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton44ActionPerformed(evt);
            }
        });

        jLabel83.setBackground(new java.awt.Color(0, 102, 255));
        jLabel83.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel83.setText("0");

        jButton45.setText("v");
        jButton45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton45ActionPerformed(evt);
            }
        });

        jLabel84.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel84.setText("Answer :");

        qviewpanel_qdes2.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        qviewpanel_qdes2.setText("I am working on a photo sharing application where users will be able to upload their ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton45, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton44, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(qviewpanel_qdes2, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel84))))
                .addContainerGap(174, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton44)
                    .addComponent(jLabel84, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel83)
                    .addComponent(qviewpanel_qdes2))
                .addGap(16, 16, 16)
                .addComponent(jButton45)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton43, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton40, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(qviewpanel_qdes1, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel82))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton40)
                    .addComponent(jLabel82, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel81)
                    .addComponent(qviewpanel_qdes1))
                .addGap(16, 16, 16)
                .addComponent(jButton43)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        qviewpanel_qdes.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        qviewpanel_qdes.setText("I am working on a photo sharing application where users will be able to upload their ");

        jLabel79.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel79.setText("Your Answer");

        qviewpanel_answertxt.setColumns(20);
        qviewpanel_answertxt.setRows(5);
        jScrollPane11.setViewportView(qviewpanel_answertxt);

        jButton42.setText("post");
        jButton42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton42ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelquestion2Layout = new javax.swing.GroupLayout(panelquestion2);
        panelquestion2.setLayout(panelquestion2Layout);
        panelquestion2Layout.setHorizontalGroup(
            panelquestion2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelquestion2Layout.createSequentialGroup()
                .addGroup(panelquestion2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelquestion2Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(116, 116, 116)
                        .addComponent(qviewpanel_qdes, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelquestion2Layout.createSequentialGroup()
                        .addGroup(panelquestion2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelquestion2Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(978, 978, 978))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelquestion2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addComponent(jPanel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(84, 84, 84))
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
            .addGroup(panelquestion2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(panelquestion2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelquestion2Layout.createSequentialGroup()
                        .addGroup(panelquestion2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelquestion2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(419, 419, 419))
                            .addGroup(panelquestion2Layout.createSequentialGroup()
                                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 843, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelquestion2Layout.createSequentialGroup()
                        .addComponent(jLabel79)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                .addGroup(panelquestion2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelquestion2Layout.createSequentialGroup()
                        .addGroup(panelquestion2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelquestion2Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(qviewpanel_qdes))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelquestion2Layout.createSequentialGroup()
                                .addComponent(jLabel78)
                                .addGap(16, 16, 16)
                                .addComponent(jButton41)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(panelquestion2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelquestion2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 166, Short.MAX_VALUE)
                                .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(261, 261, 261))
                            .addGroup(panelquestion2Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel79)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(656, Short.MAX_VALUE))
                    .addGroup(panelquestion2Layout.createSequentialGroup()
                        .addGap(587, 587, 587)
                        .addComponent(jButton42)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jScrollPane10.setViewportView(panelquestion2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 2131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
        
        
  //      a = new Answer(ac.aidCounter(), this.Qid, 0, ans, modifiedDate); //public Answer(int aid, int qid, int vote, String answer, String date)
//        System.out.println(String.valueOf(a.getAid())+" hello1");
  //      ac.addAnswer(a.getAid(), a.getQid(), a.getVote(), uc.getUserLogged(), a.getAnswer(), a.getDate()); // addAnswer(long aid, long qid, int arate, long uid, String answer, String adate)
        
        int x = 60;
       if(jPanel2.isVisible()){
       jPanel3.setVisible(true);
       qviewpanel_qdes2.setText(ans);
       qviewpanel_answertxt.setText("");
       }else{
       jPanel2.setVisible(true);
       qviewpanel_qdes1.setText(ans);
       qviewpanel_answertxt.setText("");
       }
//        
//        AnswerPanel ap1 = new AnswerPanel();
//        
//        ac.viewAnswer(ac.aidCounter()-1);  
//        System.out.println(ac.aidCounter()-1);
//        System.out.println(ac.a.getAnswer());
//        System.out.println(ac.a.getDate());                             
//        ap1.answerLabel.setText(ac.a.getAnswer());
//        ap1.answerDateLabel.setText(et.duration(ac.a.getDate()));
//        ap1.setBounds(10, 110, 1080, 100);        
       // jPanel1.add(ap1);
        
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

    private void jButton40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton40ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton40ActionPerformed

    private void jButton43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton43ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton43ActionPerformed

    private void jButton44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton44ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton44ActionPerformed

    private void jButton45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton45ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton45ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton45;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JPanel panelquestion2;
    private javax.swing.JTextArea qviewpanel_answertxt;
    private javax.swing.JLabel qviewpanel_qdes;
    private javax.swing.JLabel qviewpanel_qdes1;
    private javax.swing.JLabel qviewpanel_qdes2;
    private javax.swing.JLabel qviewpanel_qnote;
    private javax.swing.JLabel qviewpanel_title;
    // End of variables declaration//GEN-END:variables
}
