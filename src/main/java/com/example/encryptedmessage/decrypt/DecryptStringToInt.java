package com.example.encryptedmessage.decrypt;

public class DecryptStringToInt implements IDecryptStringToInt {

	public int getResult(String s) {
		
		String numbers = "0123456789";
		String alphabetLowerCase = "abcdefghijklmnopqrstuvwxyz";
		String alphabetUppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		if (numbers.contains(s)) {
			DecryptNumber character = new DecryptNumber();
			return character.getResult(s);
		} else if (alphabetLowerCase.contains(s)) {
			DecryptLowerCase character = new DecryptLowerCase();
			return character.getResult(s);
		} else if (alphabetUppercase.contains(s)){
			DecryptUpperCase character = new DecryptUpperCase();
			return character.getResult(s);
		} else {
			return -1;
		}
	}

}
