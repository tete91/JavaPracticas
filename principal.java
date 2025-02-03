package ejercicioopcionalwhile3;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		//Escribiremos un programa que pida números enteros mientras sean cada vez más grandes.
		//Primero inicializaremos el escaner y las variables a utilizar.
		Scanner scanner=new Scanner(System.in);
		int numant=0;//Variable que almacenara el numero anterior.
		int numint=0;//Variable que almacenara el numero introducido.
		System.out.println("A continuacion se le solicitarán 2 numeros enteros.");//Imprimimos explicacion y solicitudes.
		System.out.println();
		System.out.println("Por favor introduzca el primer numero:");
		System.out.println();
		numint=scanner.nextInt();//Escaneamos el num1
		System.out.println("El primer numero introducido es el: "+numint);
		do {//Bucle do para entrar minimo la primera vez y el bucle se repetira almenos que se introduzca un numero menor en num2 que en num1
			numant=numint;
			System.out.println("Por favor introduzca el siguiente numero: ");//Instrucciones y solicitudes
			System.out.println();
			numint=scanner.nextInt();
			if(numint<=numant) {//Condicional en caso de meter num2 menor a num1 antes de cerrar bucle.
				System.out.println("El numero "+numint+" no es mayor que el numero "+numant);//info
				System.out.println("Por favor reintentelo de nuevo.");
			}
			System.out.println("El anterior numero introducido es el: "+numant);
			System.out.println("El ultimo numero introducido es el: "+numint);
		}
		while(numint>numant);
	}
}
