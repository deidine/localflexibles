package com.inventory.raport;

import com.inventory.print.ViewerCtrl;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Image;
import com.itextpdf.text.List;
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
public class PDFTable {

    public static void inBaoCao(String description, File file, float[] width, String date, ArrayList<String> name, DefaultTableModel table) throws DocumentException, IOException, ParseException {

        Document document = new Document(PageSize.A4_LANDSCAPE);
        BaseFont bf1 = BaseFont.createFont("vuArial.ttf", BaseFont.IDENTITY_H, true);
        FileOutputStream outFile = new FileOutputStream(file);
        PdfWriter.getInstance(document, outFile);

        document.open();
        com.itextpdf.text.Font fontTenCuaHang = new com.itextpdf.text.Font(bf1, 14, com.itextpdf.text.Font.BOLD, BaseColor.RED);
        com.itextpdf.text.Font fontTenBaoCao = new com.itextpdf.text.Font(bf1, 18, com.itextpdf.text.Font.BOLD, BaseColor.BLUE);

        Paragraph companyName = new Paragraph("DEIDINE SYSTEM", fontTenCuaHang);
        companyName.setAlignment(Element.ALIGN_CENTER);

        document.add(companyName);
        document.add(new Paragraph(" "));
        Image logo;
        logo = Image.getInstance(new ImageIcon("resources/login.png").getImage().getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH), Color.yellow);
        logo.setAlignment(Element.ALIGN_CENTER);
        Paragraph ph1 = new Paragraph(description, fontTenBaoCao);

        document.add(logo);
        document.add(new Paragraph("  "));
        document.add(ph1);

        document.add(new Paragraph(" "));

//        float[] width = new float[]{20f, 20f, 20f, 20f, 50f};
        document.add(getTable((DefaultTableModel) table, name, width));
        document.add(new Paragraph(" "));
        document.add(new Paragraph());
        List unorderedList = new List(List.UNORDERED);

        document.add(unorderedList);

        document.close();
        new ViewerCtrl("deidine.pdf");
    }

    public static PdfPTable getTable(DefaultTableModel listSalles, ArrayList<String> name, float[] width) throws DocumentException, IOException {

        BaseFont bf1 = BaseFont.createFont("vuArial.ttf", BaseFont.IDENTITY_H, true);
        com.itextpdf.text.Font fontChung1 = new com.itextpdf.text.Font(bf1, 14, com.itextpdf.text.Font.NORMAL, BaseColor.BLACK);

        com.itextpdf.text.Font fontChung = new com.itextpdf.text.Font(bf1, 12, com.itextpdf.text.Font.NORMAL, BaseColor.BLACK);
        PdfPTable table = new PdfPTable(width.length);
        table.setWidthPercentage(100);

        table.setWidths(width);
        for (int i = 0; i < name.size(); i++) {
            table.addCell(new PdfPCell(new Paragraph(name.get(i), fontChung1)));
        }
        int j;

        for (int i = 0; i < listSalles.getRowCount(); i++) {
//            table.addCell(new PdfPCell(new Paragraph(i + 1 + "")));
            for (j = 0; j < name.size(); j++) {
                table.addCell(new PdfPCell(new Paragraph(listSalles.getValueAt(i, j).toString(), fontChung)));

            }

        }
        System.out.println(name.size() + "  " + width.length);
        return table;
    }

      void ViewerCtrl(String filePath) {

        SwingController controller = new SwingController();

        SwingViewBuilder factory = new SwingViewBuilder(controller);

        JPanel viewerComponentPanel = factory.buildViewerPanel();

        controller.getDocumentViewController().setAnnotationCallback(
                new org.icepdf.ri.common.MyAnnotationCallback(
                        controller.getDocumentViewController()));

        JFrame applicationFrame = new JFrame();
        applicationFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        applicationFrame.add(viewerComponentPanel);

        controller.openDocument(filePath);

        applicationFrame.pack();
        applicationFrame.setVisible(true);
    }
}
