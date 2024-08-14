package Java_Curso.Aula8;

public class EscopoVariaveis {
    public static void main(String[] args) {
        int idade = 20;          //Variavel de escopo LOCAL
        int qtdPessoas = 3;      //Variavel de escopo LOCAL
        boolean acompanhado;     //Variavel de escopo LOCAL

        System.out.println("------------ Aula 8 ------------");
        System.out.println("Escopo de Variaveis");

        if (qtdPessoas >= 2) {
            acompanhado = true;
        }else {
            acompanhado = false;
        }

        System.out.println("Valor de acompanhado é " + acompanhado);

        if(idade >= 18 && acompanhado ){
            System.out.println("Você pode comprar bebida!");
        } else {
            System.out.println("Você NÃO pode comprar bebida!");
        }
    }
}
