package EjercicioPropuesto7;

import java.util.Arrays;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Este programa sumara todos los numeros incluidos dentro de un array
		//El array sera el: float[] decimales = new float[]{3.4F,5.67F,12.0F,3.141615F,0.0F};
		//Primero inicializamos el array con las variables a sumar y las variables necesarias.
	 	float[] decimales = new float[]{3.4F,5.67F,12.0F,3.141615F,0.0F};//Array a sumar sus numeros
		float resultado=0;//Variable que almacenará la suma
		for(float numero:decimales) {//Bucle que recorrerá todo el array decimales e insertando sus valores en la variable numero
			resultado=resultado+numero;//Operacion de suma de cada valor en cada posicion.
		}
		System.out.println("Los numeros a sumar son: "+Arrays.toString(decimales));//Impresion del array
		System.out.println("El resultado de la suma de los numeros es: "+resultado);//Impresion del resultado
	}
}
