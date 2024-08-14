package Java_Curso.Aula2;

public class inteiro {

    public static void main(String[] args) {
        int idade;
        idade = 31;

        int soma = idade + 5;
        int subtracao = idade - 5;
        int multiplicar = idade * 2;
        int divisao = idade / 2;
        int restDivisao = idade % 2;

        System.out.println("------------ Aula 2 ------------");
        System.out.println("Variavel int, operações matemáticas e concatenação ");
        System.out.println("A idade de Giovani Moura é: " + idade);
        System.out.println("A idade de Giovani Moura + 5 é: " + soma);
        System.out.println("A idade de Giovani Moura - 5 é: " + subtracao);
        System.out.println("A idade de Giovani Moura * 2 é: " + multiplicar);
        System.out.println("A idade de Giovani Moura / 2 é: " + divisao);
        System.out.println("O resto da divisão da idade de Giovani Moura / 2 é: " + restDivisao);
    }
}
