package Banco.contas;

public class CriaConta {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 200;
        System.out.println("Olá, seja bem vindo ao Banco Banco Sem nome!");
        System.out.println("--------------------------------------");
        System.out.println("O saldo da sua conta é de R$: " + primeiraConta.saldo);

        primeiraConta.saldo += 100;
        System.out.println("Saldo atualizado R$: " + primeiraConta.saldo);

        System.out.println("--------------------------------------");

        Conta segundaConta = new Conta();
        segundaConta.saldo = 50;

        System.out.println("Primeira Conta = " + primeiraConta.saldo);
        System.out.println("Segunda Conta = " + segundaConta.saldo);
    }
}
