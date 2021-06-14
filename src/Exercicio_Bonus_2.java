import java.util.Scanner;

public class Exercicio_Bonus_2 {

	public static void main(String[] args) {
		/* 2. Fa�a um algoritmo que calcule o valor da conta de luz de 
		uma pessoa. Sabe-se que o c�lculo da conta de luz segue a 
		tabela abaixo: 
		Tipo de Cliente Valor do KW/h 
		1 (Resid�ncia) 0,60 
		2 (Com�rcio) 0,48 
		3 (Ind�stria) 1,29 */
		
		Scanner leitor = new Scanner(System.in);
		
		double taxaResidencia=0.60, taxaComercio=0.48, taxaIndustria=1.29;
		double kwH, consumo;
		int escolha;
		
		System.out.println("Este programa ir� calcular a conta de luz, baseado em qual tipo de estabelecimento e quantos KW/h foram gastos");
		
		System.out.println("Favor informal o total consumido em kwH:");
	
		consumo = leitor.nextDouble();
		
		System.out.println("Favor informar o tipo de estabelecimento");
		
		System.out.println("1 - Residencial\n2 - Comercial\n3 - Industria");
		escolha = leitor.nextInt(); 

		if (escolha == 1) {
			kwH = consumo * taxaResidencia;
			System.out.println("O total da conta de luz �:" + kwH);					
		}else if (escolha == 2){
			kwH = consumo * taxaComercio; 
			System.out.println("O total da conta de luz �:" + kwH);	
		}else if (escolha == 3){
			kwH = consumo * taxaIndustria; 
			System.out.println("O total da conta de luz �:" + kwH);	
		}else {
			System.out.println("Op��o inv�lida");			
		}
		leitor.close();
   	}
}

