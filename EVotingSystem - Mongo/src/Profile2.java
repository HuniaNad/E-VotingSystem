/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Hunia
 */

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import java.awt.Component;
import java.sql.*;
import javax.swing.JOptionPane;

public class Profile2 extends javax.swing.JFrame {
    private String uid;
    /**
     * Creates new form Profile2
     */
    public Profile2(String uid) {
        this.uid = uid;
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
        logoLb = new javax.swing.JLabel();
        headerLb = new javax.swing.JLabel();
        loginPanel = new javax.swing.JPanel();
        emailLb = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        fnameLabel = new javax.swing.JLabel();
        fnameField = new javax.swing.JTextField();
        lnameLabel = new javax.swing.JLabel();
        lnameField = new javax.swing.JTextField();
        cnicLb = new javax.swing.JLabel();
        ageLb = new javax.swing.JLabel();
        ageField = new javax.swing.JSpinner();
        PhoneLb = new javax.swing.JLabel();
        phoneField = new javax.swing.JTextField();
        passwordLb = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        cnicField = new javax.swing.JFormattedTextField();
        uIDLb = new javax.swing.JLabel();
        uIDField = new javax.swing.JTextField();
        updateBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setBackground(new java.awt.Color(244, 189, 108));
        mainPanel.setPreferredSize(new java.awt.Dimension(690, 530));
        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoLb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logo_cropped_black.png"))); // NOI18N
        mainPanel.add(logoLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 70, 90));

