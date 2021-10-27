package com.example.encryptedmessage;

import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.example.encryptedmessage.decrypt.DecryptionLoopFlow;
import com.example.encryptedmessage.decrypt.IDecryptionLoopFlow;
import com.example.encryptedmessage.encrypt.EncryptionLoopFlow;
import com.example.encryptedmessage.encrypt.IEncryptionLoopFlow;

@SpringBootApplication
public class EncryptedmessageApplication {

	public static void main(String[] args) {
		
		ApplicationContext contextEncrypt = new AnnotationConfigApplicationContext(AppConfig.class);
		IEncryptionLoopFlow ILF = contextEncrypt.getBean("IEncryptionLoopFlow", EncryptionLoopFlow.class);
		
		ApplicationContext contextDecrypt = new AnnotationConfigApplicationContext(AppConfig.class);
		IDecryptionLoopFlow DLF = contextDecrypt.getBean("IDecryptionLoopFlow", DecryptionLoopFlow.class);
		
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
			System.out.println(DLF.getResult(message));
		}
		myObj.close();
		((AbstractApplicationContext)contextEncrypt).close();
		((AbstractApplicationContext)contextDecrypt).close();
	}

}
