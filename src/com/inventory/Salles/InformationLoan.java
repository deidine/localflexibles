/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.inventory.Salles;

import com.inventory.raport.PDFTable;
import com.inventory.tables.SalleTable;
import com.itextpdf.text.DocumentException;
import java.io.File;
import java.io.IOException;
import java.lang.System.Logger;
import com.inventory.DTO.SupplierDTO;
import com.inventory.UI.FournisseurForm;
import com.inventory.tables.SalleTable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import com.inventory.Salles.PayLoan;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author deidine
 */
public class InformationLoan extends javax.swing.JPanel {

    SalleTable sltbl = new SalleTable();
    Date dates = new Date();
    DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

    /**
     * Creates new form Loan
     */
    public InformationLoan() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollTabelTransaksi = new javax.swing.JScrollPane();
        tabelInformation = new javax.swing.JTable();
        panelMainButton = new javax.swing.JPanel();
        jTextSearch = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        endDate = new com.toedter.calendar.JDateChooser();
        startDate = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        searchDate = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        bntPay = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        bntPay1 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));

        tabelInformation.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tabelInformation.setModel(sltbl.generateTable("true"));
        tabelInformation.setIntercellSpacing(new java.awt.Dimension(10, 5));
        tabelInformation.setOpaque(true);
        tabelInformation.setRowHeight(30);
        tabelInformation.getTableHeader().setReorderingAllowed(false);
        jScrollTabelTransaksi.setViewportView(tabelInformation);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollTabelTransaksi)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollTabelTransaksi, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE))
        );

        panelMainButton.setBackground(new java.awt.Color(0, 153, 153));

        jTextSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextSearchActionPerformed(evt);
            }
        });

        search.setBackground(new java.awt.Color(51, 153, 255));
        search.setForeground(new java.awt.Color(255, 255, 255));
        search.setText("chercher");
        search.setBorderPainted(false);
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(51, 153, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tableau Sur Le Vende A Terme");

        Locale locale2 = new Locale("fr", "london");
        endDate.setLocale(locale2);
        endDate.setDate(dates);
        //jDateChooser1.setDate(getCureentTime());

        Locale locale = new Locale("fr", "london");
        startDate.setLocale(locale);
        startDate.setDate(dates);
        //jDateChooser1.setDate(getCureentTime());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Du");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Au");

        searchDate.setBackground(new java.awt.Color(51, 153, 255));
        searchDate.setForeground(new java.awt.Color(255, 255, 255));
        searchDate.setText("chercher");
        searchDate.setBorderPainted(false);
        searchDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchDateActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("chercher par Code client");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("chercher par date");

        bntPay.setBackground(new java.awt.Color(102, 102, 0));
        bntPay.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bntPay.setForeground(new java.awt.Color(255, 255, 255));
        bntPay.setText("Paye L'argent");
        bntPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntPayActionPerformed(evt);
            }
        });

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        bntPay1.setBackground(new java.awt.Color(102, 102, 0));
        bntPay1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bntPay1.setForeground(new java.awt.Color(255, 255, 255));
        bntPay1.setText("Imprimer");
        bntPay1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntPay1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMainButtonLayout = new javax.swing.GroupLayout(panelMainButton);
        panelMainButton.setLayout(panelMainButtonLayout);
        panelMainButtonLayout.setHorizontalGroup(
            panelMainButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainButtonLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(panelMainButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bntPay, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                    .addComponent(bntPay1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelMainButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMainButtonLayout.createSequentialGroup()
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(startDate, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(endDate, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchDate, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jTextSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(search))
                    .addGroup(panelMainButtonLayout.createSequentialGroup()
                        .addGap(0, 0, 0)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jLabel4)))
                .addContainerGap())
        );
        panelMainButtonLayout.setVerticalGroup(
            panelMainButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainButtonLayout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(panelMainButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMainButtonLayout.createSequentialGroup()
                        .addComponent(bntPay1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bntPay)
                        .addGap(0, 5, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMainButtonLayout.createSequentialGroup()
                        .addGroup(panelMainButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelMainButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2)
                            .addGroup(panelMainButtonLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(panelMainButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelMainButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(endDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMainButtonLayout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addGap(15, 15, 15))
                                        .addComponent(search, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMainButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(searchDate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel3)
                                    .addComponent(startDate, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 8, Short.MAX_VALUE))))))
        );

        ImageIcon iconBtnCekLaporan3 = new ImageIcon(new ImageIcon("resources/check.png").getImage().
            getScaledInstance(20, 20, java.awt.Image.SCALE_SMOOTH));
        ImageIcon iconBtnCekLaporan4 = new ImageIcon(new ImageIcon("resources/check.png").getImage().
            getScaledInstance(20, 20, java.awt.Image.SCALE_SMOOTH));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelMainButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelMainButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        String text = jTextSearch.getText();

        loadSearchDataSale(text);

        // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

    private void jTextSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextSearchActionPerformed

    private void searchDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchDateActionPerformed
        String start = this.stringToDaTe(startDate.getDate());
        String end = this.stringToDaTe(endDate.getDate());
        loadSearchDataSaleByDate(start, end);
        System.out.println(start + " " + end);
