
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Fujitsu
 */
public  class registrationVote extends javax.swing.JFrame    {
private String uid;
private String eid;
 private static ArrayList<String> voterIDs = new ArrayList<>();
    private String u_id;

     
    public registrationVote(String uid) {
                this.uid=uid;

        initComponents();
    }
    
    
//public void jComboBox1actionPerformed(ActionEvent e){  
//    
//}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genderGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        logoutBtn = new javax.swing.JButton();
        AboutusLb = new javax.swing.JLabel();
        FeedbackLb = new javax.swing.JLabel();
        HomeLb = new javax.swing.JLabel();
        logoLb1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        regTovote_label = new javax.swing.JLabel();
        fname_label = new javax.swing.JLabel();
        lname_label = new javax.swing.JLabel();
        cnic_label = new javax.swing.JLabel();
        email_label = new javax.swing.JLabel();
        fname_tf = new javax.swing.JTextField();
        lname_tf = new javax.swing.JTextField();
        cnic_tf = new javax.swing.JTextField();
        email_tf = new javax.swing.JTextField();
        submit_btn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        logoutBtn.setBackground(new java.awt.Color(244, 189, 108));
        logoutBtn.setText("Log out");
        logoutBtn.setBorder(null);
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        AboutusLb.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        AboutusLb.setForeground(new java.awt.Color(255, 255, 255));
        AboutusLb.setText("About us");
        AboutusLb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AboutusLb.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        AboutusLb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AboutusLbMouseClicked(evt);
            }
        });

        FeedbackLb.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        FeedbackLb.setForeground(new java.awt.Color(255, 255, 255));
        FeedbackLb.setText("Feedback");
        FeedbackLb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        FeedbackLb.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        FeedbackLb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FeedbackLbMouseClicked(evt);
            }
        });

        HomeLb.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        HomeLb.setForeground(new java.awt.Color(255, 255, 255));
        HomeLb.setText("Home");
        HomeLb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        HomeLb.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        HomeLb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeLbMouseClicked(evt);
            }
        });

        logoLb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logo_cropped.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoLb1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 275, Short.MAX_VALUE)
                .addComponent(HomeLb, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FeedbackLb, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(AboutusLb, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(FeedbackLb)
                                .addComponent(HomeLb))
                            .addComponent(AboutusLb))))
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(logoLb1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 80));

        jPanel2.setBackground(new java.awt.Color(231, 231, 231));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        regTovote_label.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        regTovote_label.setText("Register To Vote");
        jPanel2.add(regTovote_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, -1, -1));

        fname_label.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        fname_label.setText("FIRST NAME");
        jPanel2.add(fname_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, -1, -1));

        lname_label.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lname_label.setText("LAST NAME");
        jPanel2.add(lname_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, -1, -1));

        cnic_label.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cnic_label.setText("CNIC");
        jPanel2.add(cnic_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, -1, -1));

        email_label.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        email_label.setText("EMAIL");
        jPanel2.add(email_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, -1, -1));
        jPanel2.add(fname_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, 189, -1));
        jPanel2.add(lname_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 189, -1));

        cnic_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnic_tfActionPerformed(evt);
            }
        });
        jPanel2.add(cnic_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 189, -1));
        jPanel2.add(email_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 189, -1));

        submit_btn.setBackground(new java.awt.Color(0, 0, 0));
        submit_btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        submit_btn.setForeground(new java.awt.Color(255, 255, 255));
        submit_btn.setText("SUBMIT");
        submit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit_btnActionPerformed(evt);
            }
        });
        jPanel2.add(submit_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, 108, -1));

        backBtn.setBackground(new java.awt.Color(0, 0, 0));
        backBtn.setForeground(new java.awt.Color(255, 255, 255));
        backBtn.setText("Go Back");
        backBtn.setBorder(null);
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        jPanel2.add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 70, 25));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 780, 330));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 11, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 780, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cnic_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnic_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cnic_tfActionPerformed

    private void AboutusLbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AboutusLbMouseClicked
        // TODO add your handling code here:
        
        AboutUs about= new AboutUs();
        about.setVisible(true);
        about.setLocationRelativeTo (null);
    }//GEN-LAST:event_AboutusLbMouseClicked

    private void HomeLbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeLbMouseClicked
        // TODO add your handling code here:
        dispose();
        MainScreen main = new MainScreen(uid);
        main.setVisible(true);                //frame will only be visible with set "true"
        main.setLocationRelativeTo(null);     //for opening in center
    }//GEN-LAST:event_HomeLbMouseClicked

    private void FeedbackLbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FeedbackLbMouseClicked
        // TODO add your handling code here:
        
        Feedback feed = new Feedback(uid);
        feed.setVisible(true);                //frame will only be visible with set "true"
        feed.setLocationRelativeTo(null);     //for opening in center
    }//GEN-LAST:event_FeedbackLbMouseClicked

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        // TODO add your handling code here:
        int result = JOptionPane.showConfirmDialog(null,"Are you sure you want to log out?", "Logout Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if(result == JOptionPane.YES_OPTION){
            dispose();
            Homepage home = new Homepage();
            home.setVisible(true);                //frame will only be visible with set "true"
            home.setLocationRelativeTo(null);     //for opening in center
        } 
    }//GEN-LAST:event_logoutBtnActionPerformed

    
    private void submit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit_btnActionPerformed
        
        try{
            
         Checker check = new Checker();
          Statement stmt = check.connectSQL();
          this.uid=uid;
            
           ResultSet result=null;
           IDGenerator idgen = new IDGenerator(); 
           String utypeid=idgen.generateUTypeID();
           
            result= stmt.executeQuery("Select user_id from Person where user_id='"+this.uid+"' and user_type='Voter'");
           while(result.next()){
               System.out.println(result.getString("user_id"));
                 u_id=result.getString("user_id");
                
           }
     //validation to not insert when already present in person table as voter
           if(uid.equals(u_id)==false){
               
           result=stmt.executeQuery("Select * from Person where USER_ID='"+this.uid+"' ");

            while (result.next())
            {
                String userid=result.getString(1);
                String cnic=result.getString(2);
                String age = String.valueOf(result.getInt(3));
                String fname=result.getString(4);
                String lname=result.getString(5);
                String phno = String.valueOf(result.getDouble(6));
                String email=result.getString(7);
                String pswrd=result.getString(8);
                
                fname_tf.setText(result.getString(4));
                lname_tf.setText(result.getString(5));
                cnic_tf.setText(result.getString(2));
                email_tf.setText(result.getString(7));
               //inserting user in person table ...usertype as voter
              String query2 = "INSERT INTO Person (USER_ID, CNIC, AGE, FIRST_NAME, LAST_NAME, PHONE_NUMBER, EMAIL, PASSWORD, USER_TYPE, UTYPE_ID) VALUES ('"+this.uid+"', '"+cnic+"', "+age+",'"+fname+"','"+lname+"','"+phno+"','"+email+"','"+pswrd+"','Voter','"+utypeid+"')";
              stmt.executeUpdate(query2);
             
            }
           }
           else{
                          JOptionPane.showMessageDialog(null, "ALREADY REGISTERED");

               
           }
           
            
            String uv_id=null;
             result= stmt.executeQuery("Select user_id from Voter ");
             while(result.next()){
                 uv_id=result.getString("USER_ID");
                 
             }
           if(uid.equals(uv_id)==false){
           
             result= stmt.executeQuery("Select utype_id from Person where user_id='"+this.uid+"' and user_type='Voter' ");
           while(result.next()){
                utypeid=result.getString("UTYPE_ID");
               String query4 = "INSERT INTO VOTER (USER_ID, VOTER_ID, UTYPE_ID) VALUES ('"+this.uid+"', '"+idgen.generateVoterID(voterIDs)+"', '"+utypeid+"' )";
            stmt.executeUpdate(query4);
                JOptionPane.showMessageDialog(null, "Registered as a voter successfully");

           
           }           
           }
           else{
                          JOptionPane.showMessageDialog(null, "Already registered as Voter");

           }
           }

      catch(Exception e){
           JOptionPane.showMessageDialog(null, e);

        }
        
                                          
    }//GEN-LAST:event_submit_btnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
         dispose();
        register_Vote reg = new register_Vote(uid);
        reg.setVisible(true);                //frame will only be visible with set "true"
        reg.setLocationRelativeTo(null);     //for opening in center
        
    }//GEN-LAST:event_backBtnActionPerformed

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
            java.util.logging.Logger.getLogger(registrationVote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registrationVote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registrationVote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registrationVote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registrationVote(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AboutusLb;
    private javax.swing.JLabel FeedbackLb;
    private javax.swing.JLabel HomeLb;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel cnic_label;
    private javax.swing.JTextField cnic_tf;
    private javax.swing.JLabel email_label;
    private javax.swing.JTextField email_tf;
    private javax.swing.JLabel fname_label;
    private javax.swing.JTextField fname_tf;
    private javax.swing.ButtonGroup genderGroup;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lname_label;
    private javax.swing.JTextField lname_tf;
    private javax.swing.JLabel logoLb1;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JLabel regTovote_label;
    private javax.swing.JButton submit_btn;
    // End of variables declaration//GEN-END:variables
}
