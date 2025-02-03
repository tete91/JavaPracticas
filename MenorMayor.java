package ejercicioopcional7;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		/*Escriba un programa que pida dos números y que conteste cuál es el menor y cuál el mayor o que escriba que son iguales.
		 */
		//Empezamos llamando al escaner para la introduccion de datos por terminal.
		Scanner scanner=new Scanner(System.in);
		//Ahora inicializamos las variables que necesitaremos.
		int num1;
		int num2;
		//para las pruebas vamos a crear una variable continuar y un bucle while para poder ir haciendo las pruebas desde terminal
		//sin tener que reiniciar. despues se comenta toda la parte del codigo referente al bucle para la entrega a cliente final.
		//la variable continuar la inicializamos en -1 para dar vueltas al bucle mientras no se introduzca 0, tambien de podria hacer con el do while.
		//int continuar=-1;
		//while(continuar!=0){
			//Primeros explicamos al usuario de que trata el programa y le solicitamos datos.
			System.out.println("A continuación le solicitaremos 2 numeros enteros a introducir");
			System.out.println("Despues Diremos cual es mayor de los 2 o si son iguales");
			System.out.println();
			System.out.println("A continuación introduzca el primer numero: ");
			num1=scanner.nextInt();
			System.out.println("El numero introducido es el "+num1+".");
			System.out.println("A continuación introduzca el segundo numero: ");
			num2=scanner.nextInt();
			System.out.println("El numero introducido es el "+num2+".");
			if(num1<num2) {
				System.out.println("El numero "+num2+" es mayor que el "+num1+".");
			}
			else if(num1>num2) {
				System.out.println("El numero "+num1+" es mayor que el "+num2+".");
				}
			else {
					System.out.println("Los numeros "+num1+" y "+num2+" son iguales.");
			}
			
			//Ahora añadimos para las pruebas la opcion de repetir hasta darle a 0. Comentar este codigo antes de entregar al cliente final.
			/*System.out.println();
			System.out.println("Si desea volver a probar numeros, por favor introduzca un numero diferente a 0, si quiere salir introduzca un 0: ");
			continuar=scanner.nextInt();
		}*/
	}
}
