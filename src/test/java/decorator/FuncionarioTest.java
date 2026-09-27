package decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {

    @Test
    void deveRetornarFuncionarioContratado() {
        Funcionario funcionario = new FuncionarioContratado(1000.0f);

        assertEquals(1000.0f, funcionario.getSalario());
    }

    @Test
    void deveRetornarFuncionarioContratadoComHoraExtraDomEFeriados() {
        Funcionario funcionario = new HoraExtraDomEFeriados(new FuncionarioContratado(1000.0f));

        assertEquals(1100.0f, funcionario.getSalario());
    }

    @Test
    void deveRetornarFuncionarioContratadoComHoraExtraNoturna() {
        Funcionario funcionario = new HoraExtraNoturna(new FuncionarioContratado(1000.0f));

        assertEquals(1200.0f, funcionario.getSalario());
    }

    @Test
    void deveRetornarFuncionarioContratadoComHoraExtraDiurna() {
        Funcionario funcionario = new HoraExtraDiurna(new FuncionarioContratado(1000.0f));

        assertEquals(1050.0f, funcionario.getSalario());
    }

    @Test
    void deveRetornarFuncionarioContratadoComHoraExtraDomEFeriadosMaisHoraExtraNoturna() {
        Funcionario funcionario = new HoraExtraDomEFeriados(new HoraExtraNoturna(new FuncionarioContratado(1000.0f)));

        assertEquals(1320.0f, funcionario.getSalario());
    }

    @Test
    void deveRetornarFuncionarioContratadoComHoraExtraDomEFeriadosMaisHoraExtraDiurna() {
        Funcionario funcionario = new HoraExtraDomEFeriados(new HoraExtraDiurna(new FuncionarioContratado(1000.0f)));

        assertEquals(1155.0f, funcionario.getSalario());
    }

    @Test
    void deveRetornarFuncionarioContratadoComHoraExtraNoturnaMaisHoraExtraDiurna() {
        Funcionario funcionario = new HoraExtraNoturna(new HoraExtraDiurna(new FuncionarioContratado(1000.0f)));

        assertEquals(1260.0f, funcionario.getSalario());
    }

    @Test
    void deveRetornarFuncionarioContratadoComHoraExtraDomEFeriadosMaisHoraExtraNoturnaMaisHoraExtraDiurna() {
        Funcionario funcionario = new HoraExtraDomEFeriados(new HoraExtraNoturna(new HoraExtraDiurna(new FuncionarioContratado(1000.0f))));

        assertEquals(1386.0f, funcionario.getSalario());
    }

    @Test
    void deveRetornarEstruturaFuncionarioContratado() {
        Funcionario funcionario = new FuncionarioContratado();

        assertEquals("Contratado", funcionario.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaFuncionarioContratadoComHoraExtraDomEFeriados() {
        Funcionario funcionario = new HoraExtraDomEFeriados(new FuncionarioContratado());

        assertEquals("Contratado/Hora Extra Dom e Feriados", funcionario.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaFuncionarioContratadoComHoraExtraNoturna() {
        Funcionario funcionario = new HoraExtraNoturna(new FuncionarioContratado());

        assertEquals("Contratado/Hora Extra Noturna", funcionario.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaFuncionarioContratadoComHoraExtraDiurna() {
        Funcionario funcionario = new HoraExtraDiurna(new FuncionarioContratado());

        assertEquals("Contratado/Hora Extra Diurna", funcionario.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaFuncionarioContratadoComHoraExtraDomEFeriadosMaisHoraExtraNoturna() {
        Funcionario funcionario = new HoraExtraDomEFeriados(new HoraExtraNoturna(new FuncionarioContratado()));

        assertEquals("Contratado/Hora Extra Noturna/Hora Extra Dom e Feriados", funcionario.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaFuncionarioContratadoComHoraExtraDomEFeriadosMaisHoraExtraDiurna() {
        Funcionario funcionario = new HoraExtraDomEFeriados(new HoraExtraDiurna(new FuncionarioContratado()));

        assertEquals("Contratado/Hora Extra Diurna/Hora Extra Dom e Feriados", funcionario.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaFuncionarioContratadoComHoraExtraNoturnaMaisHoraExtraDiurna() {
        Funcionario funcionario = new HoraExtraNoturna(new HoraExtraDiurna(new FuncionarioContratado()));

        assertEquals("Contratado/Hora Extra Diurna/Hora Extra Noturna", funcionario.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaFuncionarioContratadoComHoraExtraDomEFeriadosMaisHoraExtraNoturnaMaisHoraExtraDiurna() {
        Funcionario funcionario = new HoraExtraDomEFeriados(new HoraExtraNoturna(new HoraExtraDiurna(new FuncionarioContratado())));

        assertEquals("Contratado/Hora Extra Diurna/Hora Extra Noturna/Hora Extra Dom e Feriados", funcionario.getEstrutura());
    }

}