package ejercicioopcionalwhile8;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		//Escriba un programa que pida números pares mientras el usuario indique que quiere seguir introduciendo números.
		//Para indicar que quiere seguir escribiendo números, el usuario deberá contestar S o s a la pregunta.
		//Primero inicializaremos el escaner y las variables a utilizar.
		Scanner scanner=new Scanner(System.in);
		int num=0;//Variable que almacenara el numero anterior.
		String seguir="null";//Variable que preguntara si quiere seguir introduciendo datos o no.
		System.out.println("A continuacion se le solicitará un numero par.");//Imprimimos, explicacion y solicitudes.
		System.out.println();
			do{//Bucle que se repetira mientras se introduzca s o S en el sistema
				System.out.println("Por favor introduzca un numero par: ");//Imprimimos, explicaciones y solicitudes.
				System.out.println();
				num=scanner.nextInt();
				if(num%2!=0) {//Condicional en el caso de no ser par
				System.out.println("El numero introducido no es un numero par, intentelo de nuevo.");
				}
				else{//Condicional en caso de ser par
				System.out.println("El numero par introducido es el: "+num);
				System.out.println("Desea introducir otro numero? indique s o S para si, o cualquier otra cosa para no.");
				seguir=scanner.next().toLowerCase();//Leemos texto de la terminal y lo formateamos a minusculas
				}
			}
			while(seguir.equals("s"));
	}
}
