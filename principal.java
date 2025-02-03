package ejercicio3switch;

import java.util.Scanner;

public class principal {
	//En este programa vamos a solicitar un numero y ver si es divisible por varios numeros.
	public static void main(String[] args) {
		//Empezamos llamando al escaner para que el usuario pueda introducir datos por el terminal e inicializamos todas las variables que utilizaremos.
		Scanner scanner=new Scanner(System.in);
		int numerocomprobar;
		//int continuar=-1;
		//Vamos a poner un bucle while para poder realizar pruebas sin salir del terminal hasta que se introduzca el 0 al preguntar si se quiere cotinuar.
		//continuar empieza en -1 para que entre al bucle almenos una vez, aunque lo suyo seria un do while, pero como es para pruebas
		//tras comprobar el programa comentar el while.
		//while(continuar!=0) {
			//Introducimos el texto con el que pediremos al usuario lo que debe introducir.
			System.out.println("En esta aplicación vamos a comprobar Si un numero es divisible por 2,3 o 5.");
			System.out.println();
			System.out.println("A continuación introduce el numero a comprobar: ");
			//Leemos la introduccion del usuario por terminal y repetimos el numero para que salga por la terminal.
			numerocomprobar=scanner.nextInt();
			System.out.println("El numero a comprobar es el "+numerocomprobar+".");
			//Iniciamos un switch por cada division a realizar.
			switch(numerocomprobar%2){
				case 0:{
					System.out.println("El numero "+numerocomprobar+" es divisible por 2.");
					break;
				}
				default:{
					System.out.println("El numero "+numerocomprobar+" no es divisible por 2.");
					break;
				}
			
			}
			switch(numerocomprobar%3){
				case 0:{
					System.out.println("El numero "+numerocomprobar+" es divisible por 3.");
					break;
				}
				default:{
					System.out.println("El numero "+numerocomprobar+" no es divisible por 3.");
					break;
				}
			}
			switch(numerocomprobar%5){
				case 0:{
					System.out.println("El numero "+numerocomprobar+" es divisible por 5.");
					break;
				}
				default:{
					System.out.println("El numero "+numerocomprobar+" no es divisible por 5.");
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