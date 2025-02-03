package EjercicioOpcional9;
import java.util.Arrays;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//En este programa introduciremos la temperatura de 5 dias
		//daremos la media de temperatura de esos dias y los 3 dias con menos temperatura.
		//Primero inicializamos el scanner y las variables a utilizar.
		Scanner scanner = new Scanner(System.in);
		Float[] tempMin=new Float[5];//Array para almacenar las temperaturas minima
		Float[] tempMax=new Float[5];//Array para almacenar las temperaturas maximas
		int[] diasMin=new int[5];//Array para indicar el orden del dia que tiene menor temp al que mas conforme a las minimas
		Float minTemp=0f;//Variable que utilizaremos para almacenar la temp minima que busquemos al iterar.
		int contador=0;//Contador para recorrer array 1
		int contador1=0;//Contador para recorrer array 2
		Float medTemp=0f;//Variable que almacenara la media de temperaturas.
		System.out.println("Usuario por favor introduce las temperaturas minimas y maximas de los ultimos 5 dias.");//Solicitud de informacion
		for(contador=0;contador<tempMin.length;contador++) {//Bucle para recorrer tempMin
			System.out.println("Introduce la temperatura minima del dia "+(contador+1)+": ");//Solicitud de informacion
			tempMin[contador]=scanner.nextFloat();//Entrada de tempMin
			System.out.println("Introduce la temperatura maxima del dia "+(contador+1)+": ");//Solicitud de informacion
			tempMax[contador]=scanner.nextFloat();//Entrada de tempMax
			while(tempMax[contador]<tempMin[contador]) {//Bucle si se introduce tempMax inferior a tempMin
				System.out.println("La temperatura maxima no puede ser inferior a la minima, vuelve a introducir la temperatura maxima: ");//Informacion sobre error
				tempMax[contador]=scanner.nextFloat();//Entrada tempMax
			}
		}
		for(contador=0; contador<tempMin.length;contador++) {//Bucle para reccorer los dias buscando la media
			medTemp=(tempMin[contador]+tempMax[contador])/2;//sumamos tempMin y tempMax y dividimos por 2 para sacar la media de ese dia
			System.out.println("La temperatura media del dia "+(contador+1)+" es: "+medTemp);//Impresion de medTemp
		}
		for(contador=0;contador<tempMin.length;contador++) {//Bucle para recorrer las tempMin
			minTemp=Float.MAX_VALUE;//inicializamos minTemp al valor mas alto posible del array
			for(contador1=0;contador1<tempMin.length;contador1++) {//Bucle para comprobar tempMin con la minTemp almacenada
				if(tempMin[contador1]<minTemp && contador1+1 != diasMin[0] && contador1+1 != diasMin[1]&& contador1+1 != diasMin[2]&& contador1+1 != diasMin[3]&& contador1+1 != diasMin[4]) {
					//Condicional en caso de no repetirse la minima de un dia anterior.
					minTemp=tempMin[contador1];//al no repetirse el tempMin, lo almacenamos 
					diasMin[contador]=contador1+1;//Almacenamos la posicion del dia de la minima mas baja	
				}
			}
		}
		System.out.println("Los dias mas calurosos son: ");//Impresion de informacion
		for(int diasCalor:diasMin) {//Bucle para imprimir todos los dias segun orden almacenado
			System.out.print(" "+diasCalor);//Impresion diasCalor
		}
	}
}
