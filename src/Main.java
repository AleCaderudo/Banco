import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Dados Cliente
        Scanner leitura = new Scanner(System.in);
        System.out.println("\n--------------------\nDados Iniciais do Cliente!\n");
        System.out.print("Digite o seu nome : ");
        String nome = leitura.nextLine();
        System.out.print("Digite O tipo de conta, Corrente ou Poupança : ");
        String tipo = leitura.nextLine();
        System.out.print("Digite o Valor inicial : ");
        int valor = Integer.parseInt(leitura.nextLine());
        System.out.println("\n--------------------\nOlá " + nome + "\nSua conta é do tipo : " + tipo + "\nSeu saldo atual é de : R$ " + valor);

        //Operações
        int consulta =0;
        int recebe;
        int envia;
        int total = valor;

        System.out.println("\n--------------------\nDigite a opção desejada : \n--------------------\n");
        System.out.println("1 Consultar Saldo");
        System.out.println("2 Receber valor");
        System.out.println("3 Transferir valor");
        System.out.println("4 Sair");
        consulta = leitura.nextInt();


        while (consulta != 4) {

            if (consulta == 1) {
                System.out.println("\nSeu saldo atual é de : R$ " + valor);
            } else {

                if (consulta == 2) {

                    System.out.println("\n--------------------\nInforme o valor a receber\n");
                    recebe = leitura.nextInt();
                    valor += recebe;
                    System.out.println("\nSeu saldo atual é de : R$ " + valor);
                    System.out.println("\n--------------------\nDigite a opção desejada : \n--------------------\n");
                    System.out.println("1 Consultar Saldo");
                    System.out.println("2 Receber valor");
                    System.out.println("3 Transferir valor");
                    System.out.println("4 Sair");
                } else {

                    System.out.println("\n--------------------\nInforme o valor a enviar\n");
                    envia = leitura.nextInt();
                    valor -= envia;
                    System.out.println("\nSeu saldo atual é de : R$ " + valor);
                    System.out.println("\n--------------------\nDigite a opção desejada : \n--------------------\n");
                    System.out.println("1 Consultar Saldo");
                    System.out.println("2 Receber valor");
                    System.out.println("3 Transferir valor");
                    System.out.println("4 Sair");


                }
                if (consulta <= 4) {
                    System.out.println("Você saiu do programa");

                }

            }
        }
    }
}