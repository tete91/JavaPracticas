package ejercicio5if;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		//En este programa vamos a comparar si un número es par o impar y multiple de 3 o no, en todas sus variables.
		//Primero llamamos al escaner e inicializamos todas las variables a utilizar.
		Scanner scanner=new Scanner(System.in);
		int numero1=0;
		int numero2=0;
		int numero3=0;
		//int continuar=-1;
		//Creamos un bucle while que no salga hasta que continuar sea igual a 0, para pruebas, comentar el bucle y sus variables, y el continuar para entrega al cliente
		//Inicializamos continuar en -1 para que entre al bucle almenos la primera vez.
		//while(continuar!=0) {
			//Pedimos que introduzca el numero a analizar por terminal.
			System.out.println("A continuación vamos a analizar si el numero que introduzca es par o impar, y si es o no multiplo de 3.");
			System.out.println("");
			System.out.println("Introduzca el numero a analizar: ");
			numero1=scanner.nextInt();
			//Hacemos los restos %2 del numero1, y lo introducimos en numero2 para saber si es Par(Resto=0)o Impar(Resto=1).
			numero2=numero1%2;
			//Hacemos el resto %3 del numero1, y lo introducimos en numero3 para saber si es multiplo de 3(Resto=0) o Impar(Resto=1).
			numero3=numero1%3;
			//Ponemos todos los casos posibles con if, else if y else.
			if(numero2==0&&numero3==0) {
				System.out.println("El numero introducido es el: "+numero1+". El numero "+numero1+" es par y es multiplo de 3");
			}
			else
				if(numero2==0&&numero3!=0) {
					System.out.println("El numero introducido es el: "+numero1+". El numero "+numero1+" par y no es multiplo de 3");		
				}
				else
					if(numero2!=0&&numero3==0) {
						System.out.println("El numero introducido es el: "+numero1+". El numero "+numero1+" impar y es multiplo de 3");
					}
					else {
						System.out.println("El numero introducido es el: "+numero1+". El numero "+numero1+" impar y no es multiplo de 3");
					}
			/*System.out.println("");
			System.out.println("A continuación indica si quieres realizar un nuevo calculo, introduce 0 para no o cualquier otro numero para si");
			continuar=scanner.nextInt();
		}*/
	}
}
