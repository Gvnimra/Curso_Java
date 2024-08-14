package Java_Curso.Aula7;

public class TipoBooleano {
    public static void main(String[] args) {
        int idade = 16;
        int qtdPessoas = 2;
        boolean acompanhado = qtdPessoas >=2;

        System.out.println("------------ Aula 7 ------------");
        System.out.println("Tipos Booleanos");

        if(idade >= 18 && acompanhado ){
            System.out.println("Você pode comprar bebida!");
        } else {
            System.out.println("Você NÃO pode comprar bebida!");
        }
    }
}
