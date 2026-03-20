    public class Calculadora {
        double n1;
        double n2;
        double resultado;


        public void somar() {
            resultado = n1 + n2;
        }

        public double subtração() {
            return n1 - n2;
        }

        public String exibir(double valor, String operacao) {
                return operacao + " = " + valor;
        }


        
        public void exibirResultado() {
                System.out.println(resultado);

        }

        public String dividir(){
            if(n2 > 0){
                resultado = n1 / n2;
                return "Divisão = " + resultado;
            }
            return "Não é possível dividir";
        }
        public void multiplicacao (String operacao){
            System.out.println(operacao + " = " + n1 * n2);
        }
    }