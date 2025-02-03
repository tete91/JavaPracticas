package ejerciciopropuestofor1;

public class principal {

	public static void main(String[] args) {
		//Escribiremos por pantalla los 10 primeros números (ascendente y descendente)
		//Primero inicializaremos las variables que necesitaremos.
		int num;//Variable que contendra el numero a imprimir
		for(num=1;num<=10;num++) {//Bucle for ascendente que seguirá hasta imprimir los enteros hasta el 10.Empieza en uno para que obvie el 0 y llegue al 10.
			System.out.println(num);//Imprimimos el numero por pantalla.
		}
		System.out.println();
		for(num=10;num>0;num--) {//Bucle for descendente que seguirá hasta imprimir los enteros hasta el 10.
			System.out.println(num);//Imprimimos el numero por pantalla.
		}
	}
}
