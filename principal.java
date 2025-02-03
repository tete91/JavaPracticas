package ejercicioopcional3;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		/*Escriba un programa que pida primero un número par y a continuación un numero impar (positivos o negativos).
		 *En caso de que uno o los dos valores no sean correctos, se mostrarán uno o dos avisos.
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
			System.out.println("A continuación le solicitaremos 2 numeros a introducir, el primero debe ser un numero par y el segundo un numero impar.");
			System.out.println("Despues comprobaremos si los numeros son realmente como se solicitan.");
			System.out.println();
			System.out.println("A continuación introduzca el primer numero(Par): ");
			num1=scanner.nextInt();
			System.out.println("Ahora introduzca el segundo numero(Impar): ");
			num2=scanner.nextInt();
			System.out.println();
			System.out.println("Los numeros introducidos son: "+num1+" , "+num2+".");
			if(num1%2!=0) {
				System.out.println("El numero introducido no es par.");
			}
			if(num2%2==0) {
				System.out.println("El numero introducido no es impar.");
			}
			if(num1%2!=0||num2%2==0) {
				System.out.println("Ejecute de nuevo el programa para volver a intentarlo.");
			}
			if(num1%2==0&&num2%2!=0) {
				System.out.println("Los numeros introducidos son correcto, gracias por su colaboración.");
			}
			//Ahora añadimos para las pruebas la opcion de repetir hasta darle a 0. Comentar este codigo antes de entregar al cliente final.
			/*System.out.println();
			System.out.println("Si desea volver a probar numeros, por favor introduzca un numero diferente a 0, si quiere salir introduzca un 0: ");
			continuar=scanner.nextInt();
		}*/
	}
}