package Banco;

public class TesteMetodo {
    public static void main(String[] args) {
        Conta contaDoGiovani = new Conta();

        contaDoGiovani.depositar(100);
        contaDoGiovani.depositar(50);
        System.out.println(contaDoGiovani.getSaldo());

        contaDoGiovani.sacar(30);
        System.out.println("Saldo do Giovani antes da transferencia é: " + contaDoGiovani.getSaldo());

        Conta contaDaMaria = new Conta();
        contaDaMaria.depositar(1000);
        System.out.println("Saldo atual conta da Maria: " + contaDaMaria.getSaldo());

        contaDaMaria.transferir(500, contaDoGiovani);
        System.out.println(("Saldo atual da conta da Maria: " + contaDaMaria.getSaldo()));
        System.out.println("Saldo atual da conta do Giovani " + contaDoGiovani.getSaldo());
        
        System.out.println(contaDoGiovani.getTitular());

    }
}
