import java.util.Scanner;

public class Exercicio_Bonus_8 {

	public static void main(String[] args) {
		/*Um professor quer saber quantos alunos de uma sala de 50 tiveram nota maior do 
que a m�dia. Fa�a um programa onde o professor informe a m�dia e as notas de cada 
um dos 50 alunos e, ao final, seja exibido quantos alunos tiveram nota superior � m�dia 
e quantos tiveram nota inferior � m�dia. */
		
		Scanner leitor = new Scanner (System.in);
		
		double nota, media;
		int quantidadeAlunos, acimadaMedia=0, abaixodaMedia=0, contador =0;
		
		System.out.println("Programa que ir� calcular a m�dia e as notas de cada aluno e informar quantos foram acima ou abaixo da m�dia. Por favor insira a media de corte");
		
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
		
		System.out.println("O total acima da m�dia � :" + acimadaMedia + " e o total de alunos com nota abaixo da m�dia � de: " + abaixodaMedia);
		
		leitor.close();
	}

}
