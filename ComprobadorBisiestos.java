package ejercicioopcional13;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		/*Escriba un programa que pida un año y que escriba si es bisiesto o no.
		 *Se recuerda que los años bisiestos son múltiplos de 4, pero los múltiplos de 100 no lo son, aunque los múltiplos de 400 sí.
		 */
		//Empezamos llamando al escaner para la introduccion de datos por terminal.
		Scanner scanner=new Scanner(System.in);
		//Ahora inicializamos las variables que necesitaremos.
		int num1;
		//para las pruebas vamos a crear una variable continuar y un bucle while para poder ir haciendo las pruebas desde terminal
		//sin tener que reiniciar. despues se comenta toda la parte del codigo referente al bucle para la entrega a cliente final.
		//la variable continuar la inicializamos en -1 para dar vueltas al bucle mientras no se introduzca 0, tambien de podria hacer con el do while.
		//int continuar=-1;
		//while(continuar!=0){
			//Primeros explicamos al usuario de que trata el programa y le solicitamos datos.
			System.out.println("A continuación le solicitaremos 1 año a introducir");
			System.out.println("Despues diremos si es bisiesto o no.");
			System.out.println();
			System.out.println("A continuación introduzca el año: ");
			num1=scanner.nextInt();
			System.out.println("El año introducido es el "+num1+".");
			if(num1%4!=0) {
				System.out.println("El año no es bisiesto");
			}
			else if(num1%4==0&&num1%400==0){
				System.out.println("El año es bisiesto");
			}
			else if(num1%4==0&&num1%100!=0){
				System.out.println("El año es bisiesto");
			}
			else {
				System.out.println("El año no es bisiesto");
			}
			//Ahora añadimos para las pruebas la opcion de repetir hasta darle a 0. Comentar este codigo antes de entregar al cliente final.
			/*System.out.println();
			System.out.println("Si desea volver a probar numeros, por favor introduzca un numero diferente a 0, si quiere salir introduzca un 0: ");
			continuar=scanner.nextInt();
		}*/
	}
}
