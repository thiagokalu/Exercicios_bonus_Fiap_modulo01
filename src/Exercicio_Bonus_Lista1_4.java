import java.util.Scanner;

public class Exercicio_Bonus_Lista1_4 {

	public static void main(String[] args) {
		/*
		 * Um robô de combate só deve ativar sua arma principal quando o inimigo está a
		 * menos de 70cm de distância. Faça um programa onde o usuário informe a
		 * distância do inimigo e sejam exibidas as mensagens “ATIVADO” ou “DESATIVADO”
		 * dependendo do status da arma
		 */
		System.out.println("Este programa irá informar se um robô de combate está com o seu sistema de armas ativado ou desativado. Se a distancia for menor de 70cm o sistema estará ativado");	
		System.out.println("");
		Scanner leitor = new Scanner(System.in);
		int distancia;
		System.out.println("Favor informar a distancia do inimigo");	
		distancia = leitor.nextInt();
		if (distancia<70) {
			System.out.println("O Sistema de armas está ATIVADO");		
		}else {
			System.out.println("O Sistema de armas está DESATIVADO");
		}
		leitor.close();
	}

}
