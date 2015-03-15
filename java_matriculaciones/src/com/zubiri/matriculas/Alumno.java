package com.zubiri.matriculas;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Alumno extends Persona {
	
	//Anho en el que se inscribio por primera vez en alguna asignatura
	int anhoInscripcion = -1;
	//Ciclo que cursa el alumno
	String ciclo = null;
	
	//Matriculas realizadas a lo largo de los anhos en las distintas asignaturas
	ArrayList<Matricula> matriculas = null;
	
	//constructor 1
	public Alumno (String dni, String nombre, String apellido, int anhoInscripcion, String ciclo, ArrayList<Matricula>matriculas) {
		super (dni,nombre,apellido);
		this.anhoInscripcion = anhoInscripcion;
		this.ciclo = ciclo;
		this.matriculas = matriculas;
	}

	//constructor 2
	public Alumno (Scanner sc){
			
		super(sc);
			
		do {
			System.out.println("ALUMNO");
			System.out.println("Anho de Inscripcion:");		
				
			try{
					
				this.setAnhoInscripcion(sc.nextInt());
					
			}catch(InputMismatchException ime){
					
				System.out.println("No has metido un numero, mete otro:");
				sc.nextInt();
			}
		}while (anhoInscripcion == 0);
			
					
		System.out.println("En que ciclo esta?");
		this.setCiclo(sc.next());
		
		//hay que pedir por pantalla o buscar en algun sitio la matricula.
		System.out.println("En que matricula");
		this.setMatriculas(matriculas);		

	} 
	
	
	public int getAnhoInscripcion() {
		return this.anhoInscripcion;
	}
	
	public void setAnhoInscripcion(int anhoInscripcion) {
		this.anhoInscripcion = anhoInscripcion;
	}
	
	public ArrayList<Matricula> getMatriculas() {
		return this.matriculas;
	}
	
	public void setMatriculas(ArrayList<Matricula> matriculas) {
		this.matriculas = matriculas;
	}
	
	public String getCiclo() {
		return this.ciclo;
	}

	public void setCiclo(String ciclo) {
		this.ciclo = ciclo;
	}
	
public String formatted() {
		
		String alumnoStr = 
				"\tAnho de inscripcion:" + this.anhoInscripcion + "\n" + 
				"\tCiclo: " + this.ciclo  + "\n" +
				"\tMatriculas: " + this.matriculas  + "\n" ;;
				
				return alumnoStr;
		
		
	}

}
