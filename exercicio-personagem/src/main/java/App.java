public class App {
    public static void main(String[] args) {
        Heroi heroi01 = new Heroi("Homem-Aranha", "Peter Parker");
        Heroi heroi02 = new Heroi("Batman", "Bruce Wayne");
        Vilao vilao01 = new Vilao("Duende Verde", "Norman Osbourne");
        Vilao vilao02 = new Vilao("Coringa", "Arthur Fleck");

        heroi01.adicionarPoder("Soltar teia", 4);
        heroi02.adicionarPoder("Intelecto de gênio", 10);
        vilao01.adicionarPoder("Força", 6);
        vilao02.adicionarPoder("Gás do Riso", 8);

        Confronto confronto01 = new Confronto();

        confronto01.lutar(heroi01, vilao01);
        confronto01.lutar(heroi02, vilao02);
    }
}
