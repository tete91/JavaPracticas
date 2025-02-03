import java.util.Scanner;

public class Metodos {// Clase para contener todos los metodos.
	private static Scanner lector = new Scanner(System.in);
	public static Libros[] libros = new Libros[10];
	public static Autor[] autores = new Autor[10];
	public static Editorial[] editoriales = new Editorial[10];
	public static int contador_autores = 0;// Contador para autores
	public static int contador_editoriales = 0;// Contador para editoriales
	public static int contador_libros = 0;// Contador para libros
	public static int id_autor = 0;// Variable que leera los id de autor introducidos por terminal.
	public static int id_editorial = 0;// Variable que leera los id de editorial introducidos por terminal.
	public static int id_libros = 0;// Variable que leera los id de libro introducidos por terminal.
	public static Boolean idencontrado = true;// Variable para gestionar si encontramos o no los id segun sea el caso

	public static void limpiar_pantalla() {// Metodo para simular una limpieza de pantalla.
		for (int i = 0; i < 200; i++)// Hacemos un bucle que provocará 200 saltos de linea.
			System.out.println("");
	}

	public static void anadir_autor() {// Metodo para añadir un autor
		if (contador_autores < 10) {// Condicional si queda espacio en el array.
			limpiar_pantalla();
			System.out.println("Introduce los siguientes datos para dar de alta a un autor:");
			if (contador_autores == 0) {// Condicional si no se ha insertado ningun autor.
				System.out.println("Id autor: ");
				id_autor = lector.nextInt();// Leemos id autor introducido por terminal.
				lector.nextLine();// Limpiamos buffer.
			} else {// Condicional si ya hay autores.
				System.out.println("Id autor: ");
				do {// Bucle que iterará mientras el id ya esté en el array.
					idencontrado = false;// Inicializamos en false mientras no se demuestre lo contrario.
					id_autor = lector.nextInt();// Leemos por terminal el id a introducir.
					lector.nextLine();// Limpiamos buffer
					for (Autor autor : autores) {// Bucle para comparar todos los autores almacenados.
						if (autor != null && autor.getId_autor() == id_autor) {// Condicional si no es null y el id esta
																				// repetido.
							idencontrado = true;// Indicamos que lo hemos encontrado por lo que hay que volver a iterar.
							System.out.println("El id está repetido, por favor introduce uno nuevo a continuación: ");
						}
					}
				} while (idencontrado);
			}
			System.out.println("Nombre del autor: ");
			String nombre = lector.nextLine();// Leemos el nombre del autor.
			System.out.println("Apellidos del autor: ");
			String apellidos = lector.nextLine();// Leemos los apellidos del autor.
			System.out.println("Nacionalidad del autor: ");
			String nacionalidad = lector.nextLine();// Leemos la nacionalidad del autor.
			System.out.println("Fecha de nacimiento del autor: ");
			String fecha = lector.nextLine();// Leemos la fecha de nacimiento del autor.
			autores[contador_autores] = new Autor(id_autor, nombre, apellidos, nacionalidad, fecha);// Creamos un nuevo
																									// objeto autor.
			contador_autores++;// Aumentamos en 1 el contador del array autor.
			System.out.println("Autor insertado correctamente!!!!");
			System.out.println("Pulsa ENTER para continuar ...");
			lector.nextLine();// Esperamos confirmación antes de continuar.
		} else {// Condicional en caso de no haber espacio en el array, lo indicamos y esperamos
				// confirmación.
			System.out.println("No se pueden almacenar más autores");
			System.out.println("Elimine al menos un autor para insertar otro");
			System.out.println("Pulsa ENTER para continuar ...");
			lector.nextLine();
		}
	}

