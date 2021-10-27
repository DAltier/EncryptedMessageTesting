package com.example.encryptedmessage.encrypt;

public class EncryptNumber implements IEncryptCharacter {

	public int getResult(String s) {
		
		String numbers = "0123456789";
		
		return (10 - numbers.indexOf(s)) % 10;
		
	}
	
}
