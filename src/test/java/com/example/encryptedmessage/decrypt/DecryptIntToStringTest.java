package com.example.encryptedmessage.decrypt;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DecryptIntToStringTest {

	@Test
    public void Given1Geta() {
        //Given: I am a user
        //When: I enter the number 1
        IDecryptIntToString IDTS = new DecryptIntToString();
        String result = IDTS.getResult(1);
        //Then: I get back the string "a"
        assertEquals("a", result);
    }

	@Test
    public void Given26Getz() {
        //Given: I am a user
        //When: I enter the number 26
        IDecryptIntToString IDTS = new DecryptIntToString();
        String result = IDTS.getResult(26);
        //Then: I get back the string "z"
        assertEquals("z", result);
    }
	
	@Test
    public void Given27GetSpace() {
        //Given: I am a user
        //When: I enter the number 27
        IDecryptIntToString IDTS = new DecryptIntToString();
        String result = IDTS.getResult(27);
        //Then: I get back the string "A"
        assertEquals("A", result);
    }
	
	@Test
    public void Given52GetZ() {
        //Given: I am a user
        //When: I enter the number 52
        IDecryptIntToString IDTS = new DecryptIntToString();
        String result = IDTS.getResult(52);
        //Then: I get back the string "Z"
        assertEquals("Z", result);
    }
}
