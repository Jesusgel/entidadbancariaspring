package com.entidadbancaria.beans;

import org.springframework.beans.factory.annotation.Value;

public class Banco {
	
	@Value("Banco Venezuela")
	private String BanNom;

	public String getBanNom() {
		return BanNom;
	}
	
	public void setBanNom(String banNom) {
		BanNom = banNom;
	}
	
	
}
