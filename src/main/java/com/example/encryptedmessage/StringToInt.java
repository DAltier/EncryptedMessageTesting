package com.example.encryptedmessage;

import java.util.Random;

public class StringToInt implements IStringToInt {
	
	public int getResult(String s) {
		String alpha = s.toLowerCase();
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		
		if (s.equals(" ")) {
			Random r = new Random();
			int ran = r.nextInt(52 - 27) + 27;
			if(ran % 2 == 0) {
				ran -= 1;
			}
			return ran;
		} else if (numbers.contains(s)) {
			return (10 - numbers.indexOf(s)) % 10;
		}

		return alphabet.indexOf(alpha) + 1; 
	}
	
}
