import java.util.Scanner;

public class Exercicio_Bonus_1 {

	public static void main(String[] args) {
		/*  Escrever um algoritmo para determinar o consumo m�dio de 
		um autom�vel sendo fornecida a dist�ncia total percorrida 
		pelo autom�vel e o total de combust�vel gasto. */

		Scanner leitor = new Scanner(System.in);
		double combustivelGasto, distanciaTotalPercorrida, consumoMedio;
		
		System.out.println("Ol�, este programa ir� calcular o consumo m�dio de comb�stivel de um autom�vel, dada a distancia percorrida e o combust�vel gasto");
		System.out.println("Por favor, informe a distancia percorrida em quil�metros:"); 
		distanciaTotalPercorrida = leitor.nextDouble();
		System.out.println("Por favor, informe o combust�vel gasto:"); 
		combustivelGasto = leitor.nextDouble();
		
		consumoMedio = distanciaTotalPercorrida / combustivelGasto;
		
		System.out.println("O consumo m�dio do ve�culo �:" + consumoMedio);
		
		leitor.close();
	}

}
