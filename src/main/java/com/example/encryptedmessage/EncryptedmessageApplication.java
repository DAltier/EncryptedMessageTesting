package com.example.encryptedmessage;

import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class EncryptedmessageApplication {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		IEncryptedMessageFlow IEMF = context.getBean("IEncryptedMessageFlow", EncryptedMessageFlow.class);
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
		System.out.println("Enter your message");
		String message = myObj.nextLine();  // Read user input
		String result = "";
		for(int i = 0; i < message.length(); i++) {
			result += IEMF.getResult(String.valueOf(message.charAt(i)));
		}
		System.out.println(result);
		myObj.close();
	}

}
