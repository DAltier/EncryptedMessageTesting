package com.example.encryptedmessage.decrypt;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DecryptStringToIntTest {

	@Test
    public void GivenbGet2() {
        //Given: I am a user
        //When: I enter the string "b"
        IDecryptStringToInt IDSTI = new DecryptStringToInt();
        int result = IDSTI.getResult("b");
        //Then: I get back the number 2
        assertEquals(2, result);
    }

	@Test
    public void GivenBGet28() {
        //Given: I am a user
        //When: I enter the string "B"
        IDecryptStringToInt IDSTI = new DecryptStringToInt();
        int result = IDSTI.getResult("B");
        //Then: I get back the number 28
        assertEquals(28, result);
    }
	
	@Test
    public void Given2Get8() {
        //Given: I am a user
        //When: I enter the string "2"
        IDecryptStringToInt IDSTI = new DecryptStringToInt();
        int result = IDSTI.getResult("2");
        //Then: I get back the number 8
        assertEquals(8, result);
    }
	
	@Test
    public void GivenExclamationPointGetMinus1() {
        //Given: I am a user
        //When: I enter the string "!"
        IDecryptStringToInt IDSTI = new DecryptStringToInt();
        int result = IDSTI.getResult("!");
        //Then: I get back the number -1
        assertEquals(-1, result);
    }
	
	@Test
    public void GivenCGet3() {
        //Given: I am a user
        //When: I enter the string "C"
        IDecryptStringToInt IDSTI = new DecryptStringToInt();
        int result = IDSTI.getResult("C");
        //Then: I get back the number 3
        assertEquals(3, result);
    }
}
