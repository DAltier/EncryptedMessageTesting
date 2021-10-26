package com.example.encryptedmessage;

import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

@SpringBootApplication
public class EncryptedmessageApplication {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		IEncryptedMessageFlow IEMF = context.getBean("IEncryptedMessageFlow", EncryptedMessageFlow.class);
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
		System.out.println("Enter your message");
		String message = myObj.nextLine();  // Read user input
		System.out.println(IEMF.getResult(message));
		myObj.close();
		((AbstractApplicationContext)context).close();
	}

}
