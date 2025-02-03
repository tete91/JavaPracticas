package ejercicioopcionalwhile9;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		// Mejore la usabilidad del programa anterior haciendo que la pregunta se repita si el usuario no contesta S, s, N o n.
		//Escriba un programa que pida números pares mientras el usuario indique que quiere seguir introduciendo números.
		//Para indicar que quiere seguir escribiendo números, el usuario deberá contestar S o s a la pregunta.
		//Primero inicializaremos el escaner y las variables a utilizar.
		Scanner scanner=new Scanner(System.in);
		int num=0;//Variable que almacenara el numero anterior.
		String seguir="";//Variable que leera si quiere seguir introduciendo datos o no.
		System.out.println("A continuacion se le solicitará un numero par.");//Imprimimos, explicacion y solicitudes.
		System.out.println();
			do{//Bucle que se repetira mientras se introduzca s o S en el sistema
				System.out.println("Por favor introduzca un numero par: ");//Imprimimos, explicaciones y solicitudes.
				System.out.println();
				num=scanner.nextInt();
				while(num%2!=0) {//Condicional en el caso de no ser par
				System.out.println("El numero introducido no es un numero par, intentelo de nuevo.");//Imprimimos, explicaciones y solicitudes.
				System.out.println();
				System.out.println("Por favor introduzca un numero par: ");
				num=scanner.nextInt();
				}
				System.out.println("El numero par introducido es el numero: "+num);//Imprimimos, explicaciones y solicitudes.
				System.out.println();
				System.out.println("Desea introducir otro numero? indique s para si o n para no");
				scanner.nextLine();//Limpiamos buffer para introducir Strings
				seguir=String.valueOf(scanner.nextLine().toLowerCase().charAt(0));//Leemos el texto por terminar, lo formateamos obligatoriamente
																				  //a String, lo pasamos a minusculas y leemos solo el primer caracter
																				  //por si escriben si o no. todo lo demas sera descartado.
				while(!seguir.equals("s") && !seguir.equals("n")) {//Bucle que en caso de no introducir s o n pedira indefinidamente introduccion correcta.
					System.err.println("El caracter introducido no es valido, vuelva a intentarlo.");//Imprimimos, explicaciones y solicitudes.
					System.out.println("Desea introducir otro numero? indique s o S para si, o N o n para no");
					seguir=String.valueOf(scanner.nextLine().toLowerCase().charAt(0));//Leemos el texto por terminar, lo formateamos obligatoriamente
					  //a String, lo pasamos a minusculas y leemos solo el primer caracter
					  //por si escriben si o no. todo lo demas sera descartado.
				}
			}
			while(seguir.equals("s"));
	}
}
