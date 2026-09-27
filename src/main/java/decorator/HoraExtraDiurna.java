package decorator;

public class HoraExtraDiurna extends FuncionarioDecorator {

    public HoraExtraDiurna(Funcionario funcionario) {
        super(funcionario);
    }

    public float getPercentualSalario() {
        return 5.0f;
    }

    public String getNomeEstrutura() {
        return "Hora Extra Diurna";
    }
}
