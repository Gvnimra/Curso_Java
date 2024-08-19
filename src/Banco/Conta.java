package Banco;

//saldo, agencia, numero e titular.

public class Conta {

    double saldo;
    int agencia;
    int numero;
    String titular;

    public void depositar(double valor){
        this.saldo = this.saldo + valor;
    }

    boolean sacar(double valor){
        if (this.saldo >= valor) {
            this.saldo = this.saldo - valor;
            return true;
        }else{
            System.out.println("Não há saldo suficiente, saque NEGADO!");
            return false;
        }
    }

    public boolean transferir(double valor, Conta destino){
        if(this.saldo >= valor){
            this.saldo -= valor;
            destino.depositar(valor);
            return true;
        }else {
            return false;
        }
    }
}
