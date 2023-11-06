/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.inventory.Salles;

import java.awt.Dimension;
import java.awt.Toolkit;
 
import javax.swing.JDialog;
import javax.swing.JOptionPane;

import com.inventory.DAO.CustomerDAO;
import com.inventory.DTO.CustomerDTO;
import com.inventory.Database.ConnectionFactory;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author deidine
 */
public class Loanform extends javax.swing.JDialog {

    /**
     * Creates new form Clientform
     */
    Connection conn = null;
    PreparedStatement prepStatement = null;
    Statement statement = null;
    ResultSet resultSet = null;

    Object[] data;

    public Loanform(Object[] data) {
        try {
            conn = new ConnectionFactory().getConn();
            statement = conn.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        this.data = data;
        initComponents();
        loadDataSet();
        totalPaye();
        getCustemr();
        ////////////this have to be under the initCompoent to work in the jdialog plese dont forget to put under it 
        setLocationRelativeTo(null);
        setModal(true);
        setVisible(true);
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nameText = new javax.swing.JTextField();
        phoneText = new javax.swing.JTextField();
        locationText = new javax.swing.JTextField();
        codeText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        salleCode = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txtTotal = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtRendre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtRecu = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtPayed = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        labelHeader = new javax.swing.JLabel();
        editButton = new javax.swing.JButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("les information du notre client"));
        jPanel1.setFont(new java.awt.Font("Tw Cen MT", 1, 48)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel3.setText("Nom Complete:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel4.setText("Lieux Habitation:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel5.setText("Num Telephone:");

        nameText.setEditable(false);
        nameText.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        phoneText.setEditable(false);
        phoneText.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        phoneText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneTextActionPerformed(evt);
            }
        });

        locationText.setEditable(false);
        locationText.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        codeText.setEditable(false);
        codeText.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        codeText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codeTextActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel2.setText(" Code du client:");

        salleCode.setEditable(false);
        salleCode.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        salleCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salleCodeActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel8.setText(" Code du vente:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(phoneText, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                    .addComponent(locationText)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameText)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(16, 16, 16))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(codeText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(salleCode, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salleCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(phoneText, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(locationText, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));

        txtTotal.setEditable(false);
        txtTotal.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtTotal.setForeground(new java.awt.Color(4, 0, 0));
        txtTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTotal.setText("0");
        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Total a payee");

        txtRendre.setEditable(false);
        txtRendre.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtRendre.setForeground(new java.awt.Color(4, 0, 0));
        txtRendre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRendre.setText("0");
        txtRendre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRendreActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Stell to pay");

        txtRecu.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtRecu.setForeground(new java.awt.Color(4, 0, 0));
        txtRecu.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRecu.setText("0");
        txtRecu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRecuKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRecuKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Total Recu");

        txtPayed.setEditable(false);
        txtPayed.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtPayed.setForeground(new java.awt.Color(4, 0, 0));
        txtPayed.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPayed.setText("0");
        txtPayed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPayedActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Total A Rendre");

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/money.png")));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtRecu, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txtTotal, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
            .addComponent(txtRendre)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txtPayed)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPayed, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtRendre, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRecu, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        labelHeader.setFont(new java.awt.Font("Engravers MT", 1, 18)); // NOI18N
        labelHeader.setText("Formulaire du Client");