        headerLb.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        headerLb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerLb.setText("Update Your Profile");
        mainPanel.add(headerLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 650, 50));

        loginPanel.setBackground(new java.awt.Color(0, 0, 0));
        loginPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        loginPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        emailLb.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        emailLb.setForeground(new java.awt.Color(244, 189, 108));
        emailLb.setText("Email");
        loginPanel.add(emailLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 90, 30));

        emailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailFieldActionPerformed(evt);
            }
        });
        loginPanel.add(emailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 480, 30));

        fnameLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        fnameLabel.setForeground(new java.awt.Color(244, 189, 108));
        fnameLabel.setText("First Name");
        loginPanel.add(fnameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 100, 30));

        fnameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameFieldActionPerformed(evt);
            }
        });
        loginPanel.add(fnameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 170, 30));

        lnameLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lnameLabel.setForeground(new java.awt.Color(244, 189, 108));
        lnameLabel.setText("Last Name");
        loginPanel.add(lnameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 100, 30));

        lnameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnameFieldActionPerformed(evt);
            }
        });
        loginPanel.add(lnameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, 170, 30));

        cnicLb.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cnicLb.setForeground(new java.awt.Color(244, 189, 108));
        cnicLb.setText("CNIC");
        loginPanel.add(cnicLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 90, 30));

        ageLb.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ageLb.setForeground(new java.awt.Color(244, 189, 108));
        ageLb.setText("Age");
        loginPanel.add(ageLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, 90, 30));

        ageField.setModel(new javax.swing.SpinnerNumberModel(18, 18, 100, 1));
        loginPanel.add(ageField, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 130, 100, 30));

        PhoneLb.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        PhoneLb.setForeground(new java.awt.Color(244, 189, 108));
        PhoneLb.setText("Phone No.");
        loginPanel.add(PhoneLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 110, 30));

        phoneField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneFieldActionPerformed(evt);
            }
        });
        loginPanel.add(phoneField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 200, 30));

        passwordLb.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        passwordLb.setForeground(new java.awt.Color(244, 189, 108));
        passwordLb.setText("Password");
        loginPanel.add(passwordLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 90, 30));

        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });
        loginPanel.add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 480, 30));

        cnicField.setText("xxxxx-xxxxxxx-x");
        loginPanel.add(cnicField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 200, 30));

        uIDLb.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        uIDLb.setForeground(new java.awt.Color(244, 189, 108));
        uIDLb.setText("User ID");
        loginPanel.add(uIDLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, 90, 30));

        uIDField.setEditable(false);
        uIDField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uIDFieldActionPerformed(evt);
            }
        });
        loginPanel.add(uIDField, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 180, 100, 30));

        mainPanel.add(loginPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 650, 290));

        updateBtn.setBackground(new java.awt.Color(0, 0, 0));
        updateBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        updateBtn.setForeground(new java.awt.Color(244, 189, 108));
        updateBtn.setText("Update");
        updateBtn.setBorder(null);
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        mainPanel.add(updateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 460, 110, 30));

        backBtn.setBackground(new java.awt.Color(0, 0, 0));
        backBtn.setForeground(new java.awt.Color(255, 255, 255));
        backBtn.setText("Go back");
        backBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 153), java.awt.Color.black));
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        mainPanel.add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     private void displayData(){
        try{
            Checker check = new Checker();
            DB mydb = check.connectMongo();
            DBCollection collection = mydb.getCollection("Person");
            uid = "u-1";
            BasicDBObject key = new BasicDBObject();
            key.put("user_ID", uid);
            DBCursor result = collection.find(key);
            
            result.hasNext();
            DBObject obj = result.next();

            fnameField.setText((String)obj.get("firstName"));
            lnameField.setText((String)obj.get("lastName"));
            emailField.setText((String)obj.get("email"));
            cnicField.setText((String)obj.get("cnic"));
            ageField.setValue(Integer.parseInt((String)obj.get("age")));
            phoneField.setText((String)obj.get("phoneNo"));
            uIDField.setText(this.uid);
            cnicField.setEnabled(false);
             
            }catch(Exception ex){
            System.out.println(ex.toString());
        }
    }
    
     
    private void emailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailFieldActionPerformed

    private void fnameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnameFieldActionPerformed

    private void lnameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnameFieldActionPerformed

    private void phoneFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneFieldActionPerformed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        try{
            Checker check = new Checker();
            String fname = null, lname = null, cnic = null , email = null , phone = null , pwd = null;
            boolean flag = false;
               
            if(!check.isName(fnameField.getText()) && !check.isName(lnameField.getText())){
                fnameField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
                lnameField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
                flag = true;
            }
            else if(!check.isName(fnameField.getText())){
                fnameField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
                flag = true;
                lnameField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 204, 0)));
            }
            else if(!check.isName(lnameField.getText())){
                lnameField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
                flag = true;
                fnameField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 204, 0)));
            }
            else{
                fname = fnameField.getText();
                lname = lnameField.getText();
                fnameField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 204, 0)));
                lnameField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 204, 0)));

            }

            if(check.isEmail(emailField.getText())){
                email = emailField.getText();
                emailField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 204, 0)));
            }
            else{
                emailField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
                flag = true;
            }

            if(check.isPhone(phoneField.getText())){
                phone = phoneField.getText();
                phoneField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 204, 0)));
            }
            else{
                phoneField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
                flag = true;
            }

            if(check.isPassword(passwordField.getText())){
                pwd = passwordField.getText();
                passwordField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 204, 0)));
            }
            else{
                passwordField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
                flag = true;
            }

            int age = Integer.parseInt(ageField.getValue().toString());

            if(flag){
                JOptionPane.showMessageDialog((Component)null, "Please enter valid credentials!");
                
            }
            else{
                int promptResult = JOptionPane.showConfirmDialog(null,"Are you sure you want to update your credentials?", "Updation Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                if(promptResult == JOptionPane.YES_OPTION){
                    DB mydb = check.connectMongo();
                    DBCollection collection = mydb.getCollection("Person");
                    BasicDBObject key = new BasicDBObject();
                    key.put("user_ID", uid);
                    
                    BasicDBObject doc = new BasicDBObject();
                    doc.put("age", Integer.toString(age));
                    doc.put("firstName", fname);
                    doc.put("lastName", lname);
                    doc.put("phoneNo", phone);
                    doc.put("email", email);
                    doc.put("password", pwd);                
                    
                    BasicDBObject updateObj = new BasicDBObject();
                    updateObj.put("$set", doc);
                    
                    collection.update(key, updateObj);
                   

                    dispose();
                    MainScreen main = new MainScreen(uid);
                    main.setVisible(true);                //frame will only be visible with set "true"
                    main.setLocationRelativeTo(null);     //for opening in center
                }
            }

        }catch(Exception ex){
            System.out.println(ex.toString());
        }
    }//GEN-LAST:event_updateBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        dispose();
        Profile1 profile = new Profile1(uid);
        profile.setVisible(true);                //frame will only be visible with set "true"
        profile.setLocationRelativeTo(null);     //for opening in center
    }//GEN-LAST:event_backBtnActionPerformed

    private void uIDFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uIDFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uIDFieldActionPerformed

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
            java.util.logging.Logger.getLogger(Profile2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Profile2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Profile2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Profile2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Profile2(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PhoneLb;
    private javax.swing.JSpinner ageField;
    private javax.swing.JLabel ageLb;
    private javax.swing.JButton backBtn;
    private javax.swing.JFormattedTextField cnicField;
    private javax.swing.JLabel cnicLb;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailLb;
    private javax.swing.JTextField fnameField;
    private javax.swing.JLabel fnameLabel;
    private javax.swing.JLabel headerLb;
    private javax.swing.JTextField lnameField;
    private javax.swing.JLabel lnameLabel;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JLabel logoLb;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLb;
    private javax.swing.JTextField phoneField;
    private javax.swing.JTextField uIDField;
    private javax.swing.JLabel uIDLb;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}