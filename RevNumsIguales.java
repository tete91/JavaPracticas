package ejercicioopcional12;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		/*Escriba un programa que pida tres números y que escriba si son los tres iguales, si hay dos iguales o si son los tres distintos.
		 */
		//Empezamos llamando al escaner para la introduccion de datos por terminal.
		Scanner scanner=new Scanner(System.in);
		//Ahora inicializamos las variables que necesitaremos.
		int num1;
		int num2;
		int num3;
		//para las pruebas vamos a crear una variable continuar y un bucle while para poder ir haciendo las pruebas desde terminal
		//sin tener que reiniciar. despues se comenta toda la parte del codigo referente al bucle para la entrega a cliente final.
		//la variable continuar la inicializamos en -1 para dar vueltas al bucle mientras no se introduzca 0, tambien de podria hacer con el do while.
		//int continuar=-1;
		//while(continuar!=0){
			//Primeros explicamos al usuario de que trata el programa y le solicitamos datos.
			System.out.println("A continuación le solicitaremos 3 numeros enteros a introducir");
			System.out.println("Despues diremos si hay 3 numeros iguales, 2 o ninguno.");
			System.out.println();
			System.out.println("A continuación introduzca el numero 1: ");
			num1=scanner.nextInt();
			System.out.println("El numero introducido es el "+num1+".");
			System.out.println("A continuación introduzca el numero 2: ");
			num2=scanner.nextInt();
			System.out.println("El numero introducido es el "+num2+".");
			System.out.println("A continuación introduzca el numero 3: ");
			num3=scanner.nextInt();
			System.out.println("El numero introducido es el "+num3+".");
			if(num1==num2&&num1==num3) {
				System.out.println("Los tres numeros son iguales.");
			}
			else if(num1==num2&&num1!=num3||num1!=num2&&num1==num3||num2==num3&&num2!=num1){
				System.out.println("Hay 2 numeros que son iguales.");
			}
			else {
				System.out.println("Los tres numeros son diferentes");
			}
			//Ahora añadimos para las pruebas la opcion de repetir hasta darle a 0. Comentar este codigo antes de entregar al cliente final.
			/*System.out.println();
			System.out.println("Si desea volver a probar numeros, por favor introduzca un numero diferente a 0, si quiere salir introduzca un 0: ");
			continuar=scanner.nextInt();
		}*/
	}
}
