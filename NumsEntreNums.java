package ejercicioopcionalwhile7;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		//Escriba un programa que pida primero dos números enteros (mínimo y máximo) y que después pida números enteros situados entre ellos.
		//El programa terminará cuando se escriba un número que no esté comprendido entre los dos valores iniciales.
		//El programa termina escribiendo la cantidad de números escritos.
		//Primero inicializaremos el escaner asi como las variables que se necesiten.
				Scanner scanner= new Scanner(System.in);
				int numin=0;//En esta variable introduciremos el numero minimo.
				int numax=0;//En esta variable introduciremos el numero maximo.
				int num=0;//Aqui almacenaremos los numeros introducidos.
				int cont=0;//En esta variable la usaremos de contador para saber cuantos numeros se han introducido.
				System.out.println("A continuacion se le solicitaran un numero minimo y uno maximo.");//Informacion, instrucciones y solicitudes.
				System.out.println();
				System.out.println("Introduzca el numero minimo: ");
				numin=scanner.nextInt();
				System.out.println();
				System.out.println("Introduzca el numero maximo");
				numax=scanner.nextInt();
				while(numax<=numin) {//Bucle que en caso de no introducir el numero max mayor al min te hace repetir hasta hacerlo.
					System.out.println();
					System.out.println("El numero maximo introducido es mas pequeño o igual al minimo, vuelva a intentarlo por favor.");
					System.out.println("Introduzca el numero maximo");
					numax=scanner.nextInt();
				}
				do {//Bucle que se repetira mientras se introduzcan numeros comprendidos entre numin y numax inclusives
					System.out.println("A continuación introduzca un numero entre el minimo y el maximo: ");//Informacion, instrucciones y solicitudes.
					System.out.println();
					num=scanner.nextInt();
					System.out.println("El numero introducido es el: "+num);
					System.out.println();
					if(num<numin||num>numax) {//Condicional en caso de introducir un numero no comprendido entre numin y numax
						System.out.println("El numero introducido no esta comprendido entre el minimo y el maximo.");
					}
					cont++;//Aumentamos el contador para llevar la cuenta de cuantos numeros se han introducido
				}
				while(num>=numin&&num<=numax);
				System.out.println("La cantidad de numeros introducidos en el sistema ha sido de: "+cont);//Informacion con el resultado.
			}
		}
