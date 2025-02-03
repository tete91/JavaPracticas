package juegoAhorcado;

import java.util.Random;
import java.util.Scanner;
//Programa con el juego del ahorcado
public class main {
	//Inicializamos variables que queremos utilizar en varias funciones o sitios del codigo.
	public static int opcion;//Recogera la opcion seleccionada del menu
	public static int contadorPalabras;//Recogera cuantas palabras hemos introducido en el diccionario
	public static int tamanoDiccionario;//Indicara el tamaño maximo del diccionario
	public static String[] diccionario;//Array del diccionario del juego
	public static boolean palUnica;//Indicara si la palabra es unica o no
	public static String palInt;//Contendrá la palabra introducida antes de enviarla al array
	static Scanner scanner = new Scanner(System.in);//Escaner para la entrada de datos

	public static int menu() {// Funcion con el menu del programa, lectura del valor seleccionado para el
								// mismo y retorno de la opcion.
		System.out.println("+-----------------------------------+");
		System.out.println("+ 1 Llenar diccionario              +");
		System.out.println("+ 2 Comenzar a jugar                +");
		System.out.println("+ 3 Modificar diccionario           +");
		System.out.println("+ 4 Eliminar palabra diccionario    +");
		System.out.println("+ 5 Listar diccionario              +");
		System.out.println("+ 6 Salir                           +");
		System.out.println("+-----------------------------------+");
		System.out.println("Dame una opcion:                     ");
		opcion = scanner.nextInt();
		scanner.nextLine();
		return opcion;
	}

	public static void limpiar_pantalla() {// Funcion para simular un limpiado de pantalla
		for (int i = 0; i < 300; i++) {// Bucle que itera 300 saltos de linea
			System.out.println("");
		}
	}

	public static void tamanoDiccionario() {//Funcion para inicializar el array en el tamaño escogido en esta funcion
		System.out.println("Usuario por favor introduzca cuantas palabras va a introducir en el diccionario: ");
		tamanoDiccionario = scanner.nextInt();
		scanner.nextLine();
		diccionario = new String[tamanoDiccionario];
	}

	public static void llenarDiccionario() {//Funcion para llenar el diccionario a utilizar en el juego
		int contador = 0;//Variable contador
		boolean huecoEncontrado;//Indicara si ha encontrado hueco libre o no
		if (contadorPalabras == tamanoDiccionario) {//Condicional en el caso de array lleno
			System.out.println("Usuario el array esta lleno de datos!");
			System.out.println("Por favor, elimina antes una palabra para poder insertar otra");
			System.out.println("Pulsa ENTER para continuar ...");
			scanner.nextLine();
		} else {//Si no esta lleno el array imprime mensaje
			System.out.println("A continuación introduzca las palabras a insertar en el diccionario.");
		}
		while (contadorPalabras < tamanoDiccionario) {//Bucle mientras queden huecos libres en el array por rellenar
			do {//Bucle mientras la palabra este répetida en el array, intentandolo almenos una vez
				System.out.println("Inserte la palabra: ");
				palInt = scanner.nextLine().toUpperCase();//Recogemos la palabra a comprobar
				palUnica = true;//Inicializamos en true hasta demostrar lo contrario
				contador = 0;
				for (contador = 0; contador < contadorPalabras && palUnica; contador++) {//Bucle para recorrer todas las palabras ya introducidad
					if (diccionario[contador].equals(palInt)) {//Condicional si coincide la palabra introducia con alguna introducida con anterioridad
						palUnica = false;//Al coincidir, pasa a false
						System.out.println("La palabra ya ha sido insertada con anterioridad, pruebe con otra.");
					}
				}
			} while (!palUnica);//Salimos tras comprobar que no esta repetido en ninguna posicion
			contador = 0;//Reinicializamos contador para reutilizarlo
			huecoEncontrado = false;//Inicializamos en false hasta demostrar lo contrario
			while (contador < tamanoDiccionario && !huecoEncontrado) {//Bucle hasta recorrer todo el array excepto que encuentre hueco
				if (diccionario[contador] == ".") {//Condicional si encuentra "." es que hay hueco libre
					diccionario[contador] = palInt;//Guarda la palabra introducida en el hueco del array
					huecoEncontrado = true;//Indicamos que ha encontrado hueco
				}
				contador++;//Incrementamos contador para siguiente iteracion.
			}
			if (!huecoEncontrado) {//Condicional si no ha encontrado hueco
				diccionario[contadorPalabras] = palInt;//Guardamos la palabra en el ultimo espacio libre del array
			}
			contadorPalabras++;//Sumamos 1 al contador de palabras ya introducidas.
		}
	}

