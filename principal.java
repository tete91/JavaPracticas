package ejercicioopcional14;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		/*Escriba un programa que pida los coeficientes de una ecuación de primer grado (a x + b = 0) y escriba la solución.
		 *Se recuerda que una ecuación de primer grado puede no tener solución, tener una solución única, o que todos los números sean solución.
		 *Se recuerda que la fórmula de las soluciones es x = -b / a
		 *Estos son algunos ejemplos de posibles respuestas
		 *(el orden de los ejemplos no tiene por qué corresponder con el orden de las condiciones):
		 */
		//Empezamos llamando al escaner para la introduccion de datos por terminal.
		Scanner scanner=new Scanner(System.in);
		//Ahora inicializamos las variables que necesitaremos.
		int a;
		int b;
		double x;
		//para las pruebas vamos a crear una variable continuar y un bucle while para poder ir haciendo las pruebas desde terminal
		//sin tener que reiniciar. despues se comenta toda la parte del codigo referente al bucle para la entrega a cliente final.
		//la variable continuar la inicializamos en -1 para dar vueltas al bucle mientras no se introduzca 0, tambien de podria hacer con el do while.
		//int continuar=-1;
		//while(continuar!=0){
			//Primeros explicamos al usuario de que trata el programa y le solicitamos datos.
			System.out.println("A continuación le solicitaremos 2 numeros para resolver una ecuacion del tipo A*X+B=0");
			System.out.println("Despues diremos si tiene solución o no");
			System.out.println();
			System.out.println("A continuación introduzca el valor de a: ");
			a=scanner.nextInt();
			System.out.println("El valor introducido es "+a+".");
			System.out.println();
			System.out.println("A continuación introduzca el valor de b: ");
			b=scanner.nextInt();
			System.out.println("El valor introducido es "+b+".");
			if(a==0&&b==0){
				System.out.println("Todos los numeros són solución.");
			}
			else if(a==0&&b!=0) {
				System.out.println("No tiene solución");
			}
			else {
				System.out.println("La ecuación tiene una única solución.");
				x=-b/a;
				System.out.println("La solución es: "+x);
			}
			
			//Ahora añadimos para las pruebas la opcion de repetir hasta darle a 0. Comentar este codigo antes de entregar al cliente final.
			/*System.out.println();
			System.out.println("Si desea volver a probar numeros, por favor introduzca un numero diferente a 0, si quiere salir introduzca un 0: ");
			continuar=scanner.nextInt();
		}*/
	}
}