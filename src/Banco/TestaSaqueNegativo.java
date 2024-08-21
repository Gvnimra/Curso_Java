package Banco;

public class TestaSaqueNegativo {
    public static void main(String[] args) {
        Conta contaTeste = new Conta();
        contaTeste.depositar(100);
        contaTeste.sacar(200);
        System.out.println(contaTeste.getSaldo());
    }
}
