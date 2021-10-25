package com.example.encryptedmessage;

public class StringToInt implements IStringToInt {
	
	public int getResult(String s) {
		String alpha = s.toLowerCase();
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		
		return alphabet.indexOf(alpha) + 1; 
	}
	
}
