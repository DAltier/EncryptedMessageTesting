package com.example.encryptedmessage.decrypt;

public class DecryptUpperCase implements IDecryptCharacter {
	
	public int getResult(String s) {
		
		String alphabetUppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int position = alphabetUppercase.indexOf(s) + 1;
		
		if (position % 2 == 0) {
			return position + 26;
		}
		
		return position;
		
	}

}
