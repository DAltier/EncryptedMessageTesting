package com.example.encryptedmessage.encrypt;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EncryptDoubleIntTest {

	@Test
    public void Given1Get2() {
        //Given: I am a user
        //When: I enter the number 1
        IEncryptDoubleInt IDI = new EncryptDoubleInt();
        int result = IDI.getResult(1);
        //Then: I get back the number 2
        assertEquals(2, result);
    }

	@Test
    public void Given2Get4() {
        //Given: I am a user
        //When: I enter the number 2
        IEncryptDoubleInt IDI = new EncryptDoubleInt();
        int result = IDI.getResult(2);
        //Then: I get back the number 4
        assertEquals(4, result);
    }
	
	@Test
    public void Given26Get52() {
        //Given: I am a user
        //When: I enter the number 26
        IEncryptDoubleInt IDI = new EncryptDoubleInt();
        int result = IDI.getResult(26);
        //Then: I get back the number 52
        assertEquals(52, result);
    }
	
}
