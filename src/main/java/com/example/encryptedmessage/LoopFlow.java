package com.example.encryptedmessage;

public class LoopFlow implements ILoopFlow {

	private IEncryptedMessageFlow _IEMF;

    LoopFlow(IEncryptedMessageFlow IEMF) {
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
