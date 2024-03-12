public class App {
    public static void main(String[] args) {
        Quadrado quadrado01 = new Quadrado("Azul", 5, 2.50);
        Retangulo retangulo01 = new Retangulo("Azul", 10, 5.0, 10.0);
        Triangulo triangulo01 = new Triangulo("Azul", 7, 10.0, 15.0);
        Circulo circulo01 = new Circulo("Azul", 20, 15.0);

        System.out.println("-".repeat(30));

        Imagem imagem01 = new Imagem();

        imagem01.adicionarFigura(quadrado01);
        imagem01.adicionarFigura(retangulo01);
        imagem01.adicionarFigura(triangulo01);
        imagem01.adicionarFigura(circulo01);

        imagem01.exibeFiguras();

        System.out.println("-".repeat(30));

        imagem01.exibeSomaArea();

        System.out.println("-".repeat(30));

        imagem01.exibeFiguraAreaMaior20();

        System.out.println("-".repeat(30));

        imagem01.exibeQuadrado();

        System.out.println("-".repeat(30));
    }
}
