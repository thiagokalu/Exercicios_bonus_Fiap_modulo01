import java.util.Scanner;

public class Exercicio_Bonus_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * EX 10 � Antes da pandemia, o rod�zio na cidade de S�o Paulo foi motivo de
		 * confus�o em uma empresa: muitos dos 150 colaboradores est�o se atrasando e
		 * alegando que o problema foi o hor�rio do rod�zio. Cansado disso, um dos
		 * diretores da empresa solicitou um programa que receba o NOME de cada um dos
		 * funcion�rios, o SETOR desses profissionais e o meio de transporte usado
		 * (CARRO ou �NIBUS). Caso o profissional use um CARRO para ir at� a empresa,
		 * deve ser solicitada a digita��o do �ltimo d�gito num�rico da placa do carro e
		 * a mensagem exibida deve ser: �Seu dia de rod�zio � � seguida do dia de
		 * rod�zio. Caso o profissional use um �NIBUS para ir at� a empresa, deve ser
		 * exibida a mensagem �rod�zio n�o se aplica�.
		 */

		String nome, setor;
		int digitoPlaca, meioTranporte;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Ol�, este programa ir� te dizer qual � o dia do seu rod�zio!");
		
		System.out.println("Por favor, digite seu nome:");
		nome = leitor.next();
		System.out.println("Por favor, digite seu Setor:");
		setor = leitor.next();
		System.out.println( nome + "Qual � o meio de transporte?\n1-Onibus\n2-Carro");
		meioTranporte = leitor.nextInt();
		
		switch(meioTranporte) {
			case 1: 
			System.out.println("O rod�zio n�o se aplica");
			break;
		}
			
		}				
	}

