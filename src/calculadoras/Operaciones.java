package calculadoras;
import java.util.Scanner;

public class Operaciones {

	public static void main(String[] args) {
		
		int operacion;
		int primero;
		int segundo;
		int resultado;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Escribe 1 para sumar, 2, para restar, "
				+ "3 para multiplicar y 4 para dividir");
		operacion = in.nextInt();
		
		System.out.println("Introduce el primer n�mero.");
		primero = in.nextInt();
		
		System.out.println("Introduce el segundo n�mero.");
		segundo = in.nextInt();
		
		switch (operacion)
		{
		case 1:
		{
			resultado = primero + segundo;
			System.out.println("El resultado de la suma es: " + resultado);
			break;
		}
		
		case 2:
		{
			resultado = primero - segundo;
			System.out.println("El resultado de la resta es: " + resultado);
			break;
		}
		
		case 3:
		{
			resultado = primero * segundo;
			System.out.println("El resultado de la multiplicaci�n es: " + resultado);
			break;
		}
		
		case 4:
		{
			resultado = primero / segundo;
			System.out.println("El resultado de la divisi�n es: " + resultado);
			break;
		}
		
		}
		in.close();

  }

}
