import java.util.Scanner;

public class Exercicio_Bonus_Lista1_3 {

	public static void main(String[] args) {
		/*Solicite ao usu�rio a digita��o de 2 n�meros inteiros, nas vari�veis A e B. Sem usar 
		uma terceira vari�vel, troque os valores de A e B entre si
		 */
		System.out.println("este programa ir� receber 2 n�meros inteiros na variavel a e b e ir� trocar seus valores sem criar uma terceira variavel");	
		Scanner leitor = new Scanner(System.in);
		int a, b;
		
		System.out.println("digite a variavel A");
		a = leitor.nextInt();
		System.out.println("digite a variavel B");
		b = leitor.nextInt();
		a = a + b;
		b = a - b;
		a = a-b;
		System.out.println("A variavel A � " + a + " e a variavel b � " + b);	
		leitor.close();
	}

	}


