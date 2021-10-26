package com.example.encryptedmessage;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication
public class AppConfig {

	@Bean(name = "IStringToInt")
	public IStringToInt createStringToInt() {
		return new StringToInt();
	}
	
	@Bean(name = "IDoubleInt")
	public IDoubleInt createDoubleInt() {
		return new DoubleInt();
	}
	
	@Bean(name = "IHalfInt")
	public IHalfInt createHalfInt() {
		return new HalfInt();
	}
	
	@Bean(name = "IIntToString")
	public IIntToString createIntToString() {
		return new IntToString();
	}
	
	@Bean(name = "IEncryptedMessageFlow")
	public IEncryptedMessageFlow createEncryptedMessageFlow() {
		return new EncryptedMessageFlow(createStringToInt(), createDoubleInt(), createIntToString());
	}
	
	@Bean(name = "IDecryptedMessageFlow")
	public IDecryptedMessageFlow createDecryptedMessageFlow() {
		return new DecryptedMessageFlow(createStringToInt(), createHalfInt(), createIntToString());
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
