package Banco;

public class TesteMetodo {
    public static void main(String[] args) {
        Conta contaDoGiovani = new Conta();

        contaDoGiovani.saldo = 100;
        contaDoGiovani.depositar(50);
        System.out.println(contaDoGiovani.saldo);

        contaDoGiovani.sacar(30);
        System.out.println(contaDoGiovani.saldo);

        Conta contaDaMaria = new Conta();
        contaDaMaria.depositar(1000);

        contaDaMaria.transferir(500, contaDoGiovani);
        System.out.println(("Saldo atual da conta da Maria: " + contaDaMaria.saldo ));
        System.out.println("Saldo atual da conta do Giovani " + contaDoGiovani.saldo);

    }
}
