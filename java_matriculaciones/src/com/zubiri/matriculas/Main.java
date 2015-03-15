package com.zubiri.matriculas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
				int seleccion = -1;
				Scanner sc = new Scanner(System.in);

				do {
					try {
					//Visualiza por terminal (stdout) las opciones del men
					System.out.println("Solicitar matricula y mostrar-------------------------------1");
					System.out.println("Solicitar alumno y mostrar----------------------------------2");
					System.out.println("Solicitar profesor y mostrar--------------------------------3");
					System.out.println("SALIR DEL PROGRAMA------------------------------------------4");
					
					   
					seleccion = sc.nextInt();
					switch (seleccion) {
						
						case 1: //Solicitar matricula y mostrar
							Matricula matricula = new Matricula(sc);
							System.out.println(matricula.formattedAsignatura());
							//Metodo que añada la matricula al arraylist mastriculas(alumno)
							break;
							
						case 2: //Solicitar un alumno y mostrar
							Alumno alumno = new Alumno(sc);
							System.out.println(alumno.formatted());
							break;
						case 3: //Solicitar profesor y mostrar
							Profesor profesor = new Profesor(sc);
							System.out.println(profesor.formatted()); 
							break;
						case 4: //Salimos
							break;
						default:
							System.out.println("No ha insertado la opcion correcta");
					}
					}catch(InputMismatchException exception){
						System.out.println("Eso no es numero");
						sc.nextLine();
					}
				} while (seleccion != 4);
				System.out.println("Gracias por usar nuestro programa. Que tenga un buen dia!");
				sc.close();
			}
			

		}

