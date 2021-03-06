package com.example.encryptedmessage.encrypt;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;

class EncryptedMessageTestFlow {

	@Mock
	EncryptStringToInt mockStringToInt = mock(EncryptStringToInt.class);
	
	@Mock
	EncryptDoubleInt mockDoubleInt = mock(EncryptDoubleInt.class);
	
	@Mock
	EncryptIntToString mockIntToString = mock(EncryptIntToString.class);
	
	@Mock
	EncryptedMessageFlow mockEncryptedMessageFlow = mock(EncryptedMessageFlow.class);
	
	// Testing encryption for string "a" 
	@Test
	public void GivenaCallStringToIntOneTime() {
		// Given: I need to encrypt a message
		given(mockStringToInt.getResult("a")).willReturn(1);
		given(mockDoubleInt.getResult(1)).willReturn(2);
		given(mockIntToString.getResult(2)).willReturn("b");
		
		// When: I enter the string "a"
		IEncryptedMessageFlow IEMF = new EncryptedMessageFlow(mockStringToInt, mockDoubleInt, mockIntToString);
		IEMF.getResult("a");
		
		//Then: StringToInt.getResult() will be called one time
		verify(mockStringToInt, times(1)).getResult("a");
	}
	
	@Test
	public void GivenaCallDoubleIntOneTime() {
		// Given: I need to encrypt a message
		given(mockStringToInt.getResult("a")).willReturn(1);
		given(mockDoubleInt.getResult(1)).willReturn(2);
		given(mockIntToString.getResult(2)).willReturn("b");
		
		// When: I enter the string "a"
		IEncryptedMessageFlow IEMF = new EncryptedMessageFlow(mockStringToInt, mockDoubleInt, mockIntToString);
		IEMF.getResult("a");
		
		//Then: DoubleInt.getResult() will be called one time
		verify(mockDoubleInt, times(1)).getResult(1);
	}
	
	@Test
	public void GivenaCallIntToStringOneTime() {
		// Given: I need to encrypt a message
		given(mockStringToInt.getResult("a")).willReturn(1);
		given(mockDoubleInt.getResult(1)).willReturn(2);
		given(mockIntToString.getResult(2)).willReturn("b");
		
		// When: I enter the string "a"
		IEncryptedMessageFlow IEMF = new EncryptedMessageFlow(mockStringToInt, mockDoubleInt, mockIntToString);
		IEMF.getResult("a");
		
		//Then: IntToString.getResult() will be called one time
		verify(mockIntToString, times(1)).getResult(2);
	}

	
	// Testing for string "z" 
	@Test
	public void GivenzCallStringToIntOneTime() {
		// Given: I need to encrypt a message
		given(mockStringToInt.getResult("z")).willReturn(26);
		given(mockDoubleInt.getResult(26)).willReturn(52);
		given(mockIntToString.getResult(52)).willReturn("Z");
		
		// When: I enter the string "z"
		IEncryptedMessageFlow IEMF = new EncryptedMessageFlow(mockStringToInt, mockDoubleInt, mockIntToString);
		IEMF.getResult("z");
		
		//Then: StringToInt.getResult() will be called one time
		verify(mockStringToInt, times(1)).getResult("z");
	}
	
	@Test
	public void GivenzCallDoubleIntOneTime() {
		// Given: I need to encrypt a message
		given(mockStringToInt.getResult("z")).willReturn(26);
		given(mockDoubleInt.getResult(26)).willReturn(52);
		given(mockIntToString.getResult(52)).willReturn("Z");
		
		// When: I enter the string "z"
		IEncryptedMessageFlow IEMF = new EncryptedMessageFlow(mockStringToInt, mockDoubleInt, mockIntToString);
		IEMF.getResult("z");
		
		//Then: DoubleInt.getResult() will be called one time
		verify(mockDoubleInt, times(1)).getResult(26);
	}
	
