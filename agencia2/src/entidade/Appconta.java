package entidade;

import java.util.Scanner;
import abrirConta.Conta;

public class Appconta {
    
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        Conta conta;

        System.out.print("Entre com o número da conta: ");
        int numConta = tec.nextInt();

        System.out.print("Entre com o nome do cliente: ");
        tec.nextLine();
        String cliente = tec.nextLine();

        System.out.print("Vai entrar com deposito inicial? (s/n)");
        char escolha = tec.next().charAt(0);

        if(escolha == 's'){
            System.out.println("Entra com o valor do deposito inicial: R$");
            double depositoInicial = tec.nextDouble();
            conta = new Conta(cliente, numConta, depositoInicial);
        } 
        else{
            conta = new Conta(cliente, numConta);
        }


        System.out.println(" ");
        System.out.println("Conta Atualida:");
        System.out.print(conta);
        System.out.println(" ");
        
        
        System.out.print("Entre com Deposito: R$");
        double saldo = tec.nextDouble();
        conta.deposito(saldo);
        System.out.println("Conta Atualida:");
        System.out.println(conta);
        System.out.println(" ");
        
        
        System.out.print("Faça seu Saque: R$");
        saldo = tec.nextDouble();
        conta.saque(saldo);
        System.out.println("Conta Atualida:");
        System.out.println(conta);
        System.out.println(" ");

        tec.close();
    }
}
