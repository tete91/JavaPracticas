package cifradocesar;

import java.util.Scanner;//Importamos el escaner para la introduccion de datos por terminal.
import java.util.InputMismatchException;//Importamos el gestor de excepciones de java para utilizar el try catch.

public class metodos {
	public static Scanner scanner = new Scanner(System.in);// Inicializamos un escaner para la lectura de datos por
															// terminal.
	private static char[] abecedario = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'ñ', 'o',
			'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };// Array con las posibles opciones del abecedario.
	private static String contInt;// Variable que contendrá la contraseña original introducida.
	private static char[] compCont;// Array que contendrá la contraseña original en formato char, para verificar
									// que sean letras a posteriori.
	private static char[] contOriginal;// Array que contendrá la contraseña original en formato char tras comprobar que
										// sean todo letras.
	private static char[] contCifrada;// Array que contendrá la contraseña una vez cifrada.
	private static int contador;// Variable para utilizar como contador.
	private static int contador2;// Variable para utilizar como segundo contador.
	private static int posicion;// Variable que almacenará la posición de la letra del abecedario.
	private static int desp;// Variable que almacenará el desplazamiento escogido por el usuario.
	private static Boolean charEncontrado;// Variable que indicará si encuentra o no un char en el array.
	private static Boolean soloLetras;// Variable que indicará si solo hay letras o se ha introducido algún otro tipo
										// de caracter no almacenado en el abecedario.
	private static Boolean enRango;// Variable que indicará si el desplazamiento está en rango o no.
	private static Boolean valorInt;// Variable que indicará si el valor introducido en el desplazamiento es un int
									// o no.

	public static void limpiar_pantalla() {// Metodo para simular una limpieza de pantalla.
		for (int i = 0; i < 200; i++)// Hacemos un bucle que provocará 200 saltos de linea.
			System.out.println("");
	}

	public static void confirmar() {// Metodo para solicitar confirmación tras una acción y mostrado de datos.
		System.out.println("Pulsa ENTER para continuar ...");
		scanner.nextLine();// Esperamos confirmación antes de continuar.
	}

	public static void introducir_password() {// Metodo para introducir la contraseña original y desplazamiento.
		do {// Bucle que iterará mientras no esté en rango el desplazamiento escogido.
			enRango = false;// Inicializamos en false hasta demostrar que esté en rango.
			valorInt = false;// Inicializamos en false hasta demostrar que sea un integer.
			System.out.println("Por favor introduce el desplazamiento a utilizar en el cifrado en numeros(0-27): ");
			while (!valorInt) {// Bucle que iterará hasta que el try catch no detecte valor no Int.
				try {// Indicamos la soliitud, pedimos el desplazamiento, limpiamos buffer, y si es
						// correcto indicamos que es true.
					desp = scanner.nextInt();
					scanner.nextLine();
					valorInt = true;
				} catch (InputMismatchException noint) {// Al no ser int y generar un error lo indicamos y solicitamos
														// de nuevo el desplazamiento, confirmamos y limpiamos pantalla.
					System.out.println("El valor introducido no es un número, vuelve a intentarlo.");
					confirmar();
					limpiar_pantalla();
				}
			}
			if (desp >= 0 && desp <= 27) {// Condicional en caso de que el desplazamiento este en rango, igual o mayor a
											// 0 y menor o igual a 27. Imprimimos el desplazamiento, indicamos el true y
											// esperamos confirmacion.
				System.out.println("El desplazamiento escogido es de: " + desp);
				enRango = true;
				confirmar();
				limpiar_pantalla();
			} else {// Condicional si no esta en rango, lo indicamos, esperamos confirmacion, y
					// esperamos nueva introducción.
				System.out.println(
						"El rango de desplazamiento elegido no es correcto, por favor escoge un desplazamiento en rango(0-27).");
				confirmar();
				limpiar_pantalla();
			}
		} while (!enRango);
		do {// Bucle que iterará mientras no se introduzcan solo letras incluidas en el
			// array.
			System.out.println(
					"Por favor introduce la contraseña a cifrar. Recuerda que solo lee letras y que no distingue minusculas de mayusculas: ");
			contInt = scanner.nextLine();// Leemos la contraseña introducida por terminal.
			compCont = new char[contInt.length()];// Inicializamos el array de comprobación con el tamaño de la
													// contraseña.
			for (contador = 0; contador < compCont.length; contador++) {// Bucle que pasará por cada letra de la
																		// contraseña, la formateará a lower case y lo
																		// almacenará caracter a caracter al array de
																		// comprobación.
				compCont[contador] = contInt.toLowerCase().charAt(contador);
			}
			soloLetras = true;// Inicializamos en true hasta demostrar lo contrario.
			for (char c : compCont) {// Bucle que recorrerá todos los char del array de comprobación
				charEncontrado = false; // Inicializamos en false hasta demostrar lo contrario.
				for (char a : abecedario) {// Bucle que recorrerá todos los char del abecedario.
					if (c == a) {// Condicional si coincide el char de la contraseña con una letra del
									// abecedario.
						charEncontrado = true;// Indicamos que ha sido encontrada.
					}
				}
				if (!charEncontrado) {// Condicional en caso de no encontrar el char en ninguna posición, lo
										// indicamos, indicamos que no solo son letras, esperamos confirmación y
										// limpiamos pantalla.
					System.out.println(
							"Alguno de los caracteres introducidos no son letras, por favor introduzca la contraseña de nuevo.");
					soloLetras = false;
					confirmar();
					limpiar_pantalla();
				}
			}
		} while (!soloLetras);
		contOriginal = compCont;// En caso de que solo sean letras, guardamos la contraseña en el array de
								// contraseña original.
	}

