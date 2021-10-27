package com.example.encryptedmessage.decrypt;

public class DecryptionLoopFlow implements IDecryptionLoopFlow {
	
	private IDecryptedMessageFlow _IDMF;

    public DecryptionLoopFlow(IDecryptedMessageFlow IDMF) {
        _IDMF = IDMF;
    }

    public String getResult(String s) {
    	
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            result += _IDMF.getResult(String.valueOf(s.charAt(i)));
        }
        return result;
        
    }
    
}
