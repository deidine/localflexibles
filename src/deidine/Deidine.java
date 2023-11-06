/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package deidine;

import com.inventory.Database.ConnectionFactory;
import com.inventory.UI.Dashboard;

import java.time.LocalDateTime;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import com.inventory.DTO.UserDTO;
import com.inventory.Database.ConnectionFactory;
import com.inventory.Salles.SallePage;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.sql.SQLException;

/**
 *
 * @author deidine
 */
public class Deidine extends javax.swing.JFrame {

    UserDTO userDTO;
    LocalDateTime inTime;

    /**
     * Creates new form login
     */
    public Deidine() {
        initComponents();
        userDTO = new UserDTO();
        // Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        // int x = (int) ((dimension.getWidth() - this.getWidth()) / 2);
        // int y = (int) ((dimension.getHeight() - this.getHeight()) / 2);
        // this.setLocation(x, y);
        setLocationRelativeTo(null);

        this.setResizable(false);
        // this.addWindowListener(getWindowAdapter());
        setIconImage(new ImageIcon("resources/logo.png").getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userType = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        headerLogin = new javax.swing.JLabel();
        labelPengguna = new javax.swing.JLabel();
        txtFieldUsername = new javax.swing.JTextField();
        labelPass = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        clearButton = new javax.swing.JButton();
        loginButton = new javax.swing.JButton();
        activatePassField = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        userType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADMINISTRATOR", "EMPLOYEE" }));
        userType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userTypeActionPerformed(evt);
            }
        });

        jLabel1.setText("Role Dans Le System");

        jPanel1.setBackground(new java.awt.Color(85, 225, 248));

        headerLogin.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        headerLogin.setForeground(new java.awt.Color(255, 255, 255));
        headerLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerLogin.setText("Connection Dans Le System");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(headerLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                                .addContainerGap()));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(headerLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                                .addContainerGap()));

        ImageIcon iconuser = new ImageIcon(
                new ImageIcon("resources/login.png").getImage().getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH));
        headerLogin.setIcon(iconuser);

        labelPengguna.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelPengguna.setText("username");

        txtFieldUsername.setMargin(new java.awt.Insets(0, 5, 0, 5));
        txtFieldUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldUsernameActionPerformed(evt);
            }
        });

        labelPass.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelPass.setText("password");

        txtPass.setMargin(new java.awt.Insets(0, 5, 0, 5));
        txtPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPassKeyPressed(evt);
            }
        });

        clearButton.setBackground(new java.awt.Color(51, 153, 255));
        clearButton.setForeground(new java.awt.Color(255, 255, 255));
        clearButton.setText("Anuller");
        clearButton.setBorder(null);
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });
        clearButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                clearButtonKeyPressed(evt);
            }
        });

        loginButton.setBackground(new java.awt.Color(51, 153, 255));
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setText("Login");
        loginButton.setBorder(null);
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        loginButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                loginButtonKeyPressed(evt);
            }
        });

        activatePassField.setBackground(new java.awt.Color(255, 255, 255));
        activatePassField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                activatePassFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                                Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(labelPengguna, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtPass)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(activatePassField))
                                        .addComponent(labelPass, javax.swing.GroupLayout.Alignment.TRAILING,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtFieldUsername, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(userType, 0, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                Short.MAX_VALUE))
                                .addGap(25, 25, 25))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 109,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 109,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(98, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(labelPengguna)
                                .addGap(18, 18, 18)
                                .addComponent(txtFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 37,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(labelPass)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 37,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(activatePassField, javax.swing.GroupLayout.PREFERRED_SIZE, 28,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 15,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(userType, javax.swing.GroupLayout.PREFERRED_SIZE, 34,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)));

        ImageIcon icon = new ImageIcon(new ImageIcon("resources/remove-button.png").getImage().getScaledInstance(30, 30,
                java.awt.Image.SCALE_SMOOTH));
        clearButton.setIcon(icon);
        ImageIcon iconlog = new ImageIcon(new ImageIcon("resources/login 1.png").getImage().getScaledInstance(30, 30,
                java.awt.Image.SCALE_SMOOTH));
        loginButton.setIcon(iconlog);
        ImageIcon iconshow = new ImageIcon(
                new ImageIcon("resources/show.png").getImage().getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH));

        activatePassField.setIcon(iconshow);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void activatePassFieldActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_activatePassFieldActionPerformed
        if (activatePassField.isSelected()) {
            txtPass.setEchoChar((char) 0);
            ImageIcon iconshow = new ImageIcon(new ImageIcon("resources/hide.png").getImage().getScaledInstance(30, 30,
                    java.awt.Image.SCALE_SMOOTH));
            activatePassField.setIcon(iconshow);

        } else {
            txtPass.setEchoChar('*');
            ImageIcon iconshow = new ImageIcon(new ImageIcon("resources/show.png").getImage().getScaledInstance(30, 30,
                    java.awt.Image.SCALE_SMOOTH));
            activatePassField.setIcon(iconshow);

        }
    }// GEN-LAST:event_activatePassFieldActionPerformed

    private void txtFieldUsernameActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtFieldUsernameActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtFieldUsernameActionPerformed

    private void txtPassKeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_txtPassKeyPressed
        try {
            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                ActionEvent et = null;
                loginButtonActionPerformed(et);
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }// GEN-LAST:event_txtPassKeyPressed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_clearButtonActionPerformed

        txtFieldUsername.setText("");
        txtPass.setText("");
    }// GEN-LAST:event_clearButtonActionPerformed

    private void clearButtonKeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_clearButtonKeyPressed
    }// GEN-LAST:event_clearButtonKeyPressed

    private void userTypeActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_userTypeActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_userTypeActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_loginButtonActionPerformed
        String userRole;
        // TODO add your handling code here:
        String username = txtFieldUsername.getText();
        String password = txtPass.getText();
        userRole = (String) userType.getSelectedItem();

        if (new ConnectionFactory().checkLogin(username, password, userRole)) {
            inTime = LocalDateTime.now();
            userDTO.setInTime(String.valueOf(inTime));
            dispose();
            if ("ADMINISTRATOR".equals(userRole)) {
                new Dashboard(username).setVisible(true);
            } else if ("EMPLOYEE".equals(userRole)) {
                //             new Dashboard(username, userRole, userDTO);
                new SallePage(username).setVisible(true);
            }

        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "Invalid username or password.");
        }
    }// GEN-LAST:event_loginButtonActionPerformed

    private void loginButtonKeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_loginButtonKeyPressed
        // TODO add your handling code here:
    }// GEN-LAST:event_loginButtonKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws IOException, SQLException {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Deidine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Deidine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Deidine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Deidine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>
        if (new ConnectionFactory().checkConn()) {
            System.out.println("you are alredy runing xampp");

        } else {
            Process process = Runtime.getRuntime().exec("C:\\xampp\\apache_start.bat");
            Process process2 = Runtime.getRuntime().exec("C:\\xampp\\mysql_start.bat");
            System.out.println("xampp is runing");
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Deidine().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox activatePassField;
    private javax.swing.JButton clearButton;
    private javax.swing.JLabel headerLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelPass;
    private javax.swing.JLabel labelPengguna;
    private javax.swing.JButton loginButton;
    private javax.swing.JTextField txtFieldUsername;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JComboBox<String> userType;
    // End of variables declaration//GEN-END:variables
}
