package ejercicioopcional8;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		/*Escriba un programa que pida el año actual y un año cualquiera y que escriba cuántos años han pasado desde ese año 
		 *o cuántos años faltan para llegar a ese año.
		 */
		//Empezamos llamando al escaner para la introduccion de datos por terminal.
		Scanner scanner=new Scanner(System.in);
		//Ahora inicializamos las variables que necesitaremos.
		int ano1;
		int ano2;
		int difanos;
		//para las pruebas vamos a crear una variable continuar y un bucle while para poder ir haciendo las pruebas desde terminal
		//sin tener que reiniciar. despues se comenta toda la parte del codigo referente al bucle para la entrega a cliente final.
		//la variable continuar la inicializamos en -1 para dar vueltas al bucle mientras no se introduzca 0, tambien de podria hacer con el do while.
		//int continuar=-1;
		//while(continuar!=0){
			//Primeros explicamos al usuario de que trata el programa y le solicitamos datos.
			System.out.println("A continuación le solicitaremos 2 años a introducir");
			System.out.println("Despues Diremos cuantos años han pasado o cuantos años faltan para llegar a ese año.");
			System.out.println();
			System.out.println("A continuación introduzca en que año estamos: ");
			ano1=scanner.nextInt();
			System.out.println("El año introducido es el "+ano1+".");
			System.out.println("A continuación introduzca un año cualquiera: ");
			ano2=scanner.nextInt();
			System.out.println("El año introducido es el "+ano2+".");
			if(ano1<ano2) {
				difanos=ano2-ano1;
				System.out.println("Faltan "+difanos+" años hasta llegar desde el año "+ano1+" hasta el año "+ano2+".");
			}
			if(ano1>ano2) {
				difanos=ano1-ano2;
				System.out.println("Han pasado "+difanos+" años desde el año "+ano2+" hasta el año "+ano1+".");
				}
			//Ahora añadimos para las pruebas la opcion de repetir hasta darle a 0. Comentar este codigo antes de entregar al cliente final.
			/*System.out.println();
			System.out.println("Si desea volver a probar numeros, por favor introduzca un numero diferente a 0, si quiere salir introduzca un 0: ");
			continuar=scanner.nextInt();
		}*/
	}
}
