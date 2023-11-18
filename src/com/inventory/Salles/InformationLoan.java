/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.inventory.Salles;

import com.inventory.DAO.CaisseDAO;
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
import com.inventory.tables.SalleTable2;
import java.net.URISyntaxException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author deidine
 */
public class InformationLoan extends javax.swing.JPanel {
    SalleTable2 sltbl2 = new SalleTable2();

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
        jSeparator2 = new javax.swing.JSeparator();
        imprimer = new javax.swing.JButton();
        cancelSale = new javax.swing.JButton();
        bntPay = new javax.swing.JButton();

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
            .addComponent(jScrollTabelTransaksi, javax.swing.GroupLayout.DEFAULT_SIZE, 1048, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollTabelTransaksi, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE))
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

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout panelMainButtonLayout = new javax.swing.GroupLayout(panelMainButton);
        panelMainButton.setLayout(panelMainButtonLayout);
        panelMainButtonLayout.setHorizontalGroup(
            panelMainButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainButtonLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(startDate, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelMainButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMainButtonLayout.createSequentialGroup()
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
                        .addGap(83, 83, 83)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel4)))
                .addContainerGap())
        );
        panelMainButtonLayout.setVerticalGroup(
            panelMainButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainButtonLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel2)
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(panelMainButtonLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(panelMainButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMainButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(search, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jTextSearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMainButtonLayout.createSequentialGroup()
                .addGroup(panelMainButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelMainButtonLayout.createSequentialGroup()
                        .addGroup(panelMainButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelMainButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMainButtonLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(panelMainButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(endDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(searchDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(panelMainButtonLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(panelMainButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(startDate, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addContainerGap())
        );

        ImageIcon iconBtnCekLaporan3 = new ImageIcon(new ImageIcon("resources/check.png").getImage().
            getScaledInstance(20, 20, java.awt.Image.SCALE_SMOOTH));
        ImageIcon iconBtnCekLaporan4 = new ImageIcon(new ImageIcon("resources/check.png").getImage().
            getScaledInstance(20, 20, java.awt.Image.SCALE_SMOOTH));

        imprimer.setBackground(new java.awt.Color(102, 102, 0));
        imprimer.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        imprimer.setForeground(new java.awt.Color(255, 255, 255));
        imprimer.setText("Imprimer");
        imprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimerActionPerformed(evt);
            }
        });

        cancelSale.setBackground(new java.awt.Color(255, 102, 102));
        cancelSale.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cancelSale.setForeground(new java.awt.Color(255, 255, 255));
        cancelSale.setText("Annuller Vente");
        cancelSale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelSaleActionPerformed(evt);
            }
        });

        bntPay.setBackground(new java.awt.Color(102, 255, 102));
        bntPay.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bntPay.setForeground(new java.awt.Color(255, 255, 255));
        bntPay.setText("Paye L'argent");
        bntPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntPayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(imprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cancelSale, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntPay, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelMainButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(panelMainButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(bntPay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cancelSale, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(imprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
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
  

    private void imprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimerActionPerformed
        float[] width = new float[]{20f, 30f, 30f, 40f, 20f, 20f, 20f};
        ArrayList<String> name = new ArrayList<>();
        name.add("NUM");
        name.add("date");
        name.add("cod_clt");
        name.add("total");
        name.add("recu");
        name.add("retrner");
        name.add("vend_par");

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
        } catch (URISyntaxException ex) {
            java.util.logging.Logger.getLogger(InformationLoan.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            java.util.logging.Logger.getLogger(InformationLoan.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    }//GEN-LAST:event_imprimerActionPerformed

    private void cancelSaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelSaleActionPerformed
        CaisseDAO caiss = new CaisseDAO();
        int row = tabelInformation.getSelectedRow();
        DefaultTableModel listSalles = (DefaultTableModel) tabelInformation.getModel();
        int id = Integer.valueOf(listSalles.getValueAt(row, 0).toString());
          int a = JOptionPane.showConfirmDialog(null, "tu veux fermer le system?", "Select", JOptionPane.YES_NO_OPTION);
                JOptionPane.setRootFrame(null);
                if (a == JOptionPane.YES_OPTION) {
        if (caiss.cancelSalle(id)) {
            JOptionPane.showMessageDialog(null, "Le vente Est annuler.");
            tabelInformation.setModel(sltbl.generateTable("true"));
        }
                }        // TODO add your handling code here:
    }//GEN-LAST:event_cancelSaleActionPerformed

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
   private String getCureentTime() {

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date dates = new Date();

        return dateFormat.format(dates);
   }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntPay;
    private javax.swing.JButton cancelSale;
    private com.toedter.calendar.JDateChooser endDate;
    private javax.swing.JButton imprimer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
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
