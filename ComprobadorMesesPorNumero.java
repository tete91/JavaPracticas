package EjercicioOpcional6;
import java.util.Scanner;
public class main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Este programa pedira un numero de mes y dira que mes es y su numero de dias. utilizando un array
		//Primero inicializamos escaner y variables a utilizar.
		Scanner scanner=new Scanner(System.in);
		int comprobar=0;//Variable para leer numero por terminal.
		String[][] meses= {//Array bidimensional con los meses colocado segun su posicion en el año-1
				{"Enero","31"},{"Febrero","28"},{"Marzo","31"},{"Abril","30"},
				{"Mayo","31"},{"Junio","30"},{"Julio","31"},{"Agosto","31"},
				{"Septiembre","30"},{"Octubre","31"},{"Noviembre","30"},
				{"Diciembre","31"}
				};//Array con los meses introducidor por numero de fila.
		System.out.println("Usuario introduzca un numero y le diré a que mes del año pertene y cuantos dias tiene el mes: ");//Solicitud de informacion
		while(comprobar<=0||comprobar>12) {//While que iterara mientras se introduzcan numeros no validos.
			comprobar=scanner.nextInt();//Entrada de informacion
			if(comprobar<=0||comprobar>12){//Condicional solo en caso de introducir mal el mes
				System.out.println("El mes introducido no es valido, vuelve a intentarlo");//impresion de informacion
			}
		}
		System.out.print("El mes que pertenece al numero introducido es "+meses[comprobar-1][0]);//Impresion del mes perteneciente al numero introducido
		System.out.println(" y tiene "+meses[comprobar-1][1]+" dias.");//Impresion de los dias del mes del numero introducido
	}
}
