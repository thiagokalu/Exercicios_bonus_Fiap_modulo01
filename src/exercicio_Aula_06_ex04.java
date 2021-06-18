import java.util.Scanner;

public class exercicio_Aula_06_ex04 {
    
    public static void main(String[] args){

// Considere a criação de um vetor de 50 posições chamado
// vetCarrinhoValores que servirá para armazenar os valores de
// produtos comprados por um cliente, e outro vetor de 50 posições
// chamado vetCarrinhoNomes que servirá para armazenar os nomes
// de produtos comprados por um cliente.
// Crie uma estrutura de menus para que o programa tenha as seguintes
// funcionalidades:
// • Digitar o nome de um produto e seu preço. (Quando não for  case 1
// mais possível inserir itens, deve ser exibida a mensagem: “Carrinho
// cheio”)
// • Remover um produto através de seu nome. (O nome do produto case 2
// deve ser substituído por “” e o preço por 00. A posição não poderá ser
// reutilizada para armazenar novos valores)
// • Calcular o valor total da compra case 3
// • Exibir a quantidade de produtos comprados case 4
// • Exibir o nome do produto de maior valor (Em caso de produtos case 5 
// de igual valor, escolher uma das ocorrências)
// • Exibir o nome de cada produto ao lado de seu preço case 6

        Scanner leitor = new Scanner (System.in);
    
        int opcao=0, quantidadeVetores, comprado=0;
        boolean carrinhoCheio = false;
        double valorTotalCompra=0, maiorValor=0; 
        String nomeMaiorValor= "";

        System.out.println("Informe a quantidade de vetores: ");
        quantidadeVetores = leitor.nextInt();
    
        while(opcao!= 7){

        System.out.println("Digite 1 para inserir valores.\n1 Digite 2 para Remover um produto através do nome.\n2 Digite 3 para calcular o valor total da compra.\n3 digite 4 para exibir a quantidade de produtos comprados.\n4 Digite 5 para exibir o nome do produto de maior valor.\n5 Digite 6 para exibir o nome de cada produto ao lado de seu preço.\n6");
        
        double vetCarrinhoValores [] = new double [quantidadeVetores];
        String vetCarrinhoNomes [] = new String [quantidadeVetores];

        opcao = leitor.nextInt();
        switch(opcao){
            
            case 1:

            if (carrinhoCheio == false){

           
            
            for (int i=0;
            i<quantidadeVetores;
            i++){
                System.out.println("Favor digitar o nome do produto:");
                vetCarrinhoNomes[i] = leitor.next();

                System.out.println("Favor digitar o preço do produto:");
                vetCarrinhoValores[i] = leitor.nextDouble();
                valorTotalCompra = valorTotalCompra + vetCarrinhoValores[i];
                comprado++;

            if ( i == quantidadeVetores -1){
                carrinhoCheio = true;             
            }
            if (vetCarrinhoValores[i] > maiorValor )
            {
                maiorValor = vetCarrinhoValores[i];
                nomeMaiorValor = vetCarrinhoNomes[i];
            }
        }
        }
        else
        {
            System.out.println("Não é possível inserir mais itens. O carrinho está cheio com " + quantidadeVetores + " itens.");
        }
                System.out.println("Digite 1 para inserir valores.\n1 Digite 2 para Remover um produto através do nome.\n2 Digite 3 para calcular o valor total da compra.\n3 digite 4 para exibir a quantidade de produtos comprados.\n4 Digite 5 para exibir o nome do produto de maior valor.\n5 Digite 6 para exibir o nome de cada produto ao lado de seu preço.\n6");
                opcao = leitor.nextInt();
                break; 

            case 2: 
                System.out.println("Digite o nome do produto a ser removido:");               
                break;      
            case 3:
                System.out.println("O valor total da compra é R$" + valorTotalCompra);
                break;
            case 4:
                System.out.println("O carrinho possui um total de " + comprado + " produtos");
                break;
            case 5:
                System.out.println("O produto de maior valor custa: " + maiorValor);
                break;
            case 6:
                for (int i = 0; 
                    i < quantidadeVetores; 
                    i++)
                {
                System.out.println("Produto: " + vetCarrinhoNomes[i] + " --- Valor R$ " + vetCarrinhoValores[i]);
                }
           
                 break;
            case 7: 
                System.out.println("Encerrando o sistema...");
                break;
            default:                     
                System.out.println("Digite uma opção válida");
                break;

            

        }
    }
       
    }
}
