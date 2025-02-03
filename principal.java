package autoresConFunciones;

import java.util.Scanner;

public class principal {

	static Scanner lector = new Scanner(System.in);//Scanner para la entrada de datos
	public static int[] idArray=new int[10];//Array para los id de autor
	public static int contador_autores;//Variables para contar los autores introducidos
	public static int opcion;//Variable para escoger opcion del menu
	public static String [] nombres = new String[10];//Array para almacenar los nombres de los autores
	public static String [] apellidos = new String[10];//Array para almacenar los apellidos de los autores
	public static String [] nacionalidad = new String[10];//Array para almacenar la nacionalidad de los autores
	public static String [] f_nacimiento = new String[10];//Array para almacenar la fecha de nacimiento de los autores
	public static void limpiar_pantalla() {//Funcion para simular un limpiado de pantalla
		for (int i=0;i<300;i++) {//Bucle que itera 300 saltos de linea
			System.out.println("");
		}
	}
	public static int menu() {//Funcion con el menu del programa, lectura del valor seleccionado para el mismo y retorno de la opcion.
		System.out.println("+---------------------------+");
		System.out.println("+ 1 Insertar Autor          +");
		System.out.println("+ 2 Modificar Autor         +");
		System.out.println("+ 3 Listado de Autores      +");
		System.out.println("+ 4 Eliminar autor          +");
		System.out.println("+ 5 Salir                   +");
		System.out.println("+---------------------------+");
		System.out.println("Dame una opcion: ");
		opcion = lector.nextInt();
		lector.nextLine();
		return opcion;
	}
	public static void insertarAutor() {//Funcion para introducir nuevos autores
		limpiar_pantalla();
		int contIdVacio=0;//Inicializamos el contador que verifica si hay id vacio a 0
		boolean hueco=false;//Inicializamos el boolean hueco a false para asegurarnos de que solo cambia si encuentra true en esta iteracion
		int huecoLibre=0;//Variable que almacenara la posicion del hueco
		boolean idUnico=true;//Boolean que dira si un id es unico o repetido
		int idInt=0;//Variable que almacena el id introducido por terminal
		int contador=0;//Variable que sirve de contador para los bucles
		while(!hueco&&contIdVacio<10) {//Bucle que iterara mientras no encuentre un hueco vacio o llegue al tope del array
			if(idArray[contIdVacio]==-1) {//Condicional que verifica si en ese hueco del array esta vacio
				hueco=true;//Si encuentra hueco ponemos la booleana en true
				huecoLibre=contIdVacio;//Al haber hueco, guardamos su posicion en la variable huecoLibre
			}
			contIdVacio++;//Incrementamos el contador de la verificacion de hueco
		}
		if(contador_autores<10||hueco) {//Condicional que aplicara si no se ha llegado al tope del array o queda algun hueco libre
			do {
				idUnico=true;//Damos por hecho que el id es unico hasta demostrar lo contrario
				System.out.println("Id: ");//Solicitamos id
				idInt = lector.nextInt();//Leemos id insertado
				for(contador=0; contador<contador_autores; contador++) {//Bucle para recorrer todos los id ya introucidos
					if(idArray[contador]==idInt) {//Condicional en caso de encontrar coincidencia
						idUnico=false;//Como se ha encontrado coincidencia se indica que esta repetido y por lo tanto false
						System.out.println("El id introducido está repetido, por favor introduzcalo de nuevo a continuación: ");//Se solicita nuevo id
					}
				}
			}
			while(!idUnico);//Iterara hasta que el id sea unico
			if(hueco) {//Condicional solo si hay hueco
				idArray[huecoLibre]=idInt;//Si hay hueco se guarda la id en el hueco libre del array id
				lector.nextLine();//Limpiamos bufer
				System.out.println("Nombre: ");//Solicitamos nombre
				nombres[huecoLibre]=lector.nextLine();//Leemos nombre introducido
				System.out.println("Apellidos: ");//Solicitamos apellidos
				apellidos[huecoLibre]=lector.nextLine();//Leemos apellidos introducidos
				System.out.println("Nacionalidad: ");//Solicitamos nacionalidad
				nacionalidad[huecoLibre]=lector.nextLine();//Leemos nacionalidad introducida
				System.out.println("Fecha: ");//Solicitamos fecha
				f_nacimiento[huecoLibre]=lector.nextLine();//Leemos fecha introducida
				System.out.println("\n\n");//Imprimimos 2 salto de linea en blanco
				System.out.println("Autor Insertado con éxito!!!");//Informacion sobre insercion de datos
				System.out.println("Pulse ENTER para volver al menu principal ...");//Solicitamos confirmacion para volver al mennu
				lector.nextLine();//Confirmamos vuelta a menu
				contador_autores--;
			}
			else {//Si no hay hueco lo guarda al final del array
				idArray[contador_autores]=idInt;//Como el id es unico lo almacenamos
				lector.nextLine();//Limpiamos bufer
				System.out.println("Nombre: ");//Solicitamos nombre
				nombres[contador_autores]=lector.nextLine();//Leemos nombre introducido
				System.out.println("Apellidos: ");//Solicitamos apellidos
				apellidos[contador_autores]=lector.nextLine();//Leemos apellidos introducidos
				System.out.println("Nacionalidad: ");//Solicitamos nacionalidad
				nacionalidad[contador_autores]=lector.nextLine();//Leemos nacionalidad introducida
				System.out.println("Fecha: ");//Solicitamos fecha
				f_nacimiento[contador_autores]=lector.nextLine();//Leemos fecha introducida
				System.out.println("\n\n");//Imprimimos 2 salto de linea en blanco
				System.out.println("Autor Insertado con éxito!!!");//Informacion sobre insercion de datos
				System.out.println("Pulse ENTER para volver al menu principal ...");//Solicitamos confirmacion para volver al mennu
				lector.nextLine();//Confirmamos vuelta a menu
			}
			
			contador_autores++;//Aumentamos en 1 el contador de autores introducidos.
		}
		else {//En caso de estar el array lleno imprimimos instrucciones.
				System.out.println("Usuario el array esta lleno de datos!");
				System.out.println("Por favor, elimina antes a un autor para poder insertar a otro");
				System.out.println("Pulsa ENTER para continuar ...");
				lector.nextLine();
			}
	}
	public static void modificarAutor() {//Funcion para modificar un autor
		limpiar_pantalla();
		System.out.println("Dame id del autor a modificar: ");//Solicitamos informacion
		int ida=lector.nextInt();//Variable que almacena el id del autor a modificar
		lector.nextLine();//Limpiamos bufer
		int indice=0;//Variable de que hara de contador del bucle
		boolean encontrado=false;//Boolean que dira si ha encontrado el id almacenado o no
		while (!encontrado && indice<contador_autores) {//Bucle que iterara mientras no encuentre y queden huecos por revisar
			if (ida==idArray[indice]) {//Condicional en caso de encontrar el id,, solicitamos nuevos datos y proporcionamos informacion
				System.out.println("Nombre: ");
				nombres[indice]=lector.nextLine();
				System.out.println("Apellidos: ");
				apellidos[indice]=lector.nextLine();
				System.out.println("Nacionalidad: ");
				nacionalidad[indice]=lector.nextLine();
				System.out.println("F. Nacimiento: ");
				f_nacimiento[indice]=lector.nextLine();
				System.out.println("Autor actualizado correctamente!!!");
				System.out.println("Pulsa ENTER para continuar ...");
				encontrado=true;//Como hemos encontrado id lo indicamos al boolean para salir del bucle
			}
			indice++;//Incrementamos contador para volver a iterar en caso de no haber encontrado el id.
		}
	}
	public static void listadoAutor() {//Funcion para listar los autores introducidos previamente
		if (contador_autores==0) {//Condicional si aun no se han introducido autores, damos informacion y salimos a menu.
			// Significa que no hay datos para listar.
			limpiar_pantalla();
			System.out.println("Usuario no hay datos para mostrar!!!");
			System.out.println("Inserta a un autor para poder listar");
			System.out.println("Pulsa ENTER para continuar ...");
			lector.nextLine();
		}else {//Condicional que aplica si hay autores introducidos
			int opcion1=0;//Variable contador para mostrar el id a listar en la posicion indicada del array
			do {//Bucle que iterara almenos una vez y mientras queden huecos del array por recorrer.
				if (idArray[opcion1]!=-1) {//Condicional que aplica mientras ese hueco no este borrado, damos la informacion del contenido de la posicion en cada array.
					System.out.println("Datos del autor "+(opcion1+1)+": ");
					System.out.println("Id: "+idArray[opcion1]);
					System.out.println("Nombre: "+nombres[opcion1]);
					System.out.println("Apellidos: "+apellidos[opcion1]);
					System.out.println("Nacionalidad: "+nacionalidad[opcion1]);
					System.out.println("F. Nacimiento: "+f_nacimiento[opcion1]);
					System.out.println("\n\nPulsa ENTER para continuar ...");
					lector.nextLine();
					
				}
				opcion1++;//Incrementamos al posicion del array a consultar
			}while(opcion1<10);
		}
	}
	public static void eliminarAutor() {//Funcion para eliminar un autor introducido previamente
		limpiar_pantalla();
		System.out.println("Dame el id del autor a eliminar: ");//Solicitamos informacion
		int idabuscar=lector.nextInt();//Variable para guardar el id a eliminar
		lector.nextLine();//Limpiamos bufer
		boolean encontrado=false;//Variable que devolvera si ha encontrado o no el id
		int indice=0;//Variable que hara de contador para recorrer el array
		while (!encontrado && indice<contador_autores) {//Bucle que iterara mientras no encuentre el id y queden huecos del array a revisar
			if (idArray[indice]==idabuscar) {//Si encuentra el id cambia el boolean a true
				encontrado=true;
			}else {//Si no lo encuentra añade 1 al contador para volver a iterar
				indice++;
			}
		}
		if (!encontrado) {//Si despues de revisar todo el array sigue sin encontrar el id damos informacion y salimos a menu
			System.out.println("Usuario la id del autor proporcionada no esta almacenada!");
			System.out.println("Pulsa ENTER para continuar ...");
			lector.nextLine();
		}else {//Si despues de revisar el array encuentra el id añade -1 al id para dejarlo borrado, deja en blanco lo demas y salimos a menu
			idArray[indice]=-1;
			nombres[indice]="";
			apellidos[indice]="";
			nacionalidad[indice]="";
			f_nacimiento[indice]="";
			System.out.println("Autor eliminado correctamente!!!");
			System.out.println("Pulsa ENTER para continuar ....");
			lector.nextLine();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		do {//Bucle mientras no se indique un 5 para salir y que itera minimo 1 vez haciendo escoger algo del menu
			menu();//Llamamos al menu
			switch (opcion) {//Leemos la opcion y escogemos caso
				case 1:{
					insertarAutor();//Llamamos a insertar el autor
					break;
				}
				case 2:{
					modificarAutor();//Llamamos a modificar el autor
					break;
				}
				case 3:{
					listadoAutor();//Llamamos a listar los autores
					break;
				}
				case 4:{
					eliminarAutor();//Llamamos a eliminar el autor
					break;
				}
				case 5:{//Salimos del programa
					;
					break;
				}
				default:{//Al no esoger opcion correcta lo indicamos y solicitamos una correcta de nuevo
					System.out.println("Usuario, una opcion entre 1-5");
					System.out.println("Pulsa ENTER para continuar ...");
					lector.nextLine();
					break;
				}
			}	
		}
		while(opcion!=5);
	}
}
