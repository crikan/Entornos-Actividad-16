package calculadoras;
import java.util.Scanner;

public class Operaciones {

	public static void main(String[] args) {
		
		int operacion;
		int primero;
		int segundo;
		int resultado;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Introduce el primer número.");
		primero = in.nextInt();
		System.out.println("Introduce el segundo número.");
		segundo = in.nextInt();
		System.out.println("Escribe 1 para sumar, 2, para restar, "
				+ "3 para multiplicar y 4 para dividir");
		operacion = in.nextInt();
		if (operacion == 1) {
			resultado = primero + segundo;
			System.out.println("El resultado de la suma es: " + resultado);
		}

	}

}
