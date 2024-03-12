public class Circulo extends Figura{
    private Double raio;

    public Circulo(String cor, Integer espessura, Double raio) {
        super(cor, espessura);
        this.raio = raio;
    }


    @Override
    public Double calculaArea() {
        return 3.14 * (raio * raio);
    }

    @Override
    public String toString() {
        return """
                %s
                Raio do Círculo: %.2f
                """.formatted(super.toString(), raio);
    }
}
