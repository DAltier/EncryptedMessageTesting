package com.example.encryptedmessage;

import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

@SpringBootApplication
public class EncryptedmessageApplication {

	public static void main(String[] args) {
		
		ApplicationContext contextEncrypt = new AnnotationConfigApplicationContext(AppConfig.class);
		ILoopFlow ILF = contextEncrypt.getBean("ILoopFlow", LoopFlow.class);
		
		ApplicationContext contextDecrypt = new AnnotationConfigApplicationContext(AppConfig.class);
		IDecryptedMessageFlow IDMF = contextDecrypt.getBean("IDecryptedMessageFlow", DecryptedMessageFlow.class);
		
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
		System.out.println("Enter e to encrypt or d to decrypt");
		String choice = myObj.nextLine();  // Read user input
		if (choice.equals("e")) {
			System.out.println("Enter the message to encrypt");
			String message = myObj.nextLine();  // Read user input
			System.out.println(ILF.getResult(message));
		} else if (choice.equalsIgnoreCase("d")) {
			System.out.println("Enter the message to decrypt");
			String message = myObj.nextLine();  // Read user input
			System.out.println(IDMF.getResult(message));
		}
		myObj.close();
		((AbstractApplicationContext)contextEncrypt).close();
		((AbstractApplicationContext)contextDecrypt).close();
	}

}
