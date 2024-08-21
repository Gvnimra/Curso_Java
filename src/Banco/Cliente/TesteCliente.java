package Banco.Cliente;

import Banco.Conta;

public class TesteCliente {
    public static void main(String[] args) {

        Cliente giovani = new Cliente();
        giovani.nome = "Giovani de Moura André";
        giovani.CPF = "111.222.333.44";
        giovani.profissao = "desenvolvedor";

        Conta contaDoGiovani = new Conta();
        contaDoGiovani.depositar(100);
    }
}
