import java.util.Scanner;

public class Exercicio_Bonus_8 {

	public static void main(String[] args) {
		/*Um professor quer saber quantos alunos de uma sala de 50 tiveram nota maior do 
que a média. Faça um programa onde o professor informe a média e as notas de cada 
um dos 50 alunos e, ao final, seja exibido quantos alunos tiveram nota superior à média 
e quantos tiveram nota inferior à média. */
		
		Scanner leitor = new Scanner (System.in);
		
		double nota, media;
		int quantidadeAlunos, acimadaMedia=0, abaixodaMedia=0, contador =0;
		
		System.out.println("Programa que irá calcular a média e as notas de cada aluno e informar quantos foram acima ou abaixo da média. Por favor insira a media de corte");
		
		media = leitor.nextInt();
		
		System.out.println("Digite a quantidade de alunos");
		
		quantidadeAlunos = leitor.nextInt();
		
		while (contador < quantidadeAlunos)
		{
		System.out.println("Digite a nota do aluno");
		nota = leitor.nextDouble();
		if (nota < media){
			abaixodaMedia = abaixodaMedia + 1;
		}else {
			acimadaMedia = acimadaMedia +1;
		}
		contador = contador+1;	
		
	}
		
		System.out.println("O total acima da média é :" + acimadaMedia + " e o total de alunos com nota abaixo da média é de: " + abaixodaMedia);
		
		leitor.close();
	}

}
