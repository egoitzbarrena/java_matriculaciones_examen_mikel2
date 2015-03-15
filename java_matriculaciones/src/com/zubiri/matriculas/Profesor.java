package com.zubiri.matriculas;


import java.util.Scanner;



public class Profesor extends Persona {
	
	private String titulacion;
	private String departamento;
	
	//constructor 1
	public Profesor(String dni, String nombre, String apellido, String titulacion, String departamento) {
		super (dni,nombre,apellido);
		this.titulacion = titulacion;
		this.departamento = departamento;
	}
	//constructor 2	
	public Profesor (Scanner sc){
		
		super(sc);
		
		
			System.out.println("PROFESOR");
			System.out.println("Titulacion:");			
				
			this.setTitulacion(sc.next());
								
			System.out.println("En que departamento esta?");
			this.setDepartamento(sc.next());
							
	} 
				
	public String getTitulacion() {
		return titulacion;
	}
	
	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}
	
	public String getDepartamento() {
		return departamento;
	}
	
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	public String formatted() {
		String profeStr = 
				"Titulacion: "+this.getTitulacion()+"\n"+
				"Departamento: "+this.getDepartamento();
		return profeStr;
					
	}
	
}
