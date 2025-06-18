package com.ds.factorymethod;

public class ExcelDocumentFactory extends DocumentFactory {
@Override
public Document createDocument() {
	return new ExcelDocument();
}
}
