package com.example.encryptedmessage;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

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
    public void GivenSpaceGetRandomOddInt() {
        //Given: I am a user
        //When: I enter the string " "
        IStringToInt ISTI = new StringToInt();
        int result = ISTI.getResult(" ");
        Integer[] values = {27, 29, 31, 33, 35, 37, 39, 41, 43, 45, 47, 49, 51};
        boolean check = Arrays.asList(values).contains(result);
        //Then: I get back a random odd number between 27 and 52
        assertEquals(true, check);
    }
	
	@Test
    public void Given1Get9() {
        //Given: I am a user
        //When: I enter the string "1"
        IStringToInt ISTI = new StringToInt();
        int result = ISTI.getResult("1");
        //Then: I get back the number 9
        assertEquals(9, result);
    }
}
