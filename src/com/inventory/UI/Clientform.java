/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.inventory.UI;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

import com.inventory.DAO.CustomerDAO;
import com.inventory.DTO.CustomerDTO;

/**
 *
 * @author deidine
 */
public class Clientform extends javax.swing.JDialog {
    /**
     * Creates new form Clientform
     */
    boolean edit;
    boolean add;
    Object[] data;

    public Clientform(boolean edit, boolean add, Object[] data) {
        this.edit = edit;
        this.add = add;
        this.data = data;
        // Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        // int x = (int) ((dimension.getWidth() - this.getWidth()) / 4);
        // int y = (int) ((dimension.getHeight() - this.getHeight()) / 6);
        // this.setLocation(x, y);
        // this.getHeight();
        // System.out.println(x + " x,y " + y + "," + dimension);
        // this.setLocation(x, y);

        // setAlwaysOnTop(true);
        // setUndecorated(true);
        initComponents();

        ////////////this have to be under the initCompoent to work in the jdialog plese dont forget to put under it 
        setLocationRelativeTo(null);
        setResizable(false);
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
        addButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        codeText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        labelHeader = new javax.swing.JLabel();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Enter Supplier Details"));
        jPanel1.setFont(new java.awt.Font("Tw Cen MT", 1, 48)); // NOI18N
        if (!edit) {
            editButton.setEnabled(false);

        }else{
            loadDataSet();
        }
        if (!add) {
            codeText.setEnabled(false);
            addButton.setEnabled(false);
        }

        jLabel3.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel3.setText("Nom Complete:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel4.setText("Lieux Habitation:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel5.setText("Num Telephone:");

        nameText.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        phoneText.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        phoneText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneTextActionPerformed(evt);
            }
        });

        locationText.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        addButton.setBackground(new java.awt.Color(51, 255, 51));
        addButton.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        addButton.setForeground(new java.awt.Color(51, 0, 51));
        addButton.setText("Ajouter");
        addButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        editButton.setBackground(new java.awt.Color(255, 255, 0));
        editButton.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        editButton.setText("Modifier");
        editButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        clearButton.setBackground(new java.awt.Color(255, 255, 0));
        clearButton.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        clearButton.setText("inisialiser");
        clearButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        codeText.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel2.setText(" Code du client:");

        labelHeader.setFont(new java.awt.Font("Engravers MT", 1, 18)); // NOI18N
        labelHeader.setText("Formulaire du Client");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(phoneText, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                            .addComponent(jLabel2)
                            .addComponent(codeText)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(113, 113, 113))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(locationText, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(labelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(labelHeader)
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneText, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(locationText, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 653, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 18, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void phoneTextActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_phoneTextActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_phoneTextActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
        if (codeText.getText().equals("") || nameText.getText().equals("")
                || locationText.getText().equals("") || phoneText.getText().equals(""))
            JOptionPane.showMessageDialog(this, "il vaut remplis toute les champs pour terminer l'operation.");
        else {
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

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_editButtonActionPerformed
        // TODO add your handling code here:
        if (codeText.getText().equals("") || nameText.getText().equals("")
                || locationText.getText().equals("") || phoneText.getText().equals(""))
            JOptionPane.showMessageDialog(this, "il vaut remplis toute les champs pour terminer l'operation.");
        else {
            CustomerDTO customerDTO = new CustomerDTO();
            customerDTO.setCustCode(codeText.getText());
            customerDTO.setFullName(nameText.getText());
            customerDTO.setLocation(locationText.getText());
            customerDTO.setPhone(phoneText.getText());
            new CustomerDAO().editCustomerDAO(customerDTO);
            // loadDataSet();
        }
    }// GEN-LAST:event_editButtonActionPerformed

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
        String a = data[0].toString();
        String b = data[1].toString();
        String c = data[2].toString();
        String d = data[3].toString();
        codeText.setText(a);
        // creditText.setText(b);
        // debitText.setText(c);
        nameText.setText(b);
        locationText.setText(c);
        phoneText.setText(d);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JButton addButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JTextField codeText;
    protected javax.swing.JButton editButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelHeader;
    private javax.swing.JTextField locationText;
    private javax.swing.JTextField nameText;
    private javax.swing.JTextField phoneText;
    // End of variables declaration//GEN-END:variables

}
