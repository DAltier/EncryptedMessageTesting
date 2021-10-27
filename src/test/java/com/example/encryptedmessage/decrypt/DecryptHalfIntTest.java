package com.example.encryptedmessage.decrypt;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DecryptHalfIntTest {

	@Test
    public void Given2Get1() {
        //Given: I am a user
        //When: I enter the number 2
        IDecryptHalfInt IDHI = new DecryptHalfInt();
        int result = IDHI.getResult(2);
        //Then: I get back the number 1
        assertEquals(1, result);
    }

	@Test
    public void Given26Get13() {
        //Given: I am a user
        //When: I enter the number 26
        IDecryptHalfInt IDHI = new DecryptHalfInt();
        int result = IDHI.getResult(26);
        //Then: I get back the number 13
        assertEquals(13, result);
    }
	
	@Test
    public void Given52Get26() {
        //Given: I am a user
        //When: I enter the number 52
        IDecryptHalfInt IDHI = new DecryptHalfInt();
        int result = IDHI.getResult(52);
        //Then: I get back the number 26
        assertEquals(26, result);
    }
}
