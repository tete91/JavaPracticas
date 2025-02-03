package ejercicio2switch;

import java.util.Scanner;

public class principal {
	//En este programa vamos a analizar la nota de un alumno y decirle si su nota es un suspenso, aprobado, bien, notable, excelente o sobresaliente.
	public static void main(String[] args) {
		//Empezamos llamando al escaner para que el usuario pueda introducir datos por el terminal e inicializamos todas las variables que utilizaremos.
		Scanner scanner=new Scanner(System.in);
		int nota;
		//int continuar=-1;
		//Vamos a poner un bucle while para poder realizar pruebas sin salir del terminal hasta que se introduzca el 0 al preguntar si se quiere cotinuar.
		//continuar empieza en -1 para que entre al bucle almenos una vez, aunque lo suyo seria un do while, pero como es para pruebas
		//tras comprobar el programa comentar el while.
		//while(continuar!=0) {
			//Introducimos el texto con el que pediremos al usuario lo que debe introducir.
			System.out.println("En esta aplicación vamos a comprobar Si has suspendido, has sacado un suficiente, un bien, un notable, un excelente o un sobresaliente.");
			System.out.println();
			System.out.println("A continuación introduce la nota de tu examen: ");
			//Leemos la introduccion del usuario por terminal y repetimos el numero para que salga por la terminal.
			nota=scanner.nextInt();
			System.out.println("La nota introducida es un "+nota+".");
			//Iniciamos el switch indicando en cada caso lo que debe aparecer segun el numero introducido por terminal.
			switch(nota){
			case 0,1,2,3,4:{
				System.out.println("Estás suspendido.");
				break;
			}
			case 5:{
				System.out.println("Estás aprobado con un suficiente.");
				break;
			}
			case 6,7:{
				System.out.println("Estás aprobado con un Bien");
				break;
			}
			case 8:{
				System.out.println("Estás aprobado con un notable");
				break;
			}
			case 9:{
				System.out.println("Estás aprobado con un Excelente");
				break;
			}
			case 10:{
				System.out.println("Estás aprobado con un SobreSaliente");
				break;
			}
			default:{
				System.out.println("Esa nota no puede ser que esté correcta, la nota va de 0 a 10");
				break;
			}
			
			}
			//Ahora preguntamos si quiere repetir la introduccion, solo valido para comprobacion del programa, comentar para entrega al cliente final.
			/*System.out.println();
			System.out.println("Quieres volver a introducir un numero a comprobar?");
			System.out.println("De ser asi, introduce cualquier numero por la terminal, en caso contrario introduzca 0 para salir.");
			continuar=scanner.nextInt();
			
		}
		*/
	}

}
