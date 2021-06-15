import java.util.Scanner;

public class Exercicio_Bonus_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * EX 10 – Antes da pandemia, o rodízio na cidade de São Paulo foi motivo de
		 * confusão em uma empresa: muitos dos 150 colaboradores estão se atrasando e
		 * alegando que o problema foi o horário do rodízio. Cansado disso, um dos
		 * diretores da empresa solicitou um programa que receba o NOME de cada um dos
		 * funcionários, o SETOR desses profissionais e o meio de transporte usado
		 * (CARRO ou ÔNIBUS). Caso o profissional use um CARRO para ir até a empresa,
		 * deve ser solicitada a digitação do último dígito numérico da placa do carro e
		 * a mensagem exibida deve ser: “Seu dia de rodízio é “ seguida do dia de
		 * rodízio. Caso o profissional use um ÔNIBUS para ir até a empresa, deve ser
		 * exibida a mensagem “rodízio não se aplica”.
		 */

		String nome, setor;
		int digitoPlaca, meioTranporte;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Olá, este programa irá te dizer qual é o dia do seu rodízio!");
		
		System.out.println("Por favor, digite seu nome:");
		nome = leitor.next();
		System.out.println("Por favor, digite seu Setor:");
		setor = leitor.next();
		System.out.println( nome + "Qual é o meio de transporte?\n1-Onibus\n2-Carro");
		meioTranporte = leitor.nextInt();
		
		switch(meioTranporte) {
			case 1: 
			System.out.println("O rodízio não se aplica");
			break;
		}
			
		}				
	}

