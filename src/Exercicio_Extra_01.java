import java.util.Scanner;

public class Exercicio_Extra_01 {

	public static void main(String[] args) {
		// Escreva um programa que, com base em uma temperatura em graus celsius, a
		// converta e exiba em Kelvin (K), Reaumur (Re), Rankine (Ra) e Fahrenheit (F),
		// seguindo as fórmulas: F = C * 1.8 + 32; K = C + 273.15; Re = C * 0.8; Ra = C
		// * 1.8 + 32 + 459.67
		
		Scanner leitor = new Scanner(System.in);
		double celsius, kelvin, reaumur, rankine, farenheit;
		System.out.println("Por favor  digite a temperatura em graus Celsius");
		celsius = leitor.nextDouble();
		farenheit = celsius * 1.8 + 32;
		kelvin = celsius + 273.15;
		reaumur = celsius * 0.8;
		rankine = celsius * 1.8 + 32 + 459.67;
	
		
		System.out.println("Segue abaixo a conversão de " + celsius + " celsius");
		System.out.println("Em Kelvin: " + kelvin + "° Em reaumur " + reaumur + "° Em rankine " + rankine + "° Em farenheit " + farenheit + "°");
		leitor.close();						
	}
}
