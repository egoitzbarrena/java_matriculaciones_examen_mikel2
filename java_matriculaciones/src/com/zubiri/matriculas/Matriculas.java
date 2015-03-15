package com.zubiri.matriculas;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;




public final class Matriculas {

	private static ArrayList<Matricula> listaMatriculas;
	
	public static ArrayList<Matricula> getMatriculas() {
		
		return listaMatriculas;
	}
	
	public static void setMatriculas(ArrayList<Matricula> matriculaciones) {
		
		Matriculas.listaMatriculas = matriculaciones;
	}
	
	
	public static void leerArtistas(String fichero) throws IOException {
		String linea;
		FileInputStream fis;
	    InputStreamReader isr;
	    BufferedReader br;
	    
	    fis = new FileInputStream(fichero);
    	isr = new InputStreamReader(fis, "UTF8");
    	br = new BufferedReader(isr);
    	linea = br.readLine();
		
		if (linea == null) {
			System.out.println("No hay matriculas en el fichero");
		}
		
	/*	while ((linea != null) && (linea.compareTo("") != 0)) {
			Matricula m = new Matricula (linea,',');
			listaMatriculas.add();
			linea = br.readLine();
		}*/
		br.close();
	}
	
	 public static Matricula buscarMatricula(String nombre) {
			
			int i = 0;
			Matricula matricula = null;

			do {		
				if (listaMatriculas.get(i).getNombre().equalsIgnoreCase(nombre)) {
					matricula = (Matricula)listaMatriculas.get(i);
				}
				i++;
			} while ((matricula == null) && (i < listaMatriculas.size()));
			
			if (matricula == null) {
				System.out.println("No esta esa matricula en el fichero. Saliendo del programa.");
				System.exit(-1);
			}

			return matricula;
		}
	 
	 public static void mostrarMatriculas() {
			
			if (listaMatriculas.size() == 0) {
				System.out.println("No hay artistas en el fichero");
			}
			for (int i = 0;i < listaMatriculas.size();i++) {
				System.out.println(listaMatriculas.get(i).formattedAsignatura());
			}
		}
}
