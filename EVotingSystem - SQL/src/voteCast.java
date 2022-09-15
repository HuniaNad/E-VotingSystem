
import java.sql.ResultSet;
import java.sql.SQLException;
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
public class voteCast extends javax.swing.JFrame {
private String uid;
private String eid;

public voteCast(String uid,String eid) {
        this.uid=uid;
        this.eid=eid;

        initComponents();
        UpdateCombobox();
         System.out.println(this.eid);
        
    }
    /**
     * Creates new form voteCast
     */
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        votecastRadiobt = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        HomeLb = new javax.swing.JLabel();
        FeedbackLb = new javax.swing.JLabel();
        AboutusLb = new javax.swing.JLabel();
        logoutBtn = new javax.swing.JButton();
        logoLb1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        selectParty_label = new javax.swing.JLabel();
        submit_btn = new javax.swing.JButton();
        VoteCast_cb = new javax.swing.JComboBox<>();
        election_name_lb = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

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

        FeedbackLb.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        FeedbackLb.setForeground(new java.awt.Color(255, 255, 255));
        FeedbackLb.setText("Feedback");
        FeedbackLb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        FeedbackLb.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

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

        logoutBtn.setBackground(new java.awt.Color(244, 189, 108));
        logoutBtn.setText("Log out");
        logoutBtn.setBorder(null);
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        logoLb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logo_cropped.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoLb1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 346, Short.MAX_VALUE)
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
            .addGroup(jPanel1Layout.createSequentialGroup()
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
                .addGap(27, 27, 27))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(logoLb1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 813, -1));

        jPanel2.setBackground(new java.awt.Color(231, 231, 231));

        jPanel4.setBackground(new java.awt.Color(244, 189, 108));

        selectParty_label.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        selectParty_label.setText("SELECT THE CANDIDATE/PARTY YOU WANT TO VOTE");

        submit_btn.setBackground(new java.awt.Color(0, 0, 0));
        submit_btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        submit_btn.setForeground(new java.awt.Color(255, 255, 255));
        submit_btn.setText("SUBMIT");
        submit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit_btnActionPerformed(evt);
            }
        });

        VoteCast_cb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        VoteCast_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoteCast_cbActionPerformed(evt);
            }
        });

        election_name_lb.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        election_name_lb.setText("ELECTION NAME");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(229, 229, 229)
                        .addComponent(election_name_lb))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(selectParty_label, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(submit_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(VoteCast_cb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(139, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(election_name_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(selectParty_label, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(VoteCast_cb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(submit_btn)
                .addGap(39, 39, 39))
        );

        backBtn.setBackground(new java.awt.Color(0, 0, 0));
        backBtn.setForeground(new java.awt.Color(255, 255, 255));
        backBtn.setText("Go Back");
        backBtn.setBorder(null);
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(113, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 86, -1, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

     private void UpdateCombobox(){
        
        try{
         Checker check = new Checker();
            Statement stmt = check.connectSQL();
            this.eid=eid;
            String sql = "select user_id,first_name,last_name,election_name from candidateapplicants natural join person natural join election\n" +
              "where candidate_uid=user_id and election_id='"+this.eid+"'  ";
           ResultSet result=stmt.executeQuery(sql);

                
            while (result.next())
            {
                
                String ename=result.getString("election_name");

                String fname=result.getString("first_name");
                String lname=result.getString("last_name");
                String flname=fname+" "+lname;
                VoteCast_cb.addItem(flname);
                election_name_lb.setText(ename);

                
               }
            
           

        }

        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);

        }

 }   
     
    
    private void submit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit_btnActionPerformed
        // TODO add your handling code here:
         try{
         Checker check = new Checker();
                    IDGenerator idgen = new IDGenerator(); 

            Statement stmt = check.connectSQL();
           ResultSet result=null;

            String cuser_id=null;
            String v_id=null;
            String e_cid=null;
            this.eid=eid;
            this.uid=uid;
           String sname=VoteCast_cb.getSelectedItem().toString();
          
        String[] arrOfStr = sname.split(" ", 2);
        String cname=null;
        for (int i = 0; i < arrOfStr.length; i++) {
            cname=arrOfStr[0];
        }
      

           String query1 = "select user_id from Candidate natural join person where first_name='"+cname+"'";
           result= stmt.executeQuery(query1);
   
            while (result.next())
            {
                
                 cuser_id=result.getString("user_id");

            }
              String query4 = "select ELECTION_CID from election where election_id='"+this.eid+"'";
              result= stmt.executeQuery(query4);

   
            while (result.next())
            {

           e_cid=result.getString("ELECTION_CID");
             
            }

            
             String query2 = "select voter_id from Voter where user_id='"+this.uid+"'";
              result= stmt.executeQuery(query2);

   
            while (result.next())
            {

           v_id=result.getString("voter_id");
           
           
          String query3 = "INSERT INTO ELECTEDCANDIDATES (USER_ID, CANDIDATE_UID, VOTER_ID) VALUES ('"+this.uid+"', '"+cuser_id+"', '"+v_id+"' )";
          stmt.executeUpdate(query3);
          String query5 = "INSERT INTO Vote (VOTE_ID, USER_ID, ELECTION_ID,ELECTION_CID,VOTER_ID) VALUES ('"+idgen.generateVoteID()+"', '"+this.uid+"', '"+this.eid+"','"+e_cid+"','"+v_id+"' )";
          stmt.executeUpdate(query5);
       
            }      
        }

        catch(Exception e){
            JOptionPane.showMessageDialog(null, "vote is already submitted");

        }
         VoteCast_cb.setSelectedIndex(-1);
    }//GEN-LAST:event_submit_btnActionPerformed

    private void VoteCast_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoteCast_cbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VoteCast_cbActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
         dispose();
         MyReg_elections  myreg= new MyReg_elections(uid);
        myreg.setVisible(true);                //frame will only be visible with set "true"
        myreg.setLocationRelativeTo(null); 
    }//GEN-LAST:event_backBtnActionPerformed

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
            java.util.logging.Logger.getLogger(voteCast.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(voteCast.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(voteCast.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(voteCast.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new voteCast(null,null).setVisible(true);
            }
        });
    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AboutusLb;
    private javax.swing.JLabel FeedbackLb;
    private javax.swing.JLabel HomeLb;
    private javax.swing.JComboBox<String> VoteCast_cb;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel election_name_lb;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel logoLb1;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JLabel selectParty_label;
    private javax.swing.JButton submit_btn;
    private javax.swing.ButtonGroup votecastRadiobt;
    // End of variables declaration//GEN-END:variables
}