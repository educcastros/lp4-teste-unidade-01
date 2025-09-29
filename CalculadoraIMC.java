public class CalculadoraIMC {

    public static String classificaIMC(double imc, String genero) {
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
            return "Erro: Genero inválido";
        }
    }

    public static void main(String[] args) {
 
 
        double peso1 = 80.0;
        double altura1 = 1.75;
        String genero1 = "Homem";

        double imc1 = peso1 / (altura1 * altura1);
        String condicao1 = classificaIMC(imc1, genero1);

        System.out.println("");
        System.out.println("Tipo: " + genero1);
        System.out.printf("Valor do IMC: %.2f\n", imc1);
        System.out.println("Condição: " + condicao1);
        System.out.println("");
        
  
        double peso2 = 75.3;
        double altura2 = 1.69;
        String genero2 = "mulher";
        
        double imc2 = peso2 / (altura2 * altura2);
        String condicao2 = classificaIMC(imc2, genero2);

        System.out.println("");
        System.out.println("Tipo: " + genero2);
        System.out.printf("Valor do IMC: %.2f\n", imc2);
        System.out.println("Condição: " + condicao2);
        System.out.println("");
        
    
        String genero3 = "inválido";
        String condicao3 = classificaIMC(0.0, genero3);
        
        System.out.println("");
        System.out.println("Tipo: " + genero3);
        System.out.println("Condição: " + condicao3);
        System.out.println("");
    }
}