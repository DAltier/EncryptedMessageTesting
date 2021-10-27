package com.example.encryptedmessage.encrypt;

public class EncryptStringToInt implements IEncryptStringToInt {
	
	public int getResult(String s) {
		
		String numbers = "0123456789";
		String alpha = s.toLowerCase();
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		
		if (s.equals(" ")) {
			EncryptSpace character = new EncryptSpace();
			return character.getResult(s);
		} else if (numbers.contains(s)) {
			EncryptNumber character = new EncryptNumber();
			return character.getResult(s);
		} else if (alphabet.contains(alpha)) {
			EncryptLetter character = new EncryptLetter();
			return character.getResult(alpha);
		} else {
			return -1;
		}
	}
	
}
