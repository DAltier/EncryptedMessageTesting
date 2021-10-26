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
		
		for(int i = 0; i < s.length(); i++) {
			int stringToIntCheck = _ISTI.getResult(String.valueOf(s.charAt(i)));
			
			if (spaces.contains(String.valueOf(s.charAt(i)))) {
				result += " ";
			} else if (numbers.contains(String.valueOf(s.charAt(i)))) {
				result += stringToIntCheck;
			} else if (stringToIntCheck == -1) {
				result += String.valueOf(s.charAt(i));
			} else {
				int halfIntCheck = _IHI.getResult(stringToIntCheck);
				result += _IITS.getResult(halfIntCheck);
			}
		}
		return result;
		
	}
}
