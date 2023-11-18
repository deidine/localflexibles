/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.inventory.Salles;

import com.inventory.Database.ConnectionFactory;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author deidine
 */

public class SalleInfo extends javax.swing.JDialog {

    String username;
    Double moneyToCaisse = 0.0;

    Connection conn = null;
    Statement statement = null;
    ResultSet resultSet = null;
    private  Object[] data;

    /**
     * Creates new form SalleInfo
     */
    public SalleInfo(Object[] data) {
        try {
            conn = new ConnectionFactory().getConn();
            statement = conn.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        this.username = username;
        this.data = data;
    
        initComponents();

        loadDataSet();
        salleTable();
        totalValue();
        totalPaye();
        getCustemr();

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
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        codeText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        phoneText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        nameText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        locationText = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        payTable = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtTotal1 = new javax.swing.JTextField();

        jPanel4.setBackground(new java.awt.Color(0, 255, 255));

        codeText.setEditable(false);
        codeText.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        codeText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codeTextActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel2.setText(" Code du client:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel5.setText("Num Telephone:");

        phoneText.setEditable(false);
        phoneText.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        phoneText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneTextActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel3.setText("Nom Complete:");

        nameText.setEditable(false);
        nameText.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel4.setText("Lieux Habitation:");

        locationText.setEditable(false);
        locationText.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(codeText, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel5)
                .addGap(0, 0, 0)
                .addComponent(phoneText, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel3)
                .addGap(0, 0, 0)
                .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(locationText, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneText, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(locationText, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        payTable.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        payTable.setModel(new javax.swing.table.DefaultTableModel(
        ) );
        jScrollPane3.setViewportView(payTable);

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel13.setText("Total Prix ");

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

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel14.setText("Total Argent Acheter");

        txtTotal1.setEditable(false);
        txtTotal1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtTotal1.setForeground(new java.awt.Color(4, 0, 0));
        txtTotal1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTotal1.setText("0");
        txtTotal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotal1ActionPerformed(evt);
            }
        });

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/money.png")));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/money.png")));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(723, 723, 723)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTotal1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 713, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(283, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtTotal1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(37, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void codeTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codeTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codeTextActionPerformed

    private void phoneTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneTextActionPerformed

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalActionPerformed

    private void txtTotal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotal1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotal1ActionPerformed

 
    public void loadDataSet() {
        codeText.setText(data[2].toString());
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

  private void totalValue() {
        DefaultTableModel listSalles = (DefaultTableModel) payTable.getModel();

        Double totalPaye = 0.0;
        for (int i = 0; i < listSalles.getRowCount(); i++) {
            Double sellPrice = Double.valueOf(listSalles.getValueAt(i, 2).toString());
//            Double totalRevenue = sellPrice;

            Double totalRevenue = sellPrice * Integer.valueOf(listSalles.getValueAt(i, 3).toString());
            totalPaye = totalPaye + totalRevenue;
 txtTotal.setText(totalPaye.toString());
        }
    }

    private void salleTable() {

        DefaultTableModel listpays = (DefaultTableModel) payTable.getModel();

        listpays.addColumn("idVende");
        listpays.addColumn("code produit");

        listpays.addColumn("pix de vende");
        listpays.addColumn("quentite");

        listpays.addColumn("nom produit");
        listpays.addColumn("idDetail");

        try {
            String tampilBarang = "SELECT `salesid`, `date`, `customercode`, `total_paye`, "
                    + "`recu`, `changeMony`, `soldby`,"
                    + " `productcode`, `quantity`, `isLoan`,"
                    + " (SELECT  `productname` FROM `products` as p WHERE"
                    + " p.productcode=s.productcode) as productname ,"
                    + " `detaild`, `sellprice` FROM salledata as s where   "
                    + "  customercode='" + codeText.getText() + "' and salesid='" + data[0].toString() + "'";

            resultSet = statement.executeQuery(tampilBarang);

            DefaultTableModel laporan = new DefaultTableModel();
            laporan.addColumn("id");
            laporan.addColumn("code produit");

            laporan.addColumn("prix vente");
            laporan.addColumn("quentite");
            laporan.addColumn("nom Produit");

            laporan.addColumn("idDetail");

            laporan.getDataVector().removeAllElements();
            laporan.fireTableDataChanged();
            laporan.setRowCount(0);

            while (resultSet.next()) {
                laporan.addRow(new Object[]{
                    resultSet.getString("salesid"),
                    resultSet.getString("productcode"),
                    resultSet.getString("sellprice"),
                    resultSet.getString("quantity"),
                    resultSet.getString("productname"),
                    resultSet.getString("detaild"),});
                payTable.setModel(laporan);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "cek Kembali " + e + "");
        }

    }
    
        public void totalPaye() {
        try {
            String query = "SELECT Sum(total_paye) as total  FROM salesinfo  "

//            String query = "SELECT Sum((sellprice*quantity)-recu) as total  FROM salledata  "
                    + "WHERE  customercode='" + codeText.getText() + "'  and  isLoan='false'";

            resultSet = statement.executeQuery(query);
            if (resultSet.next()) {
                txtTotal1.setText(resultSet.getString("total"));
//                JOptionPane.showMessageDialog(null, "le client exists deja.");

            } else {

            }
//                addFunction(customerDTO);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField codeText;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField locationText;
    private javax.swing.JTextField nameText;
    private javax.swing.JTable payTable;
    private javax.swing.JTextField phoneText;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtTotal1;
    // End of variables declaration//GEN-END:variables
}
