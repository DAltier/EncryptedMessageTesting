package com.example.encryptedmessage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringToIntTest {

	@Test
    public void GivenaGet1() {
        //Given: I am a user
        //When: I enter the string "a"
        IStringToInt ISTI = new StringToInt();
        int result = ISTI.getResult("a");
        //Then: I get back the number 1
        assertEquals(1, result);
    }

	@Test
    public void GivenbGet2() {
        //Given: I am a user
        //When: I enter the string "b"
        IStringToInt ISTI = new StringToInt();
        int result = ISTI.getResult("b");
        //Then: I get back the number 2
        assertEquals(2, result);
    }
	
	@Test
    public void GivenzGet26() {
        //Given: I am a user
        //When: I enter the string "z"
        IStringToInt ISTI = new StringToInt();
        int result = ISTI.getResult("z");
        //Then: I get back the number 26
        assertEquals(26, result);
    }
	
	@Test
	public void GivenABGet1() {
		//Given: I am a user
		//When: I enter the string "A"
		IStringToInt ISTI = new StringToInt();
		int result = ISTI.getResult("A");
		//Then: I get back the number 1
		assertEquals(1, result);
	}
	
	@Test
    public void GivenSpaceGet0() {
        //Given: I am a user
        //When: I enter the string " "
        IStringToInt ISTI = new StringToInt();
        int result = ISTI.getResult(" ");
        //Then: I get back the number 0
        assertEquals(0, result);
    }
	
	@Test
    public void Given1Get0() {
        //Given: I am a user
        //When: I enter the string "1"
        IStringToInt ISTI = new StringToInt();
        int result = ISTI.getResult("1");
        //Then: I get back the number 0
        assertEquals(0, result);
    }
}
