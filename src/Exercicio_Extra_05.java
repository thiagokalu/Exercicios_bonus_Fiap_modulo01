import java.util.Scanner;

public class Exercicio_Extra_05 {
    
    /*. Calcular e apresentar o valor do volume de uma lata de óleo, utilizando fórmula: V = 3.14159 * R * R * A, em que as 
    variáveis: V, R e A representam respectivamente o volume, o raio e a altura.
    Vamos declarar as variáveis V, R e A como double e definir um valor qualquer 
    para as variáveis de altura e de raio. Agora vamos escrever a fórmula, conforme dita no enunciado e, em seguida, exibir na 
    tela uma mensagem contendo o resultado do volume encontrado.*/
  
	public static void main(String[] args) {
  
    Scanner leitor = new Scanner(System.in);
		double V, R, A;
        

		System.out.println("Olá, este programa irá informar o volume de uma lata de óleo baseado eno raio e na altura.");
        System.out.println("Por favor, informe o raio da lata)");
        R = leitor.nextDouble();
        System.out.println("Por favor, informe a altura da lata");
        A = leitor.nextDouble();
        V = 3.14159 * R * R * A;     
		System.out.println("O Volume da lata é " + V);
		
		leitor.close();
 }
}
