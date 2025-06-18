package com.singleton.logger;

public class Logger {
private static Logger instance;
private Logger() {
	System.out.println("Logger insatnce created...");
}
public static Logger getInsatnce() {
	if(instance==null) {
		instance = new Logger();
	}
	return instance;
}
public void log(String message) {
	System.out.println("LOG:"+message);
}
}
