import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        
        //Declaração de variáveis
        int numero;
        String Agencia;
        String nome;
        double saldo;
        
        try (Scanner sc = new Scanner(System.in)) {

            //Solicitação de dados
            System.out.println("Digite o número da Agencia: ");
            Agencia = sc.nextLine();
            System.out.println("Digite o número da conta: ");
            numero = sc.nextInt();
            sc.nextLine();
            System.out.println("Digite o nome do titular: ");
            nome = sc.nextLine();
            System.out.println("Digite o saldo da conta: ");
            saldo = sc.nextDouble();
            
            String messagem = "Olá " + nome + ", sua conta de número " + numero + " da agência " + Agencia + " possui saldo de R$ " + saldo;
            System.out.println(messagem);

            //Desafio concluido
        }

    }
}
