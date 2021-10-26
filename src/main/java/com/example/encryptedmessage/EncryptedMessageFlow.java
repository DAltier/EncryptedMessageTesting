package com.example.encryptedmessage;

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
			int stringToIntCheck = _ISTI.getResult(String.valueOf(s.charAt(i)));
			if (stringToIntCheck == -1) {
				result += String.valueOf(s.charAt(i));
			} else if (String.valueOf(s.charAt(i)).equals(" ")) {
				result += _IITS.getResult(stringToIntCheck);
			} else if (numbers.contains(String.valueOf(s.charAt(i)))) {
				result += stringToIntCheck;
			} else {
				int doubleIntCheck = _IDI.getResult(stringToIntCheck);
				result += _IITS.getResult(doubleIntCheck);
			}
		}
		return result;
	}
}
