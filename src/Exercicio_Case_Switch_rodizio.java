public class Exercicio_Case_Switch_rodizio {

    
    Scanner leitor = new Scanner(System.in);
        String nome, setor;
        int meioTransporte, placa;
        for(int i=0;i<150;i++) {
            System.out.println("Por favor, digite o nome do " + (i+1) + "º funcionario");
            nome =  leitor.next();
            System.out.println("Por favor, digite o setor do " + (i+1) + "º funcionario");
            setor =  leitor.next();
            System.out.println("Por favor, digite o meio de transporte do " + (i+1) + "º funcionario. \n 1- CARRO, 2- ÔNIBUS");
            meioTransporte =  leitor.nextInt();
            if (meioTransporte==1) {
                System.out.println("O funcionário " + nome + ", do setor " + setor + ", vem ao trabalho de carro. Informe o último dígito da placa do veículo");
                placa = leitor.nextInt();
                switch(placa) {
                case 1:
                case 2:
                    System.out.println("O rodízio deste veículo é na segunda-feira");
                    break;
                case 3:
                case 4:
                    System.out.println("O rodízio deste veículo é na terça-feira");
                    break;
                case 5:
                case 6:
                    System.out.println("O rodízio deste veículo é na quarta-feira");
                    break;
                case 7:
                case 8:
                    System.out.println("O rodízio deste veículo é na quinta-feira");
                    break;
                case 9:
                case 0:
                    System.out.println("O rodízio deste veículo é na sexta-feira");
                    break;
                default:
                    System.out.println("Não foi digitado apenas o último dígito. Encaminhe o funcionário à supervisão");
                    break;
                }
            }else if(meioTransporte==2) {
                System.out.println("O rodízio não se aplicata para o funcionário, pois ele vem trabalhar de ônibus");
            }else {
                System.out.println("Opção inválida. Encaminhe o funcionário à supervisão");
            }
        }
}
}
