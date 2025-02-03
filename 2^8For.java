package ejerciciopropuestofor5;

public class principal {

	public static void main(String[] args) {
		// Hallaremos 2 elevado a 8
		//Primero inicizalizamos las variables a utilizar.
		int denominador=2;//Introduciremos el denominador a elevar.
		int veces=8;//Introduciremos el numero elevado.
		Float numtotal=(float)denominador;//Variable que almacenara el resultado final. Lo hacemos en Float pues no sabemos que tan larga será la cadena.
		 				 //Despues parsearemos antes de imprimir.
						 //Inicializamos con la el denominador elegido por el usuario.
		for(int n=0; n<veces;n++) {//Bucle que terminara cuando se llegue al numero introducido en veces, ascendente.
			numtotal=numtotal*denominador;//Operacion para almacenar el resultado esperado.
		}
		System.out.println("El resultado de la operación introducido es: "+denominador+" elevado a "+veces+" = "+numtotal);//Imprimimos resultado.
	}
}
