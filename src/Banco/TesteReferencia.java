package Banco;

//POO: Referencia x Objetos

public class TesteReferencia {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.depositar(300);

        System.out.println("O saldo da primeira conta é: " + primeiraConta.getSaldo());

        Conta segundaConta = new Conta();

        System.out.println("O saldo da segunda conta é: " + primeiraConta.getSaldo());

        segundaConta.depositar(100);
        System.out.println("O saldo da segunda conta é: " + segundaConta.getSaldo());
        System.out.println("O saldo da primeira conta é: " + primeiraConta.getSaldo());

        if( primeiraConta == segundaConta){
            System.out.println("São a mesma conta!");
        }else{
            System.out.println("Não são a mesma conta!");
        }
    }
}
