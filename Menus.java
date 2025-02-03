import java.util.Scanner;

public class Menus {// Creamos una clase para contener todos los menus y no tener saturado el main
	private static int opcion1 = 0;// Variable para las opciones de los submenus del menu principal.
	private static int opcion2 = 0;// Variable para las opciones de los submenus de los submenus del menu
									// principal.
	private static Scanner lector = new Scanner(System.in);// Inicializamos un scanner para utilizarlo en los menús.

	public static void mostrar_default() {// Metodo para indicar en los default de los menús.
		System.out.println("La opcion no es valida!!!!!");
		System.out.println("Pulse ENTER para continuar ...");
		lector.nextLine();// Esperamos confirmación
		Metodos.limpiar_pantalla();// Limpiamos pantalla
	}

	public static int mostrar_menu_autor() {// Metodo con el menú de la seccion de autor, mismas condiciones que el
		Metodos.limpiar_pantalla(); // principal.
		int opcion;
		System.out.println("+----------- Menú Autor -----------+");
		System.out.println("+                                  +");
		System.out.println("+  1.- Insertar Autor.             +");
		System.out.println("+  2.- Consultar Autor.            +");
		System.out.println("+  3.- Modificar Autor.            +");
		System.out.println("+  4.- Eliminar Autor.             +");
		System.out.println("+  5.- Menú Principal.             +");
		System.out.println("+                                  +");
		System.out.println("+----------------------------------+");
		System.out.println("Dame una opción: ");
		opcion = lector.nextInt();
		lector.nextLine();
		return opcion;
	}

	public static int mostrar_menu_editorial() {// Metodo con el menú de la seccion de la editorial, mismas condiciones
		Metodos.limpiar_pantalla(); // que el principal.
		int opcion;
		System.out.println("+----------- Menú Editorial -----------+");
		System.out.println("+                                  +");
		System.out.println("+  1.- Insertar Editorial.             +");
		System.out.println("+  2.- Consultar Editorial.            +");
		System.out.println("+  3.- Modificar Editorial.            +");
		System.out.println("+  4.- Eliminar Editorial.             +");
		System.out.println("+  5.- Menú Editorial.             +");
		System.out.println("+                                  +");
		System.out.println("+----------------------------------+");
		System.out.println("Dame una opción: ");
		opcion = lector.nextInt();
		lector.nextLine();
		return opcion;
	}

	public static int mostrar_menu_libro() {// Metodo con el menú de la seccion de libro, mismas condiciones que el
		Metodos.limpiar_pantalla(); // principal.
		int opcion;
		System.out.println("+----------- Menú Libro -----------+");
		System.out.println("+                                  +");
		System.out.println("+  1.- Insertar Libro.             +");
		System.out.println("+  2.- Consultar Libro.            +");
		System.out.println("+  3.- Modificar Libro.            +");
		System.out.println("+  4.- Eliminar Libro.             +");
		System.out.println("+  5.- Menú Principal.             +");
		System.out.println("+                                  +");
		System.out.println("+----------------------------------+");
		System.out.println("Dame una opción: ");
		opcion = lector.nextInt();
		lector.nextLine();
		return opcion;
	}

	public static int mostrar_menu_consultar_autor() {// Metodo con el menú de la seccion de consultar autor, mismas
		Metodos.limpiar_pantalla(); // condiciones que el principal.
		int opcion;
		System.out.println("+------- Menú Consultar Autor -----+");
		System.out.println("+                                  +");
		System.out.println("+  1.- Listar Autores.             +");
		System.out.println("+  2.- Consultar Autor por id.     +");
		System.out.println("+  3.- Menú Autor.                 +");
		System.out.println("+----------------------------------+");
		System.out.println("Dame una opción: ");
		opcion = lector.nextInt();
		lector.nextLine();
		return opcion;
	}

	public static int mostrar_menu_consultar_editorial() {// Metodo con el menú de la seccion de consultar editorial,
		Metodos.limpiar_pantalla(); // mismas condiciones que el principal.
		int opcion;
		System.out.println("+------- Menú Consultar Editorial -----+");
		System.out.println("+                                  +");
		System.out.println("+  1.- Listar Editoriales.             +");
		System.out.println("+  2.- Consultar Editorial por id.     +");
		System.out.println("+  3.- Menú Editorial.                 +");
		System.out.println("+----------------------------------+");
		System.out.println("Dame una opción: ");
		opcion = lector.nextInt();
		lector.nextLine();
		return opcion;
	}

