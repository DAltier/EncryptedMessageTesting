package com.example.encryptedmessage;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.encryptedmessage.decrypt.DecryptHalfInt;
import com.example.encryptedmessage.decrypt.DecryptIntToString;
import com.example.encryptedmessage.decrypt.DecryptStringToInt;
import com.example.encryptedmessage.decrypt.DecryptedMessageFlow;
import com.example.encryptedmessage.decrypt.DecryptionLoopFlow;
import com.example.encryptedmessage.decrypt.IDecryptHalfInt;
import com.example.encryptedmessage.decrypt.IDecryptIntToString;
import com.example.encryptedmessage.decrypt.IDecryptStringToInt;
import com.example.encryptedmessage.decrypt.IDecryptedMessageFlow;
import com.example.encryptedmessage.decrypt.IDecryptionLoopFlow;
import com.example.encryptedmessage.encrypt.EncryptDoubleInt;
import com.example.encryptedmessage.encrypt.EncryptStringToInt;
import com.example.encryptedmessage.encrypt.EncryptedMessageFlow;
import com.example.encryptedmessage.encrypt.EncryptionLoopFlow;
import com.example.encryptedmessage.encrypt.IEncryptDoubleInt;
import com.example.encryptedmessage.encrypt.IEncryptedMessageFlow;
import com.example.encryptedmessage.encrypt.IEncryptionLoopFlow;
import com.example.encryptedmessage.encrypt.IEncryptIntToString;
import com.example.encryptedmessage.encrypt.IEncryptStringToInt;
import com.example.encryptedmessage.encrypt.EncryptIntToString;

@Configuration
public class AppConfig {

	@Bean(name = "IEncryptStringToInt")
	public IEncryptStringToInt createEncryptStringToInt() {
		return new EncryptStringToInt();
	}
	
	@Bean(name = "IEncryptDoubleInt")
	public IEncryptDoubleInt createEncryptDoubleInt() {
		return new EncryptDoubleInt();
	}
	
	@Bean(name = "IEncryptIntToString")
	public IEncryptIntToString createEncryptIntToString() {
		return new EncryptIntToString();
	}
	
	@Bean(name = "IDecryptStringToInt")
	public IDecryptStringToInt createDecryptStringToInt() {
		return new DecryptStringToInt();
	}
	
	@Bean(name = "IDecryptHalfInt")
	public IDecryptHalfInt createDecryptHalfInt() {
		return new DecryptHalfInt();
	}
	
	@Bean(name = "IDecryptIntToString")
	public IDecryptIntToString createDecryptIntToString() {
		return new DecryptIntToString();
	}
	
	@Bean(name = "IEncryptedMessageFlow")
	public IEncryptedMessageFlow createEncryptedMessageFlow() {
		return new EncryptedMessageFlow(createEncryptStringToInt(), createEncryptDoubleInt(), createEncryptIntToString());
	}
	
	@Bean(name = "IDecryptedMessageFlow")
	public IDecryptedMessageFlow createDecryptedMessageFlow() {
		return new DecryptedMessageFlow(createDecryptStringToInt(), createDecryptHalfInt(), createDecryptIntToString());
	}
	
	@Bean(name = "IEncryptionLoopFlow")
	public IEncryptionLoopFlow createEncryptionLoopFlow() {
		return new EncryptionLoopFlow(createEncryptedMessageFlow());
	}
	
	@Bean(name = "IDecryptionLoopFlow")
	public IDecryptionLoopFlow createDecryptionLoopFlow() {
		return new DecryptionLoopFlow(createDecryptedMessageFlow());
	}
}
