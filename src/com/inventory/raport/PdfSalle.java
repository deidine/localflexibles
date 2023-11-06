/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inventory.raport;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Image;
import com.itextpdf.text.List;
import com.itextpdf.text.ListItem;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont; 
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable; 
import com.itextpdf.text.pdf.PdfWriter; 
import java.awt.Color; 
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException; 
import java.text.ParseException;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame; 
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.icepdf.ri.common.SwingController;
import org.icepdf.ri.common.SwingViewBuilder;

/**
 *
 * @author deidine
 */
public class PdfSalle {

    public static void inBaoCao(File file, String date, String operationType, DefaultTableModel table, String customerInfo, String recu, String back, String total) throws DocumentException, IOException, ParseException {

        Document document = new Document(PageSize.A4_LANDSCAPE);
        BaseFont bf1 = BaseFont.createFont("vuArial.ttf", BaseFont.IDENTITY_H, true);
        FileOutputStream outFile = new FileOutputStream(file);
        PdfWriter.getInstance(document, outFile);
         
        document.open();
        com.itextpdf.text.Font fontTenBaoCao = new com.itextpdf.text.Font(bf1, 18, com.itextpdf.text.Font.BOLD, BaseColor.BLUE);
        com.itextpdf.text.Font fontTenCuaHang = new com.itextpdf.text.Font(bf1, 14, com.itextpdf.text.Font.BOLD, BaseColor.RED);
        com.itextpdf.text.Font fontChung = new com.itextpdf.text.Font(bf1, 13, com.itextpdf.text.Font.NORMAL, BaseColor.BLACK);
        com.itextpdf.text.Font fontChungDam = new com.itextpdf.text.Font(bf1, 13, com.itextpdf.text.Font.BOLD, BaseColor.BLACK);
        com.itextpdf.text.Font fontChungNghieng = new com.itextpdf.text.Font(bf1, 13, com.itextpdf.text.Font.ITALIC, BaseColor.BLACK);

        Paragraph companyName = new Paragraph("DEIDINE SYSTEM", fontTenCuaHang);
        companyName.setAlignment(Element.ALIGN_CENTER);

        document.add(companyName);
        document.add(new Paragraph(" "));
        Image logo;
        logo = Image.getInstance(new ImageIcon("resources/login.png").getImage().getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH), Color.yellow);
        logo.setAlignment(Element.ALIGN_CENTER);

        document.add(logo);
        document.add(new Paragraph("  "));
//        document.add(new Paragraph("\n "));

        document.add(new Paragraph("Email: cheigeurdeidine@gmail.com       numero : 49619609", fontChung));
        document.add(new Paragraph("------------------------------------------------------------------------------------------------------------------------", fontChungDam));
        Paragraph ph1 = new Paragraph("BIEN VENU ET MERCI", fontTenBaoCao);
        ph1.setSpacingAfter(10f);
        ph1.setAlignment(Element.ALIGN_CENTER);
        document.add(ph1);
        document.add(new Paragraph("DATE ACHAT : " + date, fontChungNghieng));

        document.add(new Paragraph("TYPE DU FACTURE/OPERATION : " + operationType + "\t|\t\t\t\t\tNOM CLIENT :" + customerInfo));

        document.add(new Paragraph(" "));
        ArrayList<String> name = new ArrayList<>();
        name.add("NUM");
        name.add("NOM_PRO");
        name.add("PRX_VNT");
        name.add("QUENT");
        name.add("TOTAL");

        document.add(getTable((DefaultTableModel) table, name, total));
        document.add(new Paragraph(" "));
        document.add(new Paragraph());
        List unorderedList = new List(List.UNORDERED);
//        unorderedList.add(new ListItem("MONTENT PAYEE : " + txtTotal.getText(), fontTenCuaHang));
        unorderedList.add(new ListItem("MONTENT RECU: " + recu));
        unorderedList.add(new ListItem("MONTENT RETOURNE: " + back));
        document.add(unorderedList);
       
  document.close();
  
//    assertEquals(expectedText, text.toString());
  
    }
    
    public static PdfPTable getTable(DefaultTableModel listSalles, ArrayList<String> name, String total) throws DocumentException, IOException {

        BaseFont bf1 = BaseFont.createFont("vuArial.ttf", BaseFont.IDENTITY_H, true);
        com.itextpdf.text.Font fontChung1 = new com.itextpdf.text.Font(bf1, 14, com.itextpdf.text.Font.NORMAL, BaseColor.BLACK);

        com.itextpdf.text.Font fontChung = new com.itextpdf.text.Font(bf1, 12, com.itextpdf.text.Font.NORMAL, BaseColor.BLACK);
        PdfPTable table = new PdfPTable(5);
        table.setWidthPercentage(100);
        table.setWidths(new float[]{20f, 20f, 20f, 20f, 50f});
        table.addCell(new PdfPCell(new Paragraph(name.get(0), fontChung1)));
        table.addCell(new PdfPCell(new Paragraph(name.get(1), fontChung1)));
        table.addCell(new PdfPCell(new Paragraph(name.get(2), fontChung1)));
        table.addCell(new PdfPCell(new Paragraph(name.get(3), fontChung1)));
        table.addCell(new PdfPCell(new Paragraph(name.get(4), fontChung1)));

        for (int i = 0; i < listSalles.getRowCount(); i++) {

            table.addCell(new PdfPCell(new Paragraph(i + 1 + "")));
            table.addCell(new PdfPCell(new Paragraph(listSalles.getValueAt(i, 4).toString(), fontChung)));
            table.addCell(new PdfPCell(new Paragraph(listSalles.getValueAt(i, 2).toString(), fontChung)));
            table.addCell(new PdfPCell(new Paragraph(listSalles.getValueAt(i, 3).toString(), fontChung)));
            Double sellPrice = Double.valueOf(listSalles.getValueAt(i, 2).toString());
            Double totalRevenue = sellPrice;
            String totalRevenueStr = String.valueOf(totalRevenue);
            table.addCell(new PdfPCell(new Paragraph(totalRevenueStr, fontChung)));

        }
        PdfPCell cel1 = new PdfPCell();
        cel1.setBorder(2);
        PdfPCell cel2 = new PdfPCell();
        cel2.setBorder(1);
        table.addCell(cel2);
        table.addCell(cel2);
        table.addCell(cel2);
        table.addCell(cel2);

        Paragraph ph2 = new Paragraph(total);
        ph2.setAlignment(Element.ALIGN_RIGHT);
//        ph2.setSpacingAfter(10f);
        PdfPCell cel = new PdfPCell(ph2);

        table.addCell(cel);

        return table;
    }
    public void ViewerCtrl(String filePath) {
    	 
    	SwingController controller = new SwingController();

        SwingViewBuilder factory = new SwingViewBuilder(controller);

        JPanel viewerComponentPanel = factory.buildViewerPanel();

        controller.getDocumentViewController().setAnnotationCallback(
                new org.icepdf.ri.common.MyAnnotationCallback(
                        controller.getDocumentViewController()));

        JFrame applicationFrame = new JFrame();
        applicationFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //applicationFrame.getContentPane().add(viewerComponentPanel);
        applicationFrame.add(viewerComponentPanel);
        
        controller.openDocument(filePath);

        applicationFrame.pack();
        applicationFrame.setVisible(true);
    }
}
