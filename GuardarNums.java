package ejercicioopcionalwhile4;
import java.util.Scanner;
public class principal {

	public static void main(String[] args) {
		//Escribiremos un programa que pida la cantidad de números positivos que se tienen que escribir y 
		//a continuación pida números hasta que se haya escrito la cantidad de números positivos indicada.
		//Primero inicializaremos el escaner asi como las variables que se necesiten.
		Scanner scanner= new Scanner(System.in);
		int numint=0;//En esta variable introduciremos la cantidad de numeros que se quieran introducir.
		int numint2=0;//Esta variable la utilizaremos para el segundo bucle while. y se inicializará con el mismo numint.
		int num=0;//Aqui almacenaremos los numeros introducidos.

		do {//Bucle que se repetira mientras numint sea negativo o 0
			System.out.println("A continuación indique cuantos numeros desea introducir en el sistema: ");//Informacion, instrucciones y solicitudes.
			System.out.println();
			numint=scanner.nextInt();
			System.out.println("El numero introducido es el: "+numint);
			System.out.println();
			if(numint<=0) {//Condicional en caso de introducir un negativo o 0
				System.out.println("Por favor introduzca un numero positivo. Intentelo de nuevo.");
			}
			else {//Condicional en caso de solicitud correcta
				numint2=numint;//Inicializamos numint2 a numint al ser correcta la solicitud
				while(numint2>0) {//Bucle descendente que acabara al llegar a 0 numint 2 solicitando asi la cantidad de numeros introducida en numint
					System.out.println("Introduzca el siguiente numero positivo: ");//Info, instrucciones y solicitudes.
					System.out.println();
					num=scanner.nextInt();
					System.out.println();
					System.out.println("El numero introducido es el: "+numint);
					System.out.println();
					if(num<=0) {//Condicional en caso de introducir numero negativo o 0
						System.out.println("Por favor introduzca un numero positivo. Intentelo de nuevo.");
					}
					else {//Condicional en caso de intro correcta, restamos 1 a numint2 para verificar como numero correcto.
						numint2--;
					}
				}
			}
			
		}
		while(numint<=0);
	}
}
