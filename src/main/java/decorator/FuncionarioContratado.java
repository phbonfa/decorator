package decorator;

public class FuncionarioContratado implements Funcionario {

    public float salario;

    public FuncionarioContratado() {
    }

    public FuncionarioContratado(float salario) {
        this.salario = salario;
    }

    public float getSalario() {
        return salario;
    }

    public String getEstrutura() {
        return "Contratado";
    }

}
