package EjercicioPropuesto8;

import java.util.Arrays;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Este programa, de un array, sumará sus numeros pares por un lado
		//y sus numeros impares por otro e imprimira el resultado.
		//El array es: int[] numeros = new int[]{1,2,7,3,4,65,23,78,98,34,342,45,57};
		//Primero inicializamos el array y las variables necesarias.
		int[] numeros = new int[]{1,2,7,3,4,65,23,78,98,34,342,45,57};//Array declarado
		int pares=0;//Variable para almacenar la suma de los pares
		int impares=0;//Variable para almacenar la suma de los impares
		for(int num : numeros) {//Bucle que recorrera todo el array e introducira el valor en num en cada iteracion
			if(num%2==0) {//Condicional que solo se cumplira si el resto es 0 y por lo tanto par
				pares=pares+num;//Suma de los numeros pares
			}
			else {//Condicional que solo se cumplira si no es par por lo que es impar
				impares=impares+num;//Suma de los numeros impares
			}
		}
		System.out.println("Los numeros a sumar son: "+Arrays.toString(numeros));//Impresion de la lista de numeros
		System.out.println("La suma de los numeros pares es: "+pares);//Impresion de la suma de pares
		System.out.println("La suma de los numeros impares es: "+impares);//Impresion de la suma de impares
		/*
		int[] numeros = new int[]{1,2,7,3,4,65,23,78,98,34,342,45,57};//Array declarado
		int pares=0;//Variable para almacenar la suma de los pares
		int impares=0;//Variable para almacenar la suma de los impares
		int contador=0;//Contador para las posiciones del array y las iteraciones del bucle for
		for(contador=0; contador<numeros.length; contador++) {//Bucle que recorrera todo el array
			if(numeros[contador]%2==0) {//Condicional que solo se cumplira si el resto es 0 y por lo tanto par
				pares=pares+numeros[contador];//Suma de los numeros pares
			}
			else {//Condicional que solo se cumplira si no es par por lo que es impar
				impares=impares+numeros[contador];//Suma de los numeros impares
			}
		}
		System.out.println("Los numeros a sumar son: "+Arrays.toString(numeros));//Impresion de la lista de numeros
		System.out.println("La suma de los numeros pares es: "+pares);//Impresion de la suma de pares
		System.out.println("La suma de los numeros impares es: "+impares);//Impresion de la suma de impares
		*/
	}
}
