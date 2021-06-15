import java.util.Scanner;

public class Exercicio_Bonus_Lista1_3 {

	public static void main(String[] args) {
		/*Solicite ao usuário a digitação de 2 números inteiros, nas variáveis A e B. Sem usar 
		uma terceira variável, troque os valores de A e B entre si
		 */
		System.out.println("este programa irá receber 2 números inteiros na variavel a e b e irá trocar seus valores sem criar uma terceira variavel");	
		Scanner leitor = new Scanner(System.in);
		int a, b;
		
		System.out.println("digite a variavel A");
		a = leitor.nextInt();
		System.out.println("digite a variavel B");
		b = leitor.nextInt();
		a = a + b;
		b = a - b;
		a = a-b;
		System.out.println("A variavel A é " + a + " e a variavel b é " + b);	
		leitor.close();
	}

	}


