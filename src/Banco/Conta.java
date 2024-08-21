package Banco;

//saldo, agencia, numero e titular.

import Banco.Cliente.Cliente;

public class Conta {

   private double saldo;
   private int agencia;
   private int numero;
   private Cliente titular;


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

    public double getSaldo (){
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
}
