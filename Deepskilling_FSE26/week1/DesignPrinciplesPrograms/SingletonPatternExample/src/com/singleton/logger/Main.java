package com.singleton.logger;

public class Main {
public static void main(String[] args) {
	Logger log1=Logger.getInsatnce();
	log1.log("This is first lo message");
	Logger log2=Logger.getInsatnce();
	log2.log("This is second log message");
	if(log1==log2) {
		System.out.println("singleton succesfull and same");
	}else{
		System.out.println("singleton failed and differnt");
	}
}
}
