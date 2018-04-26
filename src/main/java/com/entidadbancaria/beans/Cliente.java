package com.entidadbancaria.beans;

public class Cliente {
	
	private int id;
	private String nombre;
	private String cedula;
	
	
	
	public Cliente(int id, String nombre, String cedula) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.cedula = cedula;
	}
	
	public Cliente() {}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	
	
	

}
