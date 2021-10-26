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
