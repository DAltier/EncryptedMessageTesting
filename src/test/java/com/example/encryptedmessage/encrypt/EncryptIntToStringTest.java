package com.example.encryptedmessage.encrypt;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EncryptIntToStringTest {

	@Test
    public void Given1Geta() {
        //Given: I am a user
        //When: I enter the number 1
        IEncryptIntToString IITS = new EncryptIntToString();
        String result = IITS.getResult(1);
        //Then: I get back the string "a"
        assertEquals("a", result);
    }

	@Test
    public void Given26Getz() {
        //Given: I am a user
        //When: I enter the number 26
        IEncryptIntToString IITS = new EncryptIntToString();
        String result = IITS.getResult(26);
        //Then: I get back the string "z"
        assertEquals("z", result);
    }
	
	@Test
    public void Given27GetA() {
        //Given: I am a user
        //When: I enter the number 27
        IEncryptIntToString IITS = new EncryptIntToString();
        String result = IITS.getResult(27);
        //Then: I get back the string "A"
        assertEquals("A", result);
    }
	
	@Test
    public void Given52GetZ() {
        //Given: I am a user
        //When: I enter the number 52
        IEncryptIntToString IITS = new EncryptIntToString();
        String result = IITS.getResult(52);
        //Then: I get back the string "Z"
        assertEquals("Z", result);
    }
}
