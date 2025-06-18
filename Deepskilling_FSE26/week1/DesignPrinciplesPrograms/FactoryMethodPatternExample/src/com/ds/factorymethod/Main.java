package com.ds.factorymethod;

public class Main {
public static void main(String[] args) {
	DocumentFactory wordfac= new WordDocumentFactory();
	Document wordDoc=wordfac.createDocument();
		wordDoc.open();
	 DocumentFactory pdfFactory = new PdfDocumentFactory();
     Document pdfDoc = pdfFactory.createDocument();
     pdfDoc.open();

     DocumentFactory excelFactory = new ExcelDocumentFactory();
     Document excelDoc = excelFactory.createDocument();
     excelDoc.open();	

}
}
