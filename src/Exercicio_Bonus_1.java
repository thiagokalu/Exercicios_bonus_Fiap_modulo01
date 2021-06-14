import java.util.Scanner;

public class Exercicio_Bonus_1 {

	public static void main(String[] args) {
		/*  Escrever um algoritmo para determinar o consumo médio de 
		um automóvel sendo fornecida a distância total percorrida 
		pelo automóvel e o total de combustível gasto. */

		Scanner leitor = new Scanner(System.in);
		double combustivelGasto, distanciaTotalPercorrida, consumoMedio;
		
		System.out.println("Olá, este programa irá calcular o consumo médio de combústivel de um automóvel, dada a distancia percorrida e o combustível gasto");
		System.out.println("Por favor, informe a distancia percorrida em quilômetros:"); 
		distanciaTotalPercorrida = leitor.nextDouble();
		System.out.println("Por favor, informe o combustível gasto:"); 
		combustivelGasto = leitor.nextDouble();
		
		consumoMedio = distanciaTotalPercorrida / combustivelGasto;
		
		System.out.println("O consumo médio do veículo é:" + consumoMedio);
		
		leitor.close();
	}

}
