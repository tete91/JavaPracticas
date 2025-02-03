package ejercicioopcionalwhile5;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		//Escriba un programa que pida números mientras no se escriba un número negativo. El programa terminará escribiendo la suma de los números introducidos.
		//Primero inicializaremos el escaner asi como las variables que se necesiten.
				Scanner scanner= new Scanner(System.in);
				int numint=0;//En esta variable introduciremos los numeros introducidos.
				int numint2=0;//En esta variable iremos sumando los numeros introducidos.
				do {//Bucle que se repetira mientras numint no sea negativo.
					System.out.println("A continuación introduzca un numero no negativo: ");//Informacion, instrucciones y solicitudes.
					System.out.println();
					numint=scanner.nextInt();
					System.out.println("El numero introducido es el: "+numint);
					System.out.println();
					numint2=numint2+numint;
					System.out.println("La suma de los numeros introducidos hasta ahora es: "+numint2);
				}
				while(numint>=0);
			}
		}