package com.example.encryptedmessage;

public class IntToString implements IIntToString {
	
	public String getResult(int num) {
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String result = "";
		if (num > 26) {
			num -= 26;
			char c = alphabet.charAt(num - 1);
			result = String.valueOf(c).toUpperCase();
		} else {
			char c = alphabet.charAt(num - 1);
			result = String.valueOf(c);
		}
		return result;
	}
	
}
