import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double altura, peso, imc;

		altura = sc.nextDouble();
		peso = sc.nextDouble();

		// imc = 40.1; usado para testes.

		imc = peso / (altura * altura);

		if (imc < 18.5) {
			System.out.printf("Você está abaixo do peso, e o resultado é %.1f%n", imc);
		} else if (imc <= 24.9) {
			System.out.printf("Você está com o peso normal, e o resultado é %.1f%n", imc);
		} else if (imc <= 29.9) {
			System.out.printf("Você está com sobrepeso, e o resultado é %.1f%n", imc);
		} else if (imc <= 34.9) {
			System.out.printf("Você está com obesidade grau 1, e o resultado é %.1f%n", imc);
		} else if (imc <= 39.9) {
			System.out.printf("Você está com obesidade grau 2, e o resultado é %.1f%n", imc);
		} else if (imc >= 40) {
			System.out.printf("Você está com obesidade grau 3, e o resultado é %.1f%n", imc);
		} else {
			System.out.println("Valores fora do calculo");
		}

		sc.close();

	}

}