	public static void anadir_editorial() {// Metodo para añadir una editorial.
		if (contador_editoriales < 10) {// Condicional si queda espacio en el array.
			limpiar_pantalla();
			System.out.println("Introduce los siguientes datos para dar de alta una editorial:");
			if (contador_editoriales == 0) {// Condicional si no se ha insertado ninguna editorial.
				System.out.println("Id editorial: ");
				id_editorial = lector.nextInt();// Leemos id editorial por terminal.
				lector.nextLine();// Limpiamos buffer
			} else {// Condicional si ya hay autores.
				do {// Bucle que iterará mientras el id ya esté en el array.
					idencontrado = false;// Inicizalizamos en false mientras no se demuestre lo contrario.
					System.out.println("Id editorial: ");
					id_editorial = lector.nextInt();// Leemos por temrinal el id a introducir.
					lector.nextLine();// Limpiamos buffer
					for (Editorial editorial : editoriales) {// Bucle para comparar todas la editoriales almacenadas.
						if (editorial != null && editorial.getId_editorial() == id_editorial) {// Condicional si no es
																								// null y la id está
																								// repetida.
							System.out.println("El id está repetido, por favor introduce uno nuevo.");
							idencontrado = true;// Indicamos que lo hemos encontrado por lo que hay que volver a iterar.
						}
					}
				} while (idencontrado);
			}
			System.out.println("Nombre de la editorial: ");
			String nombre_editorial = lector.nextLine();// Leemos el nombre de la editorial.
			System.out.println("Nacionalidad de la editorial: ");
			String nacionalidad_editorial = lector.nextLine();// Leemos la nacionalidad de la editorial.
			editoriales[contador_editoriales] = new Editorial(id_editorial, nombre_editorial, nacionalidad_editorial);// Creamos
																														// un
																														// nuevo
																														// objeto
																														// editorial.
			contador_editoriales++;// Aumentamos en 1 el contador del array editoriales.
			System.out.println("Editorial insertada correctamente!!!!");
			System.out.println("Pulsa ENTER para continuar ...");
			lector.nextLine();// Esperamos confirmación antes de continuar.
		} else {// Condicional en caso de no haber espacio en el array, lo indicamos y esperamos
				// confirmación.
			System.out.println("No se pueden almacenar más editoriales");
			System.out.println("Elimine al menos una editorial para insertar otra");
			System.out.println("Pulsa ENTER para continuar ...");
			lector.nextLine();
		}
	}

