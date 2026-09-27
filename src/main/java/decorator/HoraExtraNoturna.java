package decorator;

public class HoraExtraNoturna extends FuncionarioDecorator {

    public HoraExtraNoturna(Funcionario funcionario) {
        super(funcionario);
    }

    public float getPercentualSalario() {
        return 20.0f;
    }

    public String getNomeEstrutura() {
        return "Hora Extra Noturna";
    }
}
