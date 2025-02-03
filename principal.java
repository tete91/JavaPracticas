package ejercicio1switch;

import java.util.Scanner;

public class principal {
	//En este programa vamos a devolver a que dia de la semana pertenece el numero que introduzca el usuario por la terminal.
	public static void main(String[] args) {
		//Empezamos llamando al escaner para que el usuario pueda introducir datos por el terminal e inicializamos todas las variables que utilizaremos.
		Scanner scanner=new Scanner(System.in);
		int numint;
		//int continuar=-1;
		//Vamos a poner un bucle while para poder realizar pruebas sin salir del terminal hasta que se introduzca el 0 al preguntar si se quiere cotinuar.
		//continuar empieza en -1 para que entre al bucle almenos una vez, aunque lo suyo seria un do while, pero como es para pruebas
		//tras comprobar el programa comentar el while.
		//while(continuar!=0) {
			//Introducimos el texto con el que pediremos al usuario lo que debe introducir.
			System.out.println("En esta aplicación vamos a comprobar a que dia de la semana corresponde el numero que me introduzcas.");
			System.out.println();
			System.out.println("A continuación introduce el numero a comprobar: ");
			//Leemos la introduccion del usuario por terminal y repetimos el numero para que salga por la terminal.
			numint=scanner.nextInt();
			System.out.println("El numero introducido es el "+numint+".");
			//Iniciamos el switch indicando en cada caso lo que debe aparecer segun el numero introducido por terminal.
			switch(numint){
			case 1:{
				System.out.println("El numero introducido corresponde al Lunes.");
				break;
			}
			case 2:{
				System.out.println("El numero introducido corresponde al Martes.");
				break;
			}
			case 3:{
				System.out.println("El numero introducido corresponde al Miercoles.");
				break;
			}
			case 4:{
				System.out.println("El numero introducido corresponde al Jueves.");
				break;
			}
			case 5:{
				System.out.println("El numero introducido corresponde al Viernes.");
				break;
			}
			case 6:{
				System.out.println("El numero introducido corresponde al Sabado.");
				break;
			}
			case 7:{
				System.out.println("El numero introducido corresponde al Domingo.");
				break;
			}
			default:{
				System.out.println("El numero introducido no pertenece a ningun día de la semana, tiene que ser un numero del 1 al 7.");
				break;
			}
			
			}
			//Ahora preguntamos si quiere repetir la introduccion, solo valido para comprobacion del programa, comentar para entrega al cliente final.
			/*System.out.println();
			System.out.println("Quieres volver a introducir un numero a comprobar?");
			System.out.println("De ser asi, introduce cualquier numero por la terminal, en caso contrario introduzca 0 para salir.");
			continuar=scanner.nextInt();
		}*/
	}
}
