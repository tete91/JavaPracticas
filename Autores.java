package autores2;

import java.util.Scanner;

public class principal {

    public static void limpiar_pantalla() {
        for (int i = 0; i < 300; i++) {
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        int[] id = new int[10];
        String[] nombres = new String[10];
        String[] apellidos = new String[10];
        String[] nacionalidad = new String[10];
        String[] f_nacimiento = new String[10];
        int opcion = 0;

        // Inicializar el array `id` con -1 para indicar que están vacíos
        for (int i = 0; i < id.length; i++) {
            id[i] = -1;
        }

        do {
            limpiar_pantalla();
            System.out.println("+---------------------------+");
            System.out.println("+ 1 Insertar Autor          +");
            System.out.println("+ 2 Modificar Autor         +");
            System.out.println("+ 3 Listado de Autores      +");
            System.out.println("+ 4 Eliminar Autor          +");
            System.out.println("+ 5 Salir                   +");
            System.out.println("+---------------------------+");
            System.out.print("Dame una opción: ");
            opcion = lector.nextInt();
            lector.nextLine();
            
            switch (opcion) {
                case 1: // Insertar Autor
                    limpiar_pantalla();

                    // Buscar el primer hueco libre (-1)
                    int indiceInsercion = -1;
                    for (int i = 0; i < id.length; i++) {
                        if (id[i] == -1) {
                            indiceInsercion = i;
                            break;
                        }
                    }

                    if (indiceInsercion == -1) {
                        System.out.println("El array está lleno. Elimine un autor para agregar uno nuevo.");
                        System.out.println("Pulsa ENTER para continuar...");
                        lector.nextLine();
                    } else {
                        // Solicitar el ID único
                        boolean idUnico;
                        int nuevoId;
                        do {
                            idUnico = true;
                            System.out.print("Id: ");
                            nuevoId = lector.nextInt();
                            lector.nextLine();

                            // Comprobar si el id ya está en uso
                            for (int i = 0; i < id.length; i++) {
                                if (id[i] == nuevoId) {
                                    idUnico = false;
                                    System.out.println("El id introducido ya está en uso. Por favor, ingrese otro.");
                                    break;
                                }
                            }
                        } while (!idUnico);  // Repetir hasta que el id sea único

                        // Insertar el nuevo autor en el primer hueco disponible
                        id[indiceInsercion] = nuevoId;

                        System.out.print("Nombre: ");
                        nombres[indiceInsercion] = lector.nextLine();

                        System.out.print("Apellidos: ");
                        apellidos[indiceInsercion] = lector.nextLine();

                        System.out.print("Nacionalidad: ");
                        nacionalidad[indiceInsercion] = lector.nextLine();

                        System.out.print("Fecha de Nacimiento: ");
                        f_nacimiento[indiceInsercion] = lector.nextLine();

                        System.out.println("\nAutor Insertado con éxito!");
                        System.out.println("Pulse ENTER para volver al menú principal...");
                        lector.nextLine();
                    }
                    break;

                case 2: // Modificar Autor
                    limpiar_pantalla();
                    System.out.print("Dame id del autor a modificar: ");
                    int ida = lector.nextInt();
                    lector.nextLine();
                    boolean encontrado = false;

                    for (int i = 0; i < id.length; i++) {
                        if (ida == id[i]) {
                            // Localizado el autor con el id
                            System.out.print("Nombre: ");
                            nombres[i] = lector.nextLine();
                            System.out.print("Apellidos: ");
                            apellidos[i] = lector.nextLine();
                            System.out.print("Nacionalidad: ");
                            nacionalidad[i] = lector.nextLine();
                            System.out.print("Fecha de Nacimiento: ");
                            f_nacimiento[i] = lector.nextLine();
                            System.out.println("Autor actualizado correctamente!");
                            System.out.println("Pulsa ENTER para continuar...");
                            lector.nextLine();
                            encontrado = true;
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("ID no encontrado. Pulsa ENTER para continuar...");
                        lector.nextLine();
                    }
                    break;

                case 3: // Listado de Autores
                    limpiar_pantalla();
                    boolean hayAutores = false;
                    for (int i = 0; i < id.length; i++) {
                        if (id[i] != -1) { // Mostrar solo si el id es válido (no es -1)
                            System.out.println("Datos del autor en índice " + i + ": ");
                            System.out.println("Id: " + id[i]);
                            System.out.println("Nombre: " + nombres[i]);
                            System.out.println("Apellidos: " + apellidos[i]);
                            System.out.println("Nacionalidad: " + nacionalidad[i]);
                            System.out.println("Fecha de Nacimiento: " + f_nacimiento[i]);
                            System.out.println("\n");
                            hayAutores = true;
                        }
                    }
                    if (!hayAutores) {
                        System.out.println("No hay datos para mostrar.");
                    }
                    System.out.println("Pulsa ENTER para continuar...");
                    lector.nextLine();
                    break;

                case 4: // Eliminar Autor
                    limpiar_pantalla();
                    System.out.print("Dame el id del autor a eliminar: ");
                    int idabuscar = lector.nextInt();
                    lector.nextLine();
                    encontrado = false;

                    for (int i = 0; i < id.length; i++) {
                        if (id[i] == idabuscar) {
                            // Si se ha localizado el id
                            id[i] = -1;
                            nombres[i] = "";
                            apellidos[i] = "";
                            nacionalidad[i] = "";
                            f_nacimiento[i] = "";
                            System.out.println("Autor eliminado correctamente!");
                            System.out.println("Pulsa ENTER para continuar...");
                            lector.nextLine();
                            encontrado = true;
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("El ID del autor proporcionado no está almacenado!");
                        System.out.println("Pulsa ENTER para continuar...");
                        lector.nextLine();
                    }
                    break;

                case 5: // Salir
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Ingrese un número entre 1 y 5.");
                    System.out.println("Pulsa ENTER para continuar...");
                    lector.nextLine();
                    break;
            }
        } while (opcion != 5);

        lector.close(); // Cerrar el scanner al finalizar el programa
    }
}
