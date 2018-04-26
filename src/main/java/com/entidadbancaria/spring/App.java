package com.entidadbancaria.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entidadbancaria.beans.AppConfig;
import com.entidadbancaria.beans.Banco;
import com.entidadbancaria.beans.Cliente;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/entidadbancaria/xml/beans.xml");
		//ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
		Banco b = (Banco) appContext.getBean("banco");
		
		Cliente c = (Cliente) appContext.getBean("cliente");
				
		System.out.println("Banco: "+b.getBanNom());
		System.out.println("Cliente Cedula: "+c.getCedula()+" Nombre: "+ c.getNombre()+" Id: "+c.getId()());
		
		((ConfigurableApplicationContext) appContext).close();
		

	}

}
