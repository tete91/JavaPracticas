package EjercicioOpcional4;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Este programa rellenará por terminal un array de 10 enteros
		//uno a uno, hasta que se llene la lista o se introduzca un numero negativo.
		//Despues imprimira por pantalla los numeros introducidos y solo los introducidos.
		//Primero inicializamos scanner y variables a utilizar.
		Scanner scanner = new Scanner(System.in);
		int[] arrayInt = new int[10];//Array para almacenar los datos del terminal
		int contador=0;//Contador para reccorer el array
		int numInt=0;//Variable para almacenar el dato introducido por terminal
		boolean seguir=true;//Boleano para continuar o no
		System.out.println("Usuario por favor a continuación introduce numeros enteros hasta un máximo de 10.");
		System.out.println("Si quieres parar de introducir numeros, introduce un entero negativo cualquiera.");
		//Solicitudes de datos por pantalla
		while(contador<arrayInt.length&&seguir) {//Bucle que iterara mientras quede espacio y no se introduzca un negativo.
			System.out.println("Introduce un numero entero: ");//Informacion de solicitud
			numInt=scanner.nextInt();//Entrada de datos
			if(numInt>0) {//Condicional en caso de introducir enteros positivos
				arrayInt[contador]=numInt;//introducimos el dato leido al array
				contador++;//Sumamos vuelta al contador
			}
			else {//Si no es positivo es que es entero negativo o 0
				seguir=false;//Indicamos false a seguir para salir del bucle
			}
		}
		System.out.print("Los numeros introducidos son: ");//Impresion de info
		for(int imp:arrayInt) {//Bucle que compara 1 a 1 los datos del array
			if(imp>0) {//Solo si el dato guardado en el array es mayor a 0. Asi evitamos los espacios vacios del array.
				System.out.print(imp+" ");//Imprimimos los datos introducidos.
			}
		}
	}
}
