
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Hunia
 */
public class ElectionView3 extends javax.swing.JFrame {
    private String uid;
    private String eid;
    /**
     * Creates new form ElectionView33
     */
    public ElectionView3(String uid, String eid) {
        this.uid = uid;
        this.eid = eid;
        initComponents();
        displayData();
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
        backBtn = new javax.swing.JButton();
        headerPanel = new javax.swing.JPanel();
        logoLb = new javax.swing.JLabel();
        HomeLb = new javax.swing.JLabel();
        logoutBtn = new javax.swing.JButton();
        AboutusLb = new javax.swing.JLabel();
        FeedbackLb = new javax.swing.JLabel();
        ProfileLb = new javax.swing.JLabel();
        footerPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        subheaderLb = new javax.swing.JLabel();
        headerLb1 = new javax.swing.JLabel();
        ExittBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setBackground(new java.awt.Color(231, 231, 231));
        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backBtn.setBackground(new java.awt.Color(0, 0, 0));
        backBtn.setForeground(new java.awt.Color(255, 255, 255));
        backBtn.setText("Go Back");
        backBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 153), java.awt.Color.black));
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        mainPanel.add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 70, 30));

        headerPanel.setBackground(new java.awt.Color(0, 0, 0));
        headerPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoLb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo_full_w.png"))); // NOI18N
        headerPanel.add(logoLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 10, 130, 80));

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
        headerPanel.add(HomeLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 40, 60, -1));

        logoutBtn.setBackground(new java.awt.Color(244, 189, 108));
        logoutBtn.setText("Log out");
        logoutBtn.setBorder(null);
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });
        headerPanel.add(logoutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 30, 80, 30));

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
        headerPanel.add(AboutusLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 40, 60, -1));

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
        headerPanel.add(FeedbackLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 40, 60, -1));

        ProfileLb.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ProfileLb.setForeground(new java.awt.Color(255, 255, 255));
        ProfileLb.setText("Profile");
        ProfileLb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ProfileLb.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ProfileLb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProfileLbMouseClicked(evt);
            }
        });
        headerPanel.add(ProfileLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 40, 60, -1));

        mainPanel.add(headerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 90));

        footerPanel.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout footerPanelLayout = new javax.swing.GroupLayout(footerPanel);
        footerPanel.setLayout(footerPanelLayout);
        footerPanelLayout.setHorizontalGroup(
            footerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        footerPanelLayout.setVerticalGroup(
            footerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        mainPanel.add(footerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, -1, -1));

        jScrollPane1.setBackground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setToolTipText("");

        jTable.setBackground(new java.awt.Color(244, 189, 108));
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable);

        mainPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 810, 170));

        subheaderLb.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        subheaderLb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mainPanel.add(subheaderLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 810, 50));

        headerLb1.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        headerLb1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mainPanel.add(headerLb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 810, 50));

        ExittBtn.setBackground(new java.awt.Color(0, 0, 0));
        ExittBtn.setForeground(new java.awt.Color(255, 255, 255));
        ExittBtn.setText("Exit");
        ExittBtn.setBorder(null);
        ExittBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExittBtnActionPerformed(evt);
            }
        });
        mainPanel.add(ExittBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 440, 70, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void displayData(){
        try{
            Checker check = new Checker();
            Statement stmt = check.connectSQL();
            DefaultTableModel model = (DefaultTableModel) jTable.getModel();
            //joins election and e_category to get category_type w.r.t to the election_cid
            ResultSet result = stmt.executeQuery("Select * from candidate natural join candidateapplicants natural join election natural join person where election_id='"+eid+"'");
            if(result.next()){
                headerLb1.setText("Election - "+result.getString("election_name"));
                subheaderLb.setText("Candidates' List");
                model.addColumn("Name");
                model.addColumn("Position");
                model.addColumn("Gender");
                model.addColumn("Age");
                
                do{
                    model.addRow(new String[]{result.getString("first_name")+" "+result.getString("last_name"), result.getString("position"), result.getString("gender"), result.getString("age")});
                }while(result.next());
                
            }
            else{
                result = stmt.executeQuery("Select * from party_group natural join groupapplicants natural join e_category natural join election where election_id='"+eid+"' and election_cid=category_id");
                if(result.next()){
                    headerLb1.setText("Election - "+result.getString("election_name"));
                    subheaderLb.setText("Groups' List");
                    model.addColumn("Name");
                    model.addColumn("Category");
                    model.addColumn("Description");
                    
                    do{
                        model.addRow(new String[]{result.getString("group_name"), result.getString("category_type"), result.getString("group_description")});
                    }while(result.next());
                }
            }
            
        
     
            
            
        }
        catch(Exception ex){
                System.out.println(ex.toString());
        }
    }
    
    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        dispose();
        ElectionView1 electionView = new ElectionView1(uid, eid);
        electionView.setVisible(true);                //frame will only be visible with set "true"
        electionView.setLocationRelativeTo(null);     //for opening in center
    }//GEN-LAST:event_backBtnActionPerformed

    private void HomeLbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeLbMouseClicked
        dispose();
        MainScreen main = new MainScreen(uid);
        main.setVisible(true);                //frame will only be visible with set "true"
        main.setLocationRelativeTo(null);     //for opening in center
    }//GEN-LAST:event_HomeLbMouseClicked

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        int result = JOptionPane.showConfirmDialog(null,"Are you sure you want to log out?", "Logout Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if(result == JOptionPane.YES_OPTION){
            dispose();
            Homepage home = new Homepage();
            home.setVisible(true);                //frame will only be visible with set "true"
            home.setLocationRelativeTo(null);     //for opening in center
        }
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void AboutusLbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AboutusLbMouseClicked
        // TODO add your handling code here:
        dispose();
        AboutUs about= new AboutUs();
        about.setVisible(true);
        about.setLocationRelativeTo (null);
    }//GEN-LAST:event_AboutusLbMouseClicked

    private void FeedbackLbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FeedbackLbMouseClicked
        // TODO add your handling code here:
        
        Feedback feed = new Feedback(uid);
        feed.setVisible(true);                //frame will only be visible with set "true"
        feed.setLocationRelativeTo(null);     //for opening in center
    }//GEN-LAST:event_FeedbackLbMouseClicked

    private void ExittBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExittBtnActionPerformed
        dispose();
        ElectionMainScreen election = new ElectionMainScreen(uid);
        election.setVisible(true);                //frame will only be visible with
        election.setLocationRelativeTo(null);     //for opening in center
    }//GEN-LAST:event_ExittBtnActionPerformed

    private void ProfileLbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProfileLbMouseClicked
        Profile1 profile = new Profile1(uid);
        profile.setVisible(true);                //frame will only be visible with set "true"
        profile.setLocationRelativeTo(null);     //for opening in center
    }//GEN-LAST:event_ProfileLbMouseClicked

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
            java.util.logging.Logger.getLogger(ElectionView3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ElectionView3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ElectionView3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ElectionView3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ElectionView3("","").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AboutusLb;
    private javax.swing.JButton ExittBtn;
    private javax.swing.JLabel FeedbackLb;
    private javax.swing.JLabel HomeLb;
    private javax.swing.JLabel ProfileLb;
    private javax.swing.JButton backBtn;
    private javax.swing.JPanel footerPanel;
    private javax.swing.JLabel headerLb1;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JLabel logoLb;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel subheaderLb;
    // End of variables declaration//GEN-END:variables
}
