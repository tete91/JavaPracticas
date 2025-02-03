package EjercicioPropuesto6;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Este programa en funcion al siguiente array, imprimirá por pantalla solamente las consonante.
		//El array es: char[] letras = new char[]{‘2′,’f’,’f’,’u’,’u’,’g’,’h’,’i’,’4′};
		//Primero inicializamos el array que vamos a utilizar, asi como las variables necesarias.
		char[] letras = new char[]{'2','f','f','u','u','g','h','i','4'};//Inicializamos el array a comprobar
		int contador=0;//Inicializamos un contador para el bucle for
		int contador2=0;//Inicializamos otro contador para el segundo bucle for
		char[] consonantes =new char[] {'b','B','c','C','d','D','f','F','g','G','h','H','j','J','k','K','l','L','m','M','n','N','p','P','q','Q','r','R','s','S','t','T','v','V','w','W','x','X','y','Y','z','Z'};//Array con todas las consonantes
		for(contador=0; contador<letras.length; contador++) {//Bucle que recorrerá todo el array a verificar
			for(contador2=0; contador2<consonantes.length;contador2++) {//Bucle que recorrerá todas las consonantes para comparar
				if(letras[contador]==consonantes[contador2]) {//Condicional que solo se activará en caso de que una letra sea consonante.
					System.out.println("El contenido del array en posicion"+(contador+1)+" es una consonante, y es la "+letras[contador] );//Imprimimos resultado
				}
			}

			/*switch(letras[contador]) {//Bucle switch con cada consonante como caso a comparar.
				case 'b':
				case 'c':
				case 'd':
				case 'f':
				case 'g':
				case 'h':
				case 'j':
				case 'k':
				case 'l':
				case 'm':
				case 'n':
				case 'ñ':
				case 'p':
				case 'q':
				case 'r':
				case 's':
				case 't':
				case 'v':
				case 'w':
				case 'x':
				case 'y':
				case 'z':
				case 'B':
				case 'C':
				case 'D':
				case 'F':
				case 'G':
				case 'H':
				case 'J':
				case 'K':
				case 'L':
				case 'M':
				case 'N':
				case 'Ñ':
				case 'P':
				case 'Q':
				case 'R':
				case 'S':
				case 'T':
				case 'V':
				case 'W':
				case 'X':
				case 'Y':
				case 'Z':
					System.out.println("El contenido del array en posicion"+(contador+1)+" es una consonante, y es la "+letras[contador] );//Imprimimos resultado
					break;
			}*/	
		}
	}
}
