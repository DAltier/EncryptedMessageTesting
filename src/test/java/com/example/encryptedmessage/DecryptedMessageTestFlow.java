package com.example.encryptedmessage;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;

class DecryptedMessageTestFlow {

	@Mock
	StringToInt mockStringToInt = mock(StringToInt.class);
	
	@Mock
	HalfInt mockHalfInt = mock(HalfInt.class);
	
	@Mock
	IntToString mockIntToString = mock(IntToString.class);
	
	@Mock
	DecryptedMessageFlow mockDecryptedMessageFlow = mock(DecryptedMessageFlow.class);
	
	
	// Testing encryption for string "b" 
	@Test
	public void GivenbCallStringToIntOneTime() {
		// Given: I need to decrypt a message
		given(mockStringToInt.getResult("b")).willReturn(2);
		given(mockHalfInt.getResult(2)).willReturn(1);
		given(mockIntToString.getResult(1)).willReturn("a");
		
		// When: I enter the string "b"
		IDecryptedMessageFlow IDMF = new DecryptedMessageFlow(mockStringToInt, mockHalfInt, mockIntToString);
		IDMF.getResult("b");
		
		//Then: StringToInt.getResult() will be called one time
		verify(mockStringToInt, times(1)).getResult("b");
	}
	
	@Test
	public void GivenbCallDoubleIntOneTime() {
		// Given: I need to decrypt a message
		given(mockStringToInt.getResult("b")).willReturn(2);
		given(mockHalfInt.getResult(2)).willReturn(1);
		given(mockIntToString.getResult(1)).willReturn("a");
		
		// When: I enter the string "b"
		IDecryptedMessageFlow IDMF = new DecryptedMessageFlow(mockStringToInt, mockHalfInt, mockIntToString);
		IDMF.getResult("b");
		
		//Then: DoubleInt.getResult() will be called one time
		verify(mockHalfInt, times(1)).getResult(2);
	}
	
	@Test
	public void GivenbCallIntToStringOneTime() {
		// Given: I need to decrypt a message
		given(mockStringToInt.getResult("b")).willReturn(2);
		given(mockHalfInt.getResult(2)).willReturn(1);
		given(mockIntToString.getResult(1)).willReturn("a");
		
		// When: I enter the string "b"
		IDecryptedMessageFlow IDMF = new DecryptedMessageFlow(mockStringToInt, mockHalfInt, mockIntToString);
		IDMF.getResult("b");
		
		//Then: IntToString.getResult() will be called one time
		verify(mockIntToString, times(1)).getResult(1);
	}

	
	// Testing encryption for string "B" 
	@Test
	public void GivenBCallStringToIntOneTime() {
		// Given: I need to decrypt a message
		given(mockStringToInt.getResult("B")).willReturn(2);
		given(mockHalfInt.getResult(2)).willReturn(1);
		given(mockIntToString.getResult(1)).willReturn("a");
		
		// When: I enter the string "B"
		IDecryptedMessageFlow IDMF = new DecryptedMessageFlow(mockStringToInt, mockHalfInt, mockIntToString);
		IDMF.getResult("B");
		
		//Then: StringToInt.getResult() will be called one time
		verify(mockStringToInt, times(1)).getResult("B");
	}
	
	@Test
	public void GivenBCallDoubleIntOneTime() {
		// Given: I need to decrypt a message
		given(mockStringToInt.getResult("B")).willReturn(2);
		given(mockHalfInt.getResult(2)).willReturn(1);
		given(mockIntToString.getResult(1)).willReturn("a");
		
		// When: I enter the string "B"
		IDecryptedMessageFlow IDMF = new DecryptedMessageFlow(mockStringToInt, mockHalfInt, mockIntToString);
		IDMF.getResult("B");
		
		//Then: DoubleInt.getResult() will be called one time
		verify(mockHalfInt, times(1)).getResult(2);
	}
	
	@Test
	public void GivenBCallIntToStringOneTime() {
		// Given: I need to decrypt a message
		given(mockStringToInt.getResult("B")).willReturn(2);
		given(mockHalfInt.getResult(2)).willReturn(1);
		given(mockIntToString.getResult(1)).willReturn("a");
		
		// When: I enter the string "B"
		IDecryptedMessageFlow IDMF = new DecryptedMessageFlow(mockStringToInt, mockHalfInt, mockIntToString);
		IDMF.getResult("B");
		
		//Then: IntToString.getResult() will be called one time
		verify(mockIntToString, times(1)).getResult(1);
	}
	
	
	// Testing encryption for string "A" 
	@Test
	public void GivenACallStringToIntOneTime() {
		// Given: I need to decrypt a message
		given(mockStringToInt.getResult("A")).willReturn(-1);
		given(mockHalfInt.getResult(-1)).willReturn(0);
		given(mockIntToString.getResult(0)).willReturn(" ");
		
		// When: I enter the string "A"
		IDecryptedMessageFlow IDMF = new DecryptedMessageFlow(mockStringToInt, mockHalfInt, mockIntToString);
		IDMF.getResult("A");
		
		//Then: StringToInt.getResult() will be called one time
		verify(mockStringToInt, times(1)).getResult("A");
	}
	