	public static void anadir_libro() {// Metodo para crear un libro.
		if (Metodos.contador_autores == 0) {// Condicional en caso de no haber ningun autor introducido aun.
			System.out.println("Por favor primero introduce un autor para poder añadir un libro. ");
			System.out.println("Pulsa ENTER para continuar ...");
			lector.nextLine();// Esperamos confirmación para continuar.
			Metodos.anadir_autor();// Llamamos al metodo añadir autor.
		}
		if (Metodos.contador_editoriales == 0) {// Condicional en caso de no haber ninguna editorial introducido aun.
			System.out.println("Por favor primero introduce una editorial para poder añadir un libro. ");
			System.out.println("Pulsa ENTER para continuar ...");
			lector.nextLine();// Esperamos confirmación para continuar.
			Metodos.anadir_editorial();// Llamamos al metodo añadir editorial.
		}
		if (Metodos.contador_libros < 10) {// Condicional si queda espacio en el array.
			limpiar_pantalla();
			System.out.println("Introduce los siguientes datos para dar de alta un libro:");
			if (Metodos.contador_libros == 0) {// Condicional en caso de no haber ningun libro introducido aun.
				System.out.println("Id libro: ");
				id_libros = lector.nextInt();// Leemos el id de libros introducido por terminal.
				lector.nextLine();// Limpiamos buffer.
			} else {// Condicional en caso de ya haber libros.
				do {// Bucle que iterará hasta que el id del libro no este en el array
					idencontrado = false;// Inicializamos en false antes de cada iteracion.
					System.out.println("Id libro: ");
					id_libros = lector.nextInt();// Leemos el id del libro introducido por terminal.
					lector.nextLine();// Limpiamos buffer
					for (Libros libro : libros) {// Bucle para comparar todos los libros almacenados.
						if (libro != null && libro.getId_libro() == id_libros) {// Condicional si no es null y la id
																				// está repetida.
							System.out.println("El id está repetido, por favor introduce uno correcto.");
							idencontrado = true; // Indicamos que lo hemos encontrador por lo que hay que volver a
													// iterar.
						}
					}
				} while (idencontrado);
			}
			idencontrado = false;// Inicializamos en false hasta demostrar si existe el id de autor.
			System.out.println("Id del autor del libro: ");
			id_autor = lector.nextInt();// Leemos el id del autor introducido por terminal
			lector.nextLine();// Limpiamos buffer
			for (Autor autor : autores) {// Bucle para comparar todos los autores del array.
				if (autor != null && autor.getId_autor() == id_autor) {// Condicional en caso de no ser null y encontrar
																		// el id.
					idencontrado = true;// Indicamos que está encontrado.
				}
			}
			if (!idencontrado) {// Condicional si el id de autor aun no existe.
				System.out.println("El id de autor introducido no existe, a continuación procederemos a añadirlo: ");
				Metodos.anadir_autor();// Llamamos al metodo añadir autor.
			}
			idencontrado = false;// Inicializamos en false hasta demostrar si existe el id de editorial.
			System.out.println("Id de la editorial del libro: ");
			id_editorial = lector.nextInt();// Leemos el id de editorial introducido por terminal.
			lector.nextLine();// Limpiamos buffer
			for (Editorial editorial : editoriales) {// Bucle para comparar todas las editoriales del array.
				if (editorial != null && editorial.getId_editorial() == id_editorial) {// Condicional en caso de no ser
																						// null y encontrar el id.
					idencontrado = true;// Indicamos que está encontrado.
				}
			}
			if (!idencontrado) {// Condicional si el id de editorial aun no existe
				System.out.println("El id de la editorial no existe, a continuación procederemos a añadirlo: ");
				Metodos.anadir_editorial();// Llamamos al metodo añadir editorial.
			}
			System.out.println("Titulo del libro: ");
			String titulo = lector.nextLine();// Leemos el titulo por terminal.
			System.out.println("Isbn: ");
			String isbn = lector.nextLine();// Leemos el isbn por terminal.
			System.out.println("Paginas: ");
			int paginas = lector.nextInt();// Leemos el numero de paginas por terminal.
			lector.nextLine();// Limpiamos buffer.
			libros[Metodos.contador_libros] = new Libros(id_libros, id_autor, id_editorial, titulo, isbn, paginas);// Creamos
																													// un
																													// nuevo
																													// objeto
																													// libro.
			Metodos.contador_libros++;// Aumentamos en 1 el contador del array libros.
			System.out.println("Libro insertado correctamente!!!!");
			System.out.println("Pulsa ENTER para continuar ...");
			lector.nextLine();// Esperamos confirmación antes de continuar.
		} else {// Condicional en caso de no haber espacio en el array, lo indicamos y esperamos
				// confirmación.
			System.out.println("No se pueden almacenar más libros");
			System.out.println("Elimine al menos un libro para insertar otro");
			System.out.println("Pulsa ENTER para continuar ...");
			lector.nextLine();
			Metodos.limpiar_pantalla();
		}
	}

	public static void listar_autores(Autor[] a, int i) {// Metodo para listar autores.
		if (contador_autores == 0) {// Condicional si no hay autores, lo indicamos y esperamos confirmación.
			System.out.println("No hay autores insertados para listar!.");
			System.out.println("Introduce al menos un autor para listar!.");
			System.out.println("Pulsa ENTER para continuar ...");
			lector.nextLine();
		} else {// Condicional si hay autores.

			for (int n = 0; n < i; n++) {// Bucle para recorrer todo el array.
				limpiar_pantalla();
				if (a[n].getId_autor() != 0) {// Condicional si el id autor es diferente a 0.
					System.out.println("Datos autor " + (n + 1) + ": " + a[n].toString());
					System.out.println("Pulsa ENTER para continuar ...");
					lector.nextLine();

				}
			}
		}
	}

	public static void listar_editoriales(Editorial[] a, int i) {// Metodo para listar editoriales.
		if (contador_editoriales == 0) {// Condicional si no hay editoriales, lo indicamos y esperamos confirmación.
			System.out.println("No hay editoriales insertadas para listar!.");
			System.out.println("Introduce al menos ua editorial para listar!.");
			System.out.println("Pulsa ENTER para continuar ...");
			lector.nextLine();
		} else {// Condicional si hay editoriales.
			for (int n = 0; n < i; n++) {// Bucle para recorrer todo el array.
				limpiar_pantalla();
				if (a[n].getId_editorial() != 0) {// Condicional si el id editorial es diferente a 0.
					System.out.println("Datos editorial " + (n + 1) + " " + a[n].toString());
					System.out.println("Pulsa ENTER para continuar ...");
					lector.nextLine();
				}
			}
		}
	}

