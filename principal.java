package ejerciciopropuestofor7;

public class principal {

	public static void main(String[] args) {
		//Hallaremos todas las tablas de multiplicar con for anidados
		for(int n=1; n<=10; n++) {//Bucle ascendente que empieza en el 1 por la primera tabla de multiplicar y termina en la del 10.
			System.out.println("Vamos a ver la tabla del "+n);
			System.out.println();
			for(int nt=1; nt<=10; nt++) {//Bucle ascendente como el anterior que ira desde el primer numero por el que multiplicar hasta el ultimo.
				System.out.println(n+" X "+nt+" = "+n*nt);//imprimimos resultado con la operacion incluida dentro
			}
			System.out.println();
		}
	}
}
