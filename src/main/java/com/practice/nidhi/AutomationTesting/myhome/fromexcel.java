package com.practice.nidhi.AutomationTesting.myhome;

import jxl.Sheet;
import jxl.Workbook;
import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.extractor.WordExtractor;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;

public class fromexcel {

    public static void main(String[] args) throws Exception {


        // To Open a Text File

        // Instatiate filereader f1
        FileReader f1 = new FileReader("D:\\Users\\pande\\Downloads\\Sankalp.txt");
        BufferedReader b = new BufferedReader(f1);
        System.out.println(b.readLine());

        // To Open a excel file

        FileInputStream f = new FileInputStream("C:\\SampleData.xls");
        Workbook wb = Workbook.getWorkbook(f);
        Sheet s = wb.getSheet("SalesOrders");

        System.out.println(s.getCell(0, 0).getContents());
        System.out.println(s.getCell(1, 0).getContents());


        // To Open a Word File
        FileInputStream f2 = new FileInputStream("D:\\Users\\pande\\Downloads\\ritika.doc");
        HWPFDocument document = new HWPFDocument(f2);
        WordExtractor ext = new WordExtractor(document);


        String[] fileData = ext.getParagraphText();
        for (int i = 0; i < fileData.length; i++) {
            if (fileData[i] != null)
                System.out.println(fileData[i]);
        }


    }

}
