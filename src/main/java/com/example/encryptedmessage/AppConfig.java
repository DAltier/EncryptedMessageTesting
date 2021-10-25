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
	
	@Bean(name = "IIntToString")
	public IIntToString createIntToString() {
		return new IntToString();
	}
	
	@Bean(name = "IEncryptedMessageFlow")
	public IEncryptedMessageFlow createEncryptedMessageFlow() {
		return new EncryptedMessageFlow(createStringToInt(), createDoubleInt(), createIntToString());
	}
}
