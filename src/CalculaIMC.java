enum Genero {
    MASCULINO,
    FEMININO
}

class Pessoa {
    private double peso;
    private double altura;
    private Genero genero;

    public Pessoa(double peso, double altura, Genero genero) {
        if (peso <= 0) {
            throw new IllegalArgumentException("Peso deve ser maior que 0.");
        }
        if (altura <= 0) {
            throw new IllegalArgumentException("Altura deve ser maior que 0.");
        }
        if (genero == null) {
            throw new IllegalArgumentException("Gênero não pode ser nulo.");
        }

        this.peso = peso;
        this.altura = altura;
        this.genero = genero;
    }

    public double calcularIMC() {
        return this.peso / (this.altura * this.altura);
    }

    public String getSituacao() {
        double imc = calcularIMC();


        return switch (this.genero) {
            case MASCULINO -> {
                if (imc < 20.7) yield "Abaixo do peso";
                else if (imc < 26.4) yield "Peso normal";
                else if (imc < 27.8) yield "Marginalmente acima do peso";
                else if (imc < 31.1) yield "Acima do peso ideal";
                else yield "Obeso";
            }
            case FEMININO -> {
                if (imc < 19.1) yield "Abaixo do peso";
                else if (imc < 25.8) yield "Peso normal";
                else if (imc < 27.3) yield "Marginalmente acima do peso";
                else if (imc < 32.3) yield "Acima do peso ideal";
                else yield "Obeso";
            }
        };
    }
}

public class CalculaIMC {
    public static void main(String[] args) {
        try {
            Pessoa pessoa = new Pessoa(70.0, 1.75, Genero.MASCULINO);

            System.out.printf("IMC: %.2f%n", pessoa.calcularIMC());
            System.out.println("Situação: " + pessoa.getSituacao());
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
