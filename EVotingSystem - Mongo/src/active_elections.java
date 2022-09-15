
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Fujitsu
 */
public class active_elections extends javax.swing.JFrame {
private String uid;
    /**
     * Creates new form active_elections
     */
   public active_elections(String uid) {
      this.uid=uid;
       initComponents();
   }
     public active_elections( ) {
         initComponents();
                  UpdateTable();

        
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
        logoLb1 = new javax.swing.JLabel();
        footerPanel = new javax.swing.JPanel();
        activeEL_label = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        activeEL_table = new javax.swing.JTable();

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
        headerPanel.add(logoLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 130, 80));

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
        headerPanel.add(HomeLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 40, 60, -1));

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

        logoLb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logo_cropped.png"))); // NOI18N
        headerPanel.add(logoLb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 10, 130, 80));

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

        activeEL_label.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        activeEL_label.setText("Active Elections");
        mainPanel.add(activeEL_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, -1, -1));

        activeEL_table.setBackground(new java.awt.Color(244, 189, 108));
        activeEL_table.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        activeEL_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Election ID", "Election name", "Description"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        activeEL_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                activeEL_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(activeEL_table);

        mainPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 660, 140));

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

    
    private void UpdateTable(){
          DefaultTableModel model = (DefaultTableModel) activeEL_table.getModel();
        model.setRowCount(0);
        try{
         Checker check = new Checker();
            Statement stmt = check.connectSQL();
            String sql = "Select ELECTION_ID,ELECTION_NAME,ELECTION_DESCRIPTION from ELECTION where privacy='Public'";
           ResultSet result=stmt.executeQuery(sql);

                
            while (result.next())
            {
                String eid=result.getString("ELECTION_ID");
                String e_name=result.getString("ELECTION_NAME");
                String e_desc=result.getString("ELECTION_DESCRIPTION");



                String tbdata[]={eid,e_name,e_desc};
                DefaultTableModel tb1Model = (DefaultTableModel)activeEL_table.getModel();
                tb1Model.addRow(tbdata); 
                


            }
        }

        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);

        }

       
      
    }
    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        dispose();
        Voting vote = new Voting(uid);
        vote.setVisible(true);                //frame will only be visible with set "true"
        vote.setLocationRelativeTo(null);     //for opening in center
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

    private void activeEL_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_activeEL_tableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_activeEL_tableMouseClicked

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
            java.util.logging.Logger.getLogger(active_elections.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(active_elections.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(active_elections.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(active_elections.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new active_elections().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AboutusLb;
    private javax.swing.JLabel FeedbackLb;
    private javax.swing.JLabel HomeLb;
    private javax.swing.JLabel activeEL_label;
    private javax.swing.JTable activeEL_table;
    private javax.swing.JButton backBtn;
    private javax.swing.JPanel footerPanel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logoLb;
    private javax.swing.JLabel logoLb1;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JPanel mainPanel;
    // End of variables declaration//GEN-END:variables
}