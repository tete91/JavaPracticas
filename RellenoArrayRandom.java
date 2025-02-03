package EjercicioOpcional5;

import java.util.Arrays;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Este programa llenara un array con numeros aleatorios y los imprimira de menor a mayor.
		//Inicializamos variables
		int[] array1=new int[10];//Array de 10 para almacenar numeros.
		int contador=0;//contador para el bucle
		for(contador=0;contador<array1.length;contador++) {//Bucle que recorrera todo el array
			array1[contador]=(int)(Math.random()*99999+1);//Introducira en la posicion del array un numero aleatorio entre 1 y 100000.
		}
		Arrays.sort(array1);//Ordenamos el array de menor a mayor
		for(int imp:array1) {//Recorremos todo el array introduciendolo en un int para su impresion
		System.out.print(imp+" ");//Imprimimos la info.
		}
	}
}
