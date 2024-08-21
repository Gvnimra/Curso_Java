package Banco;

public class CriaConta {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.depositar(200);
        System.out.println("Olá, seja bem vindo ao Banco Banco Sem nome!");
        System.out.println("--------------------------------------");
        System.out.println("O saldo da sua conta é de R$: " + primeiraConta.getSaldo());

        primeiraConta.depositar(100);
        System.out.println("Saldo atualizado R$: " + primeiraConta.getSaldo());

        System.out.println("--------------------------------------");

        Conta segundaConta = new Conta();
        segundaConta.depositar(50);

        System.out.println("Primeira Conta = " + primeiraConta.getSaldo());
        System.out.println("Segunda Conta = " + segundaConta.getSaldo());
    }
}
