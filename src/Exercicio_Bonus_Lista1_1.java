import java.util.Calendar;
import java.util.Scanner;

public class Exercicio_Bonus_Lista1_1 {

	public static void main(String[] args) {
		/*
		 * Para um ano de nascimento fornecido pelo usu�rio, informe a idade que ele
		 * ter� no dia 31 de dezembro de 2021. */
		
		Scanner leitor = new Scanner(System.in);
		int anoNascimento, resultado;
		System.out.println("Em que ano voc� nasceu?");	
		anoNascimento = leitor.nextInt();
		resultado = 2021 - anoNascimento;
		System.out.println("Voc� vai ter  " + resultado + " anos em 2021");
	}
}
