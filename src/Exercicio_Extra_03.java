import java.util.Scanner;

public class Exercicio_Extra_03 {

	public static void main(String[] args) {
		/*Criar um programa que calcule a média de salários de uma empresa, 
        pedindo ao usuário a grade de funcionários e os salários, e devolvendo a média salarial.*/

		Scanner leitor = new Scanner(System.in);
		double salario, mediaSalarial, totalSalarios=0;
        int numeroDeFuncionarios;

		System.out.println("Olá, este programa irá receber um número informado pelo usuário de funcionários e os salários. A partir do numero de salários e o número de funcionários o programa irá informar a média salarial.");
		System.out.println("Por favor, informe quantos salários serão cadastrados"); 
        numeroDeFuncionarios = leitor.nextInt();
       for (int i = 0; 
            i < numeroDeFuncionarios;
            i++){
                System.out.println("Por favor, informe o salário");                
                salario = leitor.nextDouble();
                totalSalarios = totalSalarios + salario;
            }
			
        mediaSalarial = totalSalarios / numeroDeFuncionarios ;
		System.out.println("A média salarial dos " + numeroDeFuncionarios + " é de R$ " + mediaSalarial);
		
		leitor.close();
	}

}
