package org.example;

public class AprovadorGerente extends Aprovador {

    public AprovadorGerente(Aprovador superior) {
        listaDespesas.add(TipoDespesaTreinamento.getTipoDespesaTreinamento());
        setAprovadorSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Gerente";
    }
}