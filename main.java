package EjercicioOpcional7;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Este programa pedira llenar 2 arrays y los sumara en un tercer array
		//Inicializamos scanner y variables necesarias
		Scanner scanner=new Scanner(System.in);
		int[] array1=new int[5];//Lista1
		int[] array2=new int[5];//Lista2
		int[] array3=new int[5];//Lista3
		int contador=0;//Contador para recorrer la lista
		System.out.println("A continuacion le solicitaremos rellenar 2 listas de numeros enteros.");//Informacion sobre datos solicitados
		System.out.println("Seguidamente le imprimiremos la suma de las 2 listas.");
		System.out.println("Introduzca los valores para la lista 1: ");
		for(contador=0;contador<array1.length;contador++) {//Bucle para recorrer la lista1
			array1[contador]=scanner.nextInt();//Introducimos datos en la lista en posicion de contador
		}
		System.out.println("Introduzca los valores para la lista 2: ");//Informacion sobre datos solicitados
		for(contador=0;contador<array2.length;contador++) {//Bucle para recorrer la lista2
			array2[contador]=scanner.nextInt();//Introducimos datos en la lista en posicion de contador
		}
		for(contador=0;contador<array3.length;contador++) {//Bucle para recorrer la lista3
			array3[contador]=array1[contador]+array2[contador];//Introducimos daots en la lista en posicion contador sumando la misma posicion de lista1+lista2
		}
		System.out.print("Los valores introducidos para la lista 1 han sido:");//Impresion de info
		for(int lista:array1) {//Array para recorrer lista1 y almacenar dato en lista
			System.out.print(" "+lista);//Imprimimos el valor de lista
		}
		System.out.println();//Salto de linea
		System.out.print("Los valores introducidos para la lista 2 han sido:");//Impresion de info
		for(int lista:array2) {//Array para recorrer lista1 y almacenar dato en lista
			System.out.print(" "+lista);//Imprimimos el valor de lista
		}
		System.out.println();//Salto de linea
		System.out.print("Los valores de la suma de las listas introducidas es:");//Impresion de info
		for(int lista:array3) {//Array para recorrer lista1 y almacenar dato en lista
			System.out.print(" "+lista);//Imprimimos el valor de lista
		}	
	}
}