	@Test
	public void GivenACallDoubleIntZeroTimes() {
		// Given: I need to decrypt a message
		given(mockStringToInt.getResult("A")).willReturn(-1);
		given(mockHalfInt.getResult(-1)).willReturn(0);
		given(mockIntToString.getResult(0)).willReturn(" ");
		
		// When: I enter the string "A"
		IDecryptedMessageFlow IDMF = new DecryptedMessageFlow(mockStringToInt, mockHalfInt, mockIntToString);
		IDMF.getResult("A");
		
		//Then: DoubleInt.getResult() will be called zero times
		verify(mockHalfInt, times(0)).getResult(-1);
	}
	
	@Test
	public void GivenACallIntToStringZeroTimes() {
		// Given: I need to decrypt a message
		given(mockStringToInt.getResult("A")).willReturn(-1);
		given(mockHalfInt.getResult(-1)).willReturn(0);
		given(mockIntToString.getResult(0)).willReturn(" ");
		
		// When: I enter the string "A"
		IDecryptedMessageFlow IDMF = new DecryptedMessageFlow(mockStringToInt, mockHalfInt, mockIntToString);
		IDMF.getResult("A");
		
		//Then: IntToString.getResult() will be called zero times
		verify(mockIntToString, times(0)).getResult(0);
	}

	
	// Testing encryption for string "!" 
	@Test
	public void GivenExclamationPointCallStringToIntOneTime() {
		// Given: I need to decrypt a message
		given(mockStringToInt.getResult("!")).willReturn(-1);
		given(mockHalfInt.getResult(-1)).willReturn(0);
		given(mockIntToString.getResult(0)).willReturn("!");
		
		// When: I enter the string "A"
		IDecryptedMessageFlow IDMF = new DecryptedMessageFlow(mockStringToInt, mockHalfInt, mockIntToString);
		IDMF.getResult("!");
		
		//Then: StringToInt.getResult() will be called one time
		verify(mockStringToInt, times(1)).getResult("!");
	}
	
	@Test
	public void GivenExclamationPointCallDoubleIntZeroTimes() {
		// Given: I need to decrypt a message
		given(mockStringToInt.getResult("!")).willReturn(-1);
		given(mockHalfInt.getResult(-1)).willReturn(0);
		given(mockIntToString.getResult(0)).willReturn("!");
		
		// When: I enter the string "A"
		IDecryptedMessageFlow IDMF = new DecryptedMessageFlow(mockStringToInt, mockHalfInt, mockIntToString);
		IDMF.getResult("!");
		
		//Then: DoubleInt.getResult() will be called zero times
		verify(mockHalfInt, times(0)).getResult(-1);
	}
	
	@Test
	public void GivenExclamationPointCallIntToStringZeroTimes() {
		// Given: I need to decrypt a message
		given(mockStringToInt.getResult("!")).willReturn(-1);
		given(mockHalfInt.getResult(-1)).willReturn(0);
		given(mockIntToString.getResult(0)).willReturn("!");
		
		// When: I enter the string "A"
		IDecryptedMessageFlow IDMF = new DecryptedMessageFlow(mockStringToInt, mockHalfInt, mockIntToString);
		IDMF.getResult("!");
		
		//Then: IntToString.getResult() will be called zero times
		verify(mockIntToString, times(0)).getResult(0);
	}
	
	// Testing for string "abc" 
	@Test
	public void GivenabcCallLoopFlow() {
		// Given: I need to decrypt a message
		given(mockDecryptedMessageFlow.getResult("a")).willReturn("b");
		given(mockDecryptedMessageFlow.getResult("b")).willReturn("d");
		given(mockDecryptedMessageFlow.getResult("c")).willReturn("f");
		
		// When: I enter the string "abc"
		IDecryptionLoopFlow ILF = new DecryptionLoopFlow(mockDecryptedMessageFlow);
		ILF.getResult("abc");
		
		//Then: IntToString.getResult() will be called one time
		verify(mockDecryptedMessageFlow, times(1)).getResult("a");
		verify(mockDecryptedMessageFlow, times(1)).getResult("b");
		verify(mockDecryptedMessageFlow, times(1)).getResult("c");
	}
}
