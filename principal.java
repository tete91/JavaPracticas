package cifradocesar;

public class principal {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Esta aplicación va a recepcionar una palabra por terminal y cifrarla mediante
		// el cifrado cesar, y mostrarla y descifrarla.
		do {// Bucle que iterará mientras no se escoja la opción 5 del menú.
			menus.opcion = menus.mostrar_menu_principal();// Indicamos que el valor de opcion es el que devuelva el
															// metodo mostrar menú.
			switch (menus.opcion) {// Switch con las opciones del menú.
			case 1: {// Caso 1, limpiamos pantalla y llamamos a cifrar.
				metodos.limpiar_pantalla();
				metodos.cifrar();
				break;
			}
			case 2: {// Caso 2, limpiamos pantalla y llamamos a mostrar el desplazamiento escogido
						// para el cifrado.
				metodos.limpiar_pantalla();
				metodos.mostrarDesplazamiento();
				break;
			}
			case 3: {// Caso 3, limpiamos pantalla y llamamos a mostrar la contraseña cifrada con el
						// desplazamiento escogido.
				metodos.limpiar_pantalla();
				metodos.mostrarContCifrada();
				break;
			}
			case 4: {// Caso 4, limpiamos pantalla y mostramos la contraseña original.
				metodos.limpiar_pantalla();
				metodos.mostrarContOriginal();
				break;
			}
			case 5: {// Caso 5, salimos del programa.
				System.out.println("Adiós usuario.");
				break;
			}
			default: {// Defaults, indicamos que no es un valor válido del menú, limpiamos pantalla y
						// mandamos a volver a introducir opción.
				System.out.println("La opcion no es valida!!!!!");
				System.out.println("Pulse ENTER para continuar ...");
				metodos.scanner.nextLine();// Esperamos confirmación
				metodos.limpiar_pantalla();
			}
			}
		} while (menus.opcion != 5);
	}
}