	@Test
	public void GivenzCallIntToStringOneTime() {
		// Given: I need to encrypt a message
		given(mockStringToInt.getResult("z")).willReturn(26);
		given(mockDoubleInt.getResult(26)).willReturn(52);
		given(mockIntToString.getResult(52)).willReturn("Z");
		
		// When: I enter the string "z"
		IEncryptedMessageFlow IEMF = new EncryptedMessageFlow(mockStringToInt, mockDoubleInt, mockIntToString);
		IEMF.getResult("z");
		
		//Then: IntToString.getResult() will be called one time
		verify(mockIntToString, times(1)).getResult(52);
	}
	
	
	// Testing for string "A" 
	@Test
	public void GivenACallStringToIntOneTime() {
		// Given: I need to encrypt a message
		given(mockStringToInt.getResult("A")).willReturn(1);
		given(mockDoubleInt.getResult(1)).willReturn(2);
		given(mockIntToString.getResult(2)).willReturn("b");
		
		// When: I enter the string "A"
		IEncryptedMessageFlow IEMF = new EncryptedMessageFlow(mockStringToInt, mockDoubleInt, mockIntToString);
		IEMF.getResult("A");
		
		//Then: StringToInt.getResult() will be called one time
		verify(mockStringToInt, times(1)).getResult("A");
	}
	
	@Test
	public void GivenACallDoubleIntOneTime() {
		// Given: I need to encrypt a message
		given(mockStringToInt.getResult("A")).willReturn(1);
		given(mockDoubleInt.getResult(1)).willReturn(2);
		given(mockIntToString.getResult(2)).willReturn("b");
		
		// When: I enter the string "A"
		IEncryptedMessageFlow IEMF = new EncryptedMessageFlow(mockStringToInt, mockDoubleInt, mockIntToString);
		IEMF.getResult("A");
		
		//Then: DoubleInt.getResult() will be called one time
		verify(mockDoubleInt, times(1)).getResult(1);
	}
	
	@Test
	public void GivenACallIntToStringOneTime() {
		// Given: I need to encrypt a message
		given(mockStringToInt.getResult("A")).willReturn(1);
		given(mockDoubleInt.getResult(1)).willReturn(2);
		given(mockIntToString.getResult(2)).willReturn("b");
		
		// When: I enter the string "A"
		IEncryptedMessageFlow IEMF = new EncryptedMessageFlow(mockStringToInt, mockDoubleInt, mockIntToString);
		IEMF.getResult("A");
		
		//Then: IntToString.getResult() will be called one time
		verify(mockIntToString, times(1)).getResult(2);
	}
	
	
	// Testing for string "Z" 
	@Test
	public void GivenZCallStringToIntOneTime() {
		// Given: I need to encrypt a message
		given(mockStringToInt.getResult("Z")).willReturn(26);
		given(mockDoubleInt.getResult(26)).willReturn(52);
		given(mockIntToString.getResult(52)).willReturn("Z");
		
		// When: I enter the string "Z"
		IEncryptedMessageFlow IEMF = new EncryptedMessageFlow(mockStringToInt, mockDoubleInt, mockIntToString);
		IEMF.getResult("Z");
		
		//Then: StringToInt.getResult() will be called one time
		verify(mockStringToInt, times(1)).getResult("Z");
	}
	
	@Test
	public void GivenZCallDoubleIntOneTime() {
		// Given: I need to encrypt a message
		given(mockStringToInt.getResult("Z")).willReturn(26);
		given(mockDoubleInt.getResult(26)).willReturn(52);
		given(mockIntToString.getResult(52)).willReturn("Z");
		
		// When: I enter the string "Z"
		IEncryptedMessageFlow IEMF = new EncryptedMessageFlow(mockStringToInt, mockDoubleInt, mockIntToString);
		IEMF.getResult("Z");
		
		//Then: DoubleInt.getResult() will be called one time
		verify(mockDoubleInt, times(1)).getResult(26);
	}
	
	@Test
	public void GivenZCallIntToStringOneTime() {
		// Given: I need to encrypt a message
		given(mockStringToInt.getResult("Z")).willReturn(26);
		given(mockDoubleInt.getResult(26)).willReturn(52);
		given(mockIntToString.getResult(52)).willReturn("Z");
		
		// When: I enter the string "Z"
		IEncryptedMessageFlow IEMF = new EncryptedMessageFlow(mockStringToInt, mockDoubleInt, mockIntToString);
		IEMF.getResult("Z");
		
		//Then: IntToString.getResult() will be called one time
		verify(mockIntToString, times(1)).getResult(52);
	}
	
	
	// Testing for string "1" 
	@Test
	public void Given1CallStringToIntOneTime() {
		// Given: I need to encrypt a message
		given(mockStringToInt.getResult("1")).willReturn(9);
		given(mockDoubleInt.getResult(0)).willReturn(0);
		given(mockIntToString.getResult(0)).willReturn("1");
		
		// When: I enter the string "1"
		IEncryptedMessageFlow IEMF = new EncryptedMessageFlow(mockStringToInt, mockDoubleInt, mockIntToString);
		IEMF.getResult("1");
		
		//Then: StringToInt.getResult() will be called one time
		verify(mockStringToInt, times(1)).getResult("1");
	}
	
