package cifradocesar;

public class menus {
	public static int opcion;// Variable para almacenar la opcion escogida del menú.

	public static int mostrar_menu_principal() {// Metodo con el menú principal, sus opciones, lectura de la opcion
		// introducida por escaner y retorno del int de la misma al main.
		metodos.limpiar_pantalla();// Limpiamos pantalla.
		System.out.println("+----------- Menú Principal -----------+");
		System.out.println("+                                      +");
		System.out.println("+  1.- Cifrar. 	                       +");
		System.out.println("+  2.- Ver Desplazamiento.             +");
		System.out.println("+  3.- Ver Clave Cifrada.              +");
		System.out.println("+  4.- Ver Clave Original.             +");
		System.out.println("+  5.- Salir.                          +");
		System.out.println("+                                      +");
		System.out.println("+--------------------------------------+");
		System.out.println("Dame una opción: ");
		opcion = metodos.scanner.nextInt();// Leemos la opcion introducida por terminal.
		metodos.scanner.nextLine();// Limpiamos buffer.
		return opcion;// Devolvemos el valor introducido.
	}
}
