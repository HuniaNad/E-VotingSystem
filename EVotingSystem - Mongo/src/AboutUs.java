
import java.awt.Component;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Fujitsu
 */
public class AboutUs extends javax.swing.JFrame {
     
    /**
     * Creates new form AboutUs
     */
    public AboutUs() {
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

        mainPanel = new javax.swing.JPanel();
        logoLb = new javax.swing.JLabel();
        aboutus_label = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        aboutus_TA = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        backBtn = new javax.swing.JButton();
        desc_label = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        features_ta = new javax.swing.JTextArea();
        features_LABEL = new javax.swing.JLabel();
        email_tf = new javax.swing.JTextField();
        mail_tf = new javax.swing.JTextField();
        email_label = new javax.swing.JLabel();
        mail_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainPanel.setBackground(new java.awt.Color(244, 189, 108));
        mainPanel.setPreferredSize(new java.awt.Dimension(690, 530));
        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoLb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logo_cropped_black.png"))); // NOI18N
        mainPanel.add(logoLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 70, 90));

        aboutus_label.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        aboutus_label.setText("About Us");
        mainPanel.add(aboutus_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 180, 50));

        aboutus_TA.setEditable(false);
        aboutus_TA.setBackground(new java.awt.Color(240, 240, 240));
        aboutus_TA.setColumns(20);
        aboutus_TA.setFont(new java.awt.Font("Segoe UI", 2, 11)); // NOI18N
        aboutus_TA.setRows(5);
        aboutus_TA.setText("This system provides a plethora of election and voting management options. The moderators can create elections for any small to large-scale event and manage the results.\n In contrast, the voters can cast votes by registering themselves for it. ");
        jScrollPane2.setViewportView(aboutus_TA);

        mainPanel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 470, 100));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        mainPanel.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 20));

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        mainPanel.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 730, 20));

        backBtn.setBackground(new java.awt.Color(0, 0, 0));
        backBtn.setForeground(new java.awt.Color(255, 255, 255));
        backBtn.setText("Go Back");
        backBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 153), java.awt.Color.darkGray));
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        mainPanel.add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 70, 30));

        desc_label.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        desc_label.setText("Description");
        mainPanel.add(desc_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, -1));

        features_ta.setEditable(false);
        features_ta.setBackground(new java.awt.Color(240, 240, 240));
        features_ta.setColumns(20);
        features_ta.setFont(new java.awt.Font("Segoe UI", 2, 11)); // NOI18N
        features_ta.setRows(5);
        features_ta.setText("Accessible and easy to use\nSecure\nPublish faster\nAccurate Results\n");
        jScrollPane1.setViewportView(features_ta);

        mainPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 470, 80));

        features_LABEL.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        features_LABEL.setText("Features");
        mainPanel.add(features_LABEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, -1, -1));

        email_tf.setFont(new java.awt.Font("Segoe UI", 2, 11)); // NOI18N
        email_tf.setText("evote@gmail.com"); // NOI18N
        email_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email_tfActionPerformed(evt);
            }
        });
        mainPanel.add(email_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, 470, -1));

        mail_tf.setEditable(false);
        mail_tf.setBackground(new java.awt.Color(240, 240, 240));
        mail_tf.setFont(new java.awt.Font("Segoe UI", 2, 11)); // NOI18N
        mail_tf.setText("1301 E. Debbie Ln., Suite #102, Mansfield, TX 76063");
        mail_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mail_tfActionPerformed(evt);
            }
        });
        mainPanel.add(mail_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, 470, -1));

        email_label.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        email_label.setText("Email");
        mainPanel.add(email_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, -1, -1));

        mail_label.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        mail_label.setText("Mailing Address");
        mainPanel.add(mail_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, -1, -1));

        getContentPane().add(mainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    private void email_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_email_tfActionPerformed

    private void mail_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mail_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mail_tfActionPerformed

    /**
     * @param args the command line arguments
     */
    public  void insert_AboutusData(){
        try{
        Checker check = new Checker();
            String description = null;
            String features= null;
            String email=null;
            String mailAddress=null;

            description= aboutus_TA.getText();
            features= features_ta.getText();
            email= email_tf.getText();
            mailAddress= mail_tf.getText();


        
                    IDGenerator idgen = new IDGenerator();
                    Statement stmt = check.connectSQL();
                    String query = "INSERT INTO ABOUTUS (ABTUS_ID,APP_DESCRIPTION,COMPANY_EMAIL, MAILING_ADDRESS,FEATURES) VALUES ('Abt-1', '"+description+"', '"+email+"','"+mailAddress+"','"+features+"')";
                    stmt.executeUpdate(query);
                 

                    
                
}
            
            catch(Exception e){
                System.out.println(e.toString());
            }
}

    
    public static void main(String args[]) {
        AboutUs abt=new AboutUs ();
        
        abt.insert_AboutusData();
        
        
        
        
        
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
            java.util.logging.Logger.getLogger(AboutUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AboutUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AboutUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AboutUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AboutUs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea aboutus_TA;
    private javax.swing.JLabel aboutus_label;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel desc_label;
    private javax.swing.JLabel email_label;
    private javax.swing.JTextField email_tf;
    private javax.swing.JLabel features_LABEL;
    private javax.swing.JTextArea features_ta;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel logoLb;
    private javax.swing.JLabel mail_label;
    private javax.swing.JTextField mail_tf;
    private javax.swing.JPanel mainPanel;
    // End of variables declaration//GEN-END:variables
}