	public static int mostrar_menu_consultar_libro() {// Metodo con el menú de la seccion de consultar libro, mismas
		Metodos.limpiar_pantalla(); // condiciones que el principal.
		int opcion;
		System.out.println("+------- Menú Consultar Libro -----+");
		System.out.println("+                                  +");
		System.out.println("+  1.- Listar Libros.             +");
		System.out.println("+  2.- Consultar Libro por id.     +");
		System.out.println("+  3.- Menú Libro.                 +");
		System.out.println("+----------------------------------+");
		System.out.println("Dame una opción: ");
		opcion = lector.nextInt();
		lector.nextLine();
		return opcion;
	}

	public static void menu_autor() {// Metodo con el menu de autor
		do {// Bucle do-while que iterara hasta que el usuario decida salir con la opcion 5.
			opcion1 = mostrar_menu_autor();// Llamamos a la pantalla del menu autor y recogemos la opcion escogida.
			switch (opcion1) {// Switch con las opciones del menu autor.
			case 1: {// Añadir autor.
				Metodos.anadir_autor();// Metodo para añadir autor.
				break;
			}
			case 2: {// Consultar autores.
				opcion2 = 0;// Reinicializamos variable antes de pedir un numero a consultar
				do {// Bucle do-while que iterara hasta que el usuario decida salir con la opcion 3.
					opcion2 = mostrar_menu_consultar_autor();// Llamamos a la pantalla del menu consultar autor y
																// recogemos la opcion escogida.
					switch (opcion2) {// Switch con las opciones del menu autor.
					case 1: {// Listamos todos los autores almacenados.
						Metodos.listar_autores(Metodos.autores, Metodos.contador_autores);// Metodo para listar autores
						break;
					}
					case 2: {// Consultar autores por su id.
						System.out.println("Dame la id del autor a consultar: ");
						Metodos.buscar_autor_por_id(Metodos.autores, Metodos.contador_autores, Metodos.id_autor);// Metodo
																													// para
																													// listar
																													// autores.
						break;
					}
					case 3: {// Volvemos al menu autores
						break;
					}
					default: {
						mostrar_default();// Metodo con el aviso del default.
					}
					}
				} while (opcion2 != 3);
				break;
			}
			case 3: {// Modificacion de un autor.
				System.out.println("Dame el id del autor a modificar: ");
				Metodos.modificar_autor_por_id(Metodos.autores, Metodos.contador_autores, Metodos.id_autor);// Metodo
																											// para
																											// modificar
																											// un
																											// el autor
																											// por id.
				break;
			}
			case 4: {// Eliminación de un autor.
				System.out.println("Dame la id del autor a eliminar: ");
				Metodos.eliminar_autor_por_id(Metodos.autores, Metodos.contador_autores, Metodos.id_autor,
						Metodos.libros);// Metodo para eliminar autor un por id.
				break;
			}
			case 5: {// Salimos al menú principal.
				break;
			}
			default: {
				mostrar_default();
			}
			}
		} while (opcion1 != 5);
	}

