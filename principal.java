package EjercicioPropuesto3;

import java.util.Arrays;
import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Este programa imprimirá por pantalla todos los componentes de un array en orden inverso a su introducción.
		//Primero llamamos al scanner e inicializamos las variables que iremos necesitando.
		Scanner scanner=new Scanner (System.in);
		int tamanoArray=0;
		int contador=0;
		//A continuación hay peticiones y entradas de datos por parte del usuario.
		System.out.println("Vamos a solicitarle que ingrese numeros enteros y se los enseñaremos por pantalla en orden inverso a su introducción.");//Info sobre el uso del programa
		System.out.println("Presione enter para comenzar:");//Info sobre el uso del programa
		scanner.nextLine();//Así le obligamos a indicar cuando quiere comenzar a introducir datos.
		System.out.println("");//Dejamos linea en blanco para no apelotonar texto.
		System.out.println("Por favor, a continuación indique cuantos numeros va a querer introducir: ");//Info de cuantas veces va a introducir datos.
		tamanoArray = scanner.nextInt();//Recogemos el tamaño que tendrá nuestro array
		System.out.println("A indicado que introducirá "+tamanoArray+" numeros.");//Le indicamos el valor introducido.
		System.out.println("");//Dejamos linea en blanco para no apelotonar texto.
		int[] arrayInt = new int[tamanoArray];//Inicializamos el array con el tamaño anterior introducido.
		System.out.println("Por favor a continuación introduzca 1 a 1 los numeros.");//Info de introducción de datos.
		scanner.nextLine();//Así le obligamos a indicar cuando quiere comenzar a introducir datos y limpiamos bufer para el bucle al ser diferente tipado.
		for(contador=0; contador<arrayInt.length; contador++) {//Bucle for que itera hasta llenar el array con la cantidad de datos introducidos.
			System.out.println("Introduzca un numero y presione enter: ");//Información de solicitud de datos.
			arrayInt[contador]=scanner.nextInt();//llenamos la posición del array con el numero introducido.
		}
		System.out.println("Los numeros introducidos por terminal en orden de introducción son: "+Arrays.toString(arrayInt));//Imprimimos por pantalla los caracteres introducidos por el usuario.
		System.out.println();//Limpiamos pantalla para no apelotonar texto.
		System.out.println("Pulse enter para continuar y mostrarle los resultados.");//Solicitamos continuar y aprovechamos a limpiar bufer.
		scanner.nextLine();//Limpiamos bufer
		scanner.nextLine();//Obligamos a leer los resultados e indicar que quiere comenzar a ver los resultados.
		System.out.print("Los numeros introducidos por terminal en orden inverso de introducción son: ");//Imprimimos por pantalla los caracteres introducidos por el usuario.
		for(contador=tamanoArray-1; contador>=0; contador--) {//Bucle for para imprimir en orden inverso
			System.out.print(arrayInt[contador]);//Imprimimos resultados.
		}
	}
}
