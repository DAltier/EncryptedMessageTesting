package com.example.encryptedmessage;

import java.util.Random;

public class EncryptedMessageFlow implements IEncryptedMessageFlow {
	
	private IStringToInt _ISTI;
	private IDoubleInt _IDI;
	private IIntToString _IITS;
	
	public EncryptedMessageFlow(IStringToInt ISTI, IDoubleInt IDI, IIntToString IITS) {
		_ISTI = ISTI;
		_IDI = IDI;
		_IITS = IITS;
	}

	public String getResult(String s) {
		String result = "";
		String numbers = "0123456789";
		
		for(int i = 0; i < s.length(); i++) {
			if (String.valueOf(s.charAt(i)).equals(" ")) {
				Random r = new Random();
				int ran = r.nextInt(52 - 27);
				if(ran % 2 == 0) {
					ran -= 1;
				}
				result += _IITS.getResult(ran).toUpperCase();
			} else if (numbers.contains(String.valueOf(s.charAt(i)))) {
				result += (10 - numbers.indexOf(String.valueOf(s.charAt(i)))) % 10;
			} else {
				int stringToIntCheck = _ISTI.getResult(String.valueOf(s.charAt(i)));
				if (stringToIntCheck > 0 && stringToIntCheck < 27) {
					int doubleIntCheck = _IDI.getResult(stringToIntCheck);
					result += _IITS.getResult(doubleIntCheck);
				} else {
					result += stringToIntCheck;
				}
			}
		}
		return result;
	}
}
