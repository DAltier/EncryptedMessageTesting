package com.example.encryptedmessage;

public class EncryptionLoopFlow implements IEncryptionLoopFlow {

	private IEncryptedMessageFlow _IEMF;

    EncryptionLoopFlow(IEncryptedMessageFlow IEMF) {
        _IEMF = IEMF;
    }

    public String getResult(String s) {
    	
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            result += _IEMF.getResult(String.valueOf(s.charAt(i)));
        }
        return result;
        
    }
    
}
