import java.util.Scanner;

public class Exercicio_Bonus_Lista1_5 {

	public static void main(String[] args) {
		/*
		 * 5 � Um drone de limpeza de ruas deve escolher carregar sempre o lixo de menor
		 * peso. Entre os pesos de 3 lixos informados pelo usu�rio, um programa deve
		 * indicar qual deles deve ser carregado pelo drone
		 */
		
		int lixo1, lixo2, lixo3;
		Scanner leitor = new Scanner(System.in);
		System.out.println("Este programa ir� selecionar para um drone de limpeza qual entre os 3 pesos de lixo informados pelo usu�rio, ser�o levados. O lixo de menor peso sempre � selecionado>");	
		System.out.println("Por favor, informe o peso do lixo 1:");
		lixo1 = leitor.nextInt();
		System.out.println("Por favor, informe o peso do lixo 2:");
		lixo2 = leitor.nextInt();
		System.out.println("Por favor, informe o peso do lixo 3:");
		lixo3 = leitor.nextInt();
		
		if (lixo1<lixo2 && lixo1<lixo3) {
			System.out.println("O lixo 1 � mais leve e ser� levado");						
		}else if(lixo2<lixo1&&lixo2<lixo3){
			System.out.println("O lixo 2 � mais leve e ser� levado");						
		}else {
			System.out.println("O lixo 3 � mais leve e ser� levado");
		}
		leitor.close();
	}
}