// TODO add your handling code here:
    }//GEN-LAST:event_searchDateActionPerformed

    private void bntPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntPayActionPerformed
        if (tabelInformation.getSelectedRow() < 0  ) {
            JOptionPane.showMessageDialog(this, "SLV slectionner un line dans le table pour le suprimer.");
        } else {
            int row = tabelInformation.getSelectedRow();
            int col = tabelInformation.getColumnCount();
            Object[] data = new Object[col];

            for (int i = 0; i < col; i++) {

                data[i] = tabelInformation.getValueAt(row, i);
            }
            if (tabelInformation.getValueAt(row, 0) != null){
                      new PayLoan(data);
            }
      

        }
        // TODO add your handling code here:
    }//GEN-LAST:event_bntPayActionPerformed

    private void bntPay1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntPay1ActionPerformed
        float[] width = new float[]{20f, 30f, 30f, 40f, 20f, 20f, 20f, 20f, 20f };
        ArrayList<String> name = new ArrayList<>();
        name.add("NUM");
        name.add("date");
        name.add("cod_clt");
        name.add("total");
        name.add("recu");
        name.add("retrner");
        name.add("vend_par");
        name.add("cod_prod");
        name.add("quentie");

        String description = "les impeyee table";
  
        try {
            PDFTable.inBaoCao(description, new File("deidine.pdf"), width, getCureentTime(), name, (DefaultTableModel) tabelInformation.getModel());
            // TODO add your handling code here:
        } catch (DocumentException ex) {
            java.util.logging.Logger.getLogger(InformationLoan.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(InformationLoan.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            java.util.logging.Logger.getLogger(InformationLoan.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    }//GEN-LAST:event_bntPay1ActionPerformed
   private String getCureentTime() {

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date dates = new Date();

        return dateFormat.format(dates);

    }    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntPay;
    private javax.swing.JButton bntPay1;
    private com.toedter.calendar.JDateChooser endDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollTabelTransaksi;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextSearch;
    private javax.swing.JPanel panelMainButton;
    private javax.swing.JButton search;
    private javax.swing.JButton searchDate;
    private com.toedter.calendar.JDateChooser startDate;
    private javax.swing.JTable tabelInformation;
    // End of variables declaration//GEN-END:variables

    private void loadSearchDataSale(String text) {

        tabelInformation.setModel(sltbl.generateSearchTable(text, "true"));
    }

    private void loadSearchDataSaleByDate(String start, String end) {

        tabelInformation.setModel(sltbl.generateSearchDateTable(start, end, "true"));
    }

    private String stringToDaTe(Date s) {

        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;

        return formatter.format(s);
    }

}
