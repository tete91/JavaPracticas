import java.util.Scanner;

public class principal {
	private static Scanner lector = new Scanner(System.in);// Inicializamos un scanner para utilizarlo en los menús.
	private static int opcion = 0;// Variable para las opciones del menu principal.

	public static int mostrar_menu_principal() {// Metodo con el menú principal, sus opciones, lectura de la opcion
												// introducida por escaner y retorno del int de la misma al main.
		Metodos.limpiar_pantalla();
		System.out.println("+----------- Menú Principal -----------+");
		System.out.println("+                                      +");
		System.out.println("+  1.- Autores.                        +");
		System.out.println("+  2.- Libros.                         +");
		System.out.println("+  3.- Editorial.                      +");
		System.out.println("+  4.- Salir.                          +");
		System.out.println("+                                      +");
		System.out.println("+--------------------------------------+");
		System.out.println("Dame una opción: ");
		opcion = lector.nextInt();
		lector.nextLine();
		return opcion;
	}

	public static void main(String[] args) {
		do {// Bucle do-while que iterara nada mas arrancar y hasta que el usuario decida
			// salir utilizando la opcion 4.
			opcion = mostrar_menu_principal();// Llamamos a la pantalla del menu principal y leemos la opcion escogida
			switch (opcion) {// Switch con las opciones del menu principal.
			case 1: {// Sección autores.
				Menus.menu_autor();// Llamamos al menu autor.
				break;
			}
			case 2: {// Seccion libros
				Menus.menu_libro();// Llamamos al menu libro.
				break;
			}
			case 3: {// Seccion editoriales
				Menus.menu_editorial();// Llamamos al menu editorial.
				break;
			}

			case 4: {// Salir del programa
				System.out.println("Adiós usuario.");
				break;
			}
			default: {
				Menus.mostrar_default();// Metodo con el aviso del default.
			}
			}
		} while (opcion != 4);
		lector.close();
	}
}
