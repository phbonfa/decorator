package decorator;

public abstract class FuncionarioDecorator implements Funcionario {

    private Funcionario funcionario;
    public String estrutura;

    public FuncionarioDecorator(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Funcionario setFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public abstract float getPercentualSalario();

    public float getSalario() {
        return this.funcionario.getSalario() * (1 + (this.getPercentualSalario() / 100));
    }

    public abstract String getNomeEstrutura();

    public String getEstrutura() {
        return this.funcionario.getEstrutura() + "/" + this.getNomeEstrutura();
    }

    public void setEstrutura(String estrutura) {
        this.estrutura = estrutura;
    }
}


