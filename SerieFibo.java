package ejerciciopropuestowhile6;

public class principal {

	public static void main(String[] args) {
		//Calcular los n primeros términos de la serie de Fibonacci
		//Primeros inicializamos las variables a utilizar.
		Float numfibo=1f;//Variable que contendra los numeros de fibonacci, lo hacemos como float pues no sabemos cuan larga sea la cadena del numero.
		Float numant=0f;//Variable que contendra el numero anterior de fibonacci.
		Float numact=1f;//Variable que contendra el numero actual de fibonacci.
						//Inicializa en 1 al ser el primer numero de fibonacci despues de 0.
		int numenc=10;//Variable que indicara cuantos numeros queremos encontrar de fibonacci.
		System.out.println("El numero "+numant.intValue()+" es un numero de Fibonacci.");//Añadimos el primer numero para poder hacer que repita el 1 en la serie.
		while(numenc>1) {//Bucle que se repetirá hasta que el contador de numeros a buscar baje a 1. para compensar el numero introducido manualmente fuera de bucle.
			System.out.println("El numero "+numfibo.intValue()+" es un numero de Fibonacci.");//Imprimimos el numero encontrado anterior por pantalla.
			numfibo=numant+numact;//Calcula el numero segun las reglas.
			numant=numact;//Pasa el numero actual al anterior.
			numact=numfibo;//Pasa el numero encontrado al actual.
			numenc--;//Baja el contador en 1 siendo numenc-1.
		}
	}
}
