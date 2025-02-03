package EjercicioPropuesto10;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Este programa convertira un array bidimensional en uno simple
		//El array bidimensional es el siguiente: El array bidimensional es el siguiente: int[][] numeros = new int[][]{ {3, 4, 5, 78},{0, 0, 0, 0}, {1, 1, 1, 1}, {6, 6, 6, -1} };
		//Comenzamos inicializando el array bidimensional asi como las variables necesarias.
		int[][] numeros = new int[][]{ {3, 4, 5, 78},//Inicializamos el array bidimensional
									   {0, 0, 0, 0},
									   {1, 1, 1, 1},
									   {6, 6, 6, -1}
									   };
		for(int[] numArray : numeros) {//Bucle que recorrera todo el array bidimensional y lo copiara en un array simple
			System.out.print("{");//Imprimimos la obertura de separacion de cada fila del array simple
			for(int array : numArray) {//Bucle que recorrera todo el array simple y almacenara el dato en una variable en cada iteracion,
				System.out.print(array+" ");//En cada iteracion del bucle imprimira el valor de la variable que almacena los numeros copiados del array simple.
			}
			System.out.print("}");//Imprimimos el cierre de separacion de cada fila del array simple
		}
	}
}
