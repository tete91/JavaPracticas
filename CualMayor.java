package ejercicio3if;
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
		int numero3=0;
		//Utilizaremos la variable continuar en -1 para poder utilizar un bucle para ir metiendo numeros para probar que el programa funciona correctamente
		//sin salir de la terminal, una vez comprobado, comentar la variable así como el bucle en su totalidad, ya que solo queremos que el usuario
		//introduzca datos 1 sola vez.
		//int continuar=-1;
		//Añadimos el bucle while para poder hacer pruebas sin salir de la terminal hasta que el usuario decida salir.
		//while (continuar!=0) {
			//mandamos por terminal un mensaje dando instrucciones, y otros solicitando datos. Y recogemos los mismos con el escaner.
			System.out.println("Por favor, introduzca tres numeros a continuación, y compararemos cual es mayor de los 3");
			System.out.println(" ");
			System.out.println("Introduzca el primer numero: ");
			numero1=scanner.nextInt();
			System.out.println("Introduzca el segundo numero: ");
			numero2=scanner.nextInt();
			System.out.println("Introduzca el tercer numero: ");
			numero3=scanner.nextInt();
			//Con el if indicamos que si el numero1 es mas mayor que numero2 y que numero3 indique por terminal que el numero mayor es numero1.
			if (numero1>numero2&&numero1>numero3) {
				System.out.println("Los numeros introducidos son: el numero "+numero1+", el numero "+numero2+" y el numero"+numero3+". Y el numero mayor es: "+numero1);
			}
			//Con el else if indicamos que si numero2 es mayor que numero1 y que numero3 imprima por terminal ese resultado
				else if (numero2>numero1&&numero2>numero3){
					System.out.println("Los numeros introducidos son: el numero "+numero1+", el numero "+numero2+" y el numero"+numero3+". Y el numero mayor es: "+numero2);
				}
			//Y por descarte el else, si el numero mayor no es numero1 ni numero2, por descarte es numero3
					else{
						System.out.println("Los numeros introducidos son: el numero "+numero1+", el numero "+numero2+" y el numero"+numero3+". Y el numero mayor es: "+numero3);
					}
			//Aqui solo para pruebas, solicitamos si se quieren seguir introduciendo numeros o no, para pasarlo al cliente comentar las siguientes lineas.
			/*System.out.println("Si deseas salir de la comparación introduce 0 a continuación, si por el contrario deseas seguir, introduce cualquier otro numero: ");
			continuar=scanner.nextInt();
		}*/
	}
}
