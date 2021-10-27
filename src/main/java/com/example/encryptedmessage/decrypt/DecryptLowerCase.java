package com.example.encryptedmessage.decrypt;

public class DecryptLowerCase implements IDecryptCharacter {

	public int getResult(String s) {
		
		String alphabetLowercase = "abcdefghijklmnopqrstuvwxyz";
		
		return alphabetLowercase.indexOf(s) + 1;
	}
}
