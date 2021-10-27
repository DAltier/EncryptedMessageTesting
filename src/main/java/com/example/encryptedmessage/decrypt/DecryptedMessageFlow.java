package com.example.encryptedmessage.decrypt;

public class DecryptedMessageFlow implements IDecryptedMessageFlow {

	private IDecryptStringToInt _DSTI;
	private IDecryptHalfInt _IDHI;
	private IDecryptIntToString _IDITS;
	
	public DecryptedMessageFlow(IDecryptStringToInt DSTI, IDecryptHalfInt IDHI, IDecryptIntToString IDITS) {
		_DSTI = DSTI;
		_IDHI = IDHI;
		_IDITS = IDITS;
	}
	
	public String getResult(String s) {
		
		String numbers = "0123456789";
		int stringToIntCheck = _DSTI.getResult(s); 
		
		if (numbers.contains(s)) {
			return String.valueOf(stringToIntCheck);
		} else if (stringToIntCheck != -1) {
			if (stringToIntCheck % 2 != 0) {
				return " "; 
			} else {
				int halfIntCheck = _IDHI.getResult(stringToIntCheck);
				return _IDITS.getResult(halfIntCheck);
			}
		}
		
		return s;
		
	}
		
}
