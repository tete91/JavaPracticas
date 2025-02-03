package EjercicioOpcional1;

public class main {

	public static int alCuadrado(int numeroPotencia) {
		return numeroPotencia*numeroPotencia;
	}
	public static int alCubo(int numeroPotencia) {
		return numeroPotencia*numeroPotencia*numeroPotencia;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Este programa cogera un array de 10 enteros
		//lo rellenara con numeros random del 1 al 10
		//e imprimirá por pantalla el elemento, su cuadrado y su cubo.
		//Primero inicializamos las variables necesarias.
		int[] vector_numeros = new int[10];//Inicializamos el array de 10 posiciones para numeros enteros
		int contador=0;//Contador para ir pasando por las posiciones del array
		int numeroPotencia=0;//Variable para almacenar los numeros de las posiciones del array para utilizarlo con funciones
		for(contador=0; contador<10; contador++) {//Bucle que recorrera el array
			vector_numeros[contador]=(int)(Math.random()*10+1);//Operacion que llenara el array con numeros random del 1 al 10
		}
		for(contador=0; contador<10; contador++) {//Bucle que recorrera el array
			numeroPotencia=vector_numeros[contador];//Llenamos la variable con el valor de la posicion del array
			System.out.print("El numero almacenado en la posicion "+(contador+1));//Imprimimos el valor de la posicion
			System.out.println(" es el: "+numeroPotencia+".");//Imprimimos el valor almacenado en la posicion
			System.out.println("Su cuadrado es el: "+alCuadrado(numeroPotencia)+".");//Imprimimos el cuadrado
			System.out.println("Y su cubo es el: "+alCubo(numeroPotencia)+".");//Imprimimos el cubo
			System.out.println();//Dejamos hueco entre iteraciones para que se separe cada hueco del array visualmente.
		}
	}
}
