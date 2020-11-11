import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		//Ejercicio 3-Algoritmo que lea dos números y nos diga cual de ellos es mayor o bien si son iguales
	float num1, num2;
	Scanner leer = new Scanner(System.in);
	System.out.println("Dime dos numeros");
	num1=leer.nextInt();
	num2=leer.nextInt();
	if (num1>num2) {
		System.out.println("El numero "+num1 +"es mayor que " + num2);
	}else {
		System.out.println("El numero " +num2 +" es mayor que " +num1);
	}}	
}