	public static void listar_libros(Libros[] a, int i) {// Metodo para listar libros.
		if (contador_libros == 0) {// Condicional si no hay libros, lo indicamos y esperamos confirmación.
			System.out.println("No hay libros insertados para listar!.");
			System.out.println("Introduce al menos un libro para listar!.");
			System.out.println("Pulsa ENTER para continuar ...");
			lector.nextLine();
		} else {// Condicional si hay libros.
			for (int n = 0; n < i; n++) {// Bucle para recorrer todo el array.
				limpiar_pantalla();
				if (a[n].getId_libro() != 0) {// Condicional si el id libro es diferente a 0.
					System.out.println("Datos libro " + (n + 1) + " " + a[n].toString());
					System.out.println("Pulsa ENTER para continuar ...");
					lector.nextLine();
				}
			}
		}
	}

	public static void buscar_autor_por_id(Autor[] a, int i, int id) {// Metodo para buscar autor por id.
		if (contador_autores == 0) {// Condicional en caso de no haber autores almacenados, lo indicamos y esperamos
									// confirmación.
			System.out.println("No hay autores almacenados.");
			System.out.println("Pulsa ENTER para continuar...");
			lector.nextLine();
			limpiar_pantalla();
		} else {// Si hay autores almacenados.
			do {// Bucle que iterará mientras no se encuentre el id introducido.
				idencontrado = false;// Inicializamos en false mientras no se demuestre lo contrario.
				id_autor = lector.nextInt();// Leemos el id introducido por terminal.
				lector.nextLine();// Limpiamos buffer
				for (Autor autor : a) {// Bucle que compara todos los autores del array.
					if (autor != null && autor.getId_autor() != id_autor) {// Condicional si no es null y no existe el
																			// id.
						System.out.println("El id no está almacenado, por favor introduce uno nuevo a continuación: ");
					}
					if (autor != null && autor.getId_autor() == id_autor) {// Condicional si no es null y el id está en
																			// el array.
						// Mostramos los datos relacionados al id, esperamos confirmación e indicamos
						// que ha sido encontrado.
						System.out.println("Los datos del autor con id " + id_autor + " son:");
						System.out.println(autor.toString());
						System.out.println("Pulsa ENTER para continuar ...");
						lector.nextLine();
						limpiar_pantalla();
						idencontrado = true;
					}
				}
			} while (!idencontrado);
		}
	}

	public static void buscar_editorial_por_id(Editorial[] a, int i, int id) {// Metodo para buscar editorial por id.
		if (contador_editoriales == 0) {// Condicional en caso de no haber editoriales almacenadas, lo indicamos y
										// esperamos confirmación.
			System.out.println("No hay editoriales almacenadas.");
			System.out.println("Pulsa ENTER para continuar...");
			lector.nextLine();
			limpiar_pantalla();
		} else {// Si hay editoriales almacenadas.
			do {// Bucle que iterará mientras no se encuentre el id introducido.
				idencontrado = false;// Inicializamos en false mientras no se demuestre lo contrario.
				id_editorial = lector.nextInt();// Leemos el id introducido por terminal.
				lector.nextLine();// Limpiamos buffer
				for (Editorial editorial : a) {// Bucle que compara todas las editoriales del array.
					if (editorial != null && editorial.getId_editorial() != id_editorial) {// Condicional si no es null
																							// y no existe el id.
						System.out.println("El id no está almacenado, por favor introduce uno nuevo a continuación: ");
					}
					if (editorial != null && editorial.getId_editorial() == id_editorial) {// Condicional si no es null
																							// y el id está en el array.
						// Mostramos los datos relacionados al id, esperamos confirmación e indicamos
						// que ha sido encontrado.
						System.out.println("Los datos del autor con id " + id_editorial + " son:");
						System.out.println(editorial.toString());
						System.out.println("Pulsa ENTER para continuar ...");
						lector.nextLine();
						limpiar_pantalla();
						idencontrado = true;
					}
				}
			} while (!idencontrado);
		}
	}

