package com.gatitos;

public class Gato {
	//atributos
	private String nombre;
	private int patas;
	private boolean adoptado;
	
	//constructor
	/*public Gato(String nombre, int patas, boolean adoptado) {
		super();
		this.nombre = nombre;
		this.patas = patas;
		this.adoptado = adoptado;
	}*/
	
	
	
	
	//getters y setters, deben ser public por convención
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getPatas() {
			return this.patas;
	}
	public void setPatas(int patas) {
		if(patas>=0 && patas<=4) {
			this.patas = patas;
		} else {
			throw new IllegalArgumentException("El número de patas no es válido");
			
		}
		// this.patas = patas;
	}
	
	public boolean isAdoptado() { //is, porque se hace uan pregunta
		return this.adoptado;
	}
	public void setAdoptado(boolean adoptado) {
		this.adoptado = adoptado;
	}
	 
	 //Método toString
	@Override
	public String toString() {
		return "Gato [nombre=" + nombre + ", patas=" + patas + "]";
	}
	 
	 
}
