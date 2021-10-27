package com.example.encryptedmessage.encrypt;

public class EncryptLetter implements IEncryptCharacter {
	
	public int getResult(String s) {
		
		String alpha = s.toLowerCase();
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		
		return alphabet.indexOf(alpha) + 1;
		
	}
	
}
