package ejerciciopropuestofor6;

public class principal {

	public static void main(String[] args) {
		//Hallaremos los números impares menores de 30 y que aparezcan en orden descendente
		for(int n=30;n>0;n--) {//Bucle que empieza en 30, y bajara en descendente a 0, de 1 en 1.
			if(n%2!=0) {//Condicional para saber si el resto no es 0, por lo tanto será impar.
				System.out.println("El numero "+n+" es impar.");//Imprimimos resultados.
			}
		}
	}
}
