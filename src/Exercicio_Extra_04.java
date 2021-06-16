import java.util.Scanner;

public class Exercicio_Extra_04 {
    
    /*Uma parede em formato retangular, cuja altura é hp (altura da parede) e a largura lp (largura da parede) 
    precisa ser coberta por azulejos também retangulares. O azulejo retangular tem dimensões ha (altura do azulejo) 
    e la (largura do azulejo). 
    Escreva um programa que leia as quatro medidas hp, lp, ha e la, calcule e imprima quanto azulejos com as 
    medidas dadas são necessários para cobrir a parede dada.*/
  
	public static void main(String[] args) {
  
    Scanner leitor = new Scanner(System.in);
		double hp, lp, ha, la, areaParede, AreaAzulejo, totalAzulejos;
        

		System.out.println("Olá, este programa irá informar quantos azulejos sao necessários para preencher uma parede.");
		System.out.println("Por favor, informe a altura da parede (hp)");
        hp = leitor.nextDouble();
        System.out.println("Por favor, informe a largura da parede (lp)");
        lp = leitor.nextDouble();
        areaParede = hp * lp;
        System.out.println("Por favor, informe a altura do azulejo (ha)");
        ha = leitor.nextDouble();
        System.out.println("Por favor, informe a largura do azulejo (la)");
        la = leitor.nextDouble();  
        AreaAzulejo = ha * la;
           
        totalAzulejos = areaParede / AreaAzulejo;
      
		System.out.println("você irá precisar de " + totalAzulejos + " azulejos!");
		
		leitor.close();
 }
}