	public static void buscar_libro_por_id(Libros[] a, int i, int id) {// Metodo para buscar libro por id.
		if (contador_libros == 0) {// Condicional en caso de no haber libbros almacenados, lo indicamos y esperamos
									// confirmación.
			System.out.println("No hay libros almacenados.");
			System.out.println("Pulsa ENTER para continuar...");
			lector.nextLine();
			limpiar_pantalla();
		} else {// Si hay libros almacenados.
			do {// Bucle que iterará mientras no se encuentre el id introducido.
				idencontrado = false;// Inicializamos en false mientras no se demuestre lo contrario.
				id_libros = lector.nextInt();// Leemos el id introducido por terminal.
				lector.nextLine();// Limpiamos buffer
				for (Libros libro : a) {// Bucle que compara todos los libros del array.
					if (libro != null && libro.getId_libro() != id_libros) {// Condicional si no es null y no existe el
																			// id.
						System.out.println("El id no está almacenado, por favor introduce uno nuevo a continuación: ");
					}
					if (libro != null && libro.getId_libro() == id_libros) {// Condicional si no es null y el id está en
																			// el array.
						// Mostramos los datos relacionados al id, esperamos confirmación e indicamos
						// que ha sido encontrado.
						System.out.println("Los datos del autor con id " + id_libros + " son:");
						System.out.println(libro.toString());
						System.out.println("Pulsa ENTER para continuar ...");
						lector.nextLine();
						limpiar_pantalla();
						idencontrado = true;
					}
				}
			} while (!idencontrado);
		}
	}

	public static void modificar_autor_por_id(Autor[] a, int i, int id) {// Metodo para modificar autor por id.
		if (contador_autores == 0) {// Condicional en caso de no haber autores almacenados, lo indicamos y esperamos
									// confirmación.
			System.out.println("No hay autores almacenados.");
			System.out.println("Pulsa ENTER para continuar...");
			lector.nextLine();
			limpiar_pantalla();
		} else {// Si hay autores almacenados.
			do {// Bucle que iterará mientras no encuentre el id.
				idencontrado = false;// Inicializamos en false hasta demostrar que existe.
				id_autor = lector.nextInt();// Leemos el id introducido por terminal.
				lector.nextLine();// Limpiamos buffer.
				for (Autor autor : a) {// Bucle para comparar todos los autores del array.
					if (autor != null && autor.getId_autor() != id_autor) {// Condicional en caso de no ser null y no
																			// existir el id.
						System.out.println("El id no está almacenado, por favor introduce uno nuevo a continuación: ");
					}
					if (autor != null && autor.getId_autor() == id_autor) {// Condicional en caso de no ser null y
																			// existir el id.
						System.out.println("Los datos del autor son: ");
						System.out.println(autor.toString());// Imprimimos los datos antiguos.
						System.out.println("Nombre del autor: ");
						String nombre = lector.nextLine();// Leemos el nuevo nombre de autor.
						System.out.println("Apellidos del autor: ");
						String apellidos = lector.nextLine();// Leemos los nuevos apellidos de autor.
						System.out.println("Nacionalidad del autor: ");
						String nacionalidad = lector.nextLine();// Leemos la nueva nacionalidad de autor.
						System.out.println("Fecha de nacimiento del autor: ");
						String fecha = lector.nextLine();// Leemos la nueva fecha de autor.
						autor.setNombre_autor(nombre);// Almacenamos el nuevo nombre de autor.
						autor.setApellidos_autor(apellidos);// Almacenamos los nuevos apellidos de autor.
						autor.setNacionalidad(nacionalidad);// Almacenamos la nueva nacionalidad de autor.
						autor.setFecha(fecha);// Almacenamos la nueva fecha de autor.
						// Indicamos el cambio, esperamos confirmación e indicamos que ha sido
						// encontrado para salir del bucle.
						System.out.println("Datos del autor " + id_autor + " cambiados de forma correcta!");
						System.out.println("Pulse ENTER para continuar ...");
						lector.nextLine();
						limpiar_pantalla();
						idencontrado = true;
					}
				}
			} while (!idencontrado);
		}
	}

