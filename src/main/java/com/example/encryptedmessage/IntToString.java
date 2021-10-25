package com.example.encryptedmessage;

public class IntToString implements IIntToString {
	
	public String getResult(int num) {
		String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		char c = alphabet.charAt(num - 1);
		return String.valueOf(c);
	}
	
}
