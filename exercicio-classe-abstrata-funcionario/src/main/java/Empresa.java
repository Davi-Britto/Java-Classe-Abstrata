import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<Funcionario> funcionarios;

    public void adicionarFunc(Funcionario funcionario){
        funcionarios.add(funcionario);
    }

    public void exibeTodos(){
        for (int i = 0; i < funcionarios.size(); i++){
            System.out.println(funcionarios.get(i));
        }
    }

    public void exibeTotalSalario(){
        Double totalSalario = 0.0;
        for (int i = 0; i < funcionarios.size(); i++){
            totalSalario += funcionarios.get(i).calcSalario();
        }

        System.out.println(totalSalario);
    }

    public Empresa() {
        funcionarios = new ArrayList<>();
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    @Override
    public String toString() {
        return """
                Funcionarios: %s
                """.formatted(funcionarios);
    }
}