        editButton.setBackground(new java.awt.Color(255, 255, 0));
        editButton.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        editButton.setText("Payer");
        editButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(193, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(labelHeader)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        jPanel1.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalActionPerformed

    private void codeTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codeTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codeTextActionPerformed

    private void txtPayedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPayedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPayedActionPerformed

    private void salleCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salleCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salleCodeActionPerformed

    private void txtRecuKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRecuKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c)) && !(c == KeyEvent.VK_BACK_SPACE)) {
            JOptionPane.showMessageDialog(null, "il vaut entrer les nombre seulement", "Ilegal Input",
                    JOptionPane.ERROR_MESSAGE);
            evt.consume();
        }    // TODO add your handling code here:
    }//GEN-LAST:event_txtRecuKeyTyped

    private void txtRecuKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRecuKeyReleased
        Double totalPaye = Double.valueOf(txtTotal.getText());
        Double totalRecu = Double.valueOf(txtRecu.getText());
        if (totalRecu >= totalPaye) {
            txtRendre.setText("" + (totalRecu - totalPaye) + "");
            int revenu = Integer.valueOf(txtRendre.getText());
            txtRendre.setText("" + (revenu) + "");

        } else {
            txtRendre.setText("0");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRecuKeyReleased

    private void txtRendreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRendreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRendreActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        new PayLoan(data);
        // TODO add your handling code here:
    }//GEN-LAST:event_editButtonActionPerformed

    private void phoneTextActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_phoneTextActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_phoneTextActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
        if (codeText.getText().equals("") || nameText.getText().equals("")
                || locationText.getText().equals("") || phoneText.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please enter all the required details.");
        } else {
            CustomerDTO customerDTO = new CustomerDTO();
            customerDTO.setCustCode(codeText.getText());
            customerDTO.setFullName(nameText.getText());
            customerDTO.setLocation(locationText.getText());
            customerDTO.setPhone(phoneText.getText());
            new CustomerDAO().addCustomerDAO(customerDTO);
            // loadDataSet();
            codeText.setText("");
            nameText.setText("");
            locationText.setText("");
            phoneText.setText("");
        }
    }// GEN-LAST:event_addButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_deleteButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_clearButtonActionPerformed
        // TODO add your handling code here:
        codeText.setText("");
        nameText.setText("");
        locationText.setText("");
        phoneText.setText("");
    }// GEN-LAST:event_clearButtonActionPerformed

    public void loadDataSet() {
        codeText.setText(data[2].toString());
//        txtTotal.setText(data[3].toString());
        txtRecu.setText(data[4].toString());
        salleCode.setText(data[0].toString());
        codeText.setText(data[2].toString());

        Double total = Double.valueOf(txtTotal.getText());
        Double recu = Double.valueOf(txtRecu.getText());
//   this variable is for show that the user have payed and let some mony that is not payed
        Double have = total - recu;
        txtPayed.setText("" + have);

    }

    public void totalPaye() {
        try {

            String query = "SELECT SUM(d.total_paye-d.recu) as total "
                    + "FROM salesinfo d "
                    + "WHERE d.customercode='" + data[2].toString() + "'  and d.isLoan='true'";
   
            resultSet = statement.executeQuery(query);
            if (resultSet.next()) {
                txtTotal.setText(resultSet.getString("total"));
//                JOptionPane.showMessageDialog(null, "le client exists deja.");

            } else {

            }
//                addFunction(customerDTO);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void getCustemr() {
        try {
            String query = "select * FROM customers WHERE customercode='" + codeText.getText() + "'";
            resultSet = statement.executeQuery(query);

            if (resultSet.next()) {
                nameText.setText(resultSet.getString("fullname"));
                locationText.setText(resultSet.getString("location"));
                phoneText.setText(resultSet.getString("phone"));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updatePayRecu() {
        try {
            String query;
            Double totalPaye = Double.valueOf(txtTotal.getText());
            Double totalRecu = Double.valueOf(txtRecu.getText());
//verify if the recu amout is greter the the total pay if that true you have to delete the custmer from the loan pepole
//if not true you have to mince the recu in update it the amout of mony that have to be payed
            if (totalRecu >= totalPaye) {
//                txtRendre.setText("" + (totalRecu - totalPaye) + "");
//                int revenu = Integer.parseInt(txtRendre.getText());
//                txtRendre.setText("" + (revenu) + "");
//insert into table paylon always
                query = "UPDATE salesinfo SET recu= ?,isLoan='flase' WHERE customercode=? and salesid =?";
                prepStatement = conn.prepareStatement(query);
                prepStatement.setDouble(1, Double.parseDouble(txtRecu.getText()));
                prepStatement.setString(2, codeText.getText());
                prepStatement.setInt(3, Integer.parseInt(salleCode.getText()));

            } else {

                query = "UPDATE salesinfo SET recu=recu-? WHERE customercode=? and salesid =?";
                prepStatement = conn.prepareStatement(query);
                prepStatement.setDouble(1, Double.parseDouble(txtRecu.getText()));
                prepStatement.setString(2, codeText.getText());
                prepStatement.setInt(3, Integer.parseInt(salleCode.getText()));
            }

//            prepStatement.setString(2, prodCode);
            prepStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField codeText;
    private javax.swing.JButton editButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel labelHeader;
    private javax.swing.JTextField locationText;
    private javax.swing.JTextField nameText;
    private javax.swing.JTextField phoneText;
    private javax.swing.JTextField salleCode;
    private javax.swing.JTextField txtPayed;
    private javax.swing.JTextField txtRecu;
    private javax.swing.JTextField txtRendre;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables

}
