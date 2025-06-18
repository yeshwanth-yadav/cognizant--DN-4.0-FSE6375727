package com.bpe.builder;

public class Main {
	 public static void main(String[] args) {
	       
	        Computer basicPC = new Computer.Builder("Intel i3", "4GB").build();
	        basicPC.showSpecs();

	       
	        Computer gamingPC = new Computer.Builder("Intel i7", "16GB")
	            .setStorage("1TB SSD")
	            .setGraphicsCard("NVIDIA RTX 3060")
	            .setOS("Windows 11")
	            .build();
	        gamingPC.showSpecs();

	      
	        Computer workstation = new Computer.Builder("AMD Ryzen 9", "32GB")
	            .setStorage("2TB HDD + 1TB SSD")
	            .setGraphicsCard("NVIDIA Quadro RTX")
	            .setOS("Linux Ubuntu")
	            .build();
	        workstation.showSpecs();
	    }
}
