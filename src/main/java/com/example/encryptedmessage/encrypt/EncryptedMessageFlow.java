package com.example.encryptedmessage.encrypt;

public class EncryptedMessageFlow implements IEncryptedMessageFlow {
	
	private IEncryptStringToInt _ISTI;
	private IEncryptDoubleInt _IDI;
	private IEncryptIntToString _IITS;
	
	public EncryptedMessageFlow(IEncryptStringToInt ISTI, IEncryptDoubleInt IDI, IEncryptIntToString IITS) {
		_ISTI = ISTI;
		_IDI = IDI;
		_IITS = IITS;
	}

	public String getResult(String s) {
		
		String numbers = "0123456789";
		int stringToIntCheck = _ISTI.getResult(s);
		
		if (stringToIntCheck != -1) {
			if (s.equals(" ")) {
				return _IITS.getResult(stringToIntCheck);
			} else if (numbers.contains(s)) {
				return String.valueOf(stringToIntCheck);
			} else {
				int doubleIntCheck = _IDI.getResult(stringToIntCheck);
				return _IITS.getResult(doubleIntCheck);
			}
		}
		
		return s;
		
	}
}
