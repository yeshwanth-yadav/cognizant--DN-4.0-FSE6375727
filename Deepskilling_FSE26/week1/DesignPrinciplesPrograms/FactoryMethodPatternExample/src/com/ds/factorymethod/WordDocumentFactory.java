package com.ds.factorymethod;

public class WordDocumentFactory extends DocumentFactory {
@Override
public Document createDocument() {
	return new WordDocument();
}
}
