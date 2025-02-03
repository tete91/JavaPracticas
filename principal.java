package ejerciciopropuestowhile1;


public class principal {

	public static void main(String[] args) {
		//Vamos a calcular el factorial de 25(numero que se multiplica por todos sus anteriores naturales).
		//Lo primero inicializamos todas las variables que utilizaremos.
		int contador=25;
		Float num1=25f;
		//Imprimimos por pantalla informacion para el usuario
		System.out.println("A continuacion vamos a calcular el factorial de 25 imprimiendo cada calculo por pantalla.");
		System.out.println();
		//Inicializamos bucle while mientras contador sea mayor a 1 ya que muliplicar por 1 no tiene sentido gastar memoria por ello
		while(contador>1) {
			//Hacemos las operaciones de calculo asi como restamos al contador para llegar a cerrar al bucle
			num1=num1*contador;
			contador--;
		}
		//Le damos el resultado final al usuario.
		System.out.println("El factorial de 25 es "+num1);
	}
}
