package ejercicioopcional5;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		/*Escriba un programa que pida dos números enteros y que calcule su división, escribiendo si la división es exacta o no.
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
			System.out.println("A continuación le solicitaremos 2 numeros enteros a introducir");
			System.out.println("Despues los dividiremos el uno por el otro y comprobaremos si la division es exacta o no");
			System.out.println();
			System.out.println("A continuación introduzca el primer numero(Dividendo): ");
			num1=scanner.nextInt();
			System.out.println("El numero introducido es el "+num1+".");
			System.out.println("A continuación introduzca el segundo numero(Divisor): ");
			num2=scanner.nextInt();
			System.out.println("El numero introducido es el "+num2+".");
			num3=num1/num2;
			if(num1%num2==0) {
				System.out.println("La división es exacta. El cociente es de: "+num3);
			}
			else {
				System.out.println("La división no es extacta. El cociente es de: "+num3+". y el resto es de: "+num1%num2);
			}
			//Ahora añadimos para las pruebas la opcion de repetir hasta darle a 0. Comentar este codigo antes de entregar al cliente final.
			/*System.out.println();
			System.out.println("Si desea volver a probar numeros, por favor introduzca un numero diferente a 0, si quiere salir introduzca un 0: ");
			continuar=scanner.nextInt();
		}*/
	}
}