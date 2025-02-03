package EjercicioPropuesto5;

import java.util.Arrays;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Este programa va a coger 2 arrays y crear un 3o con los datos de los 2 primeros intercalando el contenido de cada uno.
		//El array 1 sera: char[] cars1 = new char[]{‘1′,’2′,’3′,’4′,’5′,’6’};
		//El array 2 sera: char[] cars2 = new char[]{‘a’,’e’,’r’,’t’,’y’,’u’};
		//Primero inicializamos los arrays que vamos a convertir y el array final, y los operadores necesarios.
		char[] cars1 = new char[]{'1','2','3','4','5','6'};//Inicializamos el array 1
		char[] cars2 = new char[]{'a','e','r','t','y','u'};//Inicializamos el array 2
		char[] result = new char[cars1.length+cars2.length];//Inicializamos el array del resultado, con logitud igual a la suma de longitudes de array 1 y array 2
		int contador1=0;//Inicializamos un contador para movernos por las posiciones del array1.
		int contador2=0;//Inicializamos un contador para movernos por las posiciones del array2.
		int contadorR=0;//Inicializamos un contador para movernos por las posiciones del array resultado.
		for(contadorR=0; contadorR<result.length; contadorR++){//Bucle que iterara mientras queden casillas por rellenar en result e incrementamos el contador por cada ciclo de bucle
			result[contadorR]=cars1[contador1];//introducimos el caracter del array cars1 posicion contador1 en el array result posicion contadorR
			contador1++;//sumamos 1 al contador del array cars1
			contadorR++;//sumamos 1 al contador del array result para sumar en la siguiente casilla el valor del array cars2
			result[contadorR]=cars2[contador2];//introducimos el caracter del array cars2 posicion contador2 en el array result posicion contadorR
			contador2++;//sumamos 1 al contador del array cars2
		}
		System.out.println("El primer array es: "+Arrays.toString(cars1));//Imprimimos el array cars1
		System.out.println("El segundo array es: "+Arrays.toString(cars2));//Imprimimos el array cars2
		System.out.println("El array resultado es: "+Arrays.toString(result));//Imprimimos el array result 
	}
}
