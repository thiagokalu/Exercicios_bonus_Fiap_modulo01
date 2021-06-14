import java.util.Scanner;

public class Exercicio_Bonus_7 {

	public static void main(String[] args) {
		/*
		No parque Valter Dino World, os clientes podem ter a chance de passar uma noite 
		no castelo da princesa Javarella. Para isso, devem acertar quantos feijões estão em um 
		jarro (1238). Faça um programa que solicite a digitação da quantidade de feijões até que 
		um cliente acerte.*/
		
		int chuteUsuario;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Tente advinhar o número secreto, digite seu chute e aperte enter:\n");
	
		chuteUsuario = leitor.nextInt();
		
		while(chuteUsuario!=1238)
		{
		System.out.println("Você errou!!!\n tente novamente:");		
		chuteUsuario = leitor.nextInt();
		}	
		System.out.println("Você acertou, o número secreto é 1238");
		leitor.close();
	}
}
