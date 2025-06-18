package com.ds.factorymethod;

public class PdfDocumentFactory extends DocumentFactory{
@Override
public Document createDocument() {
	return new PdfDocument();
}
}