	public static void modificar_editorial_por_id(Editorial[] a, int i, int id) {// Metodo para modificar editorial por
																					// id.
		if (contador_editoriales == 0) {// Condicional en caso de no haber editoriales almacenadas, lo indicamos y
										// esperamos confirmación.
			System.out.println("No hay editoriales almacenadas.");
			System.out.println("Pulsa ENTER para continuar...");
			lector.nextLine();
			limpiar_pantalla();
		} else {// Si hay editoriales almacenadas.
			do {// Bucle que iterará mientras no encuentre el id.
				idencontrado = false;// Inicializamos en false hasta demostrar que existe.
				id_editorial = lector.nextInt();// Leemos el id introducido por terminal.
				lector.nextLine();// Limpiamos buffer.
				for (Editorial editorial : a) {// Bucle para comparar todas las editoriales del array.
					if (editorial != null && editorial.getId_editorial() != id_editorial) {// Condicional en caso de no
																							// ser null y no existir el
																							// id.
						System.out.println("El id no está almacenado, por favor introduce uno nuevo a continuación: ");
					}
					if (editorial != null && editorial.getId_editorial() == id_editorial) {// Condicional en caso de no
																							// ser null y existir el id.
						System.out.println("Los datos de la editorial son: ");
						System.out.println(editorial.toString());// Imprimimos los datos antiguos.
						System.out.println("Nombre de la editorial: ");
						String nombre = lector.nextLine();// Leemos el nuevo nombre.
						System.out.println("Nacionalidad de la editorial: ");
						String nacionalidad = lector.nextLine();// Leemos la nueva nacionalidad.
						editorial.setNombre_editorial(nombre);// Almacenamos el nuevo nombre.
						editorial.setNacionalidad_editorial(nacionalidad);// Almacenamos la nueva nacionalidad.
						// Indicamos el cambio, esperamos confirmación e indicamos que ha sido
						// encontrado para salir del bucle.
						System.out.println("Datos del autor " + id_editorial + " cambiados de forma correcta!");
						System.out.println("Pulse ENTER para continuar ...");
						lector.nextLine();
						limpiar_pantalla();
						idencontrado = true;
					}
				}
			} while (!idencontrado);
		}
	}

