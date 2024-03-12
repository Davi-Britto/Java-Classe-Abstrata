import java.util.ArrayList;
import java.util.List;

public class Imagem {

    List<Figura> figuras;

    public Imagem() {
        this.figuras = figuras = new ArrayList<>();
    }

    public void adicionarFigura(Figura figura){
        figuras.add(figura);
    }

    public void exibeFiguras(){
        for(int i = 0; i < figuras.size(); i++){
            System.out.println(figuras.get(i));
        }
    }

    public void exibeSomaArea(){
        for(int i = 0; i < figuras.size(); i++){
            System.out.println(figuras.get(i).calculaArea());
        }
    }

    public void exibeFiguraAreaMaior20(){
        for(int i = 0; i < figuras.size(); i++){
            if(figuras.get(i).calculaArea() > 20){
                System.out.println(figuras.get(i).calculaArea());
            }
        }
    }

    public void exibeQuadrado(){
        for (Figura figuraDaVez: figuras) {
            if(figuraDaVez instanceof Quadrado){
                System.out.println(figuraDaVez);
            }
        }
    }

    public List<Figura> getFiguras() {
        return figuras;
    }

    public void setFiguras(List<Figura> figuras) {
        this.figuras = figuras;
    }

    @Override
    public String toString() {
        return """
                Figuras: %s
                """.formatted(figuras);
    }
}
