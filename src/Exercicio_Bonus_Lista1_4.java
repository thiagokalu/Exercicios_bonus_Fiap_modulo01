import java.util.Scanner;

public class Exercicio_Bonus_Lista1_4 {

	public static void main(String[] args) {
		/*
		 * Um rob� de combate s� deve ativar sua arma principal quando o inimigo est� a
		 * menos de 70cm de dist�ncia. Fa�a um programa onde o usu�rio informe a
		 * dist�ncia do inimigo e sejam exibidas as mensagens �ATIVADO� ou �DESATIVADO�
		 * dependendo do status da arma
		 */
		System.out.println("Este programa ir� informar se um rob� de combate est� com o seu sistema de armas ativado ou desativado. Se a distancia for menor de 70cm o sistema estar� ativado");	
		System.out.println("");
		Scanner leitor = new Scanner(System.in);
		int distancia;
		System.out.println("Favor informar a distancia do inimigo");	
		distancia = leitor.nextInt();
		if (distancia<70) {
			System.out.println("O Sistema de armas est� ATIVADO");		
		}else {
			System.out.println("O Sistema de armas est� DESATIVADO");
		}
		leitor.close();
	}

}
