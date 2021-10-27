package com.example.encryptedmessage.decrypt;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;

class DecryptedMessageTestFlow {

	@Mock
	DecryptStringToInt mockStringToInt = mock(DecryptStringToInt.class);
	
	@Mock
	DecryptHalfInt mockHalfInt = mock(DecryptHalfInt.class);
	
	@Mock
	DecryptIntToString mockIntToString = mock(DecryptIntToString.class);
	
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
	public void GivenbCallHalfIntOneTime() {
		// Given: I need to decrypt a message
		given(mockStringToInt.getResult("b")).willReturn(2);
		given(mockHalfInt.getResult(2)).willReturn(1);
		given(mockIntToString.getResult(1)).willReturn("a");
		
		// When: I enter the string "b"
		IDecryptedMessageFlow IDMF = new DecryptedMessageFlow(mockStringToInt, mockHalfInt, mockIntToString);
		IDMF.getResult("b");
		
		//Then: HalfInt.getResult() will be called one time
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

	
	// Testing decryption for string "B" 
	@Test
	public void GivenBCallStringToIntOneTime() {
		// Given: I need to decrypt a message
		given(mockStringToInt.getResult("B")).willReturn(28);
		given(mockHalfInt.getResult(28)).willReturn(14);
		given(mockIntToString.getResult(14)).willReturn("n");
		
		// When: I enter the string "B"
		IDecryptedMessageFlow IDMF = new DecryptedMessageFlow(mockStringToInt, mockHalfInt, mockIntToString);
		IDMF.getResult("B");
		
		//Then: StringToInt.getResult() will be called one time
		verify(mockStringToInt, times(1)).getResult("B");
	}
	
	@Test
	public void GivenBCallHalfIntOneTime() {
		// Given: I need to decrypt a message
		given(mockStringToInt.getResult("B")).willReturn(28);
		given(mockHalfInt.getResult(28)).willReturn(14);
		given(mockIntToString.getResult(14)).willReturn("n");
		
		// When: I enter the string "B"
		IDecryptedMessageFlow IDMF = new DecryptedMessageFlow(mockStringToInt, mockHalfInt, mockIntToString);
		IDMF.getResult("B");
		
		//Then: HalfInt.getResult() will be called one time
		verify(mockHalfInt, times(1)).getResult(28);
	}
	
	@Test
	public void GivenBCallIntToStringOneTime() {
		// Given: I need to decrypt a message
		given(mockStringToInt.getResult("B")).willReturn(28);
		given(mockHalfInt.getResult(28)).willReturn(14);
		given(mockIntToString.getResult(14)).willReturn("n");
		
		// When: I enter the string "B"
		IDecryptedMessageFlow IDMF = new DecryptedMessageFlow(mockStringToInt, mockHalfInt, mockIntToString);
		IDMF.getResult("B");
		
		//Then: IntToString.getResult() will be called one time
		verify(mockIntToString, times(1)).getResult(14);
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
	public void GivenACallHalfIntZeroTimes() {
		// Given: I need to decrypt a message
		given(mockStringToInt.getResult("A")).willReturn(-1);
		given(mockHalfInt.getResult(-1)).willReturn(0);
		given(mockIntToString.getResult(0)).willReturn(" ");
		
		// When: I enter the string "A"
		IDecryptedMessageFlow IDMF = new DecryptedMessageFlow(mockStringToInt, mockHalfInt, mockIntToString);
		IDMF.getResult("A");
		
		//Then: HalfInt.getResult() will be called zero times
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
	
	
	// Testing encryption for string "Z" 
	@Test
	public void GivenZCallStringToIntOneTime() {
		// Given: I need to decrypt a message
		given(mockStringToInt.getResult("Z")).willReturn(52);
		given(mockHalfInt.getResult(52)).willReturn(26);
		given(mockIntToString.getResult(26)).willReturn("z");
		
		// When: I enter the string "Z"
		IDecryptedMessageFlow IDMF = new DecryptedMessageFlow(mockStringToInt, mockHalfInt, mockIntToString);
		IDMF.getResult("Z");
		
		//Then: StringToInt.getResult() will be called one time
		verify(mockStringToInt, times(1)).getResult("Z");
	}
	
	@Test
	public void GivenZCallHalfIntOneTime() {
		// Given: I need to decrypt a message
		given(mockStringToInt.getResult("Z")).willReturn(52);
		given(mockHalfInt.getResult(52)).willReturn(26);
		given(mockIntToString.getResult(26)).willReturn("z");
		
		// When: I enter the string "Z"
		IDecryptedMessageFlow IDMF = new DecryptedMessageFlow(mockStringToInt, mockHalfInt, mockIntToString);
		IDMF.getResult("Z");
		
		//Then: HalfInt.getResult() will be called zero times
		verify(mockHalfInt, times(1)).getResult(52);
	}
	
	@Test
	public void GivenZCallIntToStringOneTime() {
		// Given: I need to decrypt a message
		given(mockStringToInt.getResult("Z")).willReturn(52);
		given(mockHalfInt.getResult(52)).willReturn(26);
		given(mockIntToString.getResult(26)).willReturn("z");
		
		// When: I enter the string "Z"
		IDecryptedMessageFlow IDMF = new DecryptedMessageFlow(mockStringToInt, mockHalfInt, mockIntToString);
		IDMF.getResult("Z");
		
		//Then: IntToString.getResult() will be called zero times
		verify(mockIntToString, times(1)).getResult(26);
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
	public void GivenExclamationPointCallHalfIntZeroTimes() {
		// Given: I need to decrypt a message
		given(mockStringToInt.getResult("!")).willReturn(-1);
		given(mockHalfInt.getResult(-1)).willReturn(0);
		given(mockIntToString.getResult(0)).willReturn("!");
		
		// When: I enter the string "!"
		IDecryptedMessageFlow IDMF = new DecryptedMessageFlow(mockStringToInt, mockHalfInt, mockIntToString);
		IDMF.getResult("!");
		
		//Then: HalfInt.getResult() will be called zero times
		verify(mockHalfInt, times(0)).getResult(-1);
	}
	
	@Test
	public void GivenExclamationPointCallIntToStringZeroTimes() {
		// Given: I need to decrypt a message
		given(mockStringToInt.getResult("!")).willReturn(-1);
		given(mockHalfInt.getResult(-1)).willReturn(0);
		given(mockIntToString.getResult(0)).willReturn("!");
		
		// When: I enter the string "!"
		IDecryptedMessageFlow IDMF = new DecryptedMessageFlow(mockStringToInt, mockHalfInt, mockIntToString);
		IDMF.getResult("!");
		
		//Then: IntToString.getResult() will be called zero times
		verify(mockIntToString, times(0)).getResult(0);
	}
	
	// Testing for string "bdf" 
	@Test
	public void GivenabcCallLoopFlow3Times() {
		// Given: I need to decrypt a message
		given(mockDecryptedMessageFlow.getResult("b")).willReturn("a");
		given(mockDecryptedMessageFlow.getResult("d")).willReturn("b");
		given(mockDecryptedMessageFlow.getResult("f")).willReturn("c");
		
		// When: I enter the string "bdf"
		IDecryptionLoopFlow ILF = new DecryptionLoopFlow(mockDecryptedMessageFlow);
		ILF.getResult("bdf");
		
		//Then: IntToString.getResult() will be called one time
		verify(mockDecryptedMessageFlow, times(1)).getResult("b");
		verify(mockDecryptedMessageFlow, times(1)).getResult("d");
		verify(mockDecryptedMessageFlow, times(1)).getResult("f");
	}
	
	
	// Testing for string "B" 
	@Test
	public void GivenBbcCallLoopFlow() {
		// Given: I need to decrypt a message
		given(mockDecryptedMessageFlow.getResult("B")).willReturn("n");
		
		// When: I enter the string "B"
		IDecryptionLoopFlow ILF = new DecryptionLoopFlow(mockDecryptedMessageFlow);
		ILF.getResult("B");
		
		//Then: IntToString.getResult() will be called one time
		verify(mockDecryptedMessageFlow, times(1)).getResult("B");
	}
	
	
	// Testing for string "Z" 
	@Test
	public void GivenZbcCallLoopFlow() {
		// Given: I need to decrypt a message
		given(mockDecryptedMessageFlow.getResult("Z")).willReturn("z");
		
		// When: I enter the string "Z"
		IDecryptionLoopFlow ILF = new DecryptionLoopFlow(mockDecryptedMessageFlow);
		ILF.getResult("Z");
		
		//Then: IntToString.getResult() will be called one time
		verify(mockDecryptedMessageFlow, times(1)).getResult("Z");
	}
}
