package com.zubiri.matriculas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Matricula extends Asignatura {
	
	private int anhoMatriculacion;
    private double precio;
    
	//constructor 1
	public Matricula (String nombre, int creditos, Profesor profesor, int anhoMatriculacion, double precio) {
		super (nombre, creditos, profesor);
		this.anhoMatriculacion = anhoMatriculacion;
		this.precio = precio;
	
	}
	
	//constructor 2
	public Matricula (Scanner sc){
			
		super(sc);
			
		do {
			System.out.println("MATRICULA");
			System.out.println("Anho de matriculacion:");		
				
			try{
					
				this.setAnhoMatriculacion(sc.nextInt());
					
			}catch(InputMismatchException ime){
					
				System.out.println("No has metido un numero entero, mete otro:");
				sc.nextInt();
			}
		}while (this.anhoMatriculacion == 0);
		
		do {
			
			System.out.println("Que precio tiene(numero decimal)?");		
				
			try{
					
				this.setPrecio(sc.nextInt());
					
			}catch(NumberFormatException nfe){
					
				System.out.println("No has metido un numero decimal, mete otro:");
				sc.nextDouble();
			}
		}while (this.precio == 0);
			
	}	 
    
		
	public int getAnhoMatriculacion() {
		return this.anhoMatriculacion;
	}
	
	public void setAnhoMatriculacion(int anhoMatriculacion) {
		this.anhoMatriculacion = anhoMatriculacion;
	}
	
	public double getPrecio() {
		return this.precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
    
	public String formattedAsignatura() {
		
		String matriculaStr = //falta super.formattedAsignatura
				"\tAnho de matriculacion: "+this.anhoMatriculacion+"\n"+
				"\tPrecio: "+this.precio+"\n";
				
		return matriculaStr;
		
	}
	
	/**
	 * Metodo que calcula un descuento basado en porcentaje sobre el precio original
	 * de la matricula.
	 * @return
	 */
	/*public double descuentoFamiliaNumerosa(int porcentaje) {
		
	}*/
	
}
