package com.example.encryptedmessage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HalfIntTest {

	@Test
    public void Given2Get1() {
        //Given: I am a user
        //When: I enter the number 2
        IHalfInt IHI = new HalfInt();
        int result = IHI.getResult(2);
        //Then: I get back the number 1
        assertEquals(1, result);
    }

	@Test
    public void Given4Get2() {
        //Given: I am a user
        //When: I enter the number 4
		IHalfInt IHI = new HalfInt();
        int result = IHI.getResult(4);
        //Then: I get back the number 2
        assertEquals(2, result);
    }
	
	@Test
    public void Given52Get23() {
        //Given: I am a user
        //When: I enter the number 52
		IHalfInt IHI = new HalfInt();
        int result = IHI.getResult(52);
        //Then: I get back the number 26
        assertEquals(26, result);
    }

}
