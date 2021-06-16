import java.util.Scanner;

public class Exercicio_Extra_06 {
    
    /*.Escreva um programa para determinar a quantidade de cavalos necessários para se levantar 
    uma massa de m quilogramas a uma altura de h metros em t segundos. Considere cavalos = (m * h / t) / 745,6999.*/
  
	public static void main(String[] args) {
  
    Scanner leitor = new Scanner(System.in);
		double m, h, t,c;
        

		System.out.println("Olá, este programa irá informar quantos cavalos são necessários.");
        System.out.println("Por favor, informe a massa)");
        m = leitor.nextDouble();
        System.out.println("Por favor, informe a altura da massa");
        h = leitor.nextDouble();
        System.out.println("Por favor, informe o tempo");
        t = leitor.nextDouble();
        c = m *  h / t / 745.6999 ;
        System.out.println("Os cavalos necessários são " + c);		
		leitor.close();
 }
}
