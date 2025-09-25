public class CalculaIMC {
    public static void main(String[] args) {
        String sexo = "H";
        double peso = 90.0;
        double altura = 1.86;
        double imc = peso / (altura * altura);
        String situacao =".";


        if (sexo.equals("H")) {
            if (imc < 20.7) {
                situacao = "Abaixo do peso";
            } else if (imc < 26.4) {
                situacao = "Peso normal";
            } else if (imc < 27.8) {
                situacao = "Marginalmente acima do peso";
            } else if (imc < 31.1) {
                situacao = "Acima do peso ideal";
            } else {
                situacao = "Obeso";
            }
        } else if (sexo.equals("F")) {
            if (imc < 19.1) {
                situacao = "Abaixo do peso";
            } else if (imc < 25.8) {
                situacao = "Peso normal";
            } else if (imc < 27.3) {
                situacao = "Marginalmente acima do peso";
            } else if (imc < 32.3) {
                situacao = "Acima do peso ideal";
            } else {
                situacao = "Obeso";
            }
        }

        System.out.println("IMC: " + imc);
        System.out.println("Situação: " + situacao);
    }
}
