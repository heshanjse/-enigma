/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package valkyrie.enigma.enigmaplus.view;

import com.hp.hpl.jena.datatypes.xsd.XSDDatatype;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.Property;
import com.hp.hpl.jena.rdf.model.Resource;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import valkyrie.enigma.enigmaplus.jena_enigma.insertQuestion;
import valkyrie.enigma.enigmaplus.rdfPath;

/**
 *
 * @author Abeysekera
 */
public class adminPanel extends javax.swing.JFrame {

    /**
     * Creates new form adminPanel
     */
    public adminPanel() {
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

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        addTagButton = new javax.swing.JButton();
        deleteTagButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        removeUserButton = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        addTagButton.setText("Add Tag");
        addTagButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTagButtonActionPerformed(evt);
            }
        });

        deleteTagButton.setText("Reset");
        deleteTagButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteTagButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabel1.setText("Privilege User Mode");

        removeUserButton.setText("Remove User");
        removeUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeUserButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1)
                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(removeUserButton, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                    .addComponent(addTagButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(deleteTagButton, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1)
                    .addComponent(deleteTagButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addTagButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(removeUserButton, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(jTextField2))
                .addContainerGap(225, Short.MAX_VALUE))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addTagButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTagButtonActionPerformed
        String addTag;
        addTag = jTextField1.getText();
        Model m = ModelFactory.createDefaultModel();
        //  m.read("/Users/avinda/Desktop/ishara/jena_Enigma/jena_Enigma/src/jena_enigma/enigmardf2.rdf", "RDF/XML");
        m.read(rdfPath.rdfPath, "RDF/XML");
        String NS = "http://www.semanticweb.org/hesh/ontologies/valkyrie/enigmaplus/ontology#";

        Resource r = m.createResource(NS + "Tags");//like subject
        Property p1 = m.createProperty(NS + "tag");
    
//        r.removeAll(p5);

        r.addProperty(p1, addTag, XSDDatatype.XSDstring);
        
//        r.addProperty(p5, "Engineer", XSDDatatype.XSDstring);
//        r.addProperty(p6, "15", XSDDatatype.XSDstring);
        try {
            m.write(new FileOutputStream(rdfPath.rdfPath), "RDF/XML");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(insertQuestion.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_addTagButtonActionPerformed

    private void deleteTagButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteTagButtonActionPerformed
        String deleteTag;
        deleteTag = jTextField1.getText();
        Model m = ModelFactory.createDefaultModel();
        //  m.read("/Users/avinda/Desktop/ishara/jena_Enigma/jena_Enigma/src/jena_enigma/enigmardf2.rdf", "RDF/XML");
        m.read(rdfPath.rdfPath, "RDF/XML");
        String NS = "http://www.semanticweb.org/hesh/ontologies/valkyrie/enigmaplus/ontology#";

        Resource r = m.createResource(NS + "Tags");//like subject
        Property p1 = m.createProperty(NS + "tag");
    
       r.removeAll(p1);

    //    r.addProperty(p1, addTag, XSDDatatype.XSDstring);
        
//        r.addProperty(p5, "Engineer", XSDDatatype.XSDstring);
//        r.addProperty(p6, "15", XSDDatatype.XSDstring);
        try {
            m.write(new FileOutputStream(rdfPath.rdfPath), "RDF/XML");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(insertQuestion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_deleteTagButtonActionPerformed

    private void removeUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeUserButtonActionPerformed
        String removeUser = jTextField2.getText();
        Model m = ModelFactory.createDefaultModel();
        //  m.read("/Users/avinda/Desktop/ishara/jena_Enigma/jena_Enigma/src/jena_enigma/enigmardf2.rdf", "RDF/XML");
        m.read(rdfPath.rdfPath, "RDF/XML");
        String NS = "http://www.semanticweb.org/hesh/ontologies/valkyrie/enigmaplus/ontology#";

        Resource r = m.createResource(NS + "User"+removeUser);//like subject
        Property p1 = m.createProperty(NS + "uid");
        Property p2 = m.createProperty(NS + "reputation");
        Property p3 = m.createProperty(NS + "availability");
        Property p4 = m.createProperty(NS + "fname");
        Property p5 = m.createProperty(NS + "password");
        Property p6 = m.createProperty(NS + "lname");
        Property p7 = m.createProperty(NS + "email");
        Property p8 = m.createProperty(NS + "interested");
        Property p9 = m.createProperty(NS + "picture");
        Property p10 = m.createProperty(NS + "designation");
   
        
    
       r.removeAll(p1);
       r.removeAll(p2);
       r.removeAll(p3);
       r.removeAll(p4);
       r.removeAll(p5);
       r.removeAll(p6);
       r.removeAll(p7);
       r.removeAll(p8);
       r.removeAll(p9);
       r.removeAll(p10);
       


        try {
            m.write(new FileOutputStream(rdfPath.rdfPath), "RDF/XML");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(insertQuestion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_removeUserButtonActionPerformed

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
            java.util.logging.Logger.getLogger(adminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addTagButton;
    private javax.swing.JButton deleteTagButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton removeUserButton;
    // End of variables declaration//GEN-END:variables
}
