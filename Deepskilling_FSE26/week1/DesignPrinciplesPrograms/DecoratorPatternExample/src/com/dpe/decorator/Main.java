package com.dpe.decorator;

public class Main {
	 public static void main(String[] args) {
	        
	        Notifier emailNotifier = new EmailNotifier();
	        System.out.println("Email Only:");
	        emailNotifier.send("Server is down!");

	        
	        Notifier smsNotifier = new SMSNotifierDecorator(emailNotifier);
	        System.out.println("\nEmail + SMS:");
	        smsNotifier.send("Server is down!");

	      
	        Notifier slackNotifier = new SlackNotifierDecorator(smsNotifier);
	        System.out.println("\nEmail + SMS + Slack:");
	        slackNotifier.send("Server is down!");
	    }
}