	public static void modificar_libro_por_id(Libros[] a, int i, int id, Autor[] autores, Editorial[] editoriales) {// Metodo
																													// para
																													// modificar
																													// libro
																													// por
																													// id.
		if (contador_libros == 0) {// Condicional en caso de no haber libbros almacenados, lo indicamos y esperamos
									// confirmación.
			System.out.println("No hay libros almacenados.");
			System.out.println("Pulsa ENTER para continuar...");
			lector.nextLine();
			limpiar_pantalla();
		} else {// Si hay libros almacenados.
			do {// Bucle que iterará mientras no encuentre el id.
				idencontrado = false;// Inicializamos en false hasta demostrar que existe.
				id_libros = lector.nextInt();// Leemos el id introducido por terminal.
				lector.nextLine();// Limpiamos buffer.
				for (Libros libro : a) {// Bucle para comparar todos los libros del array.
					if (libro != null && libro.getId_libro() != id_libros) {// Condicional en caso de no ser null y no
																			// existir el id.
						System.out.println("El id no está almacenado, por favor introduce uno nuevo a continuación: ");
					}
					if (libro != null && libro.getId_libro() == id_libros) {// Condicional en caso de no ser null y
																			// existir el id.
						System.out.println("Los datos del libro son: ");
						System.out.println(libro.toString());// Imprimimos los antiguos datos del libro.
						Boolean idAutorEncontrado = false;// Inicializamos en false hasta demostrar si existe el id de
															// autor.
						System.out.println("Id del autor del libro: ");
						id_autor = lector.nextInt();// Leemos el id del autor introducido por terminal
						lector.nextLine();// Limpiamos buffer
						for (Autor autor : autores) {// Bucle para comparar todos los autores del array.
							if (autor != null && autor.getId_autor() == id_autor) {// Condicional en caso de no ser null
																					// y encontrar el id.
								idAutorEncontrado = true;// Indicamos que está encontrado.
							}
						}
						if (!idAutorEncontrado) {// Condicional si el id de autor aun no existe.
							System.out.println(
									"El id de autor introducido no existe, a continuación procederemos a añadirlo: ");
							Metodos.anadir_autor();// Llamamos al metodo añadir autor.
						}
						Boolean idEditorialEncontrado = false;// Inicializamos en false hasta demostrar si existe el id
																// de editorial.
						System.out.println("Id de la editorial del libro: ");
						id_editorial = lector.nextInt();// Leemos el id de editorial introducido por terminal.
						lector.nextLine();// Limpiamos buffer
						for (Editorial editorial : editoriales) {// Bucle para comparar todas las editoriales del array.
							if (editorial != null && editorial.getId_editorial() == id_editorial) {// Condicional en
																									// caso de no ser
																									// null y encontrar
																									// el id.
								idEditorialEncontrado = true;// Indicamos que está encontrado.
							}
						}
						if (!idEditorialEncontrado) {// Condicional si el id de editorial aun no existe
							System.out.println(
									"El id de la editorial no existe, a continuación procederemos a añadirlo: ");
							Metodos.anadir_editorial();// Llamamos al metodo añadir editorial.
						}
						System.out.println("Titulo del libro: ");
						String titulo = lector.nextLine();// Leemos el nuevo titulo del libro.
						System.out.println("ISBN: ");
						String isbn = lector.nextLine();// Leemos el nuevo isbn del libro.
						System.out.println("Paginas: ");
						int paginas = lector.nextInt();// Leemos el nuevo numero de paginas del libro.
						lector.nextLine();// Limpiamos buffer.
						libro.setId_autor(id_autor);// Almacenamos el nuevo autor.
						libro.setId_editorial(id_editorial);// Almacenamos la nueva editorial.
						libro.setTitulo(titulo);// Almacenamos el nuevo titulo.
						libro.setIsbn(isbn);// Almacenamos el nuevo isbn.
						libro.setPaginas(paginas);// Almacenamos el nuevo numero de paginas.
						// Indicamos el cambio, esperamos confirmación e indicamos que ha sido
						// encontrado para salir del bucle.
						System.out.println("Datos del libro " + id_libros + " cambiados de forma correcta!");
						System.out.println("Pulse ENTER para continuar ...");
						lector.nextLine();
						limpiar_pantalla();
						idencontrado = true;
					}
				}
			} while (!idencontrado);
		}
	}

	public static void eliminar_autor_por_id(Autor[] a, int i, int id, Libros[] z) {
		int posAutor = 0;// Variable para saber en que posicion del array está el autor.
		do {// Bucle que iterará mientras no encuentre el id.
			posAutor = 0;
			idencontrado = false;// Inicializamos en false hasta encontrarlo.
			id_autor = lector.nextInt();// Leemos el id a eliminar.
			lector.nextLine();// Limpiamos buffer.
			for (Autor autor : a) {// Bucle para comparar todos los autores en el array.
				if (autor != null && autor.getId_autor() != id_autor && idencontrado == false) {// Condicional si no es
																								// null y no encuentra
																								// el id en ninguna
																								// iteración.
					posAutor++;
				}
				if (autor != null && autor.getId_autor() == id_autor) {// Condicional si no es null y encuentra el id,
																		// lo indicamos que ha sido encontrado para
																		// salir del bucle.
					idencontrado = true;
				}
			}
			if (!idencontrado) {// Condicional si al salir del for aun no encuentra el id.
				System.out.println("El id no está almacenado, por favor introduce uno nuevo a continuación: ");
			}
		} while (!idencontrado);
		Boolean autorconlibro = false;// Boolean que controlara si el autor tiene libros vinculados.
		for (Libros libro : z) {// Bucle para comparar todos los libros en el array.
			if (libro != null && libro.getId_autor() == id_autor) {// Condicional si no es null y el id autor coincide
																	// con el id en un libro almacenado.
				System.out.println("Por favor elimina primero los libros vinculados a este autor.");
				System.out.println("Pulser ENTER para continuar ...");
				lector.nextLine();
				autorconlibro = true;// Mostramos que el autor tiene libros, esperamos confirmación e indicamos para
										// salir del bucle.
				limpiar_pantalla();
			}
		}
		if (autorconlibro == false) {// Condicional si el autor no tiene libros vinculados.
			a[posAutor] = new Autor();// Indicamos que el autor en la posicion de posAutor pasa a estar vacío, lo
										// indicamos y esperamos confirmación.
			System.out.println("Datos del autor " + id_autor + " eliminados de forma correcta!");
			System.out.println("Pulse ENTER para continuar ...");
			lector.nextLine();
			limpiar_pantalla();
		}
	}

