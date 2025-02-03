package ejercicioopcionalwhile6;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		//Escriba un programa que pida un valor límite positivo y a continuación pida números hasta que la suma de los números introducidos supere el límite inicial.
		//Primero inicializaremos el escaner asi como las variables que se necesiten.
				Scanner scanner= new Scanner(System.in);
				int numint=0;//En esta variable introduciremos el numero limite.
				int num=0;//Aqui almacenaremos los numeros introducidos.
				int suma=0;//En esta variable almacenaremos la suma de los numeros introducidos.
				do {//Bucle que se repetira mientras numint sea negativo o 0
					System.out.println("A continuación indique el numero positivo limite: ");//Informacion, instrucciones y solicitudes.
					System.out.println();
					numint=scanner.nextInt();
					System.out.println("El numero introducido es el: "+numint);
					System.out.println();
					if(numint<=0) {//Condicional en caso de introducir un negativo o 0
						System.out.println("Por favor introduzca un numero positivo. Intentelo de nuevo.");
					}
					else {//Condicional en caso de solicitud correcta
						while(suma<numint) {//Bucle que seguira hasta que la suma total llegue o supere el limite de sumint.
							System.out.println("Introduzca un numero a sumar: ");//Info, instrucciones y solicitudes.
							System.out.println();
							num=scanner.nextInt();
							System.out.println();
							System.out.println("El numero introducido es el: "+num);
							System.out.println();
							suma=suma+num;//Realizamos la operacion de suma.
						}
					}
					
				}
				while(numint<=0);
				System.out.println("Has llegado al limite introducido de: "+numint);//Informacion de resultados.
				System.out.println("La suma de los numeros introducidos es de: "+suma);
			}
		}