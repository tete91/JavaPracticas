package ejercicio6if;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		//En este programa vamos a subir el sueldo de los empleados, un porcentaje según su sueldo y según su género e hijos.
		//Primero llamamos al escaner.
		Scanner scanner=new Scanner(System.in);
		
		//Creamos un bucle while que no salga hasta que continuar sea igual a 0, para pruebas, comentar el bucle y sus variables, y el continuar para entrega al cliente
		//Inicializamos continuar en -1 para que entre al bucle almenos la primera vez.
		//inicializamos la variable continuar para la salida del bucle.
		//int continuar=-1;
		//while(continuar!=0) {
			//Inicializamos todas las variables a utilizar.
			float salario1=0f;
			String genero;
			int nhijos=0;
			float nsalario=0f;
			int incremento=0;
			System.out.println("A Continuación vamos a calcular que incremento de salario le pertenece, por favor introduzca los datos solicitados: ");
			System.out.println("Cual es tu salario actual? ");
			salario1=scanner.nextFloat();
			System.out.println();
			System.out.println("Introduzca su genero, V para Varon y M para Mujer: ");
			genero=scanner.next();
			System.out.println();
			System.out.println("Indique la cantidad de hijos que tiene: ");
			nhijos=scanner.nextInt();
			System.out.println();
			//Ahora realizamos los calculos del nuevo salario antes de imprimirlo por terminal.
			if(genero.equals("M") || genero.equals("m")){
				incremento=incremento+2;
			}
			if (salario1<15000) {
				incremento=incremento+15;
			}
			else {
				incremento=incremento+12;
			}
			incremento=incremento+nhijos;
			nsalario=salario1+(salario1*incremento/100);
			System.out.println("Su nuevo salario es de: "+nsalario);
			//Preguntamos si quiere otra ronda, esto es solo para comprobaciones, borrar para entrega a cliente final.
			/*System.out.println();
			System.out.println("Quieres realizar de nuevo los calculos, indica 0 para no, o cualquier otro numero pasa si.");
			continuar=scanner.nextInt();
		}*/
	}
}