	public static void eliminar_editorial_por_id(Editorial[] a, int i, int id, Libros[] z) {
		int posEditorial = 0;// Variable para saber en que posicion del array está el autor.
		do {// Bucle que iterará mientras no encuentre el id.
			posEditorial = 0;
			idencontrado = false;// Inicializamos en false hasta encontrarlo.
			id_editorial = lector.nextInt();// Leemos el id a eliminar.
			lector.nextLine();// Limpiamos buffer.
			for (Editorial editorial : a) {// Bucle para comparar todos los editoriales en el array.
				if (editorial != null && editorial.getId_editorial() != id_editorial && idencontrado == false) {// Condicional
																												// si no
																												// es
																												// null
																												// y no
																												// encuentra
																												// el id
																												// en
																												// ninguna
																												// iteración.
					posEditorial++;
				}
				if (editorial != null && editorial.getId_editorial() == id_editorial) {// Condicional si no es null y
																						// encuentra el id, lo indicamos
																						// que ha sido encontrado para
																						// salir del bucle.
					idencontrado = true;

				}
			}
			if (!idencontrado) {// Condicional si al salir del for aun no encuentra el id.
				System.out.println("El id no está almacenado, por favor introduce uno nuevo a continuación: ");
			}
		} while (!idencontrado);
		Boolean editorialconlibro = false;// Boolean que controlara si la editorial tiene libros vinculados.
		for (Libros libro : z) {// Bucle para comparar todos los libros en el array.
			if (libro != null && libro.getId_editorial() == id_editorial) {// Condicional si no es null y el id
																			// editorial coincide con el id en un libro
																			// almacenado.
				System.out.println("Por favor elimina primero los libros vinculados a esta editorial.");
				System.out.println("Pulser ENTER para continuar ...");
				lector.nextLine();
				editorialconlibro = true;// Mostramos que la editorial tiene libros, esperamos confirmación e indicamos
											// para salir del bucle.
				limpiar_pantalla();
			}
		}
		if (editorialconlibro == false) {// Condicional si la editorial no tiene libros vinculados.
			a[posEditorial] = new Editorial();// Indicamos que la editorial en la posicion de posEditorial pasa a estar
												// vacío, lo indicamos y esperamos confirmación.
			System.out.println("Datos de la editorial " + id_editorial + " eliminados de forma correcta!");
			System.out.println("Pulse ENTER para continuar ...");
			lector.nextLine();
			limpiar_pantalla();
		}
	}

	public static void eliminar_libro_por_id(Libros[] a, int i, int id) {
		do {// Bucle que iterará mientras no encuentre el id.
			idencontrado = false;// Inicializamos en false hasta encontrarlo.
			id_libros = lector.nextInt();// Leemos el id a eliminar.
			lector.nextLine();// Limpiamos buffer.
			for (int contador = 0; contador < i; contador++) {// Bucle para comparar todos los libros en el array.
				if (a[contador] != null && a[contador].getId_editorial() == id_libros) {// Condicional si no es null y
																						// el id está en el array.
					a[contador] = new Libros();// Ponemos el libro a 0, lo indicamos y esperamos confirmación.
					System.out.println("Datos del libro " + id_libros + " eliminados de forma correcta!");
					System.out.println("Pulse ENTER para continuar ...");
					lector.nextLine();
					limpiar_pantalla();
					idencontrado = true;// Indicamos que ha sido encontrado para salir del bucle while.
				}
			}
			if (!idencontrado) {// Condicional si al salir del for sigue sin encontrar el id.
				System.out.println("El id no está almacenado, por favor introduce uno nuevo a continuación: ");
			}
		} while (!idencontrado);
	}
}
