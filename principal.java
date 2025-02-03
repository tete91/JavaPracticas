package EjercicioPropuesto2;

import java.util.Arrays;
import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Este programa va a pedir llenar un array con numeros enteros, e imprimira por pantalla si son pares o impares y si son multiplos de 3.
		//Primero llamamos al scanner e inicializamos las variables que iremos necesitando.
				Scanner scanner=new Scanner (System.in);
				int tamanoArray=0;
				int contador=0;
				//A continuación hay peticiones y entradas de datos por parte del usuario.
				System.out.println("Vamos a solicitarle que ingrese numeros enteros y le diremos si son pares, impares y/o multiplos de 3.");//Info sobre el uso del programa
				System.out.println("Presione enter para comenzar:");//Info sobre el uso del programa
				scanner.nextLine();//Así le obligamos a indicar cuando quiere comenzar a introducir datos.
				System.out.println("");//Dejamos linea en blanco para no apelotonar texto.
				System.out.println("Por favor, a continuación indique cuantos numeros va a querer introducir: ");//Info de cuantas veces va a introducir datos.
				tamanoArray = scanner.nextInt();//Recogemos el tamaño que tendrá nuestro array
				System.out.println("A indicado que introducirá "+tamanoArray+" numeros.");//Le indicamos el valor introducido.
				System.out.println("");//Dejamos linea en blanco para no apelotonar texto.
				int[] arrayInt = new int[tamanoArray];//Inicializamos el array con el tamaño anterior introducido.
				System.out.println("Por favor a continuación introduzca 1 a 1 todos los numeros a comprobar.");//Info de introducción de datos.
				scanner.nextLine();//Así le obligamos a indicar cuando quiere comenzar a introducir datos y limpiamos bufer para el bucle al ser diferente tipado.
				for(contador=0; contador<arrayInt.length; contador++) {//Bucle for que itera hasta llenar el array con la cantidad de datos introducidos.
					System.out.println("Introduzca un numero y presione enter: ");//Información de solicitud de datos.
					arrayInt[contador]=scanner.nextInt();//llenamos la posición del array con el numero introducido.
				}
				System.out.println("Los numeros introducidos por terminal son: "+Arrays.toString(arrayInt));//Imprimimos por pantalla los caracteres introducidos por el usuario.
				System.out.println();//Limpiamos pantalla para no apelotonar texto.
				System.out.println("Pulse enter para continuar y mostrarle los resultados.");//Solicitamos continuar y aprovechamos a limpiar bufer.
				scanner.nextLine();//Limpiamos bufer
				scanner.nextLine();//Obligamos a leer los resultados e indicar que quiere comenzar a ver los resultados.
				for(contador=0; contador<arrayInt.length; contador++) {//Bucle for que itera hasta dar la vuelta a todos los espacios del array.
					if(arrayInt[contador]%2==0) {//condicional if que si resto es 0 sera par
						System.out.print("El numero "+arrayInt[contador]+" es par y ");//imprimimos resultado
					}
					else {//condicional else que si no es par es impar.
						System.out.print("El numero "+arrayInt[contador]+" es impar y ");//imprimimos resultado

					}
					if(arrayInt[contador]%3==0) {//condicional if que si resto es 0 es multiplo de 3
						System.out.println("es multiplo de 3.");//imprimimos resultado
					}
					else {//condicional else que si no resto no es 0 no es multiplo de 3
						System.out.println("no es multiplo de 3.");//imprimimos resultado
					}
				}
	}
}
