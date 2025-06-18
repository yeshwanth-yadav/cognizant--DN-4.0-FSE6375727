package com.ope.observer;

public class Main {
	 public static void main(String[] args) {
	        StockMarket stockMarket = new StockMarket();

	        Observer mobile1 = new MobileApp("Investor A");
	        Observer mobile2 = new MobileApp("Investor B");
	        Observer webApp = new WebApp("StockPortal");

	        stockMarket.registerObserver(mobile1);
	        stockMarket.registerObserver(mobile2);
	        stockMarket.registerObserver(webApp);

	        stockMarket.setStockPrice(1520.50);
	        stockMarket.setStockPrice(1589.75);

	        stockMarket.removeObserver(mobile2);

	        stockMarket.setStockPrice(1605.25);
	    }
}
