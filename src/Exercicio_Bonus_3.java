import java.util.Scanner;

public class Exercicio_Bonus_3 {

	public static void main(String[] args) {
		/* 3. Suponha que você esteja fazendo um concurso público. 
		Cada candidato ao cargo terá direito a uma pontuação em 
		função da sua titulação, anos de experiência e idade. 
		
		Baseado na tabela abaixo, faça um programa que leia o 
		nome do candidato, sua titulação, tempo de experiência e 
		idade. 
		O algoritmo deverá então calcular e imprimir o nome 
		do candidato e sua pontuação final. 
		
		Além disso, se o candidato possuir menos de 40 anos de idade, 
		terá direito a mais 100 pontos. Caso contrário, perderá 50 
		pontos.*/
		
		Scanner leitor = new Scanner (System.in);
		

		int idade, pontuacao, escolha, xp, bonusIdade;
		String nome ="";
		
		System.out.println("Este programa irá calcular a pontuação de candidatos a um concurso publico, levando em consideração a idade e os anos de experiência.\n");
	//primeira parte do exercicio//	
		System.out.println("Por favor digite seu nome");
		nome = leitor.next();
		
		System.out.println("Por favor digite sua idade");
		idade = leitor.nextInt();
	
		if (idade>40) {
			bonusIdade = -50;
		}else{
			bonusIdade = 100;
		}
		System.out.println("Por escolha sua titulação:\n1 -2o grau\n2 - Graduação\n3 - Pós-Graduação");
		escolha = leitor.nextInt();
			

		if (escolha == 1) 
		{
			pontuacao = 50 + bonusIdade ;
			System.out.println("Senhor(a)" + nome + "Sua pontuação total será de: " + pontuacao  + " pontos"); 	
		}
		else if (escolha ==2) 
		{
			System.out.println("Escolha quantos Anos de Experiência:\n1 - Até 4 anos\n2 - Acima de 4 anos");
			xp = leitor.nextInt();
			
			if (xp ==1)
			{
				pontuacao = 70 + bonusIdade;
				System.out.println("Senhor(a)" + nome + "Sua pontuação total será de: " + pontuacao  + " pontos"); 
			}
			else
			{
				pontuacao = 90 + bonusIdade;
				System.out.println("Senhor(a)" + nome + "Sua pontuação total será de: " + pontuacao  + " pontos"); 
			}
			
			
		}
		else if (escolha ==3) 
		{
			System.out.println("Escolha quantos Anos de Experiência:\n1 - Até 4 anos\n2 - Acima de 4 anos");
			xp = leitor.nextInt();
			if (xp ==1)
			{
				pontuacao = 100 + bonusIdade;
				System.out.println("Senhor(a)" + nome + "Sua pontuação total será de: " + pontuacao  + " pontos"); 
			}
			else if (xp ==2) {
				pontuacao = 120 + bonusIdade;
				System.out.println("Senhor(a)" + nome + "Sua pontuação total será de: " + pontuacao  + " pontos"); 
			}
			else if (xp ==3) {
				pontuacao = 150 + bonusIdade;
				System.out.println("Senhor(a)" + nome + "Sua pontuação total será de: " + pontuacao  + " pontos");
			}
	
			}
		else
		{
			System.out.println("Opção inválida.");
		}
		leitor.close();	
		}
			
	}



