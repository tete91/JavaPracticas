package ejerciciopropuestodowhile3;

public class principal {

	public static void main(String[] args) {
		//Calcularemos la suma de los números pares comprendidos entre 10 y 50
		//Primero inicializaremos las variables necesarias.
		int numsum=0;
		int numpar=10;
		do{
			if(numpar%2==0) {
				numsum=numsum+numpar;
			}
			numpar++;
		}
		while(numpar<=50);
		System.out.println("La suma de los numeros pares comprendidos entre 10 y 50 es: "+numsum);
	}
}