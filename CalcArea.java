package ejercicioopcional15;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		/*Escriba un programa que pregunte primero si se quiere calcular el área de un triángulo o la de un círculo.
		 * Si se contesta que se quiere calcular el área de un triángulo (escribiendo T o t), el programa tiene que pedir entonces la base y la altura y escribir el área.
		 * Si se contesta que se quiere calcular el área de un círculo (escribiendo C o c), el programa tiene que pedir entonces el radio y escribir el área.
		 * Se recuerda que el área de un triángulo es base por altura dividido por 2 y que el área de un círculo es Pi (aproximadamente 3,141592)
		 * por el radio al cuadrado.
		 * Nota: Utilice como valor de pi el valor 3.141592.
		 */
		//Empezamos llamando al escaner para la introduccion de datos por terminal.
		Scanner scanner=new Scanner(System.in);
		//Ahora inicializamos las variables que necesitaremos.
		String eleccion;
		double altura;
		double base;
		double area;
		double radio;
		//para las pruebas vamos a crear una variable continuar y un bucle while para poder ir haciendo las pruebas desde terminal
		//sin tener que reiniciar. despues se comenta toda la parte del codigo referente al bucle para la entrega a cliente final.
		//la variable continuar la inicializamos en -1 para dar vueltas al bucle mientras no se introduzca 0, tambien de podria hacer con el do while.
		int continuar=-1;
		while(continuar!=0){
			//Primeros explicamos al usuario de que trata el programa y le solicitamos datos.
			System.out.println("A continuación le solicitaremos varias opciones para resolver el area de un triangulo o de un circulo");
			System.out.println("Despues se le solicitarán datos según la elección escogida.");
			System.out.println();
			System.out.println("Quieres calcular el are de un triangulo o un circulo?");
			eleccion=scanner.next();
			System.out.println("El valor introducido es "+eleccion+".");
			switch(String.valueOf(eleccion).toLowerCase()) {
				case "triangulo":{
					System.out.println("Introduce la altura del triangulo: ");
					System.out.println();
					altura=scanner.nextDouble();
					System.out.println("La altura introducida ha sido de "+altura+".");
					System.out.println("Introduce la base del triangulo: ");
					System.out.println();
					base=scanner.nextDouble();
					System.out.println("La base introducida ha sido de "+base+".");
					area=base*altura/2;
					System.out.println("El area del triangulo es de: "+area+".");
					break;
				}
				case "circulo":{
					System.out.println("Introduce el radio del circulo: ");
					radio=scanner.nextDouble();
					System.out.println("El radio introducido es de: "+radio+".");
					area=3.141592*(radio*radio);
					System.out.println("El area del circulo es de: "+area+".");
					break;
				}
			}
			//Ahora añadimos para las pruebas la opcion de repetir hasta darle a 0. Comentar este codigo antes de entregar al cliente final.
			System.out.println();
			System.out.println("Si desea volver a probar numeros, por favor introduzca un numero diferente a 0, si quiere salir introduzca un 0: ");
			continuar=scanner.nextInt();
		}
	}
}
