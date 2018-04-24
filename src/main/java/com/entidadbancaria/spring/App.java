package com.entidadbancaria.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entidadbancaria.beans.Banco;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/entidadbancaria/xml/beans.xml");
		Banco b = (Banco) appContext.getBean("banco");
				
		System.out.println(b.getBanNom());
		
		((ConfigurableApplicationContext) appContext).close();
		

	}

}
