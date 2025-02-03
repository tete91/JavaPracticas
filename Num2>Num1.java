package ejercicioopcionalwhile1;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		//Escribiremos un programa que pida dos números enteros. El programa pedirá de nuevo el segundo número mientras no sea mayor que el primero.
		//El programa terminará escribiendo los dos números.
		//Primero inicializaremos el escane y las variables a utilizar.
		Scanner scanner=new Scanner(System.in);
		int num1=0;//Variable que almacenara el primer numero introducido.
		int num2=0;//Variable que almacenara el segundo numero introducido.
		System.out.println("A continuacion se le solicitarán 2 numeros enteros.");//Imprimimos explicacion y solicitudes.
		System.out.println();
		System.out.println("Por favor introduzca el primer numero:");
		System.out.println();
		num1=scanner.nextInt();//Escaneamos el num1
		do {
			System.out.println("Por favor introduzca el segundo numero: ");
			System.out.println();
			num2=scanner.nextInt();
			if(num2<=num1) {
				System.out.println("El segundo numero tiene que ser mas grande que el primero, por favor introduzcalo de nuevo.");
			}
		}
		while(num2<=num1);
	}
}