	@Test
	public void Given1CallDoubleIntZeroTimes() {
		// Given: I need to encrypt a message
		given(mockStringToInt.getResult("1")).willReturn(9);
		given(mockDoubleInt.getResult(0)).willReturn(0);
		given(mockIntToString.getResult(0)).willReturn("1");
		
		// When: I enter the string "1"
		IEncryptedMessageFlow IEMF = new EncryptedMessageFlow(mockStringToInt, mockDoubleInt, mockIntToString);
		IEMF.getResult("1");
		
		//Then: DoubleInt.getResult() will be called zero times
		verify(mockDoubleInt, times(0)).getResult(0);
	}
	
	@Test
	public void Given1CallIntToStringZeroTimes() {
		// Given: I need to encrypt a message
		given(mockStringToInt.getResult("1")).willReturn(9);
		given(mockDoubleInt.getResult(0)).willReturn(0);
		given(mockIntToString.getResult(0)).willReturn("1");
		
		// When: I enter the string "1"
		IEncryptedMessageFlow IEMF = new EncryptedMessageFlow(mockStringToInt, mockDoubleInt, mockIntToString);
		IEMF.getResult("1");
		
		//Then: IntToString.getResult() will be called zero times
		verify(mockIntToString, times(0)).getResult(0);
	}
	
	
	// Testing for string "!" 
	@Test
	public void GivenExclamationPointCallStringToIntOneTime() {
		// Given: I need to encrypt a message
		given(mockStringToInt.getResult("!")).willReturn(-1);
		given(mockDoubleInt.getResult(0)).willReturn(0);
		given(mockIntToString.getResult(0)).willReturn("");
		
		// When: I enter the string "!"
		IEncryptedMessageFlow IEMF = new EncryptedMessageFlow(mockStringToInt, mockDoubleInt, mockIntToString);
		IEMF.getResult("!");
		
		//Then: StringToInt.getResult() will be called one time
		verify(mockStringToInt, times(1)).getResult("!");
	}
	
	@Test
	public void GivenExclamationPointCallDoubleIntZeroTimes() {
		// Given: I need to encrypt a message
		given(mockStringToInt.getResult("!")).willReturn(-1);
		given(mockDoubleInt.getResult(0)).willReturn(0);
		given(mockIntToString.getResult(0)).willReturn("");
		
		// When: I enter the string "!"
		IEncryptedMessageFlow IEMF = new EncryptedMessageFlow(mockStringToInt, mockDoubleInt, mockIntToString);
		IEMF.getResult("!");
		
		//Then: DoubleInt.getResult() will be called zero times
		verify(mockDoubleInt, times(0)).getResult(0);
	}
	
	@Test
	public void GivenExclamationPointCallIntToStringZeroTimes() {
		// Given: I need to encrypt a message
		given(mockStringToInt.getResult("!")).willReturn(-1);
		given(mockDoubleInt.getResult(0)).willReturn(0);
		given(mockIntToString.getResult(0)).willReturn("");
		
		// When: I enter the string "!"
		IEncryptedMessageFlow IEMF = new EncryptedMessageFlow(mockStringToInt, mockDoubleInt, mockIntToString);
		IEMF.getResult("!");
		
		//Then: IntToString.getResult() will be called zero times
		verify(mockIntToString, times(0)).getResult(0);
	}
	
	
	// Testing for string "abc" 
	@Test
	public void GivenabcCallLoopFlow3Times() {
		// Given: I need to encrypt a message
		given(mockEncryptedMessageFlow.getResult("a")).willReturn("b");
		given(mockEncryptedMessageFlow.getResult("b")).willReturn("d");
		given(mockEncryptedMessageFlow.getResult("c")).willReturn("f");
		
		// When: I enter the string "abc"
		IEncryptionLoopFlow ILF = new EncryptionLoopFlow(mockEncryptedMessageFlow);
		ILF.getResult("abc");
		
		//Then: IntToString.getResult() will be called one time
		verify(mockEncryptedMessageFlow, times(1)).getResult("a");
		verify(mockEncryptedMessageFlow, times(1)).getResult("b");
		verify(mockEncryptedMessageFlow, times(1)).getResult("c");
	}
}
