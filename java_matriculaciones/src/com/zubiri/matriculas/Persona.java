package com.zubiri.matriculas;

//import java.util.InputMismatchException;
import java.util.Scanner;





public abstract class Persona {
	
	String dni;
	String nombre;
	String apellido;
	
	//constructor 1
	public Persona(String dni, String nombre, String apellido) {
		
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	//constructor 2	
	public Persona(Scanner sc) {
		
		System.out.println("PERSONA:");
		System.out.println("\tDNI:");
		this.setDni(sc.next());

		System.out.println("\tNombre:");
		this.setNombre(sc.next());
			
		System.out.println("\tApellido:");
		this.setApellido(sc.next());
		/*		
		System.out.println("Autor de la obra:");
		this.setAutor(Artistas.buscarArtista(sc.next()));
		*/
		
	}
	

	public String getDni() {
		return dni;
	}
	
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	/**
	 * Metodo que retorna un String con los valores de las propiedades
	 * formateados del siguiente modo:
	 *  <NOMBRE_PROPIEDAD1> : <VALOR_PROPIEDAD1>\n
	 *  <NOMBRE_PROPIEDAD2> : <VALOR_PROPIEDAD2>\n 
	 *  .....
	 * @return String
	 */
	
	public String formatted() {
		
		String personaStr = 
				"Nombre: "+this.getNombre()+"\n"+
				"Apellido: "+this.getApellido()+"\n"+
				"DNI: "+this.getDni();
		return personaStr;
	}
	/*public void split(String personaStr, char separator) {
		String[] personaStr.separator(separator);
	}*/
}
