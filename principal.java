package ejerciciopropuestofor3;

public class principal {

	public static void main(String[] args) {
		//Escribiremos la tabla de multiplicar del 5
		//Primero inicializamos las variables a utilizar.
		int num=0;//Variable que almacenara el numero a imprimir.
		int cont;//Variable que contara las vueltas y al mismo tiempo dara el numero por el que se multiplica el 5 en la tabla.
		for(cont=1;cont<=10;cont++) {//Bucle que seguira mientras el contador sea igual o menor a 10 ya que es donde acaba la tabla, empieza en 1 que es donde empieza
									 //la misma y es ascendente de 1
			num=5*cont;//Formula para calcular el resultado de la multiplicacion
			System.out.println("5 por "+cont+" = "+num);//Imprimimos resultado por terminal.
		}
	}
}
