package ejerciciopropuestodowhile1;

public class principal {

	public static void main(String[] args) {
		//Resolveremos la potencia de 2 elevado a 8 con do-while
		//Primero inicializamos las variables a utilizar
		Float num1=2f;
		int contador=2;
		//Imprimimos por pantalla lo que va a suceder al usuario.
		System.out.println("A continuación vamos a calcular el resultado de 2^8: ");
		//Iniciamos el bucle do while, haciendo que pare una vez el contador sea mayor a 8, ya que si queremos que el 8 se multiplique
		do {
			//Realizamos los calculos y sumamos 1 al contador para que se vaya repitiendo el bucle.
			num1=num1*2;
			contador++;
		}
		while(contador<=8);
		//Imprimos el resultado por pantalla, hacemos un intvalue para que se imprima el numero sin los decimales.
		//Hacemos un Float en num1 atendiendo en que en principio se supone que no sabemos si el numero introducido al realizar el calculo,
		//Podra almacenarse en int (Aunque aqui es obvio que si), asi que para ser precavido, pasamos a float y parseamos a int despues.
		System.out.println("El resultado de la operación es: "+num1.intValue()+".");
	}
}
