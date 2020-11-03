import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		//Ejercicio 2. Algoritmo que lea dos números, calculando y escribiendo el valor de su suma, resta, producto y división.
	float num1, num2;
	Scanner leer = new Scanner(System.in);
	System.out.println("Dime el valor del numero 1");
	num1=leer.nextInt();
	System.out.println("Dime el valor del numero 2");
	num2=leer.nextInt();
	System.out.println("El valor del numero 1 es " +num1);
	System.out.println("El valor del numero 2 es " +num2);
	System.out.println("La suma de los dos numeros es " + (num1 + num2));
	System.out.println("La resta de los dos numeros es " + (num1 - num2));
	System.out.println("La multiplicacion de los dos numeros es " + (num1 * num2));
	System.out.println("La division de los dos numeros es " + (num1 / num2));
	}

}
