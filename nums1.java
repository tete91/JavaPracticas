package ejercicioopcionalwhile2;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		//Escriba un programa que pida números decimales mientras el usuario escriba número mayores que el primero.
		//Primero inicializaremos el escane y las variables a utilizar.
		Scanner scanner=new Scanner(System.in);
		Double num1;//Variable que almacenara el primer numero introducido.
		Double num2;//Variable que almacenara el segundo numero introducido.
		System.out.println("A continuacion se le solicitarán 2 numeros con decimales.");//Imprimimos explicacion y solicitudes.
		System.out.println();
		System.out.println("Por favor introduzca el primer numero:");
		System.out.println();
		num1=scanner.nextDouble();//Escaneamos el num1
		do {//Bucle do para entrar minimo la primera vez y el bucle se repetira almenos que se introduzca un numero menor en num2 que en num1
			System.out.println("Por favor introduzca el segundo numero: ");//Instrucciones y solicitudes
			System.out.println();
			num2=scanner.nextDouble();
			if(num2<=num1) {//Condicional en caso de meter num2 menor a num1 antes de cerrar bucle.
				System.out.println("El numero "+num2+" no es mayor que el numero "+num1);//info
			}
		}
		while(num2>num1);
	}
}
