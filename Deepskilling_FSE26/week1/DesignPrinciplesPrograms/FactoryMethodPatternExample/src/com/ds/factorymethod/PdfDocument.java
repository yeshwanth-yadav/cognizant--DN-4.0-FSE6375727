package com.ds.factorymethod;

public class PdfDocument implements Document {
@Override
public void open() {
	System.out.println("opening pdf document..");
}
}
