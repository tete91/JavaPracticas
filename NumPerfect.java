package ejerciciopropuestowhile5;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Un numero es perfecto cuando todos sus divisores sumados dan el mismo numero Ejemplo: 6 = 1 + 2 + 3; luego 6 es un numero perfecto
		//Mostrar los números perfectos hasta el 100
		//Primero inicializamos las variables que utilizaremos.
		int numperf=1;//Esta variable empieza de 1 para no hacer iteraciones innecesarias
					  //y servira para ir verificando si el numero es perfecto a medida que lo aumentemos, y para imprimirlo en caso de serlo.
		while(numperf<=100){//Bucle que seguirá hasta el numero 100 inclusive.
			int sumcompnum=0;//Variable que servira para ir sumando los divisores encontrados de un numero.
			int n=1;//Variable que contendrá el divisor a comprobar
			while(n<numperf) {//Bucle while que se repetirá hasta igualar el divisor con el numero a comprobar.
				if(numperf%n==0) {
					sumcompnum=sumcompnum+n;//sumamos a la variable el numero del divisor encontrado
				}
				n++;//sumamos 1 para repetir el bucle con el nuevo divisor siendo n+1
			}
			if(sumcompnum==numperf) {//Condicional que compara si es un numero perfecto o no.
				System.out.println("El numero "+numperf+" es un numero perfecto.");//Imprimimos resultado en caso de serlo.
			}
			numperf++;//Aumentamos para comprobar el siguiente numero siendo numperf+1.
		}
	}
}
