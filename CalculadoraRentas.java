package ejercicio4if;
import java.util.Scanner;
public class principal {
	//A continuación haremos una calculadora de rentas a partir de los datos de
	//capital solicitado(c),tasa de interes(r) y tiempo de amortización en meses(t). 

	public static void main(String[] args) {
		//Inicializamos el escaner
		Scanner scanner=new Scanner(System.in);
		//Iniciamos todas las variables que tengamos en el programa a continuación.
		float c=0f;
		float r=0f;
		int t=0;
		//int continuar=-1;
		float intereses=0;
		float totalprestamo=0;
		float mensualidad=0;
	//Primero vamos a introducir un bucle while para poder hacer pruebas sin salir del termina.
	//Para ello incializamos la variable continuar en -1, y hasta que no se elija 0 se irá
	//Repitiendo el bucle.
		//while(continuar!=0) {
			//Primero vamos a solicitar datos al usuario y que los introduzca por terminal
			System.out.println("Por favor, introduzca los datos solicitados a continuación ");
			System.out.println("para proceder a calcular su renta");
			System.out.println("");
			System.out.println("Introduzca el importe solicitado: ");
			c=scanner.nextFloat();
			System.out.println("Ahora introduzca en cuanto meses quiere amortizar el crédito: ");
			t=scanner.nextInt();
			//Con el if asignamos un tipo de interes según los meses de amortización
			if(t<=24) {
				r=5;			
			}
			else  
				if(t>24&&t<=60) {
					r=8;
				}
				else {
					r=10;
				}
			//Con esto ya tenemos todos los datos por lo que procedemos a calcular
			//Datos y mostrar la renta por pantalla.
			intereses=(c*r*t)/1200;
			totalprestamo=c+((c*r*t)/1200);
			mensualidad=totalprestamo/t;
			System.out.println("El total de intereses del prestamo es de: "+intereses);
			System.out.println("El total del prestamo incluido intereses es de: "+totalprestamo);
			System.out.println("Las mensualidades son de: "+mensualidad);
			//Con lo siguiente preguntamos si quiere hacer un nuevo calculo, solo lo usaremos para pruebas
			//Comentar antes de entregar al cliente final.
			/*System.out.println("");
			System.out.println("Quieres Calcular otro prestamo?");
			System.out.println("Introduce 0 para no, cualquier otro numero para si: ");
			continuar=scanner.nextInt();
		}*/		
	}

}
