import java.util.Scanner;

public class Exercicio_Bonus_3 {

	public static void main(String[] args) {
		/* 3. Suponha que voc� esteja fazendo um concurso p�blico. 
		Cada candidato ao cargo ter� direito a uma pontua��o em 
		fun��o da sua titula��o, anos de experi�ncia e idade. 
		
		Baseado na tabela abaixo, fa�a um programa que leia o 
		nome do candidato, sua titula��o, tempo de experi�ncia e 
		idade. 
		O algoritmo dever� ent�o calcular e imprimir o nome 
		do candidato e sua pontua��o final. 
		
		Al�m disso, se o candidato possuir menos de 40 anos de idade, 
		ter� direito a mais 100 pontos. Caso contr�rio, perder� 50 
		pontos.*/
		
		Scanner leitor = new Scanner (System.in);
		

		int idade, pontuacao, escolha, xp, bonusIdade;
		String nome ="";
		
		System.out.println("Este programa ir� calcular a pontua��o de candidatos a um concurso publico, levando em considera��o a idade e os anos de experi�ncia.\n");
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
		System.out.println("Por escolha sua titula��o:\n1 -2o grau\n2 - Gradua��o\n3 - P�s-Gradua��o");
		escolha = leitor.nextInt();
			

		if (escolha == 1) 
		{
			pontuacao = 50 + bonusIdade ;
			System.out.println("Senhor(a)" + nome + "Sua pontua��o total ser� de: " + pontuacao  + " pontos"); 	
		}
		else if (escolha ==2) 
		{
			System.out.println("Escolha quantos Anos de Experi�ncia:\n1 - At� 4 anos\n2 - Acima de 4 anos");
			xp = leitor.nextInt();
			
			if (xp ==1)
			{
				pontuacao = 70 + bonusIdade;
				System.out.println("Senhor(a)" + nome + "Sua pontua��o total ser� de: " + pontuacao  + " pontos"); 
			}
			else
			{
				pontuacao = 90 + bonusIdade;
				System.out.println("Senhor(a)" + nome + "Sua pontua��o total ser� de: " + pontuacao  + " pontos"); 
			}
			
			
		}
		else if (escolha ==3) 
		{
			System.out.println("Escolha quantos Anos de Experi�ncia:\n1 - At� 4 anos\n2 - Acima de 4 anos");
			xp = leitor.nextInt();
			if (xp ==1)
			{
				pontuacao = 100 + bonusIdade;
				System.out.println("Senhor(a)" + nome + "Sua pontua��o total ser� de: " + pontuacao  + " pontos"); 
			}
			else if (xp ==2) {
				pontuacao = 120 + bonusIdade;
				System.out.println("Senhor(a)" + nome + "Sua pontua��o total ser� de: " + pontuacao  + " pontos"); 
			}
			else if (xp ==3) {
				pontuacao = 150 + bonusIdade;
				System.out.println("Senhor(a)" + nome + "Sua pontua��o total ser� de: " + pontuacao  + " pontos");
			}
	
			}
		else
		{
			System.out.println("Op��o inv�lida.");
		}
		leitor.close();	
		}
			
	}



