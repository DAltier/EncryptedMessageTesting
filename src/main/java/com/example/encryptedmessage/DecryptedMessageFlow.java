package com.example.encryptedmessage;

public class DecryptedMessageFlow implements IDecryptedMessageFlow {

	private IStringToInt _ISTI;
	private IHalfInt _IHI;
	private IIntToString _IITS;
	
	public DecryptedMessageFlow(IStringToInt ISTI, IHalfInt IHI, IIntToString IITS) {
		_ISTI = ISTI;
		_IHI = IHI;
		_IITS = IITS;
	}
	
	public String getResult(String s) {
		String result = "";
		String numbers = "0123456789";
		String spaces = "ACEGIKMOQSUWY";
		String alphabetUpperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		int stringToIntCheck = _ISTI.getResult(s); 
		
		if (alphabetUpperCase.contains(s)) {
			stringToIntCheck = _ISTI.getResult(s) + 26;
		}
		
		if (spaces.contains(s)) {
			result += " ";
		} else if (numbers.contains(s)) {
			result += stringToIntCheck;
		} else if (stringToIntCheck == -1) {
			result += s;
		} else {
			int halfIntCheck = _IHI.getResult(stringToIntCheck);
			result += _IITS.getResult(halfIntCheck);
		}
		return result;
		
	}
}
