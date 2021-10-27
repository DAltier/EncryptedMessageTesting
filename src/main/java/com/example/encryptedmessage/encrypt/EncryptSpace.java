package com.example.encryptedmessage.encrypt;

import java.util.Random;

public class EncryptSpace implements IEncryptCharacter {

	public int getResult(String s) {
		
		Random r = new Random();
		int ran = r.nextInt(52 - 27) + 27;
		if(ran % 2 == 0) {
			ran--;
		}
		return ran;
		
	}
	
}
