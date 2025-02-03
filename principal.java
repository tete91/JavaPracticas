package ejerciciopropuestofor9;

public class principal {

	public static void main(String[] args) {
		//Hallaremos la lista de los números primos hasta el 100
		System.out.println("Los numeros primos del 1 al 100 son: ");
		for(int n=1;n<=100;n++) {//Bucle que seguira desde el primer numero natural al 100 en orden ascendente.
			int contdiv=0;//Variable que contara por cuantos numeros es divisible un numero.
			for(int div=1; div<=n; div++) {//Bucle que recorrera todos los numeros enteros a partir de 1 hasta n.
				if(n%div==0) {//Condicional que indica que solo si n es divisible sin resto por div sera un divisor y entra en la condicion
					contdiv++;//Aumentamos el contador de divisibles
				}
			}
			if(contdiv<=2) {//Si el contador de disibles es igual o menor de 2 significa que es un numero primo.
				System.out.print(n+" ");//Imprimimos el numero primo
			}
		}
	}
}