	public static void modificarPalabra() {
		int contador = 0;//Inicializamos el contador generico 
		boolean palabraEncontrada = false;//Inicializamos en false hasta demostrar lo contrario y servira para indicar si se ha encontrado la palabra en el array
		boolean palabraUnica;//Indicara si la palabra es unica o no
		String palabraModificar;//Contendrá la palabra del array que queremos modificar
		String palabraNueva;//Contendra la palabra a introducir en el array
		do {//Bucle mientras no encuentre una palabra
			System.out.println("Inserte la palabra a modificar: ");
			palabraModificar = scanner.nextLine().toUpperCase();//Leemos la palabra que queremos buscar y modificar
			palabraEncontrada = false;//Inicializamos en false hasta demostrar lo contrario
			while (contador < tamanoDiccionario && !palabraEncontrada) {//Bucle mientras recorremos array y no encontremos la palabra
				if (diccionario[contador].equals(palabraModificar)) {//Condicional si las palabras coinciden
					palabraEncontrada = true;//Al coincidir lo indicamos en el boolean
				} else {//Al no encontrarla incrementamos contador para volver a iterar
					contador++;
				}
			}
			if (!palabraEncontrada) {//Al no encontrar la palabra en todo el array lo indicamos asi por terminal
				System.out.println("La palabra a modificar no se encuentra en el diccionario, vuelva a intentarlo.");
			}
		} while (!palabraEncontrada);//Salimos al encontrar la palabra en el array
		do {//Bucle mientras la palabra este repetida con almenos una iteracion de comprobacion
			System.out.println("Inserte la nueva palabra para reemplazar: ");
			palabraNueva = scanner.nextLine().toUpperCase();//Almacenamos la palabra que queremos introducir al array
			palabraUnica = true;//Indicamos que es unica hasta demostrar lo contrario
			contador = 0;//Reinicializamos el contador
			while (contador < tamanoDiccionario && palabraUnica) {//Bucle mientras recorre el diccionario y la palabra sea "unica"
				if (diccionario[contador].equals(palabraNueva)) {//Si las palabras coinciden, lo indicamos asi al boolean y por terminal
					palabraUnica = false;
					System.out.println(
							"La palabra introducida ya se encuentra en la base de datos, por favor introduzca una nueva palabra.");
				}
				contador++;//Incrementamos iteracion
			}
		} while (!palabraUnica);//Al ser unica salimos
		diccionario[contador - 1] = palabraNueva;//Guardamos la palabra en el array en la posicion anterior a contador, ya que lo sumabamos al final del bucle tras comprobar
		//Indicamos que hemos tenido exito y esperamos confirmacion para volver la menu
		System.out.println("La palabra ha sido modificada correctamente.");
		System.out.println("Por favor presione ENTER para continuar: ");
		scanner.nextLine();
	}

