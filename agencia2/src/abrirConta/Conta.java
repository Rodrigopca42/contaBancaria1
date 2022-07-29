package abrirConta;


/**
 * Conta
 */
public class Conta {

    private String cliente;
    private int numConta;
    private double saldo;
    public char escolha;

    public Conta (String cliente, int numConta){
        this.cliente = cliente;
        this.numConta = numConta;
       
    }
    
    public Conta (String cliente, int numConta, double depositoInicial){
        this.cliente = cliente;
        this.numConta = numConta;
        deposito(depositoInicial);
    }

    public String getCliente(){
        return cliente;
    }

    public void setCliente(String cliente){
        this.cliente = cliente;
    }

    public int getNumConta(){
        return numConta;
    }

    public double saldo(){
        return saldo;
    }


    public void deposito(double quantia){
            saldo += quantia;
    }

    public void saque(double quantia){
         saldo -= quantia + 5;
    }

    public String toString(){
        return "Conta: "+ numConta + ", Cliente: "+ cliente+", Saldo, R$"+String.format("%.2f%n", saldo);
    }

}