package ejercicio2if;
//Primero importamos el escaner
import java.util.Scanner;
public class principal {

	public static void main(String[] args) {
		//En este programa vamos a comparar 2 numeros, y decir cual de ellos es mayor.
		//Aqui inicializamos el escaner, para que el usuario pueda entrar los datos al sistema.
		Scanner scanner= new Scanner(System.in);
		//Vamos iniciando todas las variables que iremos necesitando en esta zona.
		int numero1=0;
		int numero2=0;
		//Utilizaremos la variable continuar en -1 para poder utilizar un bucle para ir metiendo numeros para probar que el programa funciona correctamente
		//sin salir de la terminal, una vez comprobado, comentar la variable así como el bucle en su totalidad, ya que solo queremos que el usuario
		//introduzca datos 1 sola vez.
		//int continuar=-1;
		//Añadimos el bucle while para poder hacer pruebas sin salir de la terminal hasta que el usuario decida salir.
		//while (continuar!=0) {
			//mandamos por terminal un mensaje dando instrucciones, y otros solicitando datos. Y recogemos los mismos con el escaner.
			System.out.println("Por favor, introduzca dos numeros a continuación, y compararemos cual es mayor de los 2");
			System.out.println(" ");
			System.out.println("Introduzca el primer numero: ");
			numero1=scanner.nextInt();
			System.out.println("Introduzca el segundo numero: ");
			numero2=scanner.nextInt();
			//Con el if indicamos que si el numero1 es mas pequeño que numero 2 indique por terminal que el numero mayor es numero2.
			if (numero1<numero2) {
				System.out.println("Los numeros introducidos son: el numero "+numero1+" y el numero "+numero2+". Y el numero mayor es: "+numero2);
			}
			//Por el contrario con el else indicamos que si no entra por el if, es si o si mas grande el numero1 que el numero2 y por lo tanto asi lo indique por terminal.
				else{
					System.out.println("Los numeros introducidos son: el numero "+numero1+" y el numero "+numero2+". Y el numero mayor es: "+numero1);
				}
			//Aqui solo para pruebas, solicitamos si se quieren seguir introduciendo numeros o no, para pasarlo al cliente comentar las siguientes lineas.
			/*System.out.println("Si deseas salir de la comparación introduce 0 a continuación, si por el contrario deseas seguir, introduce cualquier otro numero: ");
			continuar=scanner.nextInt();
		}*/
	}
}
