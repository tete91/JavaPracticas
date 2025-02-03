package EjercicioPropuesto1;
import java.util.Arrays;
import java.util.Scanner;
public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//En este programa vamos a pedir por terminal caracteres, y solo se van a devolver impresos en caso de ser vocales.
		//Primero llamamos al scanner e inicializamos las variables que iremos necesitando.
		Scanner scanner=new Scanner (System.in);
		int tamanoArray=0;
		int contador=0;
		//A continuación hay peticiones y entradas de datos por parte del usuario.
		System.out.println("Vamos a solicitarle que ingrese letras por terminal y decirle cual de ellas son vocales.");//Info sobre el uso del programa
		System.out.println("Presione enter para comenzar:");//Info sobre el uso del programa
		scanner.nextLine();//Así le obligamos a indicar cuando quiere comenzar a introducir datos.
		System.out.println("");//Dejamos linea en blanco para no apelotonar texto.
		System.out.println("Por favor, a continuación indique cuantas letras va a querer introducir: ");//Info de cuantas veces va a introducir datos.
		tamanoArray = scanner.nextInt();//Recogemos el tamaño que tendrá nuestro array
		System.out.println("A indicado que introducirá "+tamanoArray+" letras.");//Le indicamos el valor introducido.
		System.out.println("");//Dejamos linea en blanco para no apelotonar texto.
		char[] arrayCharInt = new char[tamanoArray];//Inicializamos el array con el tamaño anterior introducido.
		System.out.println("Por favor a continuación introduzca 1 a 1 todas las letras a comprobar.");//Info de introducción de datos.
		scanner.nextLine();//Así le obligamos a indicar cuando quiere comenzar a introducir datos y limpiamos bufer para el bucle al ser diferente tipado.
		for(contador=0; contador<arrayCharInt.length; contador++) {//Bucle for que itera hasta llenar el array con la cantidad de datos introducidos.
			System.out.println("Introduzca una letra y presione enter: ");//Información de solicitud de datos.
			arrayCharInt[contador]=scanner.nextLine().charAt(0);//llenamos la posición del array con la letra introducida.
		}
		System.out.println("Las letras introducidas por terminal son: "+Arrays.toString(arrayCharInt));//Imprimimos por pantalla los caracteres introducidos por el usuario.
		System.out.println();//Limpiamos pantalla para no apelotonar texto.
		System.out.println("Pulse enter para continuar y mostrarle las vocales introducidas.");//Solicitamos continuar y aprovechamos a limpiar bufer.
		scanner.nextLine();//Obligamos a leer los resultados e indicar que quiere comenzar a ver los resultados.
		for(contador=0; contador<arrayCharInt.length; contador++) {//Bucle for que itera hasta dar la vuelta a todos los espacios del array.
			/*if(arrayCharInt[contador]=='a'|arrayCharInt[contador]=='e'|arrayCharInt[contador]=='i'|arrayCharInt[contador]=='o'|arrayCharInt[contador]=='u') {
				System.out.print(arrayCharInt[contador]+" ");//if que compara el dato del array con las opciones.
			}
			if(arrayCharInt[contador]=='A'|arrayCharInt[contador]=='E'|arrayCharInt[contador]=='I'|arrayCharInt[contador]=='O'|arrayCharInt[contador]=='U') {
				System.out.print(arrayCharInt[contador]+" ");//if que compara el dato del array con las opciones.
			}*/
			switch(arrayCharInt[contador]){
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
				case 'A':
				case 'E':
				case 'I':
				case 'O':
				case 'U':
					System.out.print(arrayCharInt[contador]+" ");
					break;
			}
		}
	}
}