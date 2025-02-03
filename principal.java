package ejerciciopropuestowhile3;

public class principal {

	public static void main(String[] args) {
		//A continuacion calcularemos los 25 primeros numeros primos, que no del 1 al 25.
		//Primero inicializamos las variables a utilizar.
		//el numprimo lo inicializamos desde el primer numero primo para ahorrar calculos innecesarios.
		int numprimo=2;//Esta variable servira para ir verificando si el numero es primo a medida que lo aumentemos, y para imprimirlo en caso de serlo.
		int contprimo=0;//Variable para contar las vueltas de numeros primos encontrados
		while(contprimo<25){//Bucle que seguirá hasta encontrar 25 primos contando que inicializa en 0.
			int contdiv=0;//Variable que contara por cuantos numeros es divisible un numero.
			for(int n=1; n<=numprimo;n++) {//Bucle que se repetirá mientras la variable n sea menor al numero a comprobar.
				if(numprimo%n==0) {//Si el resto del numero comprobado con el numero divido da 0 es que es divisible por el y sube el contador contdiv.
					contdiv++;
				}
			}
			if(contdiv==2) {//Condicional que se cumplirá solo en caso que el numero comprobado solo sea divisible por 2 numeros, que serán el 1 y si mismo.
				contprimo++;//sumaremos uno al contador de primos encontrados, lo ponemos antes para de paso imprimirlo despues empezando desde 1 y no desde 0
				System.out.println(numprimo+" es el primo encontrado numero "+contprimo+".");//Imprimimos el numero encontrado asi como en que posicion se encuentra.
			}
			numprimo++;//Aumentamos en 1 el numero a comprobar si es primo.
		}
	}
}
