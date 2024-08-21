package Banco.Cliente;

import Banco.Conta;

public class TesteGetterESetter {
    public static void main(String[] args) {

        Conta conta = new Conta();
        conta.setNumero(13);
        System.out.println(conta.getNumero());
    }
}
