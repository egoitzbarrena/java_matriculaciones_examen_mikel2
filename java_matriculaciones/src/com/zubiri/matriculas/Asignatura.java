package com.zubiri.matriculas;

import java.util.Scanner;

public class Asignatura {

	String nombre;
	int creditos;
	Profesor profesor;
	
	//constructor 1
	public Asignatura (String nombre,int creditos, Profesor profesor) {
		this.nombre = nombre;
		this.creditos = creditos;
		this.profesor = profesor;
	}
	
	//constructor 2
	public Asignatura (Scanner sc) {
		
		System.out.println("ASIGNATURA:");
		System.out.println("\tNombre:");
		this.setNombre(sc.next());

		System.out.println("\tCreditos:");
		this.setCreditos(sc.nextInt());
			
		System.out.println("\tProfesor:");
		this.setProfesor(new Profesor(sc));
		/*		
		System.out.println("Autor de la obra:");
		this.setAutor(Artistas.buscarArtista(sc.next()));
		*/
		
	}	
	
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getCreditos() {
		return creditos;
	}
	
	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}
	
	public Profesor getProfesor() {
		return profesor;
	}
	
	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}
	
	/**
	 * Metodo que retorna un String con los valores de las propiedades
	 * formateados del siguiente modo:
	 *  <NOMBRE_PROPIEDAD1> : <VALOR_PROPIEDAD1>\n
	 *  <NOMBRE_PROPIEDAD2> : <VALOR_PROPIEDAD2>\n 
	 *  .....
	 * @return String
	 */
	
	public String formattedAsignatura() {
		
		String asignaturaStr = 
				"\tNombre: "+this.nombre+"\n"+
				"\tCreditos: "+this.creditos+"\n"+
				"\tProfesor: "+this.profesor;
		
		return asignaturaStr;
		
	}
	
	/**
	 * Metodo que obtiene valores de una asignatura a partir de un String y 
	 * un caracter separador.
	 */
	/*public void split(String personaStr, char separator) {
		
	}
*/
}
