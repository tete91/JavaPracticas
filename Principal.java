package ejercicio1if;
//Primero importamos el escaner
import java.util.Scanner;
public class Principal {
	public static void main(String[] args) {
		//En este programa, comprobaremos si un numero es par o impar.
		//Aqui inicializamos el escaner, para que el usuario pueda entrar los datos al sistema.
		Scanner scanner = new Scanner(System.in);
		//Vamos iniciando todas las variables que iremos necesitando en esta zona.
		//Inicializamos numero1 en -1 para que así podamos decidir salir del bucle al introducir 0 por la terminal.
		int numero1=-1;
		/*En las pruebas incluimos el bucle while para poder probar numeros y asegurarnos de que funciona bien el programa, sin tener que reiniciar.
		*A la hora de lanzar el programa hay que comentar esta sintaxis para que no se produzca dicho bucle, ya que solo queremos que nos introduzca el numero
		una sola vez.*/
		//while(numero1!=0) {
			//pedimos por terminal que nos introduzca un numero para ver si es par o impar
			System.out.println("Por favor, introduzca un número a continuación, y le diremos si es un numero Par o Impar: ");
			//Leemos el numero introducido y lo insertamos en numero1
			numero1=scanner.nextInt();
			//Comparamos el resto de numero1 al dividirlo por 2, por lo que si es 0 entrara en el if significando que es Par
			//y si no es 0, entrará por else indicando pues que es Impar.
			if (numero1%2==0) {
				System.out.println("El numero introducido es el: " + numero1 + ". Y es Par.");
			}
			else {
				System.out.println("El numero introducido es el: " + numero1 + ". Y es Impar.");
			}
		//}
	}

}