	public static void menu_editorial() {// Metodo con el menu editorial.
		do {// Bucle do-while que iterara hasta que el usuario decida salir con la opcion 5.
			opcion1 = mostrar_menu_editorial();// Llamamos a la pantalla del menu editorial y recogemos la opcion
												// escogida.
			switch (opcion1) {// Switch con las opciones del menu autor.
			case 1: {// Añadir editorial.
				Metodos.anadir_editorial();// Metodo para añadir editorial.
				break;
			}
			case 2: {// Consultar editoriales.
				opcion2 = 0;// Reinicializamos variable antes de pedir un numero a consultar
				do {// Bucle do-while que iterara hasta que el usuario decida salir con la opcion 3.
					opcion2 = mostrar_menu_consultar_editorial();// Llamamos a la pantalla del menu consultar editorial
																	// y
																	// recogemos la opcion escogida.
					switch (opcion2) {// Switch con las opciones del menu editorial.
					case 1: {// Listamos a todas las editoriales almacenadas.
						Metodos.listar_editoriales(Metodos.editoriales, Metodos.contador_editoriales);// Metodo para
																										// listar
																										// editoriales.
						break;
					}
					case 2: {// Consultar editorial por su id.
						System.out.println("Dame la id de la editorial a consultar: ");
						Metodos.buscar_editorial_por_id(Metodos.editoriales, Metodos.contador_editoriales,
								Metodos.id_editorial);// Metodo para listar editoriales por id.
						break;
					}
					case 3: {// Volvemos al menu editoriales.
						break;
					}
					default: {
						mostrar_default();// Metodo con el aviso del default.
					}
					}
				} while (opcion2 != 3);
				break;
			}
			case 3: {// Modificacion de una editorial.
				System.out.println("Dame el id de la editorial a modificar: ");
				Metodos.modificar_editorial_por_id(Metodos.editoriales, Metodos.contador_editoriales,
						Metodos.id_editorial);// Metodo para modificar una editorial por id.
				break;
			}
			case 4: {// Eliminacion de una editorial.
				System.out.println("Dame la id de la editorial a eliminar: ");
				Metodos.eliminar_editorial_por_id(Metodos.editoriales, Metodos.contador_editoriales,
						Metodos.id_editorial, Metodos.libros);// Metodo para eliminar una editorial por id.
				break;
			}
			case 5: {// Salimos al menú principal.
				break;
			}
			default: {
				mostrar_default();// Metodo con el aviso del default.
			}
			}
		} while (opcion1 != 5);

	}

	public static void menu_libro() {// Metodo con el menu libro.
		do {// Bucle do-while que iterara hasta que el usuario decida salir con la opcion 5.
			opcion1 = mostrar_menu_libro();// Llamamos a la pantalla del menu libro y recogemos la opcion escogida.
			switch (opcion1) {// Switch con las opciones del menu libro.
			case 1: {// Añadir libro.
				Metodos.anadir_libro();// Metodo para añadir libro.
				break;
			}
			case 2: {// Consultar libros.
				opcion2 = 0;// Reinicializamos variable antes de pedir un numero a consultar
				do {// Bucle do-while que iterara hasta que el usuario decida salir con la opcion 3.
					opcion2 = mostrar_menu_consultar_libro();// Llamamos a la pantalla del menu consultar libro y
																// recogemos la opcion escogida.
					switch (opcion2) {// Switch con las opciones del menu libro.
					case 1: {// Listamos los libros almacenador.
						Metodos.listar_libros(Metodos.libros, Metodos.contador_libros);// Metodo para listar los libros.
						break;
					}
					case 2: {// Consultar libro por su id.
						System.out.println("Dame la id del libro a consultar: ");
						Metodos.buscar_libro_por_id(Metodos.libros, Metodos.contador_libros, Metodos.id_libros);// Metodo
																												// para
																												// listar
																												// libros
																												// por
																												// id.
						break;
					}
					case 3: {// Volvemos al menu libros.
						break;
					}
					default: {
						mostrar_default();// Metodo con el aviso del default.
					}
					}
				} while (opcion2 != 3);
				break;
			}
			case 3: {// Modificacion de un libro.
				System.out.println("Dame el id del libro a modificar: ");
				Metodos.modificar_libro_por_id(Metodos.libros, Metodos.contador_libros, Metodos.id_libros,
						Metodos.autores, Metodos.editoriales);// Metodo para modificar una editorial por id.
				break;
			}
			case 4: {// Eliminación de un libro.
				System.out.println("Dame la id del libro a eliminar: ");
				Metodos.eliminar_libro_por_id(Metodos.libros, Metodos.contador_libros, Metodos.id_libros);// MEtodo para
																											// eliminar
																											// un libro
																											// por id.
				break;
			}
			case 5: {// Salimos al menú principal.
				break;
			}
			default: {
				mostrar_default();// MEtodo con el aviso del default.
			}
			}
		} while (opcion1 != 5);

	}
}
