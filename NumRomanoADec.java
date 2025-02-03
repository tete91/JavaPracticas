package ejercicio5switch;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		//En este programa vamos a pedir un numero romano ya sea I, V, X, L, C, D, M (incluso minúsculas) y vamos a decir a que numero corresponde.
		//Empezamos llamando al escaner para que el usuario pueda introducir datos por el terminal e inicializamos todas las variables que utilizaremos.
		Scanner scanner=new Scanner(System.in);
		char numeroromano;
		//int continuar=-1;
		//Vamos a poner un bucle while para poder realizar pruebas sin salir del terminal hasta que se introduzca el 0 al preguntar si se quiere cotinuar.
		//continuar empieza en -1 para que entre al bucle almenos una vez, aunque lo suyo seria un do while, pero como es para pruebas
		//tras comprobar el programa comentar el while.
		//while(continuar!=0) {
			//Introducimos el texto con el que pediremos al usuario lo que debe introducir.
			System.out.println("En esta aplicación vamos a pasar de numero romano a numero normal.");
			System.out.println();
			System.out.println("A continuación introduce la letra en numero romano a traducir: ");
			//Leemos la introduccion del usuario por terminal y repetimos el numero para que salga por la terminal.
			numeroromano=scanner.next().charAt(0);
			System.out.println("El numero introducido es el "+numeroromano+".");
			//Iniciamos un switch por cada numero posible a analizar.
			switch(String.valueOf(numeroromano).toUpperCase()){
				case "I":{
					System.out.println("El numero romano "+numeroromano+" introducido equivale al numero: 1");
					break;
				}
				case "V":{
				System.out.println("El numero romano "+numeroromano+" introducido equivale al numero: 5");
				break;
				}
				case "X":{
				System.out.println("El numero romano "+numeroromano+" introducido equivale al numero: 10");
				break;
				}
				case "L":{
				System.out.println("El numero romano "+numeroromano+" introducido equivale al numero: 50");
				break;
				}
				case "C":{
					System.out.println("El numero romano "+numeroromano+" introducido equivale al numero: 100");
					break;
					}
				case "D":{
					System.out.println("El numero romano "+numeroromano+" introducido equivale al numero: 500");
					break;
					}
				case "M":{
					System.out.println("El numero romano "+numeroromano+" introducido equivale al numero: 1000");
					break;
					}
				default:{
					System.out.println("Ese no es un numero romano.");
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
