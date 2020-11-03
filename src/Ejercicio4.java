import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		//Ejercicio4-Algoritmo que lea tres números distintos y nos diga cual de ellos es el mayor
	int num1, num2, num3;
	Scanner leer = new Scanner(System.in);
	System.out.println("Dime tres numeros distintos y te dire cual es mayor");
	num1=leer.nextInt();
	num2=leer.nextInt();
	num3=leer.nextInt();
	if (num1>num2) {
		System.out.println("El numero "+num1 +"es mayor que " + num2);
	} else {
		System.out.println("El numero " +num2 +" es mayor que " +num1);
	if (num1>num3) {
		System.out.println("El numero "+num1 +"es mayor que " + num3);
	} else {
		System.out.println("El numero " +num3 +" es mayor que " +num1);
	}
	}
	}

}