	public static void cifrar() {// Metodo para cifrar la contraseña.
		introducir_password();// Primero llamamos a introducir la contraseña a cifrar, podriamos ponerlo
								// aparte en el menú como otra opción.
		contCifrada = new char[contOriginal.length];// Inicializamos el array de la contraseña cifrada con la longitud
													// del array de la contraseña original.
		charEncontrado = false;// Inicializamos en false hasta demostrar lo contrario.
		contador = 0;// Inicializamos el contador 1 a 0 antes del primer bucle ya que queremos
						// recorrerlo solo 1 vez.
		for (char c : contOriginal) {// Bucle que iterará todos los char de la contraseña original.
			contador2 = 0;// Inicializamos el contador 2 ya que queremos que itere desde 0 por cada nueva
							// iteración del for de contOriginal.
			posicion = 0;// Inicializamos el contador de la posicion del array de abecedario a 0 ya que
							// queremos que se reinice con cada iteración de contOriginal.
			for (char a : abecedario) {// Bucle que iterará por todos los char de abecedario.
				if (c == a) {// Condicional si coincide el char de contOriginal y el de abecedario.
					if (contador2 + desp > abecedario.length) {// Condicional en caso de que al desplazarse lleguemos o
																// sobrepasemos la z.
						posicion = contador2 + desp - abecedario.length;// Si sobrepasamos la z indicamos que reste el
																		// length de abecedario para que empiece desde a
																		// de nuevo.
					} else {// Condicional en caso de no llegar a z.
						posicion = contador2 + desp;// Al no llegar a z solo sumamos a la posicion del array de
													// abecedario el desplazamiento solicitado para encontrar la letra
													// correcta del cifrado.
					}
					contCifrada[contador] = abecedario[posicion];// Guardamos la letra del cifrado en la posicion
																	// indicada de contCifrada.
				}
				contador2++;// Añadimos 1 al contador2 para ir teniendo la posición exacta de abecedario en
							// cada iteración del for de diccionario.
			}
			contador++;// Añadimos 1 al contador para ir teniendo la posición exacta de contCifrada en
						// cada iteración del for de contOriginal.
		}
		System.out.println("Contraseña cifrada correctamente.");// Indicamos que ha sido todo cifrado, esperamos
																// confirmación y limpiamos pantalla.
		confirmar();
		limpiar_pantalla();
	}

	public static void mostrarContCifrada() {
		if (contCifrada == null) {
			System.out.println("Por favor primero introduce una contraseña.");
		} else {
			System.out.println("La contraseña cifrada es: ");
			for (char c : contCifrada) {
				System.out.print(c);
			}
			System.out.println(" ");
		}
		confirmar();
	}

	public static void mostrarContOriginal() {// Metodo para mostrar la contraseña introducida por terminal, en
												// aplicación final no entregar. Esperamos confirmación y limpiamos
												// pantalla.
		System.out.println("La contraseña original es: " + contInt);
		confirmar();
		limpiar_pantalla();
	}

	public static void mostrarDesplazamiento() {// Metodo para mostrar el desplazamiento escogido, esperamos
												// confirmación y limpiamos pantalla.
		System.out.println("El desplazamiento utilizado ha sido el: " + desp);
		confirmar();
		limpiar_pantalla();
	}

}
