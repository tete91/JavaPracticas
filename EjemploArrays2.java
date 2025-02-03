package EjercicioOpcional2;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Programa que con un array de 5 caracteres y rellenandolo con datos por terminal
		//se copiara el array 1 en un array 2 en orden inverso y se imprimira por pantalla
		//Primero inicializamos el scaner, y las variables necesarias.
		Scanner scanner=new Scanner(System.in);
		String[] array1 = new String[5];//Array de 5 Strings para la lista entrada por temrina
		String[] array2 = new String[5];//Array de 5 Strings para la lista inversa
		int contador1=0;//Contador para recorrer el array1
		int contador2=0;//Contador para recorrer el array2
		for(contador1=0;contador1<array1.length;contador1++) {//Bucle que recorrera el array1 hasta llenarlo
			System.out.println("Por favor introduce cadenas de caracteres por el terminal: ");//Informacion de solicitud de datos
			array1[contador1]=scanner.nextLine();//Entrada de datos por terminal
		}
		contador1=0;//Inicializamos el contador para ir a la posicion 0 del array1
		for(contador2=4;contador2>=0;contador2--) {//Bucle que recorrera el array2 en orden inverso
			array2[contador2]=array1[contador1];//Introducimos los datos en orden inverso a su posicion
			contador1++;//Aumentamos en 1 el contador por cada iteracion del bucle
		}
		System.out.println("Los datos almacenados en orden de introduccion son: ");//Informacion sobre lo que se mostrara
		for(String datosArray1:array1) {//Bucle para recorrer todo el array 1 y almacenar la info en datosArray1 por cada iteracion
			System.out.print(datosArray1+" ");//Imprimimos array1	
		}
		System.out.println("");//Dejamos separación entre datos
		System.out.println("Los datos almacenados en orden de introduccion son: ");//Informacion sobre lo que se mostrara
		for(String datosArray2:array2) {//Bucle para recorrer todo el array 1 y almacenar la info en datosArray1 por cada iteracion
			System.out.print(datosArray2+" ");//Imprimimos array2	
		}
	}
}
