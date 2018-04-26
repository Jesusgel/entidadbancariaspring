package com.entidadbancaria.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean
	public  Banco banco() {
		return new Banco();
	}
	
	@Bean
	public Cliente cliente() {
		return new Cliente();
	}
	

}
