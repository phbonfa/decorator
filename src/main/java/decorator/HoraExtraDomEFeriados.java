package decorator;

public class HoraExtraDomEFeriados extends FuncionarioDecorator {

    public HoraExtraDomEFeriados(Funcionario funcionario) {
        super(funcionario);
    }

    public float getPercentualSalario() {return 10.0f;}

    public String getNomeEstrutura() {
        return "Hora Extra Dom e Feriados";
    }
}