	public static void eliminarPalabra() {// Funcion para eliminar un autor introducido previamente
		limpiar_pantalla();
		System.out.println("Dame la palabra a eliminar: ");
		String palabraEliminar = scanner.next().toUpperCase();// Variable para guardar la palabra a eliminar
		boolean encontrado = false;// Variable que devolvera si ha encontrado o no la palabra, inicializada en false hasta encontrarla
		int contador = 0;// Variable que hara de contador para recorrer el array
		while (!encontrado && contador < contadorPalabras) {// Bucle que iterara mientras no encuentre la palabra y queden
															// huecos rellenos del array a revisar
			if (diccionario[contador].equals(palabraEliminar)) {// Si encuentra la palabra cambia el boolean a true
				encontrado = true;
			} else {// Si no lo encuentra añade 1 al contador para volver a iterar
				contador++;
			}
		}
		if (!encontrado) {// Si despues de revisar todo el array sigue sin encontrar la palabra damos
						  // informacion y salimos a menu
			System.out.println("Usuario la palabra proporcionada no esta almacenada!");
			System.out.println("Pulsa ENTER para continuar ...");
			scanner.nextLine();
		} else {// Si despues de revisar el array encuentra la palabra añade "." a la posicion donde estaba la palabra para dejarla
				// "borrada" y salimos a menu
			diccionario[contador] = ".";
			System.out.println("Palabra eliminada correctamente!!!");
			System.out.println("Pulsa ENTER para continuar ....");
			scanner.nextLine();
			contadorPalabras--;//Quitamos 1 al contador de palabras para que deje introducir en la funcion añadir palabras
		}
	}

	public static void listarDiccionario() {// Funcion para listar los autores introducidos previamente
		if (contadorPalabras == 0) {// Condicional si aun no se han introducido autores, damos informacion y salimos
									// a menu.
			// Significa que no hay datos para listar.
			limpiar_pantalla();
			System.out.println("Usuario no hay datos para mostrar!!!");
			System.out.println("Inserta una palabra para poder listar");
			System.out.println("Pulsa ENTER para continuar ...");
			scanner.nextLine();
		} else {// Condicional que aplica si hay palabras introducidos
			int contador = 0;// Variable contador para mostrar el id a listar en la posicion indicada del
								// array
			do {// Bucle que iterara almenos una vez y mientras queden huecos del array por
				// recorrer.
				if (diccionario[contador] != ".") {// Condicional que aplica mientras ese hueco no este borrado, damos
													// la
													// informacion del contenido de la posicion en cada array.
					System.out.print(diccionario[contador] + " ");

				}
				contador++;// Incrementamos al posicion del array a consultar
			} while (contador < tamanoDiccionario);
			System.out.println("Pulsa ENTER para continuar ....");
			scanner.nextLine();
		}
	}

