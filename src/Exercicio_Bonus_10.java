import java.util.Scanner;

public class Exercicio_10_Loop_For {

	// EX 10 – Antes da pandemia, o rodízio na cidade de São Paulo foi motivo de
	// confusão em uma empresa: muitos dos 150 colaboradores estão se atrasando e
	// alegando que o problema foi o horário do rodízio.

	// Cansado disso, um dos diretores da empresa solicitou um programa que receba o
	// NOME de cada um dos funcionários, o SETOR desses profissionais e o meio de
	// transporte usado (CARRO ou ÔNIBUS).

	// Caso o profissional use um CARRO para ir até a empresa, deve ser solicitada a
	// digitação do último dígito numérico da placa do carro e a mensagem exibida
	// deve ser: “Seu dia de rodízio é “ seguida do dia de rodízio.

	// Caso o profissional use um ÔNIBUS para ir até a empresa, deve ser exibida a
	// mensagem “rodízio não se aplica”.

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		String nome = "", setor = "";
		int escolha, placa;

		for (int i = 0; i < 5; i++) {
			System.out.println("Qual seu nome?");
			nome = leitor.next();

			System.out.println("Qual o seu setor?");
			setor = leitor.next();

			System.out.println("Informe o meio de Transporte.\n1 - Carro\n2 - Ônibus");
			escolha = leitor.nextInt();

			if (escolha == 1) {
				System.out.println("Informe o final da placa do carro:");
				placa = leitor.nextInt();

				if (placa == 1 || placa == 2) {
					System.out.println("Seu dia de rodízio é SEGUNDA-FEIRA");
				} else if (placa == 3 || placa == 4) {
					System.out.println("Seu dia de rodízio é TERÇA-FEIRA");
				} else if (placa == 5 || placa == 6) {
					System.out.println("Seu dia de rodízio é QUARTA-FEIRA");
				} else if (placa == 7 || placa == 8) {
					System.out.println("Seu dia de rodízio é QUINTA-FEIRA");
				} else if (placa == 9 || placa == 0) {
					System.out.println("Seu dia de rodízio é SEXTA-FEIRA");
				}
			} else if (escolha == 2) {
				System.out.println("Rodízio não se aplica.");
			} else {
				System.out.println("Opção Inválida!");
			}
		}

		leitor.close();

	}

}