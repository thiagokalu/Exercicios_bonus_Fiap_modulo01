import java.util.Scanner;

public class Exercicio_Bonus_Lista1_6 {

	public static void main(String[] args) {
		/*
		 * 
		 * Uma loja oferece um desconto de 3% aos clientes que tiverem o cupom
		 * �DIADEFESTA�. Fa�a um programa onde o funcion�rio digite o valor da compra e
		 * um cupom, informando o valor final a ser pago.
		 */
		String cupomDesconto = "DIADEFESTA"; 
		double valorCompra, valorTotal, desconto;
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Este programa ir� informar o total de uma compra. Se o cumpom DIADEFESTA for colocado informado, haver� um desconto de 3% do valor total");	
		System.out.println("Por favor, informe o valor da sua compra:");
		valorCompra = leitor.nextInt();
		System.out.println("Por favor, informe o cupom caso houver:");
		cupomDesconto = leitor.next();
		
		if (cupomDesconto.equalsIgnoreCase("DIADEFESTA")) {
			desconto = valorCompra * 0.03;
			valorTotal = valorCompra - (desconto);
			System.out.println("O valor total � de R$ " + valorTotal);			
		}else{
			System.out.println("O valor total � de R$ " + valorCompra);	
		}
	}

}

