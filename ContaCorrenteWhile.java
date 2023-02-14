
import java.util.Scanner;

/**
 *
 * @author lucas.monteiro
 */
 
public class ContaCorrenteWhile {
private Double saldo;

    /* Classe das operações da conta */

    public void setSaldo(Double saldo) {
        /* Faz a primeira entrada */
        this.saldo = saldo;
    }

    public Double getSaldo() {
        /* Faz a recuperação */
        return saldo;
    }

    public void depositar(Double valor) {
        /* Acresenta o valor */
        saldo += valor;
    }

    public void sacar(Double valor) {
        /* retira o valor */
        saldo -= valor;
    }

    public void verificaSaldo() {
        System.out.println("Valor do Saldo com Limite Especial: R$" + getSaldo());
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //INSTANCIA A CLASSE
        ContaCorrenteWhile conta = new ContaCorrenteWhile();
        conta.setSaldo(300.00);
        /* Limite especial*/

        System.out.print("Escolha a operacao desejada:\n 1) Para Extrato\n 2) Para Saque \n 3) Para Deposito \n 00) Para Sair  \n");
        Scanner input = new Scanner(System.in);
        int opcao = input.nextInt();

        while (opcao != 00) {
            if (opcao == 1) {
                //RESGATA VALOR
                conta.verificaSaldo();
            } else if (opcao == 2) {
                System.out.print("\n Digite o valor de saque\n");
                double saque = input.nextDouble();
                double saldoin = conta.getSaldo();
                if(saldoin < saque ){
                    System.out.println("Saldo Insuficiente!\n"
                            + "Seu Saldo é de: R$ " + saldoin);
                }else{
                conta.sacar(saque);
                }
            } else if (opcao == 3) {
                System.out.print("\nSaldo com Deposito\n");
                double deposito = input.nextDouble();
                conta.depositar(deposito);
            }

            System.out.print("Escolha a operacao desejada:\n 1) Para Extrato\n 2) Para Saque \n 3) Para Deposito \n 00) Para Sair  \n");            
            opcao = input.nextInt();

        }
    }
    
}
