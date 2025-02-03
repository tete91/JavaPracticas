package ejerciciopropuestofor4;

public class principal {

	public static void main(String[] args) {
		//Escribiremos el factorial del numero 15
		//Inicializamos las variables a utilizar.
		int confact;//Variable que contendra el numero a multiplicar asi como el numero regresivo del bucle.
		int numfac=15;//Variable que contiene el numero del cual se busca el factor, lo he separado del bucle para que sea mas facil cambiar el numero a buscar.
		Float fact=(float)numfac;//Variable que calculara el resultado de la factorial, lo indicamos en float pues no sabemos cuan larga sea la cadena
		  						 //despues parsearemos a int por terminal.
								 //La inicializamos con el valor a factorizar haciendo parseo.
		for(confact=numfac;confact>1;confact--) {//Bucle for que inicia en el numero del cual se busca el factorial. y regresa en orden descendente hasta 1 para evitar
								  			     //calculos innecesarios.
			fact=fact*confact;
		}
		System.out.println("El factorial del numero "+numfac+" es: "+fact);
	
	
	}
}
