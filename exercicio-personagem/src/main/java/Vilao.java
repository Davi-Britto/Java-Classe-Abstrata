public class Vilao extends Personagem{

    public Vilao(String codinome, String nome) {
        super(codinome, nome);
    }

    @Override
    public Double getForcaTotal() {
        Double valorTotalPoderes = 0.0;
        for (int i = 0; i < poderes.size(); i++){
            valorTotalPoderes += poderes.get(i).getCategoria();
        }
        return valorTotalPoderes;
    }
}
