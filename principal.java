package ejerciciopropuestofor8;

public class principal {

	public static void main(String[] args) {
		//Con los 20 primeros números vamos a decir con cada uno por cual es divisible: ejemplo: 1 –> es divisible por 1
		//2 –> es divisible por 1 es divisible por 2 …
		for(int n=1; n<=20; n++) {//Bucle que empezará por el numero 1 hasta llegar al 20 inclusive para calcular en cada numero
			System.out.println("El numero "+n+" es divisible por los numeros: ");//Imprimimos el numero del cual se va a calcular sus divisores.
			for(int div=1; div<=n; div++) {//Bucle que recorrera todos los numeros enteros a partir de 1 hasta n.
				if(n%div==0) {//Condicional que indica que solo si n es divisible sin resto por div sera un divisor y entra en la condicion
					System.out.print(div+" ");//Imprimimos dicho numero.
				}
			}
			System.out.println();
		}
	}
}
