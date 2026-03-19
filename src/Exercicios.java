public class Exercicios {
    //Atributos
    String nomeExercicio;
    String regiaoExercitada;
    int series;
    int repeticoes;
    int carga;
    int dificuldade;

    //Métodos = Ações
    //Techo de código - Usado várias vezes.
    //public - Metodo publico.
    //Void - É um tipo vazio de retorno - Sem retorno
    //Nome do metodo: Começa com leta minúscula, usa padrão camelCase, não pode conter carac. especiais.
    public void exibir() { //Assinatura do metodo
        System.out.println("Descrição do exercício");
        System.out.println(nomeExercicio + "\n" +
                regiaoExercitada);
        System.out.println("Séries: " + series);
        System.out.println("Repetições: " + repeticoes);
        System.out.println("Carga: " + carga + "Kg");
        System.out.println("Dificuldade: " + dificuldade);
    }

    //Metodo com retorno
    //public tipo retorno nomeMetodo(){}
    //Sempre devemos retornar o tiupo soclitado e usamos a palavra return valor/variavel
    public String exibirComRetorno(){
        String mensagem = "\nDescriçao\n" + nomeExercicio + "\n" +
                regiaoExercitada + "\n" +
                "Series: " series + "\n" +
                "Repeticoes: " + repeticoes + "\n" +
                "Carga: " + carga + "\n"
                "Dificuldade: " + dificuldade + "\n" +

    }

}
