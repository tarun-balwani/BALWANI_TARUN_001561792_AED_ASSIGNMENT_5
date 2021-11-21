/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import static Business.Enterprise.Enterprise.EnterpriseType.Restaurant;
import Business.Organization;
import static Business.Organization.Type.RestaurantAdmin;
import Business.Role.AdminRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author tarunbalwani
 */
public class AddNewRestaurantPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddNewRestaurantPanel
     */
    JPanel cardSequenceJPanel;
    EcoSystem system;
    Enterprise enterprise;
    Organization organization;
    public AddNewRestaurantPanel(JPanel cardSequenceJPanel,EcoSystem system) {
        initComponents();
        initComponents();
        this.cardSequenceJPanel = cardSequenceJPanel;
        this.system=system;
        jButtonAssignManager.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtRestName = new javax.swing.JTextField();
        txtRestLoc = new javax.swing.JTextField();
        jButtonAddRestaurant = new javax.swing.JButton();
        jButtonAssignManager = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtManUserId = new javax.swing.JTextField();
        txtManName = new javax.swing.JTextField();
        txtManPwd = new javax.swing.JTextField();
        jButtonBack = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("Add A New Restaurant");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        jLabel2.setText("Restaurant Name:");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        jLabel3.setText("Location:");

        jButtonAddRestaurant.setBackground(new java.awt.Color(204, 255, 204));
        jButtonAddRestaurant.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jButtonAddRestaurant.setText("Add Restaurant");
        jButtonAddRestaurant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddRestaurantActionPerformed(evt);
            }
        });

        jButtonAssignManager.setBackground(new java.awt.Color(204, 255, 204));
        jButtonAssignManager.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jButtonAssignManager.setText("Add Manager");
        jButtonAssignManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAssignManagerActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        jLabel4.setText("Manager's Name");

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        jLabel5.setText("User ID");

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        jLabel6.setText("Password");

        jButtonBack.setBackground(new java.awt.Color(204, 255, 204));
        jButtonBack.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        jButtonBack.setText("BACK");
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel7.setText("Add manager Details:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jButtonBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonAssignManager)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txtManName, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(txtManUserId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(txtManPwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3)
                                        .addComponent(jButtonAddRestaurant))
                                    .addGap(32, 32, 32)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtRestLoc, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                        .addComponent(txtRestName)))))))
                .addContainerGap(159, Short.MAX_VALUE))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel2, jLabel3});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButtonAddRestaurant, jButtonAssignManager});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel4, jLabel5, jLabel6});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtManName, txtManPwd, txtManUserId});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonBack)
                    .addComponent(jLabel1))
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtRestName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtRestLoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonAddRestaurant)
                .addGap(36, 36, 36)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtManName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtManUserId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtManPwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jButtonAssignManager)
                .addContainerGap(81, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddRestaurantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddRestaurantActionPerformed
        // TODO add your handling code here:
        if (txtRestName.getText().equals("") || txtRestLoc.getText().equals("") ){
            JOptionPane.showMessageDialog(null,"Fields cannot be empty");
            return;
            
        }
        enterprise= system.getEnterpriseDirectory().createAndAddEnterprise(txtRestName.getText(),txtRestLoc.getText(),Restaurant);
        organization=  (Organization)enterprise.getRestaurantDirectory().createOrganization(Organization.Type.RestaurantAdmin);
       JOptionPane.showMessageDialog(null, "Restaurant Created successfully");
       jButtonAssignManager.setEnabled(true);
       
       {  
           return ; 
       }
    }//GEN-LAST:event_jButtonAddRestaurantActionPerformed

    private void jButtonAssignManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAssignManagerActionPerformed
        // TODO add your handling code here:
        if(organization==null){
            JOptionPane.showMessageDialog(null, "Please Create the Restaurant");
         return ; 
        }
        for(UserAccount ua : organization.getUserAccountDirectory().getUserAccountList()){
            if(ua.getUsername().equals(txtManUserId.getText())){
                 JOptionPane.showMessageDialog(null, "Username should be unique. UserName is already in use.");
    return;
            }
        }
        
        if (usernamePatternCorrect()==false){
    txtManUserId.setBorder(BorderFactory.createLineBorder(Color.RED));
    JOptionPane.showMessageDialog(null, "Username should be in the format of xx_xx@xx.xx");
    return;
} else{
    
    txtManUserId.setBorder(BorderFactory.createLineBorder(Color.black));
}
if (passwordPatternCorrect()==false){
    
    
    JOptionPane.showMessageDialog(null, "Password should be at least 6 digits and contain at least one upper case letter, one lower case letter, one digit and one special character $, *, # or &.");
    return;
}else{
    
    txtManPwd.setBorder(BorderFactory.createLineBorder(Color.black));
}
      
Employee employee=organization.getEmployeeDirectory().createEmployee(txtManName.getText());
     organization.getUserAccountDirectory().createUserAccount(txtManUserId.getText(),txtManPwd.getText() , employee, new AdminRole());
     JOptionPane.showMessageDialog(null, "Manager added successfully");
        
    }//GEN-LAST:event_jButtonAssignManagerActionPerformed

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        // TODO add your handling code here:
        cardSequenceJPanel.remove(this);
        CardLayout layout = (CardLayout) cardSequenceJPanel.getLayout();
        layout.previous(cardSequenceJPanel);
        Component[] comps = this.cardSequenceJPanel.getComponents();
        for(Component comp : comps){
            if(comp instanceof ManageRestaurantPanel){
                ManageRestaurantPanel manageRestaurantsJPanel= (ManageRestaurantPanel) comp;
               manageRestaurantsJPanel.populateTable(); 
            }
        }
    }//GEN-LAST:event_jButtonBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddRestaurant;
    private javax.swing.JButton jButtonAssignManager;
    private javax.swing.JButton jButtonBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtManName;
    private javax.swing.JTextField txtManPwd;
    private javax.swing.JTextField txtManUserId;
    private javax.swing.JTextField txtRestLoc;
    private javax.swing.JTextField txtRestName;
    // End of variables declaration//GEN-END:variables

    private boolean passwordPatternCorrect() {
        Pattern p1;
        p1 = Pattern.compile("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{6,}$");
        Matcher m1=p1.matcher(txtManPwd.getText());
        boolean b1=m1.matches();
        return b1;
    }

    private boolean usernamePatternCorrect() {
        Pattern p=Pattern.compile("^[a-zA-Z0-9]+[a-zA-Z0-9]+@[a-zA-Z0-9]+.[a-zA-Z0-9]+$");
        Matcher m=p.matcher(txtManUserId.getText());
        boolean b=m.matches();
        return b;
    }
}
