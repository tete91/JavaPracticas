package EjercicioOpcional8;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Este programa guardara nombre y edades de alumnos hasta que se introduzca *,
		//despues imprimirá los mayores de edad y los mas mayores
		//Primero inicializamos el scanner y las variables a utilizar
		Scanner scanner=new Scanner(System.in);
		ArrayList<String> nombreAlumno=new ArrayList<>();//Lista para los nombres de alumnos
		ArrayList<Integer> edadAlumno= new ArrayList<>();//Lista para las edades de alumnos
		int contador=0;//Contador para recorrer la lista
		String nomInt="";//Variable para leer el nombre introducido por terminal
		int edad=0;//Variable para leer la edad introducida por terminal
		String alMayor1="";//Variable alumno mas mayor
		String alMayor2="";//Variable 2o alumno mas mayor
		String alMayor3="";//Variable 3r alumno mas mayor
		int edMayor1=0;//Variable edad mas alta
		int edMayor2=0;//Variable 2a edad mas alta
		int edMayor3=0;//Variables 3a edad mas alta
		System.out.println("Introduzca alumnos a continuacion hasta que indique * para salir: ");//impresion de informacion del programa
		while(!nomInt.equals("*")) {//Bucle que itera mientras no se introduzca * por terminal
			System.out.println("Introduzca el nombre del alumno: ");//solicitud de informacion
			nomInt=scanner.nextLine();//recogemos nombre alumno o fin de iteracion
			if(!nomInt.equals("*")) {//Condicional en caso de ser nombre
				System.out.println("Introduzca la edad del alumno "+nomInt+":");//solicitud de informacion
				edad=scanner.nextInt();//recogemos edad alumno
				scanner.nextLine();//Limpiamos buffer
				nombreAlumno.add(nomInt);//introducimos el nombre leido en su lista
				edadAlumno.add(edad);//Introducimos la edad leida en su lista
			}
		}
		System.out.print("Los alumnos mayores de edad son: ");//Informacion
		for(contador=0; contador<nombreAlumno.size();contador++) {//Bucle que recorre la lista de nombres
			if(edadAlumno.get(contador)>=18) {//Condicional si es mayor de edad
				System.out.print(nombreAlumno.get(contador)+" ");//Imprimimos el nombre del alumno mayor de edad
			}
		}
		System.out.println(".");//informacion
		System.out.println();//Salto de linea
		for(contador=0; contador<nombreAlumno.size();contador++){//Bucle que recorre la lista
			if(edadAlumno.get(contador)>edMayor1) {//Condicional si la edad de la lista es mayor a la guardada en la variable
				edMayor1=edadAlumno.get(contador);//guardamos la nueva edad
				alMayor1=nombreAlumno.get(contador);//Guardamos el nombre del alumno de esa posicion
			}
		}
		for(contador=0; contador<nombreAlumno.size();contador++){//Bucle que recorre la lista
			if(edadAlumno.get(contador)>=edMayor2&&!nombreAlumno.get(contador).equals(alMayor1)) {//Condicional si la edad de la lista es mayor a la guardada en la variable y menor del alumno mayor 1
				edMayor2=edadAlumno.get(contador);//guardamos la nueva edad
				alMayor2=nombreAlumno.get(contador);//Guardamos el nombre del alumno de esa posicion
			}
		}
		for(contador=0; contador<nombreAlumno.size();contador++){//Bucle que recorre la lista
			if(edadAlumno.get(contador)>edMayor3&&!nombreAlumno.get(contador).equals(alMayor1)&&!nombreAlumno.get(contador).equals(alMayor2)) {//Condicional si la edad de la lista es mayor a la guardada en la variable y menor del alumno mayor 1 y 2
				edMayor3=edadAlumno.get(contador);//guardamos la nueva edad
				alMayor3=nombreAlumno.get(contador);//Guardamos el nombre del alumno de esa posicion
			}
		}
		System.out.println("Los 3 alumnos mas mayores son: "+alMayor1+" "+alMayor2+" "+alMayor3);//Imprimimos los alumnos mayores.
	}
}
