package com.example.encryptedmessage.decrypt;

public class DecryptNumber implements IDecryptCharacter {
	
	public int getResult(String s) {
		
		String numbers = "0123456789";
		
		return (10 - numbers.indexOf(s)) % 10;
		
	}

}
