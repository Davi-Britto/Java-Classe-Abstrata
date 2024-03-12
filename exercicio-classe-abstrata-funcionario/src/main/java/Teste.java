public class Teste {
    public static void main(String[] args) {
        Vendedor vendedor01 = new Vendedor("12345678901", "João", 20.0, 5.0);
        Horista horista01 = new Horista("10987654321", "Maria", 40, 2.0);

        Empresa empresa01 = new Empresa();

        empresa01.adicionarFunc(vendedor01);
        empresa01.adicionarFunc(horista01);

        System.out.println("-".repeat(30));
        empresa01.exibeTodos();
        System.out.println("-".repeat(30));
        empresa01.exibeTotalSalario();
    }
}
