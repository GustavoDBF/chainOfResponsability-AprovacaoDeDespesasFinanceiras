package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DespesaTest {

    AprovadorCEO ceo;
    AprovadorDiretor diretor;
    AprovadorGerente gerente;
    AprovadorSupervisor supervisor;

    @BeforeEach
    void setUp() {
        ceo = new AprovadorCEO(null);
        diretor = new AprovadorDiretor(ceo);
        gerente = new AprovadorGerente(diretor);
        supervisor = new AprovadorSupervisor(gerente);
    }

    @Test
    void deveRetornarSupervisorParaAprovaçãoViagem() {
        assertEquals("Supervisor", supervisor.aprovarDespesa(new Despesa(TipoDespesaViagem.getTipoDespesaViagem())));
    }

    @Test
    void deveRetornarGerenteParaAprovaçãoTreinamento() {
        assertEquals("Gerente", supervisor.aprovarDespesa(new Despesa(TipoDespesaTreinamento.getTipoDespesaTreinamento())));
    }

    @Test
    void deveRetornarDiretorParaAprovaçãoEquipamento() {
        assertEquals("Diretor", supervisor.aprovarDespesa(new Despesa(TipoDespesaEquipamento.getTipoDespesaEquipamento())));
    }

    @Test
    void deveRetornarCEOParaAprovaçãoAquisicaoEmpresa() {
        assertEquals("CEO", supervisor.aprovarDespesa(new Despesa(TipoDespesaAquisicaoEmpresa.getTipoDespesaAquisicaoEmpresa())));
    }

    @Test
    void deveRetornarSemAprovacaoParaInvestimentoRisco() {
        assertEquals("Sem aprovação", supervisor.aprovarDespesa(new Despesa(TipoDespesaInvestimentoRisco.getTipoDespesaInvestimentoRisco())));
    }
}