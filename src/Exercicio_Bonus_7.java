import java.util.Scanner;

public class Exercicio_Bonus_7 {

	public static void main(String[] args) {
		/*
		No parque Valter Dino World, os clientes podem ter a chance de passar uma noite 
		no castelo da princesa Javarella. Para isso, devem acertar quantos feij�es est�o em um 
		jarro (1238). Fa�a um programa que solicite a digita��o da quantidade de feij�es at� que 
		um cliente acerte.*/
		
		int chuteUsuario;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Tente advinhar o n�mero secreto, digite seu chute e aperte enter:\n");
	
		chuteUsuario = leitor.nextInt();
		
		while(chuteUsuario!=1238)
		{
		System.out.println("Voc� errou!!!\n tente novamente:");		
		chuteUsuario = leitor.nextInt();
		}	
		System.out.println("Voc� acertou, o n�mero secreto � 1238");
		leitor.close();
	}
}
