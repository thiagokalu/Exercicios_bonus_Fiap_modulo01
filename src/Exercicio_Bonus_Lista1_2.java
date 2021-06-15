import java.util.Scanner;

public class Exercicio_Bonus_Lista1_2 {

	public static void main(String[] args) {
		/*
		 * 2 – Sabendo que cada hora dura 60 minutos e que cada minuto dura 60 segundos,
		 * solicite ao usuário que digite o tempo de um filme em minutos e informe a
		 * duração desse filme em horas e em segundos.
		 */
	
		Scanner leitor = new Scanner(System.in);
		double duracaoFilmeHoras, duracaoFilmeSegundos, duracaoFilmeMinutos;
		System.out.println("Este programa irá transformar a duração de um filme de minutos para horas e segundos!");
		System.out.println("Favor digitar a duração do filme em minutos:");	
		duracaoFilmeMinutos = leitor.nextDouble();
		duracaoFilmeHoras = duracaoFilmeMinutos / 60;
		duracaoFilmeSegundos = duracaoFilmeMinutos * 60;
		System.out.println("O Filme tem " + duracaoFilmeHoras + "horas e " + duracaoFilmeSegundos + " segundos");
	}

}
