package com.ds.factorymethod;

public class ExcelDocument implements Document {
@Override
public void open() {
	System.out.println("opening excel document..");
}
}
