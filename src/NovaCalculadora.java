import java.util.Scanner;

public class NovaCalculadora {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Calculadora");
        Calculadora calculadora = new Calculadora();
        System.out.println("Digite o 1º número: ");
        calculadora.n1 = leitor.nextDouble();
        System.out.println("Digite o 2º número: ");
        calculadora.n2 = leitor.nextDouble();
        calculadora.somar();
        System.out.println(calculadora.exibir(calculadora.resultado, "Soma"));
        double sub = calculadora.subtração();
        System.out.println(calculadora.exibir(sub, "Subtração"));
        System.out.println(calculadora.dividir());
        calculadora.multiplicacao("Multiplicação");
    }
}
