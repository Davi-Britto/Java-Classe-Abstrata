public class Confronto {

    public Confronto() {
    }

    public void lutar(Heroi heroi, Vilao vilao){
        Double forcaTotalHeroi = heroi.getForcaTotal();
        Double forcaTotalVilao = vilao.getForcaTotal();

        if(forcaTotalHeroi > forcaTotalVilao){
            System.out.println("""
                    Herói: %s Venceu o combate!!!""".formatted(heroi.getCodinome()));
        } else if (forcaTotalVilao > forcaTotalHeroi) {
            System.out.println("""
                    Vilão: %s Venceu o combate!!!""".formatted(vilao.getCodinome()));
        } else {
            System.out.println("Empate!");
        }
    }

    @Override
    public String toString() {
        return """
                Confronto""";
    }
}
