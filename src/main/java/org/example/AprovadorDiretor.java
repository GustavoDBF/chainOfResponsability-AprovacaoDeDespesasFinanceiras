package org.example;

public class AprovadorDiretor extends Aprovador {

    public AprovadorDiretor(Aprovador superior) {
        listaDespesas.add(TipoDespesaEquipamento.getTipoDespesaEquipamento());
        setAprovadorSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Diretor";
    }
}