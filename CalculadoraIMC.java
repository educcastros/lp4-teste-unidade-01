public class CalculadoraIMC {

    public static String classificarIMC(double imc, String genero) {
        if (genero.equalsIgnoreCase("mulher")) {
            if (imc < 19.1) {
                return "Abaixo do peso";
            } else if (imc < 25.8) {
                return "No peso normal";
            } else if (imc < 27.3) {
                return "Marginalmente acima do peso";
            } else if (imc < 32.3) {
                return "Acima do peso ideal";
            } else {
                return "Obeso";
            }
        } else if (genero.equalsIgnoreCase("homem")) {
            if (imc < 20.7) {
                return "Abaixo do peso";
            } else if (imc < 26.4) {
                return "No peso normal";
            } else if (imc < 27.8) {
                return "Marginalmente acima do peso";
            } else if (imc < 31.1) {
                return "Acima do peso ideal";
            } else {
                return "Obeso";
            }
        } else {
            return "Erro: Genero invalido";
        }
    }

    public static void main(String[] args) {
 
 
        double peso = 80.0;
        double altura = 1.75;
        String genero = "Homem";
        
        //double peso = 75.3;
        //double altura = 1.69;
        //String genero = "mulher";
        
        //String genero = "inválido";

        double imc = peso / (altura * altura);
        String condicao = classificarIMC(imc, genero);

        System.out.println("---------------------------------------");
        System.out.println("Calculando IMC para: "+ genero);
        System.out.printf("Seu IMC é: %.2f\n", imc);
        System.out.println("Condicao: " + condicao);
        System.out.println("---------------------------------------");
    }
}