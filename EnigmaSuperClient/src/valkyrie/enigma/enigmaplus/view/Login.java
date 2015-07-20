
package valkyrie.enigma.enigmaplus.view;

import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.beans.PropertyVetoException;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import valkyrie.enigma.enigmaplus.Controller.UserController;
import valkyrie.enigma.enigmaplus.EnigmaMain;
import static valkyrie.enigma.enigmaplus.EnigmaMain.jDesktopPane1;
import valkyrie.enigma.enigmaplus.model.User;
import valkyrie.enigma.enigmaplus.service.impl.UserServiceImpl;

import static valkyrie.enigma.enigmaplus.view.editProfile.resize;



public class Login extends javax.swing.JInternalFrame {

    /**
     * Creates new form login
     */
    public Login() {
        initComponents();
        ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setNorthPane(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panellogin = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        login_email = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jButton31 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton32 = new javax.swing.JButton();
        login_password = new javax.swing.JPasswordField();
        jPanel9 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setMaximizable(true);
        setResizable(true);

        panellogin.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 163, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 285, Short.MAX_VALUE)
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        login_email.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                login_emailMouseClicked(evt);
            }
        });
        login_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_emailActionPerformed(evt);
            }
        });
        login_email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                login_emailKeyPressed(evt);
            }
        });

        jLabel38.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel38.setText("Email address");

        jLabel39.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel39.setText("Password");

        jButton31.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton31.setText("Sign In");
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });

        jCheckBox1.setText("Stay signed in");

        jButton32.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton32.setText("Signup");
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });

        login_password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                login_passwordKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jCheckBox1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(login_email)
                    .addComponent(login_password)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel38, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel39, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(155, 155, 155)))
                .addGap(63, 63, 63))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(login_email, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addGap(5, 5, 5)
                .addComponent(login_password, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton31)
                    .addComponent(jButton32))
                .addGap(71, 71, 71))
        );

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/valkyrie/enigma/enigmaplus/view/images/IFS_logo_big.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 193, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 288, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelloginLayout = new javax.swing.GroupLayout(panellogin);
        panellogin.setLayout(panelloginLayout);
        panelloginLayout.setHorizontalGroup(
            panelloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelloginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelloginLayout.setVerticalGroup(
            panelloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelloginLayout.createSequentialGroup()
                .addGroup(panelloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelloginLayout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addGroup(panelloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelloginLayout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelloginLayout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(243, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panellogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panellogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void login_emailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_emailMouseClicked

    }//GEN-LAST:event_login_emailMouseClicked

    private void login_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_login_emailActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        
//        Jena_Enigma JE = new Jena_Enigma();
//        JE.sparqlTst();
//        JE.getName();
        
        String email = login_email.getText();
        String pw = login_password.getText();

        try {
            if (UserController.Loginuser(email, pw) != null) {
                JInternalFrame intr = new Questionmain();
                jDesktopPane1.add(intr);
                intr.show();
                EnigmaMain.head_main.setVisible(true);
                EnigmaMain.head_signup.setVisible(false);
                this.setVisible(false);
                try {
                    intr.setMaximum(true);
                } catch (PropertyVetoException e) {
                    System.out.println(e);
                }
                
                UserController uc = new UserController();
                uc.getUser(uc.getUserLogged());
                EnigmaMain.head_main_userName.setText(uc.u1.getFname()+" "+uc.u1.getLname()); 
                
                BufferedImage image;
                    try {
                        image = ImageIO.read(new File(uc.u1.getPic()));
                        BufferedImage resizedImage = editProfile.resize(image, 34, 30);//resize the image to 100x100
                        BufferedImage resizedImage2 = editProfile.resize(image, 100, 76);
                        ImageIcon icon = new ImageIcon(resizedImage);
                        ImageIcon icon2 = new ImageIcon(resizedImage2);
                        EnigmaMain.mini_profile_pic.setIcon(icon);
                        EnigmaMain.profile_pic_signout.setIcon(icon2);
                    } catch (IOException ex) {
                        Logger.getLogger(editProfile.class.getName()).log(Level.SEVERE, null, ex);
                    }
                
            } else {
                JOptionPane.showMessageDialog(this, "No customer found "+ email, "login error", JOptionPane.ERROR_MESSAGE);
           }
          
     //   } catch (ClassNotFoundException ex) {
    //        Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
//        panelsignup.setVisible(true);
//        panellogin.setVisible(false);
        JInternalFrame intr = new signup();
        jDesktopPane1.add(intr);
        intr.show();
        try {
            intr.setMaximum(true);
        } catch (PropertyVetoException e) {

        }
        //EnigmaMain.head_main.setVisible(true);
        //EnigmaMain.head_signup.setVisible(false);
        this.setVisible(false);
        EnigmaMain.jLabel11.setText("Sign up");
        
    }//GEN-LAST:event_jButton32ActionPerformed

    private void login_passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_login_passwordKeyPressed
        
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            String email = login_email.getText();
            String pw = login_password.getText();

            try {
                User user = new UserServiceImpl().LoginUser(email, pw);
                if (user != null) {
                    JInternalFrame intr = new Questionmain();
                    jDesktopPane1.add(intr);
                    intr.show();
                    EnigmaMain.head_main.setVisible(true);
                    EnigmaMain.head_signup.setVisible(false);
                    this.setVisible(false);
                    try {
                        intr.setMaximum(true);
                    } catch (PropertyVetoException e) {
                        System.out.println(e);
                    }
                    EnigmaMain.head_main_userName.setText(user.getFname() + " " + user.getLname());
                    BufferedImage image;
                } else {
                    JOptionPane.showMessageDialog(this, "No customer found " + email);
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_login_passwordKeyPressed

    private void login_emailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_login_emailKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER) {

            String email = login_email.getText();
            String pw = login_password.getText();

            try {
                if (UserController.Loginuser(email, pw) != null) {
                    JInternalFrame intr = new Questionmain();
                    jDesktopPane1.add(intr);
                    intr.show();
                    this.setVisible(false);
                    try {
                        intr.setMaximum(true);
                    } catch (PropertyVetoException e) {
                        System.out.println(e);
                    }
                    UserController uc = new UserController();
                    uc.getUser(uc.getUserLogged());
                    
                    BufferedImage image;
                    try {
                        image = ImageIO.read(new File(uc.u1.getPic()));
                        BufferedImage resizedImage = editProfile.resize(image, 34, 30);//resize the image to 100x100
                        BufferedImage resizedImage2 = editProfile.resize(image, 100, 76);
                        ImageIcon icon = new ImageIcon(resizedImage);
                        ImageIcon icon2 = new ImageIcon(resizedImage2);
                        
                        EnigmaMain.mini_profile_pic.setIcon(icon);
                        EnigmaMain.profile_pic_signout.setIcon(icon2);
                    } catch (IOException ex) {
                        Logger.getLogger(editProfile.class.getName()).log(Level.SEVERE, null, ex);
                    }

                } else {
                    JOptionPane.showMessageDialog(this, "No customer found "+ email, "login error", JOptionPane.ERROR_MESSAGE);
                }

     //   } catch (ClassNotFoundException ex) {
                //        Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_login_emailKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField login_email;
    private javax.swing.JPasswordField login_password;
    private javax.swing.JPanel panellogin;
    // End of variables declaration//GEN-END:variables
}