	public static void jugarAhorcado() {
		//Imprimimos informacion del juego
		System.out.print("Vamos a jugar una partida nueva del ahorcado.");
		System.out.print("Debes adivinar las letras que componen una palabra,");
		System.out.println(" tienes como maximo 5 fallos.");
		System.out.println("Presione ENTER para comenzar a jugar:");
		scanner.nextLine();
		Random ran = new Random();//Creamos una variable random
		int palJugada = ran.nextInt(diccionario.length);//Guardamos una palabra random del diccionario en la variable
		int contador = 0;//contador generico
		int contJugada = 0;//Contador qpara las jugadas con fallo realizadas
		int contCharRestantes = 0;//Contador de char restantes a descubrir
		char charInt;//Variable para recoger el caracter introducido por terminal
		boolean encontrado;//Boolean para si encuentra el char en la palabra oculta
		char[] palEscondida = new char[diccionario[palJugada].length()];//Array con la longitud de la palabra a adivinar
		for (contador = 0; contador < diccionario[palJugada].length(); contador++) {//Bucle para rellenar el array con cada char de la palabra a adivinar
			palEscondida[contador] = diccionario[palJugada].charAt(contador);
		}
		char[] palEnJuego = new char[palEscondida.length];//Array con la longitud en char de la palabra escondida
		for (int contChar = 0; contChar < palEscondida.length; contChar++) {//Bucle para por cada char añadir un _
			palEnJuego[contChar] = '_';
		}
		System.out.println("La palabra a acertar es: ");
		contCharRestantes = palEscondida.length;//Inicializamos las letras restantes a la longitud de la palabra
		for (int contChar = 0; contChar < palEscondida.length; contChar++) {//Bucle para recorrer el array de char enseñando su valor
			System.out.print(palEnJuego[contChar] + " ");
		}
		//Comienza el juego de verdad
		while (contCharRestantes > 0 && contJugada < 5) {//Bucle mientras queden letras por descubrir o intentos
			System.out.println();//Dejamos espacio para no apelotonar codigo
			System.out.println("Introduce una letra:");
			charInt = scanner.next().toUpperCase().charAt(0);//Leemos la letra del intento por terminal
			encontrado = false;//Inicializamos en false hasta demostrar lo contrario
			for (int contChar = 0; contChar < palEscondida.length; contChar++) {//Bucle para recorrer todos los char de la palabra
				if (charInt == palEscondida[contChar]) {//Condicional si encuentra el char almacenado
					palEnJuego[contChar] = charInt;//Cambiamos el _ por el valor de char introducido
					encontrado = true;//Indicamos que hemos encontrado el char
					contCharRestantes--;//Restamos un char restantes por cada letra encontrada
				}
			}
			if (!encontrado) {//Si no hemos encontrado agregamos un fallo al contador
				contJugada++;
			}
			System.out.println("La letra introducida es: " + charInt + " y llevas " + contJugada + " fallos.");//Indicamos la letra introducida, y los fallos acumulados
			for (int contChar = 0; contChar < palEscondida.length; contChar++) {//Bucle para recorrer todos los char de la palabra
				System.out.print(palEnJuego[contChar] + " ");//Imprimimos el valor de char por terminal con " " para no apelotonar y ver las letras acertadas y faltantes
			}
		}
		System.out.println();//Dejamos espacio para no apelotonar hueco
		if (contCharRestantes == 0 && contJugada < 5) {//Condicional si no has agotado los fallos y has encontrado todos los char
			System.out.println("Enhorabuena, has ganado.");//Indicamos la victoria
		} else {//Al no haber encontrado todos los char y agotado los fallos
			System.out.println("Lo siento has perdido, comienza una nueva partida.");//Indicamos el GAME OVER
		}
		//Solicitamos confirmacion y volvemos a menu
		System.out.println("Pulsa ENTER para volver al menu ...");
		scanner.nextLine();//Limpiamos bufer para limpiarlo solo una vez tras tanta lectura diferente de cadena
		scanner.nextLine();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean datosIntroducidos = false;//Boolean para indicar si ya hemos indicado el tamaño del diccionario
		do {// Bucle mientras no se indique un 6 para salir y que itera minimo 1 vez
			// haciendo escoger algo del menu
			menu();// Llamamos al menu
			switch (opcion) {// Leemos la opcion y escogemos caso
			case 1: {//Llenamos el diccionario con su funcion y en caso de no haber decidido tamaño del diccionario lo hacemos tambien y despues indicamos que lo hemos hecho.
				limpiar_pantalla();
				if (datosIntroducidos == false) {
					tamanoDiccionario();
				}
				llenarDiccionario();
				datosIntroducidos = true;
				break;
			}
			case 2: {//Jugamos partida
				jugarAhorcado();
				break;
			}
			case 3: {//Modificamos alguna palabra del diccionario
				modificarPalabra();
				break;
			}
			case 4: {//"Eliminamos" una palabra del diccionario
				eliminarPalabra();
				break;
			}
			case 5: {//Listamos el diccionario
				listarDiccionario();
				break;
			}
			case 6: {//Salimos del programa
				break;
			}
			default: {// Al no esoger opcion correcta lo indicamos y solicitamos una correcta de nuevo
				System.out.println("Usuario, una opcion entre 1-6");
				System.out.println("Pulsa ENTER para continuar ...");
				scanner.nextLine();
				break;
			}
			}
		} while (opcion != 6);
	}
}
