package EjercicioOpcional3;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Este programa leera 5 notas introducidas por terminal
		//Dira cual es la nota mas alta, la mas baja y la media
		//Primero inicializamos el escaner y las variables a utilizar.
		Scanner scanner = new Scanner(System.in);
		Float[] arrayNotas= new Float[5];//Array para almacenar las notas
		int contador=0;//Contador para recorrer el array
		Float notInt=0F;//Variable para almacenar la nota introducida.
		Float notMin=10F;//Inicializamos en la nota maxima para asegurarnos que siempre pueda bajar la nota, almacenara la nota minima
		Float notMax=0F;//Inicializamos en 0 para asegurarnos de siempre subir esta nota, almacenara la nota maxima
		Float notMedia=0F;//Almacenara la media de las notas
		System.out.println("Por favor a continuacion introduzca las notas de los examenes: ");//Informacion datos solicitados
		for(contador=0;contador<arrayNotas.length;contador++) {//Bucle que recorrera todo el array
			notInt=scanner.nextFloat();//rellenamos el array con el valor introducido por terminal
			while(notInt<0||notInt>10) {//Bucle que itera si la nota no esta comprendida entre 1 y 10
				System.out.println("La nota introducida no es valida, vuelve a insertarla: ");
				notInt=scanner.nextFloat();//rellenamos el array con el valor introducido por terminal
			}
			arrayNotas[contador]=notInt;//como la nota es correcta la almacenamos en el array.
		}
		for(Float numin:arrayNotas) {//Bucle que itera el arrayNotas e introduce cada vez su valor en numin si es menor al valor anterior.
			if(numin<=notMin) {
				notMin=numin;
			}
		}
		for(Float numax:arrayNotas) {//Bucle que itera el arrayNotas e introduce cada vez su valor en numax si es mayor al valor anterior.
			if(numax>=notMax) {
				notMax=numax;
			}
		}
		for(Float numedia:arrayNotas) {//Bucle que itera el arrayNotas sumando los valores en notMedia.
			notMedia=notMedia+numedia;//Divide notMedia entre la cantidad de examenes para sacar la media.
		}
		notMedia=notMedia/5;//Divide notMedia entre la cantidad de examenes para sacar la media.
		System.out.println("La nota maxima es: "+String.format("%.2f" , notMax));//Imprimimos nota maxima, obligando a reducir a 2 decimales
		System.out.println("La nota minima es: "+String.format("%.2f" , notMin));//Imprimimos nota minima, obligando a reducir a 2 decimales
		System.out.println("La nota media es: "+String.format("%.2f" , notMedia));//Imprimimos nota media, obligando a reducir a 2 decimales
	}
}
