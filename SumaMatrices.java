package EjercicioPropuesto9;

import java.util.Arrays;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Este programa sumara los numeros de 2 arrays dobles, sumando los mismos en cada posicion de cada array.
		//El array 1 sera: int[][] matriz1 = new int[][]{ {1,2}, {0,5} };
		//El array 2 sera: int[][] matriz2 = new int[][]{ {3,4}, {5,8} };
		//Primero inicializamos los arrays a sumar y las variables necesarias para el sumado
		int[][] matriz1 = new int[][]{ {1,2}, {0,5} };//Inicializamos el array 1
		int[][] matriz2 = new int[][]{ {3,4}, {5,8} };//Inicializamos el array 2
		int[][] resultado = new int [matriz1.length][matriz1.length];//Inicializamos el array del resultado
		int cont1=0;//Inicializamos un contador para las filas del array
		int cont2=0;//Inicializamos un contador para las columnas del array
		for(cont1=0; cont1<matriz1.length; cont1++) {//Bucle que iterara por cada fila del array 1
			for(cont2=0; cont2<matriz1[cont1].length; cont2++) {//Bucle que iterara por cada columna del array 1
				resultado[cont1][cont2]=matriz1[cont1][cont2]+matriz2[cont1][cont2];//Operacion de suma de cada fila y columna
			}
		}
		System.out.println("El array 1 es: "+Arrays.deepToString(matriz1));//Impresion del array 1
		System.out.println("El array 2 es: "+Arrays.deepToString(matriz2));//Impresion del array 2
		System.out.println("El resultado de la suma es: ");//Impresion de mensaje sobre el resultado
		for(int [] cont3 : resultado ) {//Bucle que recorrera todo el array del resultado y almacenara los datos en otro array numsum
			for(int numsum : cont3) {//Bucle que recorrera todo el array numsum
				System.out.print(" "+numsum);//Impresion de los resultados de las sumas
			}
		}
	}
}
